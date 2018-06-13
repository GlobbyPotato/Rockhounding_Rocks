package com.globbypotato.rockhounding_rocks.machines.gui;

import com.globbypotato.rockhounding_core.utils.Translator;
import com.globbypotato.rockhounding_rocks.machines.container.ContainerBase;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public abstract class GuiBase extends GuiContainer{

    public static ResourceLocation TEXTURE = new ResourceLocation("");
    public String containerName = "";
	public GuiBase(ContainerBase container) {
        super(container);
    }

    @Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks){
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);
		String device = Translator.translateToLocal(this.containerName);
		this.fontRenderer.drawString(device, 7, 7, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	    this.mc.getTextureManager().bindTexture(TEXTURE);
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

}