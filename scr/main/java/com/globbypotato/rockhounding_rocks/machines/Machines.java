package com.globbypotato.rockhounding_rocks.machines;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_core.enums.EnumFluidNbt;
import com.globbypotato.rockhounding_core.machines.tileentity.IFluidHandlingTile;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_core.utils.MachinesUtils;
import com.globbypotato.rockhounding_rocks.Rhrocks;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.handler.GuiHandler;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.io.MachineIO;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBench;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEMillWheel;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEMillWheelAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockPlatform;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBench;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammer;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammerAnimated;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Machines extends MachineIO {
	public static PropertyEnum VARIANT = PropertyEnum.create("variant", EnumMachines.class);
    Random rand = new Random();

	public Machines(String name) {
		super(name, Material.IRON, EnumMachines.getNames(), 3.0F, 5.0F, SoundType.METAL);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumMachines.values()[0]).withProperty(FACING, EnumFacing.NORTH));
		for(int x = 0; x < EnumMachines.size(); x++){
			if(x >= 2 && x <= 9){
				setHarvestLevel("axe", 0, this.blockState.getBaseState().withProperty(VARIANT, EnumMachines.values()[x]));
			}else{
				setHarvestLevel("pickaxe", 1, this.blockState.getBaseState().withProperty(VARIANT, EnumMachines.values()[x]));
			}
		}
	}



	//---------- VARIANT HANDLER ----------
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(VARIANT, EnumMachines.values()[meta]);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumMachines)state.getValue(VARIANT)).ordinal();
	}

	@Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
    	TileEntityInv tile = (TileEntityInv)world.getTileEntity(pos);
    	return state.withProperty(FACING, EnumFacing.getFront(tile.facing));
    }

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT, FACING });
	}



	//---------- BLOCK HANDLER ----------
    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
    	int meta = stack.getItemDamage();
    	int facingIndex = placer.getHorizontalFacing().ordinal();
    	EnumFacing isFacing = EnumFacing.getFront(2);
        world.setBlockState(pos, state.withProperty(VARIANT, EnumMachines.values()[meta]).withProperty(FACING, isFacing), 2);

        TileEntity te = world.getTileEntity(pos);
        if(world.getTileEntity(pos) != null){
	    	MachinesUtils.restoreMachineNBT(stack, te, facingIndex);

	        if(te instanceof TECuttingStation){
	        	restoreCuttingStationNBT(stack, te);
	        }
        }
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items){
        for (int i = 0; i < this.array.length; ++i){
        	if(i == EnumMachines.CUTTING_STATION.ordinal()){ 
        		if(ModConfig.CAN_USE_CUTTING_STATION){
            		items.add(new ItemStack(this, 1, i));
        		}
        	}else{
        		if(!isAnimated(i)){
        			items.add(new ItemStack(this, 1, i));
        		}
        	}
        }
    }

	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		int meta = state.getBlock().getMetaFromState(state);
		if(meta == EnumMachines.MILL_WHEEL.ordinal() || meta == EnumMachines.MILL_WHEEL_ANIMATED.ordinal()){
			return handleBox(state, source, pos, 0.4D, 0.6D, 1.0D);
		}else if(meta == EnumMachines.CARVING_RACK.ordinal()){
			return handleBox(state, source, pos, 0.6D, 0.4D, 0.7D);
		}
        return FULL_BLOCK_AABB;
    }

	private AxisAlignedBB handleBox(IBlockState state, IBlockAccess world, BlockPos pos, double min, double max, double h) {
		TileEntity tile = world.getTileEntity(pos);
		double minX = 0.0D;
		double minZ = 0.0D;
		double maxX = 1.0D;
		double maxZ = 1.0D;
		if(tile != null && tile instanceof TileEntityInv){
			TileEntityInv mill = (TileEntityInv) tile;
			if(mill.getFacing() == EnumFacing.NORTH){
				maxZ = max;
			}else if(mill.getFacing() == EnumFacing.SOUTH){
				minZ = min;
			}else if(mill.getFacing() == EnumFacing.EAST){
				minX = min;
			}else if(mill.getFacing() == EnumFacing.WEST){
				maxX = max;
			}
		}
		return new AxisAlignedBB(minX, 0.0D, minZ, maxX, h, maxZ);
	}

	@Override
	public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
		IBlockState state = world.getBlockState(pos);
		int meta = state.getBlock().getMetaFromState(state);
		if(CoreUtils.hasWrench(player)){
			handleRotation(world, pos, player, meta);
		}
	}



	//---------- TILE HANDLER ----------
    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.CUTOUT;
    }

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		int meta = state.getBlock().getMetaFromState(state);
		if(meta == EnumMachines.CUTTING_STATION.ordinal()){
			return new TECuttingStation();
		}else if(meta == EnumMachines.ROCK_VENDOR.ordinal()){
			return new TERockVendor();
		}else if(meta == EnumMachines.MILL_WHEEL.ordinal()){
			return new TEMillWheel();
		}else if(meta == EnumMachines.MILL_WHEEL_ANIMATED.ordinal()){
			return new TEMillWheelAnimated();
		}else if(meta == EnumMachines.ROCK_PLATFORM.ordinal()){
			return new TERockPlatform();
		}else if(meta == EnumMachines.STONE_RAMMER.ordinal()){
			return new TEStoneRammer();
		}else if(meta == EnumMachines.STONE_RAMMER_ANIMATED.ordinal()){
			return new TEStoneRammerAnimated();
		}else if(meta == EnumMachines.CARVING_BENCH.ordinal()){
			return new TECarvingBench();
		}else if(meta == EnumMachines.CARVING_BENCH_ANIMATED.ordinal()){
			return new TECarvingBenchAnimated();
		}else if(meta == EnumMachines.CARVING_RACK.ordinal()){
			return new TECarvingRack();
		}else if(meta == EnumMachines.SCULPTING_BENCH.ordinal()){
			return new TESculptingBench();
		}else if(meta == EnumMachines.SCULPTING_BENCH_ANIMATED.ordinal()){
			return new TESculptingBenchAnimated();
		}
		return null;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if (!world.isRemote) {
			if(world.getTileEntity(pos) instanceof IFluidHandlingTile){
				if (CoreUtils.isBucketType(player.getHeldItemMainhand())){
					((IFluidHandlingTile)world.getTileEntity(pos)).interactWithFluidHandler(player, hand, world, pos, facing);
					return true;
				}
			}
			int meta = getMetaFromState(state);
			if(meta == EnumMachines.CUTTING_STATION.ordinal()){
				player.openGui(Rhrocks.instance, GuiHandler.cutting_station_id, world, pos.getX(), pos.getY(), pos.getZ());
			}
			if(meta == EnumMachines.ROCK_VENDOR.ordinal()){
				player.openGui(Rhrocks.instance, GuiHandler.rock_vendor_id, world, pos.getX(), pos.getY(), pos.getZ());
			}
			if(meta == EnumMachines.ROCK_PLATFORM.ordinal()){
				TERockPlatform cutting = (TERockPlatform)world.getTileEntity(pos);
				ItemStack outputStack = cutting.outputSlot().copy();
				if(!outputStack.isEmpty()){
					EntityItem outEntity = new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5, outputStack);
						outEntity.motionX = 0; outEntity.motionY = 0; outEntity.motionZ = 0;
						if(!world.isRemote){
							world.spawnEntity(outEntity);
						}
			            world.playSound((EntityPlayer)null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM, SoundCategory.AMBIENT, 0.5F, this.rand.nextFloat() * 0.1F + 0.9F);
						cutting.getOutput().extractItem(TileEntityInv.OUTPUT_SLOT, outputStack.getCount(), false);
				}else{
					ItemStack inputStack = cutting.inputSlot().copy();
					if(!inputStack.isEmpty()){
						EntityItem inputEntity = new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5, inputStack);
						inputEntity.motionX = 0; inputEntity.motionY = 0; inputEntity.motionZ = 0;
						if(!world.isRemote){
							world.spawnEntity(inputEntity);
						}
			            world.playSound((EntityPlayer)null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM, SoundCategory.AMBIENT, 0.5F, this.rand.nextFloat() * 0.1F + 0.9F);
						cutting.getInput().extractItem(TileEntityInv.INPUT_SLOT, inputStack.getCount(), false);
					}else{
						if(inputStack.isEmpty()){
							if(!player.getHeldItemMainhand().isEmpty()){
								int possibleStack = cutting.inputSlot().getMaxStackSize() - cutting.inputSlot().getCount();
								int availableStack = player.getHeldItemMainhand().getCount();
								int addingStack = availableStack < possibleStack ? availableStack : possibleStack;
								cutting.getInput().insertItem(TileEntityInv.INPUT_SLOT, new ItemStack(player.getHeldItemMainhand().getItem(), addingStack, player.getHeldItemMainhand().getItemDamage()), false);
								player.getHeldItemMainhand().shrink(addingStack);
					            world.playSound((EntityPlayer)null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ITEMFRAME_PLACE, SoundCategory.AMBIENT, 0.5F, this.rand.nextFloat() * 0.1F + 0.9F);
							}
						}
					}
				}
			}
			if(meta == EnumMachines.CARVING_RACK.ordinal()){
				player.openGui(Rhrocks.instance, GuiHandler.carving_bench_id, world, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}



	//---------- DROP HANDLER ----------
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(this);
	}

	@Override
	public int damageDropped(IBlockState state) {
		int meta = getMetaFromState(state);
		return isAnimated(meta) ? meta - 1 : meta;
	}

	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		int meta = getMetaFromState(state);
		if(isAnimated(meta)){
			return new ItemStack(Item.getItemFromBlock(this), 1, meta -1);
		}
		return super.getPickBlock(state, target, world, pos, player);
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack){
        player.addStat(StatList.getBlockStats(this));
        player.addExhaustion(0.005F);
		int meta = getMetaFromState(state);
        List<ItemStack> items = new ArrayList<ItemStack>();
        ItemStack itemstack = isAnimated(meta) ? new ItemStack(this, 1, meta -1) : new ItemStack(this, 1, meta);
        if(te != null){
       		MachinesUtils.addMachineNbt(itemstack, te);

        	if(te instanceof TECuttingStation){
        		addCuttingStationNbt(itemstack, te);
        	}
        	
        }
        if (!itemstack.isEmpty()){
        	items.add(itemstack);
        }
        ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true, player);
        for (ItemStack item : items){
        	spawnAsEntity(worldIn, pos, item);
        }
    }

    private boolean isAnimated(int meta) {
		return meta == EnumMachines.MILL_WHEEL_ANIMATED.ordinal()
			|| meta == EnumMachines.STONE_RAMMER_ANIMATED.ordinal()
			|| meta == EnumMachines.CARVING_BENCH_ANIMATED.ordinal()
			|| meta == EnumMachines.SCULPTING_BENCH_ANIMATED.ordinal();
	}

	private static void addCuttingStationNbt(ItemStack itemstack, TileEntity te) {
		TECuttingStation cuttingStation = ((TECuttingStation)te);
		NBTTagCompound water = new NBTTagCompound(); 
		itemstack.getTagCompound().setInteger("Recipe", cuttingStation.cutSelector);
		if(cuttingStation.inputTank.getFluid() != null){
			cuttingStation.inputTank.getFluid().writeToNBT(water);
			itemstack.getTagCompound().setTag(EnumFluidNbt.WATER.nameTag(), water);
		}
	}
	private static void restoreCuttingStationNBT(ItemStack stack, TileEntity te) {
		TECuttingStation tank = ((TECuttingStation)te);
    	if(stack.hasTagCompound() && tank != null){
			if(stack.getTagCompound().hasKey(EnumFluidNbt.WATER.nameTag())){
				tank.inputTank.setFluid(FluidStack.loadFluidStackFromNBT(stack.getTagCompound().getCompoundTag(EnumFluidNbt.WATER.nameTag())));
			}
    	}
	}

}