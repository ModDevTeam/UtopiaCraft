package Mrhand3.BigModBF.blocks;

import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;


public class BlockRenderingHandler implements ISimpleBlockRenderingHandler {
    public static final double POSITION_FIX = -0.5D;
    private static TEF generator = new TEF();

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
        TileEntityRenderer entityRenderer = TileEntityRenderer.instance;
        if (modelID == BlockManager.Machine1Idle.getRenderType()) {
            entityRenderer.renderTileEntityAt(generator, POSITION_FIX, POSITION_FIX, POSITION_FIX, 0.0F);
        }
    }

    @SuppressWarnings("unused")
	@Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        Tessellator tes = Tessellator.instance;
        //if (tes.isDrawing) return false;
        TileEntity toRender = null;

       

        if (toRender != null) {
            RenderUtils.RenderStaticTileEntity(world, x, y, z, renderer, toRender);
            return true;
        }

        return false;
    }

    @Override
    public boolean shouldRender3DInInventory() {
        return true;
    }

    @Override
    public int getRenderId() {
        return BlockManager.Machine1Idle.getRenderType();
    }
}