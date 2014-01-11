package Mrhand3.BigModBF.client;

import org.lwjgl.opengl.GL11;

import Mrhand3.BigModBF.blocks.TEF;
import assets.bigmod.textures.models.fossilizer;
import assets.bigmod.textures.models.machine;
import assets.bigmod.textures.models.newfossilizer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererFossilizer implements IItemRenderer {

private newfossilizer model;

public ItemRendererFossilizer() {

model = new newfossilizer();
}

@Override
public boolean handleRenderType(ItemStack item, ItemRenderType type) {

return true;
}

@Override
public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

return true;
}

@Override
public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
TileEntityRenderer.instance.renderTileEntityAt(new TEF(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}