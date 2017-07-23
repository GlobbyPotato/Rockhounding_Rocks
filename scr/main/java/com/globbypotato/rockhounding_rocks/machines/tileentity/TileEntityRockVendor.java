package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;
import java.util.List;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TemplateStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityMachineInv;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRockList;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksA;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksB;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksC;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksE;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksF;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksG;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiRockVendor;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.oredict.OreDictionary;

public class TileEntityRockVendor extends TileEntityMachineInv{

	private ItemStackHandler template = new TemplateStackHandler(6);

	//Input handler slots
	public static final int INPUT_SLOT = 0;
	public static final int INSCRIBER_SLOT = 1;
	public static final int OUTPUT_SLOT = 0;
	public static final int BUY_SLOT = 4;
	public static final int PREVIEW_SLOT = 5;
	public int colorScan = -1;
	public int rockScan = -1;
	public boolean reloadRocks;
	public boolean allowBuy;

	public static List<ItemStack> filteredRocks = new ArrayList<ItemStack>();;

	public static Biome[] biomeList;

	public TileEntityRockVendor() {
		super(2, 1);

		input =  new MachineStackHandler(INPUT_SLOTS, this){
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
		automationInput = new WrappedItemHandler(input, WriteMode.IN);
		this.markDirtyClient();
	}


	//---------------- HANDLER ----------------
	public ItemStackHandler getTemplate(){
		return this.template;
	}

	@Override
	public int getGUIHeight() {
		return GuiRockVendor.HEIGHT;
	}



	//---------------- CUSTOM ----------------
	private boolean isRockFinder(ItemStack insertingStack) {
		return insertingStack.isItemEqual(new ItemStack(ModItems.rockFinder));
	}

	private boolean isComparableCurrency(ItemStack insertingStack) {
		for(RockVendorFees recipe: MachineRecipes.vendorRecipe){
			if(insertingStack != null && recipe.getInput() != null){
				if(recipe.canOredict()){
					int[] recipeIDs = OreDictionary.getOreIDs(recipe.getInput());
					if(recipeIDs.length > 0) {
						for(int j = 0; j < recipeIDs.length; j++) {
							String recipeName = OreDictionary.getOreName(recipeIDs[j]);
							int[] stackIDs = OreDictionary.getOreIDs(insertingStack);
							if(stackIDs.length > 0) {
								for(int i = 0; i < stackIDs.length; i++) {
									String stackName = OreDictionary.getOreName(stackIDs[i]);
									if(stackName.matches(recipeName)){
										return true;
									}
								}
							}
						}
					}
				}else{
					if(insertingStack.getItem() == recipe.getInput().getItem() && insertingStack.getItemDamage() == recipe.getInput().getItemDamage() ){
						return true;
					}
				}
			}
		}
		return false;
	}

	public int getFeeAmount(){
		ItemStack insertingStack = input.getStackInSlot(INPUT_SLOT);
		for(RockVendorFees recipe: MachineRecipes.vendorRecipe){
			if(insertingStack != null && recipe.getInput() != null){
				if(recipe.canOredict()){
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
					}
				}else{
					if(insertingStack.getItem() == recipe.getInput().getItem() && insertingStack.getItemDamage() == recipe.getInput().getItemDamage() ){
						return recipe.getOutput();
					}
				}
			}
		}
		return 0;
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



	//----------------------- PROCESS -----------------------
	@Override
	public void update(){
		if(!worldObj.isRemote){
			if(!this.reloadRocks && this.isValidColor() && filteredRocks.size() <= 0){reloadFilter();}//startup check
			if(this.reloadRocks && this.isValidColor()){reloadFilter();}//color scroll

			//show rock preview
			if(this.isRockSelected()){
				if(wrongPreview()){
					template.setStackInSlot(PREVIEW_SLOT, filteredRocks.get(this.rockScan));
				}
			}else{
				template.setStackInSlot(PREVIEW_SLOT, null);
			}

			//purchase rock
			if(this.allowBuy){
				if(canBuyRocks()){
					buyRocks();
				}
			}

			//inscribe book
			if(canInscribe()){
				inscribeBook();
			}

			this.markDirtyClient();
		}
	}

	private boolean canInscribe() {
		return RocksGenerator.BIOMES_ENABLER
			&& isRockSelected()
			&& (input.getStackInSlot(INSCRIBER_SLOT) != null && isRockFinder(input.getStackInSlot(INSCRIBER_SLOT)) && input.getStackInSlot(INSCRIBER_SLOT).stackSize == 1) 
			&& template.getStackInSlot(PREVIEW_SLOT) != null
			&& input.getStackInSlot(INSCRIBER_SLOT).hasTagCompound();
	}

	private void inscribeBook() {
		ItemStack rockFinder = input.getStackInSlot(INSCRIBER_SLOT);
		String rockName = template.getStackInSlot(PREVIEW_SLOT).getDisplayName();
		rockFinder.getTagCompound().setString("Rock", rockName);
		for(int x = 0; x < EnumRockList.size(); x++){
			if(EnumRockList.getDysplayName(x).matches(rockName.toLowerCase())){
				String rockLevel = "Y=" + RocksGenerator.ROCKS_MIN_VEIN[x] + " to Y=" + RocksGenerator.ROCKS_MAX_VEIN[x];
				rockFinder.getTagCompound().setString("Level", rockLevel);

				String rockSize = "";
				if(RocksGenerator.CLOUDS_ENABLER){
					rockSize = RocksGenerator.CLOUDS_MIN_SIZE + "/" + RocksGenerator.CLOUDS_MAX_SIZE;
				}else{
					rockSize = RocksGenerator.ROCKS_MIN_SIZE[x] + "/" + RocksGenerator.ROCKS_MAX_SIZE[x];
				}
				rockFinder.getTagCompound().setString("Size", rockSize);

				String rockBiome = RocksGenerator.ROCKS_BIOME[x];
				rockFinder.getTagCompound().setString("Type", rockBiome);

				biomeList = BiomeDictionary.getBiomesForType(Type.valueOf(rockBiome));
				rockFinder.getTagCompound().setInteger("Biomes", biomeList.length);
				if(biomeList.length > 0){
					for(int b = 0; b < biomeList.length; b++){
						rockFinder.getTagCompound().setString("Biome" + b, biomeList[b].getBiomeName());
					}
				}else{
					rockFinder.getTagCompound().setString("Biome0", "No biomes available");
					rockFinder.getTagCompound().setString("Biome1", "Please change Type");
				}
			}
		}
	}

	public boolean canBuyRocks() {
		return isRockSelected()
			&& input.getStackInSlot(INPUT_SLOT) != null
			&& this.getFeeAmount() > 0
			&& template.getStackInSlot(PREVIEW_SLOT) != null
			&& (output.getStackInSlot(OUTPUT_SLOT) == null || canStackOutput());
	}

	private void buyRocks() {
		this.allowBuy = false;
		if(output.getStackInSlot(OUTPUT_SLOT) == null){
			output.setStackInSlot(OUTPUT_SLOT, template.getStackInSlot(PREVIEW_SLOT).copy());
			output.getStackInSlot(OUTPUT_SLOT).stackSize = this.getFeeAmount();
		}else{
			if(canStackOutput()){
				output.getStackInSlot(OUTPUT_SLOT).stackSize += this.getFeeAmount();
			}
		}
		input.getStackInSlot(INPUT_SLOT).stackSize--;
		if(input.getStackInSlot(INPUT_SLOT).stackSize <= 0){input.setStackInSlot(INPUT_SLOT, null);}
	}

	private boolean canStackOutput() {
		return output.getStackInSlot(OUTPUT_SLOT) != null 
			&& (output.getStackInSlot(OUTPUT_SLOT).isItemEqual(template.getStackInSlot(PREVIEW_SLOT)) && output.getStackInSlot(OUTPUT_SLOT).stackSize <= output.getStackInSlot(OUTPUT_SLOT).getMaxStackSize() - this.getFeeAmount());
	}

	private boolean wrongPreview() {
		return template.getStackInSlot(PREVIEW_SLOT) == null || (template.getStackInSlot(PREVIEW_SLOT) != null && !template.getStackInSlot(PREVIEW_SLOT).isItemEqual(filteredRocks.get(this.rockScan)));
	}

	public String getColorName() {
		return EnumDyeColor.values()[15 - this.colorScan].getUnlocalizedName().toLowerCase();
	}

	private void reloadFilter() {
		this.rockScan = -1;
		ItemStack filterRock;
		filteredRocks = new ArrayList<ItemStack>();
		for(int x = 0; x < 16; x++){ if(EnumRocksA.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksA, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksB.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksB, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksC.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksC, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksD.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksD, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksE.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksE, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksF.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksF, 1, x); filteredRocks.add(filterRock); } }
		for(int x = 0; x < 16; x++){ if(EnumRocksG.values()[x].color().toLowerCase().matches(getColorName())){ filterRock = new ItemStack(ModBlocks.rocksG, 1, x); filteredRocks.add(filterRock); } }
		this.reloadRocks = false;
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

}