package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TemplateStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRockList;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksA;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksB;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksC;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksE;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksF;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksG;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksH;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.RockVendorFee;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.oredict.OreDictionary;

public class TERockVendor extends TileEntityInv{

	public static int inputSlots = 2;
	public static int outputSlots = 1;
	public static int templateSlots = 7;
	private ItemStackHandler template = new TemplateStackHandler(templateSlots);

	//Input handler slots
	public static final int INSCRIBER_SLOT = 1;
	public static final int BUY_SLOT = 4;
	public static final int PREVIEW_SLOT = 5;
	public int colorScan = -1;
	public int rockScan = -1;
	public boolean reloadRocks;
	public boolean allowBuy;
	public boolean allowInscribe;

	public static List<ItemStack> filteredRocks = new ArrayList<ItemStack>();;

	public Set<Biome> biomeList;
	
	public TERockVendor() {
		super(inputSlots, outputSlots, templateSlots, 0);

		this.input =  new MachineStackHandler(inputSlots, this){
			@Override
			public ItemStack insertItem(int slot, ItemStack insertingStack, boolean simulate){
				if(slot == INPUT_SLOT && isComparableCurrency(insertingStack)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				if(slot == INSCRIBER_SLOT && isRockFinder(insertingStack)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				return insertingStack;
			}
		};
		this.automationInput = new WrappedItemHandler(this.input, WriteMode.IN);
	}



	//----------------------- I/O -----------------------
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		this.rockScan = compound.getInteger("RockScan");
		this.colorScan = compound.getInteger("ColorScan");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		compound.setInteger("RockScan", this.rockScan);
		compound.setInteger("ColorScan", this.colorScan);
		return compound;
	}



	//---------------- HANDLER ----------------
	public ItemStack inscriberSlot(){
		return this.input.getStackInSlot(INSCRIBER_SLOT);
	}

	public ItemStack previewSlot(){
		return this.template.getStackInSlot(PREVIEW_SLOT);
	}
	
	public ItemStack outputSlot(){
		return this.output.getStackInSlot(OUTPUT_SLOT);
	}



	//---------------- HANDLER ----------------
	public ItemStackHandler getTemplate(){
		return this.template;
	}

	@Override
	public int getGUIHeight() {
		return 200;
	}

	public static String getName(){
		return "rock_vendor";
	}



	//---------------- RECIPE ----------------
	public ArrayList<RockVendorFee> recipeList(){
		return RockVendorFees.rock_vendor_fees;
	}

	public boolean isComparableCurrency(ItemStack insertingStack) {
		if(!insertingStack.isEmpty()){
			ArrayList<Integer> inputOreIDs = CoreUtils.intArrayToList(OreDictionary.getOreIDs(insertingStack));
			if(!inputOreIDs.isEmpty()){
				for(RockVendorFee recipe: recipeList()){
					ArrayList<Integer> recipeOreIDs = CoreUtils.intArrayToList(OreDictionary.getOreIDs(recipe.getInput()));
					if(!recipeOreIDs.isEmpty()){
						if(CoreUtils.compareDictArrays(inputOreIDs, recipeOreIDs)){
							return true;
						}
					}
				}
			}
			return recipeList().stream().anyMatch(recipe -> !insertingStack.isEmpty() && !recipe.getInput().isEmpty() && insertingStack.isItemEqual(recipe.getInput()));
		}
		return false;
	}

	public int getFeeAmount(){
		ItemStack insertingStack = this.input.getStackInSlot(INPUT_SLOT);
		for(RockVendorFee recipe: RockVendorFees.rock_vendor_fees){
			if(!insertingStack.isEmpty() && !recipe.getInput().isEmpty()){
				int[] recipeIDs = OreDictionary.getOreIDs(recipe.getInput());
				if(recipeIDs.length > 0) {
					for(int j = 0; j < recipeIDs.length; j++) {
						String recipeName = OreDictionary.getOreName(recipeIDs[j]);
						int[] stackIDs = OreDictionary.getOreIDs(insertingStack);
						if(stackIDs.length > 0) {
							for(int i = 0; i < stackIDs.length; i++) {
								String stackName = OreDictionary.getOreName(stackIDs[i]);
								if(stackName.matches(recipeName)){
									return recipe.getOutput();
								}
							}
						}
					}
				}else{
					if(insertingStack.isItemEqual(recipe.getInput())){
						return recipe.getOutput();
					}
				}
			}
		}
		return 0;
	}



	//---------------- CUSTOM ----------------
	public boolean isRockFinder(ItemStack insertingStack) {
		return insertingStack.isItemEqual(ToolUtils.finder);
	}

	private static String formalName(String biomeName) {
		return biomeName.substring(0, 1).toUpperCase() + biomeName.substring(1);
	}

	public boolean isRockSelected(){
		return this.isValidColor() && this.isValidRock();
	}

	public boolean isValidColor() {
		return this.colorScan > -1 && this.colorScan < 16;
	}

	public boolean isValidRock() {
		return this.rockScan > -1 && this.listHasRocks();
	}

	public boolean listHasRocks(){
		return this.rockScan < filteredRocks.size();
	}

	public boolean listMaxRocks(){
		return this.rockScan < filteredRocks.size() - 1;
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update(){
		if(!this.world.isRemote){
			//startup check
			if(!this.reloadRocks && this.isValidColor() && filteredRocks.size() <= 0){
				reloadFilter();
				this.markDirtyClient();
			}

			//color scroll
			if(this.reloadRocks && this.isValidColor()){
				reloadFilter();
				this.markDirtyClient();
			}

			//show rock preview
			if(this.isRockSelected()){
				if(wrongPreview()){
					this.template.setStackInSlot(PREVIEW_SLOT, filteredRocks.get(this.rockScan));
				}
			}else{
				this.template.setStackInSlot(PREVIEW_SLOT, ItemStack.EMPTY);
			}

			//purchase rock
			if(this.allowBuy){
				if(canBuyRocks()){
					buyRocks();
					this.markDirtyClient();
				}
			}

			//inscribe book
			if(this.allowInscribe){
				if(canInscribe()){
					inscribeBook();
					this.markDirtyClient();
				}
			}
		}
	}

	public boolean canInscribe() {
		return RocksGenerator.BIOMES_ENABLER
			&& isRockSelected()
			&& (!inscriberSlot().isEmpty() && isRockFinder(inscriberSlot()) && inscriberSlot().getCount() == 1) 
			&& !previewSlot().isEmpty()
			&& inscriberSlot().hasTagCompound();
	}

	private void inscribeBook() {
		this.allowInscribe = false;
		String unlocName = previewSlot().getUnlocalizedName().toLowerCase();
		String displayName = previewSlot().getDisplayName();
		inscriberSlot().getTagCompound().setString("Rock", displayName);
		for(int x = 0; x < EnumRockList.size(); x++){
			if(EnumRockList.getUnlocName(x).matches(unlocName)){
				String rockLevel = "Y=" + RocksGenerator.ROCKS_MIN_VEIN[x] + " to Y=" + RocksGenerator.ROCKS_MAX_VEIN[x];
				inscriberSlot().getTagCompound().setString("Level", rockLevel);

				String rockSize = "";
				if(RocksGenerator.CLOUDS_ENABLER){
					rockSize = RocksGenerator.CLOUDS_MIN_SIZE + "/" + RocksGenerator.CLOUDS_MAX_SIZE;
				}else{
					rockSize = RocksGenerator.ROCKS_MIN_SIZE[x] + "/" + RocksGenerator.ROCKS_MAX_SIZE[x];
				}
				inscriberSlot().getTagCompound().setString("Size", rockSize);

				String rockBiome = RocksGenerator.ROCKS_BIOME[x];
				inscriberSlot().getTagCompound().setString("Type", rockBiome);

				this.biomeList = BiomeDictionary.getBiomes(Type.getType(rockBiome));
				inscriberSlot().getTagCompound().setInteger("Biomes", this.biomeList.size());
				if(!this.biomeList.isEmpty() && this.biomeList.size() > 0){
					int nBiome = 0;
					for(Biome b : this.biomeList){
						String biomeName = b.getRegistryName().getResourcePath().replaceAll("_", " ");
						inscriberSlot().getTagCompound().setString("Biome" + nBiome, formalName(biomeName));
						nBiome++;
					}
				}else{
					inscriberSlot().getTagCompound().setString("Biome0", "No biomes available");
					inscriberSlot().getTagCompound().setString("Biome1", "Please change Type");
				}
			}
		}
	}

	private ItemStack recipeOutput(){
		ItemStack outstack = previewSlot().copy(); 
		outstack.setCount(this.getFeeAmount());
		return !outstack.isEmpty() ? outstack : ItemStack.EMPTY;
	}

	public boolean canBuyRocks() {
		return isRockSelected()
			&& !this.input.getStackInSlot(INPUT_SLOT).isEmpty()
			&& this.getFeeAmount() > 0
			&& !previewSlot().isEmpty()
			&& !recipeOutput().isEmpty()
			&& this.output.canSetOrStack(outputSlot(), recipeOutput());
	}

	private void buyRocks() {
		this.allowBuy = false;
		this.output.setOrStack(OUTPUT_SLOT, recipeOutput());
		this.input.decrementSlot(INPUT_SLOT);
	}

	private boolean wrongPreview() {
		return previewSlot().isEmpty() || (!previewSlot().isEmpty() && !previewSlot().isItemEqual(filteredRocks.get(this.rockScan)));
	}

	public String getColorName() {
		return EnumDyeColor.values()[15 - this.colorScan].getUnlocalizedName().toLowerCase();
	}

	private void reloadFilter() {
		this.rockScan = -1;
		ItemStack filterRock;
		filteredRocks = new ArrayList<ItemStack>();
		for(int x = 0; x < 16; x++){ if(EnumRocksA.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_A, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksB.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_B, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksC.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_C, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksD.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_D, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksE.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_E, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksF.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_F, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksG.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_G, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksH.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.ROCKS_H, 1, x); filteredRocks.add(filterRock); } }
		this.reloadRocks = false;
	}

}