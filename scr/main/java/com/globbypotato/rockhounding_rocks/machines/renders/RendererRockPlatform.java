package com.globbypotato.rockhounding_rocks.machines.renders;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockPlatform;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RendererRockPlatform extends TileEntitySpecialRenderer<TERockPlatform>{
	private static EntityItem rock;

	@Override
	public void render(TERockPlatform rammer, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		super.render(rammer, x, y, z, partialTicks, destroyStage, alpha);
		World world = Minecraft.getMinecraft().world;

		if(rammer != null){
			ItemStack inputSlot = rammer.getInput().getStackInSlot(TERockPlatform.INPUT_SLOT);
			ItemStack outputSlot = rammer.getOutput().getStackInSlot(TERockPlatform.OUTPUT_SLOT);
			
			if(!inputSlot.isEmpty()){
				ItemStack inputStack = new ItemStack(inputSlot.getItem(), 1, inputSlot.getItemDamage());
				if(!inputStack.isEmpty()){
					rock = new EntityItem(world, 0, 0, 0, inputStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.rotate(0F, 0, 0, 0);
						GlStateManager.scale(3.93, 3.87, 3.93);
						GlStateManager.translate(0.127, -0.215, 0.127);
						Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}else{
				if(!outputSlot.isEmpty()){
					ItemStack outputStack = new ItemStack(outputSlot.getItem(), 1, outputSlot.getItemDamage());
					if(!outputStack.isEmpty()){
						rock = new EntityItem(world, 0, 0, 0, outputStack);
						rock.hoverStart = 0;
						GlStateManager.pushMatrix();
						{
							GlStateManager.translate(x, y, z);
							GlStateManager.rotate(0F, 0, 0, 0);
							GlStateManager.scale(3.93, 3.87, 3.93);
							GlStateManager.translate(0.127, -0.215, 0.127);
							Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
						}
						GlStateManager.popMatrix();
					}
				}
			}
		}
	}
}