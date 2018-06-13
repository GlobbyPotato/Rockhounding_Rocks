package com.globbypotato.rockhounding_rocks.machines.gui;

import java.util.List;

import com.globbypotato.rockhounding_core.machines.gui.GuiUtils;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.container.CORockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockVendor;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class UIRockVendor extends GuiBase {
	private final TERockVendor tile;
	public static final ResourceLocation TEXTURE_REF =  new ResourceLocation(Reference.MODID + ":textures/gui/guirockvendor.png");
	public static final ResourceLocation TEXTURE_JEI =  new ResourceLocation(Reference.MODID + ":textures/gui/jei/jeirockvendor.png");
	public static int WIDTH = 176;
	public static int HEIGHT = 200;

	public UIRockVendor(InventoryPlayer playerInv, TERockVendor tile){
		super(new CORockVendor(playerInv, tile));
		TEXTURE = TEXTURE_REF;
		this.tile = tile;
		this.xSize = WIDTH;
		this.ySize = HEIGHT;
		this.containerName = "container." + TERockVendor.getName();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float f) {
		super.drawScreen(mouseX, mouseY, f);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		List<String> tooltip;

		//prev color
		if(GuiUtils.hoveringArea(10, 28, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Previous Color", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//next color
		if(GuiUtils.hoveringArea(48, 28, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Next Color", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//color caption
		if(GuiUtils.hoveringArea(28, 30, 18, 12, mouseX, mouseY, x, y)){
			String text = "No color selected";
			if(this.tile.isValidColor()){
				text = this.tile.getColorName() + " rocks";
				tooltip = GuiUtils.drawLabel(text, mouseX, mouseY);
		    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
			}
		}

		//prev rock
		if(GuiUtils.hoveringArea(10, 54, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Previous Rock", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//next rock
		if(GuiUtils.hoveringArea(130, 54, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Next Rock", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//buy
		if(GuiUtils.hoveringArea(130, 28, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Purchase Rock", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

		//finder
		if(this.tile.getInput().getStackInSlot(TERockVendor.INSCRIBER_SLOT).isEmpty()){
			if(GuiUtils.hoveringArea(148, 79, 18, 18, mouseX, mouseY, x, y)){
				tooltip = GuiUtils.drawLabel("Insert here a Rock Finder", mouseX, mouseY);
		    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
			}
		}

		//inscribe
		if(GuiUtils.hoveringArea(130, 80, 16, 16, mouseX, mouseY, x, y)){
			tooltip = GuiUtils.drawLabel("Inscribe Rock Finder", mouseX, mouseY);
	    	drawHoveringText(tooltip, mouseX, mouseY, this.fontRenderer);
		}

	}

	 @Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);
		String recipeLabel = "No Rocks available";
		if(this.tile.isRockSelected()){
			recipeLabel = TERockVendor.filteredRocks.get(this.tile.rockScan).getDisplayName();
		}
		this.fontRenderer.drawString(recipeLabel, 29, 58, 4210752);

		this.fontRenderer.drawString("x" + String.valueOf(this.tile.getFeeAmount()), 108, 36, 4210752);

		if(!RocksGenerator.BIOMES_ENABLER){
			this.fontRenderer.drawString("Biome Filter is Disabled!", 19, 85, 10040115);
		}
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

		if(this.tile.isValidColor()){
			this.drawTexturedModalRect(i + 28, j + 30, 176, 0 + (this.tile.colorScan * 12), 18, 12); //color icon
		}

	}

}