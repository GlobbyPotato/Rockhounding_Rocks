package com.globbypotato.rockhounding_rocks.machines.gui;

import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.container.COCarvingRack;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class UICarvingRack extends GuiBase {
	private final TECarvingRack tile;
	public static final ResourceLocation TEXTURE_REF =  new ResourceLocation(Reference.MODID + ":textures/gui/guicarvingbench.png");
	public static final ResourceLocation TEXTURE_JEI =  new ResourceLocation(Reference.MODID + ":textures/gui/jei/jeicarvingbench.png");
	public static int WIDTH = 176;
	public static int HEIGHT = 200;

	public UICarvingRack(InventoryPlayer playerInv, TECarvingRack tile){
		super(new COCarvingRack(playerInv, tile));
		TEXTURE = TEXTURE_REF;
		this.tile = tile;
		this.xSize = WIDTH;
		this.ySize = HEIGHT;
		this.containerName = "container." + TECarvingRack.getName();
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
	}

}