package com.globbypotato.rockhounding_rocks.machines.renders;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RendererCuttingStation extends TileEntitySpecialRenderer<TileEntityCuttingStation>{
	private static EntityItem rock;

	@Override
	public void renderTileEntityAt(TileEntityCuttingStation te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);

		TileEntityCuttingStation cutter = (TileEntityCuttingStation)te;
		if(cutter != null){
			if(cutter.getInput().getStackInSlot(cutter.INPUT_SLOT) != null){
				ItemStack inputStack = new ItemStack(cutter.getInput().getStackInSlot(cutter.INPUT_SLOT).getItem(), 1, cutter.getInput().getStackInSlot(cutter.INPUT_SLOT).getItemDamage());
				int inputSize = cutter.getInput().getStackInSlot(cutter.INPUT_SLOT).stackSize;
				World world = Minecraft.getMinecraft().theWorld;
				int metadata = cutter.getBlockMetadata();
				if(inputStack != null){
					Block renderBlock = Block.getBlockFromItem(inputStack.getItem());
					ItemStack rockStack = new ItemStack(renderBlock, 1, inputStack.getItemDamage());
					rock = new EntityItem(world, 0, 0, 0, rockStack);
					rock.hoverStart = 0;
					GlStateManager.pushMatrix();
					{
						GlStateManager.translate(x, y, z);
						GlStateManager.rotate(0F, 0, 0, 0);
						GlStateManager.scale(2.3, 2.3, 2.3);
						GlStateManager.translate(0.22, -0.195, 0.22);
						Minecraft.getMinecraft().getRenderManager().doRenderEntity(rock, 0, 0, 0, 0F, 0F, false);
					}
					GlStateManager.popMatrix();
				}
			}
		}

	}
}