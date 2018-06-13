package com.globbypotato.rockhounding_rocks.machines.renders;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RendererSculptingBench extends TileEntitySpecialRenderer<TESculptingBenchAnimated>{
	private static EntityItem rock;

	@Override
	public void render(TESculptingBenchAnimated cutter, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		super.render(cutter, x, y, z, partialTicks, destroyStage, alpha);

		if(cutter != null){
			if(!cutter.platformInput().isEmpty()){
				ItemStack inputStack = new ItemStack(cutter.platformInput().getItem(), 1, cutter.platformInput().getItemDamage());
				World world = Minecraft.getMinecraft().world;
				if(!inputStack.isEmpty()){
					rock = new EntityItem(world, 0, 0, 0, inputStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.scale(1.2, 1.2, 1.2);
						GlStateManager.translate(0.415, 0.46, 0.415);
						GlStateManager.rotate(cutter.getRolling(), 0, 1, 0);
						Minecraft.getMinecraft().getRenderManager().renderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}
		}

	}
}