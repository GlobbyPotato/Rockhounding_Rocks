package com.globbypotato.rockhounding_rocks.machines.gui;

import java.util.List;

import com.globbypotato.rockhounding_core.machines.gui.GuiUtils;
import com.globbypotato.rockhounding_rocks.enums.EnumCuts;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.container.COCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class UICuttingStation extends GuiBase {
	private final TECuttingStation tile;
	public static final ResourceLocation TEXTURE_REF =  new ResourceLocation(Reference.MODID + ":textures/gui/guicuttingstation.png");
	public static final ResourceLocation TEXTURE_JEI =  new ResourceLocation(Reference.MODID + ":textures/gui/jei/jeicuttingstation.png");
	public static int WIDTH = 176;
	public static int HEIGHT = 232;

	public UICuttingStation(InventoryPlayer playerInv, TECuttingStation tile){
		super(new COCuttingStation(playerInv, tile));
		TEXTURE = TEXTURE_REF;
		this.tile = tile;
		this.xSize = WIDTH;
		this.ySize = HEIGHT;
		this.containerName = "container." + TECuttingStation.getName();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float f) {
		super.drawScreen(mouseX, mouseY, f);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		
		//fuel
	    if(GuiUtils.hoveringArea(25, 25, 53, 9, mouseX, mouseY, x, y)){
	    	List<String> tooltip = GuiUtils.drawStorage(TextFormatting.GOLD, "ticks", TextFormatting.YELLOW, this.tile.getCooktimeMax(), this.tile.getPower(), this.tile.getPowerMax(), mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
	    }

		//fuel status
		if(GuiUtils.hoveringArea(7, 25, 18, 18, mouseX, mouseY, x, y)){
			List<String> tooltip = GuiUtils.drawStorage(TextFormatting.GOLD, "ticks", TextFormatting.YELLOW, 0, this.tile.getPower(), this.tile.getPowerMax(), mouseX, mouseY);
			drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//water
	    if(GuiUtils.hoveringArea(98, 25, 53, 9, mouseX, mouseY, x, y)){
	    	List<String> tooltip = GuiUtils.drawStorage(TextFormatting.BLUE, "mB", TextFormatting.YELLOW, this.tile.getConsumedWater(), this.tile.inputTank.getFluidAmount(), this.tile.inputTank.getCapacity(), mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
	    }

		//cut list
		for (int row = 0; row < 3; row++){
			for (int col = 0; col < 9; col++){
				int colOff = col * 18;
				int rowOff = row * 18;
				if(mouseX >= 8+colOff+x && mouseX <= 26+colOff+x && mouseY >= 92+rowOff+y && mouseY <= 107+rowOff+y){
					int cutCode = (col + (row * 9));
					if(cutCode < EnumCuts.size()){
						String text = cutCode + ": " + EnumCuts.values()[cutCode].getCut();
						List<String> tooltip = GuiUtils.drawLabel(text, mouseX, mouseY);
				    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
					}
				}
			}
		}
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

		//power bar
        if (this.tile.getPower() > 0){
            int k = GuiUtils.getScaledValue(51, this.tile.getPower(), this.tile.getPowerMax());
            this.drawTexturedModalRect(i + 25, j + 26, 0, 232, k, 7);
        }

		//water bar
        int w = GuiUtils.getScaledValue(51, this.tile.inputTank.getFluidAmount(), this.tile.inputTank.getCapacity());
        this.drawTexturedModalRect(i + 100, j + 26, 73, 232, (51 - w), 7);

        //smelt bar
        if (this.tile.getCooktime() > 0){
            int k = GuiUtils.getScaledValue(30, this.tile.getCooktime(), this.tile.getCooktimeMax());
            this.drawTexturedModalRect(i + 73, j + 48, 176, 0, k, 17);
        }

		//cuts selection
		if(this.tile.cutSelector > -1){
			int thisCut = this.tile.cutSelector;
			int uiColOff = 0;
			int uiRowOff = 0;
			int xColOff = 0;
			int xRowOff = 0;
			if(thisCut >= 0 && thisCut <= 8){
				uiColOff = thisCut * 18;
				uiRowOff = 92;
				xColOff = 207;
				xRowOff = thisCut * 16;
			}else if(thisCut >= 9 && thisCut <= 17){
				uiColOff = (thisCut - 9) * 18;
				uiRowOff = 110;
				xColOff = 223;
				xRowOff = (thisCut - 9) * 16;
			}else if(thisCut >= 18 && thisCut <= 21){
				uiColOff = (thisCut - 18) * 18;
				uiRowOff = 128;
				xColOff = 239;
				xRowOff = (thisCut - 18) * 16;
			}
			this.drawTexturedModalRect(i + 8 + uiColOff,   j + uiRowOff,  xColOff, 0 + xRowOff,  16, 16);
		}		
	}
}