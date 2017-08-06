package com.globbypotato.rockhounding_rocks.machines.gui;

import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.container.ContainerRockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityRockVendor;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiRockVendor extends GuiBase {
	private final InventoryPlayer playerInventory;
	private final TileEntityRockVendor rockVendor;
	public static final int WIDTH = 176;
	public static final int HEIGHT = 177;
	public static final ResourceLocation TEXTURE_REF =  new ResourceLocation(Reference.MODID + ":textures/gui/guirockvendor.png");

	public GuiRockVendor(InventoryPlayer playerInv, TileEntityRockVendor tile){
		super(tile,new ContainerRockVendor(playerInv, tile));
		this.playerInventory = playerInv;
		TEXTURE = TEXTURE_REF;
		this.rockVendor = tile;
		this.xSize = WIDTH;
		this.ySize = HEIGHT;
		this.containerName = "container.rockVendor";
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float f) {
		super.drawScreen(mouseX, mouseY, f);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;

		//prev color
		if(mouseX >= 11+x && mouseX <= 24+x && mouseY >= 19+y && mouseY <= 32+y){
			drawButtonLabel("Previous Color", mouseX, mouseY);
		}

		//next color
		if(mouseX >= 49+x && mouseX <= 62+x && mouseY >= 19+y && mouseY <= 32+y){
			drawButtonLabel("Next Color", mouseX, mouseY);
		}

		//color caption
		if(mouseX >= 28+x && mouseX <= 45+x && mouseY >= 20+y && mouseY <= 32+y){
			String text = "No color selected";
			if(this.rockVendor.isValidColor()){
				text = this.rockVendor.getColorName() + " rocks";
				drawButtonLabel(text, mouseX, mouseY);
			}
		}

		//prev rock
		if(mouseX >= 11+x && mouseX <= 24+x && mouseY >= 45+y && mouseY <= 58+y){
			drawButtonLabel("Previous Rock", mouseX, mouseY);
		}

		//next rock
		if(mouseX >= 127+x && mouseX <= 140+x && mouseY >= 45+y && mouseY <= 58+y){
			drawButtonLabel("Next Rock", mouseX, mouseY);
		}

		//buy
		if(mouseX >= 131+x && mouseX <= 144+x && mouseY >= 19+y && mouseY <= 32+y){
			drawButtonLabel("Purchase Rock", mouseX, mouseY);
		}
	}

	 @Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);
		String recipeLabel = "No Rocks available";
		if(this.rockVendor.isRockSelected()){
			recipeLabel = this.rockVendor.filteredRocks.get(this.rockVendor.rockScan).getDisplayName();
		}
		this.fontRendererObj.drawString(recipeLabel, 29, 48, 4210752);

		this.fontRendererObj.drawString("x" + String.valueOf(this.rockVendor.getFeeAmount()), 108, 26, 4210752);

		if(!RocksGenerator.BIOMES_ENABLER){
			this.fontRendererObj.drawString("Biome Filter is Disabled!", 19, 75, 10040115);
		}
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

		if(this.rockVendor.isValidColor()){
			this.drawTexturedModalRect(i + 28, j + 20, 176, 0 + (this.rockVendor.colorScan * 12), 18, 12); //color icon
		}

	}

}