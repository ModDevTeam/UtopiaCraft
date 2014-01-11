package Mrhand3.BigModBF.Gui;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import Mrhand3.BigModBF.TIleEntity.TileEntityBlobEngine;
import Mrhand3.BigModBF.blocks.TEF;
import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiBenjin extends GuiContainer
{
    private TileEntityBlobEngine furnaceInventory;
	public static final ResourceLocation texture = new ResourceLocation(BaseMod.modid, "textures/gui/Fossilizer.png");
	

	public GuiBenjin(InventoryPlayer invPlayer, TileEntityBlobEngine entity) {
		super(new ContainerBenjin(invPlayer, entity));
		
		this.furnaceInventory = entity;

		this.xSize = 176;
		this.ySize = 165;
	}

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(StatCollector.translateToLocal("Energy"), 60, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
        this.fontRenderer.drawString(furnaceInventory.getEnergyLevel()+"/4000", 110, 24, 16711680);
        
    }//125 34

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
	public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().
		bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		int i1;

		/**if(this.furnaceInventory.energyLevel > 0){
			i1 = this.furnaceInventory.(45);
			this.drawTexturedModalRect(guiLeft + 8, guiTop + 53 - i1, 176, 62 - i1, 16, i1);
		}*/
		
		i1 = this.furnaceInventory.getCookProgressScaled(24);
		this.drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 0, i1 + 1, 16);
	}
}
