package com.globbypotato.rockhounding_rocks.machines.gui;

import java.util.Arrays;
import java.util.List;

import com.globbypotato.rockhounding_core.utils.RenderUtils;
import com.globbypotato.rockhounding_core.utils.Translator;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.container.ContainerCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiCuttingStation extends GuiBase {
	private final InventoryPlayer playerInventory;
	private final TileEntityCuttingStation cuttingStation;
	public static final int WIDTH = 176;
	public static final int HEIGHT = 232;
	public static final ResourceLocation TEXTURE_REF =  new ResourceLocation(Reference.MODID + ":textures/gui/guicuttingstation.png");

	public GuiCuttingStation(InventoryPlayer playerInv, TileEntityCuttingStation tile){
		super(tile,new ContainerCuttingStation(playerInv, tile));
		this.playerInventory = playerInv;
		TEXTURE = TEXTURE_REF;
		this.cuttingStation = tile;
		this.xSize = WIDTH;
		this.ySize = HEIGHT;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float f) {
		super.drawScreen(mouseX, mouseY, f);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		
		//fuel
		if(mouseX >= 10+x && mouseX <= 21+x && mouseY >= 36+y && mouseY <= 87+y){
			String[] text = {this.cuttingStation.getPower() + "/" + this.cuttingStation.getPowerMax() + " ticks"};
			List<String> tooltip = Arrays.asList(text);
			drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
		}

		//input tank
		if(mouseX>= 148+x && mouseX <= 167+x && mouseY >= 37+y && mouseY <= 101+y){
			int fluidAmount = 0;
			if(cuttingStation.inputTank.getFluid() != null){
				fluidAmount = this.cuttingStation.inputTank.getFluidAmount();
			}
			String[] text = {fluidAmount + "/" + this.cuttingStation.inputTank.getCapacity() + " mb "};
			if(cuttingStation.inputTank.getFluid() != null) text[0] += cuttingStation.inputTank.getFluid().getLocalizedName();
			List<String> tooltip = Arrays.asList(text);
			drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
		}

		if(mouseX >= 8+x && mouseX <= 24+x && mouseY >= 92+y && mouseY <= 108+y){
			String[] text = {"0: " + ToolUtils.cutNames[0]};
			List<String> tooltip = Arrays.asList(text);
			drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
		}
		
		for (int row = 0; row < 2; row++){
			for (int col = 0; col < 9; col++){
				int colOff = col * 18;
				int rowOff = row * 18;
				if(mouseX >= 7+colOff+x && mouseX <= 25+colOff+x && mouseY >= 109+rowOff+y && mouseY <= 127+rowOff+y){
					int cutCode = (col + (row * 9)) + 1;
					String[] text = {cutCode + ": " + ToolUtils.cutNames[cutCode]};
					List<String> tooltip = Arrays.asList(text);
					drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
				}
			}
		}
	}

	 @Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);

		String device = Translator.translateToLocal("container.cuttingStation");
		this.fontRendererObj.drawString(device, this.xSize / 2 - this.fontRendererObj.getStringWidth(device) / 2, 4, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        //power bar
        if (this.cuttingStation.getPower() > 0){
            int k = this.getBarScaled(50, this.cuttingStation.getPower(), this.cuttingStation.getPowerMax());
            this.drawTexturedModalRect(i + 11, j + 37 + (50 - k), 176, 17, 10, k);
        }

        //smelt bar
        if (this.cuttingStation.cookTime > 0){
            int k = this.getBarScaled(30, this.cuttingStation.cookTime, this.cuttingStation.getCookTimeMax());
            this.drawTexturedModalRect(i + 82, j + 48, 176, 0, k, 17);
        }

        //inductor
        if(this.cuttingStation.hasPermanentInduction()){
            this.drawTexturedModalRect(i + 7, j + 16, 176, 83, 18, 18);
        }

		//cuts selection
		switch(this.cuttingStation.cutSelector){
			case 0:		this.drawTexturedModalRect(i + 8,   j + 92,  176, 67,  16, 16); break;
			case 1:		this.drawTexturedModalRect(i + 8,   j + 110, 210, 0,   16, 16); break;
			case 2:		this.drawTexturedModalRect(i + 26,  j + 110, 210, 16,  16, 16); break;
			case 3:		this.drawTexturedModalRect(i + 44,  j + 110, 210, 32,  16, 16); break;
			case 4:		this.drawTexturedModalRect(i + 62,  j + 110, 210, 48,  16, 16); break;
			case 5:		this.drawTexturedModalRect(i + 80,  j + 110, 210, 64,  16, 16); break;
			case 6:		this.drawTexturedModalRect(i + 98,  j + 110, 210, 80,  16, 16); break;
			case 7:		this.drawTexturedModalRect(i + 116, j + 110, 210, 96,  16, 16); break;
			case 8:		this.drawTexturedModalRect(i + 134, j + 110, 210, 112, 16, 16); break;
			case 9:		this.drawTexturedModalRect(i + 152, j + 110, 210, 128, 16, 16); break;
			case 10:	this.drawTexturedModalRect(i + 8,   j + 128, 230, 0,   16, 16); break;
			case 11:	this.drawTexturedModalRect(i + 26,  j + 128, 230, 16,  16, 16); break;
			case 12:	this.drawTexturedModalRect(i + 44,  j + 128, 230, 32,  16, 16); break;
			case 13:	this.drawTexturedModalRect(i + 62,  j + 128, 230, 48,  16, 16); break;
			case 14:	this.drawTexturedModalRect(i + 80,  j + 128, 230, 64,  16, 16); break;
			case 15:	this.drawTexturedModalRect(i + 98,  j + 128, 230, 80,  16, 16); break;
			case 16:	this.drawTexturedModalRect(i + 116, j + 128, 230, 96,  16, 16); break;
			case 17:	this.drawTexturedModalRect(i + 134, j + 128, 230, 112, 16, 16); break;
			case 18:	this.drawTexturedModalRect(i + 152, j + 128, 230, 128, 16, 16); break;
		}

		//input fluid
		if(cuttingStation.inputTank.getFluid() != null){
			FluidStack temp = cuttingStation.inputTank.getFluid();
			int capacity = cuttingStation.inputTank.getCapacity();
			if(temp.amount > 5){
				RenderUtils.bindBlockTexture();
				RenderUtils.renderGuiTank(temp,capacity, temp.amount, i + 148, j + 37, zLevel, 20, 65);
			}
		}
	}
}