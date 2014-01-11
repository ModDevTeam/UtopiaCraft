package Mrhand3.BigModBF.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;

public class HWS extends BlockFluid {

    // super constructor gets the id of the liquid
    public HWS(int id) {
        // sets the id, the fluid, and the material type
        super(id, Material.water);
    }

    // gets the texture/icon uses the water texture, not sure how to get custom
    // texture yet
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.theIcon = new Icon[] {
                iconRegister.registerIcon("bigmod:hw_still"),
                iconRegister.registerIcon("bigmod:hw_flow") };
    }

    // colors the texture of the fluid to a greenish color

}