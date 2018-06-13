package com.globbypotato.rockhounding_rocks.machines.renders;

import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RendererCuttingStation extends TileEntitySpecialRenderer<TECuttingStation>{
	private static EntityItem rock;

	@Override
	public void render(TECuttingStation cutter, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		super.render(cutter, x, y, z, partialTicks, destroyStage, alpha);

		if(cutter != null){
			if(!cutter.getInput().getStackInSlot(TileEntityInv.INPUT_SLOT).isEmpty()){
				ItemStack inputStack = new ItemStack(cutter.getInput().getStackInSlot(TileEntityInv.INPUT_SLOT).getItem(), 1, cutter.getInput().getStackInSlot(TileEntityInv.INPUT_SLOT).getItemDamage());
				World world = Minecraft.getMinecraft().world;
				if(!inputStack.isEmpty()){
					rock = new EntityItem(world, 0, 0, 0, inputStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.rotate(0F, 0, 0, 0);
						GlStateManager.scale(2.3, 2.3, 2.3);
						GlStateManager.translate(0.22, -0.195, 0.22);
						Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}
		}

	}
}