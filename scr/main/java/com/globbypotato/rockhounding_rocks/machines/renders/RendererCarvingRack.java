package com.globbypotato.rockhounding_rocks.machines.renders;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class RendererCarvingRack extends TileEntitySpecialRenderer<TECarvingRack>{
	private static EntityItem rock;

	@Override
	public void render(TECarvingRack cutter, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		super.render(cutter, x, y, z, partialTicks, destroyStage, alpha);

		if(cutter != null){
			World world = Minecraft.getMinecraft().world;
			EnumFacing facing = cutter.getFacing();
			if(!cutter.getInput().getStackInSlot(cutter.PATTERN_SLOT).isEmpty()){
				ItemStack patternStack = new ItemStack(cutter.getInput().getStackInSlot(cutter.PATTERN_SLOT).getItem(), 1, cutter.getInput().getStackInSlot(cutter.PATTERN_SLOT).getItemDamage());
				if(!patternStack.isEmpty()){
					rock = new EntityItem(world, 0, 0, 0, patternStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.scale(0.65, 0.65, 0.65);
						if(facing == EnumFacing.SOUTH){
							GlStateManager.rotate(180F, 0, 1, 0);
							GlStateManager.translate(-1.20, 0.25, -1.29);
						}else if (facing == EnumFacing.NORTH){
							GlStateManager.rotate(0F, 0, 1, 0);
							GlStateManager.translate(0.35, 0.25, 0.26);
						}else if (facing == EnumFacing.EAST){
							GlStateManager.rotate(270F, 0, 1, 0);
							GlStateManager.translate(0.35, 0.25, -1.29);
						}else if (facing == EnumFacing.WEST){
							GlStateManager.rotate(90F, 0, 1, 0);
							GlStateManager.translate(-1.20, 0.25, 0.26);
						}
						Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}
			if(!cutter.getInput().getStackInSlot(cutter.TOOL_SLOT).isEmpty()){
				ItemStack toolStack = new ItemStack(cutter.getInput().getStackInSlot(cutter.TOOL_SLOT).getItem(), 1, cutter.getInput().getStackInSlot(cutter.TOOL_SLOT).getItemDamage());
				if(!toolStack.isEmpty()){
					rock = new EntityItem(world, 0, 0, 0, toolStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.scale(0.65, 0.65, 0.65);
						if(facing == EnumFacing.SOUTH){
							GlStateManager.rotate(180F, 0, 1, 0);
							GlStateManager.translate(-0.35, 0.25, -1.29);
						}else if (facing == EnumFacing.NORTH){
							GlStateManager.rotate(0F, 0, 1, 0);
							GlStateManager.translate(1.20, 0.25, 0.26);
						}else if (facing == EnumFacing.EAST){
							GlStateManager.rotate(270F, 0, 1, 0);
							GlStateManager.translate(1.20, 0.25, -1.29);
						}else if (facing == EnumFacing.WEST){
							GlStateManager.rotate(90F, 0, 1, 0);
							GlStateManager.translate(-0.35, 0.25, 0.26);
						}
						Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}
		}

	}
}