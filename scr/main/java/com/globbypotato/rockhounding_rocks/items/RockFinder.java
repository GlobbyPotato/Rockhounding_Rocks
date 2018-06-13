package com.globbypotato.rockhounding_rocks.items;

import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_rocks.items.io.UtilIO;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RockFinder extends UtilIO {
	public Set<Type> biomeTypes;

	public RockFinder(String name) {
		super(name);
	}

	@Override
    public void onCreated(ItemStack itemstack, World world, EntityPlayer player) {
		setItemNbt(itemstack);
    }

    private static void setItemNbt(ItemStack itemstack) {
    	itemstack.setTagCompound(new NBTTagCompound());
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
    	if(!worldIn.isRemote){
    		ItemStack stack = playerIn.getHeldItemMainhand();
    		if(RocksGenerator.BIOMES_ENABLER){
	    		ItemStack heldItem = playerIn.getHeldItem(EnumHand.MAIN_HAND);
	    		if(!heldItem.isEmpty() && heldItem.isItemEqual(ToolUtils.finder)){
	    			if(heldItem.hasTagCompound()){
	    				if(heldItem.getTagCompound().hasKey("Biomes")){
	    					Biome biome = worldIn.getBiome(pos);
	    	            	String rock = stack.getTagCompound().getString("Rock");
	    	            	String type = stack.getTagCompound().getString("Type");
	    	            	this.biomeTypes = BiomeDictionary.getTypes(biome);
	    	            	if(!this.biomeTypes.isEmpty() && this.biomeTypes.size() > 0){
		                    	for(Type t : this.biomeTypes){
		            				if(t.getName().toLowerCase().matches(type.toLowerCase())){
		            					playerIn.sendMessage(new TextComponentString("Some " + rock + " could be found in this area"));
		            		            return EnumActionResult.SUCCESS;
		            				}
		                    	}
	    	            	}
	    				}
	    			}
	    		}
    		}
    	}
        return EnumActionResult.FAIL;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flag){
    	String rock = ""; String type = ""; String level = ""; String size = ""; int biomeNum = 0;
        if (itemstack.hasTagCompound()) {
        	if(itemstack.getTagCompound().hasKey("Rock")){
        		rock = itemstack.getTagCompound().getString("Rock");
        	}else{
        		rock = "N/A";
        	}
        	if(itemstack.getTagCompound().hasKey("Level")){
        		level = itemstack.getTagCompound().getString("Level");
        	}else{
        		level = "N/A";
        	}
        	if(itemstack.getTagCompound().hasKey("Size")){
        		size = itemstack.getTagCompound().getString("Size");
        	}else{
        		size = "N/A";
        	}
        	if(itemstack.getTagCompound().hasKey("Type")){
        		type = itemstack.getTagCompound().getString("Type");
        	}else{
        		type = "N/A";
        	}
        	tooltip.add(TextFormatting.DARK_GRAY + "Rock: " + TextFormatting.RED + rock);
        	tooltip.add(TextFormatting.DARK_GRAY + "Spawn: " + TextFormatting.YELLOW + type + " biomes");
        	tooltip.add(TextFormatting.DARK_GRAY + "Level: " + TextFormatting.WHITE + level);
        	tooltip.add(TextFormatting.DARK_GRAY + "Size: " + TextFormatting.GRAY + size);

        	if(itemstack.getTagCompound().hasKey("Biomes")){
        		biomeNum = itemstack.getTagCompound().getInteger("Biomes");
    			if(biomeNum > 0){
    				for(int x = 0; x < biomeNum; x++){
    		        	tooltip.add(TextFormatting.AQUA + itemstack.getTagCompound().getString("Biome" + x));
    				}
            	}else{
		        	tooltip.add(TextFormatting.AQUA + itemstack.getTagCompound().getString("Biome0"));
		        	tooltip.add(TextFormatting.AQUA + itemstack.getTagCompound().getString("Biome1"));
    			}
        	}else{
        		biomeNum = 0;
        	}
        }else{
        	itemstack.setTagCompound(new NBTTagCompound());
        }
	}

}