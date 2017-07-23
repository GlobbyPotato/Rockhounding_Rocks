package com.globbypotato.rockhounding_rocks.machines.gui;

import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityMachineBase;
import com.globbypotato.rockhounding_rocks.machines.container.ContainerBase;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public abstract class GuiBase extends GuiContainer{
	
    public static ResourceLocation TEXTURE = new ResourceLocation("");
    
	public GuiBase(TileEntityMachineBase tile, ContainerBase container) {
        super(container);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	    this.mc.getTextureManager().bindTexture(TEXTURE);
	    this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	protected int getBarScaled(int pixels, int count, int max) {
        return count > 0 && max > 0 ? count * pixels / max : 0;
	}

}