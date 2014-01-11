package Mrhand3.BigModBF.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import Mrhand3.BigModBF.blocks.TEF;
import Mrhand3.BigModBF.common.BaseMod;

	public class GuiFossilizer extends GuiContainer{
		public static final ResourceLocation texture = new ResourceLocation(BaseMod.modid, "textures/gui/Fossilizer.png");
		
		public TEF Fossilizer;
		
		public GuiFossilizer(InventoryPlayer invPlayer, TEF entity) {
			super(new ContainerFossilizer(invPlayer, entity));
			
			this.Fossilizer = entity;

			this.xSize = 176;
			this.ySize = 165;
		}
		
		public void drawGuiContainerForegroundLayer(int par1, int par2){
			String s = this.Fossilizer.isInvNameLocalized() ? this.Fossilizer.getInvName() : I18n.getString(this.Fossilizer.getInvName());
			this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
			this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
		}
		
		public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
			GL11.glColor4f(1F, 1F, 1F, 1F);
			
			Minecraft.getMinecraft().getTextureManager().
			bindTexture(texture);
			
			drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
			
			int i1;

			if(this.Fossilizer.hasPower()){
				i1 = this.Fossilizer.getPowerRemainingScaled(45);
				this.drawTexturedModalRect(guiLeft + 8, guiTop + 53 - i1, 176, 62 - i1, 16, i1);
			}
			
			i1 = this.Fossilizer.getCookProgressScaled(24);
			this.drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 0, i1 + 1, 16);
		}
	}