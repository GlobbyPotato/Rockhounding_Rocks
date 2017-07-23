package com.globbypotato.rockhounding_rocks.machines;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_core.enums.EnumFluidNbt;
import com.globbypotato.rockhounding_rocks.handler.GuiHandler;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CuttingStation extends BaseMachine{
    public CuttingStation(float hardness, float resistance, String name){
        super(name, Material.IRON, TileEntityCuttingStation.class,GuiHandler.cuttingStationID);
		setHardness(hardness);
		setResistance(resistance);	
		setHarvestLevel("pickaxe", 0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return  BlockRenderLayer.CUTOUT;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
    	super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing()), 2);
		if(stack.hasTagCompound()){
        	int recipe = stack.getTagCompound().getInteger("Recipe");
        	TileEntityCuttingStation te = (TileEntityCuttingStation) worldIn.getTileEntity(pos);
			if(te != null){
       			te.cutSelector = recipe;
        		if(stack.getTagCompound().hasKey(EnumFluidNbt.WATER.nameTag())){
        			te.inputTank.setFluid(FluidStack.loadFluidStackFromNBT(stack.getTagCompound().getCompoundTag(EnumFluidNbt.WATER.nameTag())));
        		}
			}
		}
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack){
        player.addStat(StatList.getBlockStats(this));
        player.addExhaustion(0.025F);
        java.util.List<ItemStack> items = new java.util.ArrayList<ItemStack>();
        ItemStack itemstack = new ItemStack(Item.getItemFromBlock(this));
        if(te != null && te instanceof TileEntityCuttingStation){
  			addNbt(itemstack, te);
        }
        if (itemstack != null){ items.add(itemstack); }
        net.minecraftforge.event.ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true, player);
        for (ItemStack item : items){ spawnAsEntity(worldIn, pos, item); }
    }

	private void addNbt(ItemStack itemstack, TileEntity tileentity) {
		TileEntityCuttingStation cuttingStation = ((TileEntityCuttingStation)tileentity);
		itemstack.setTagCompound(new NBTTagCompound());
		addPowerNbt(itemstack, tileentity);
		NBTTagCompound water = new NBTTagCompound(); 
		itemstack.getTagCompound().setInteger("Recipe", cuttingStation.cutSelector);
		if(cuttingStation.inputTank.getFluid() != null){
			cuttingStation.inputTank.getFluid().writeToNBT(water);
			itemstack.getTagCompound().setTag(EnumFluidNbt.WATER.nameTag(), water);
		}
	}

}