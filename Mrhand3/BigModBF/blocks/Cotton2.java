package Mrhand3.BigModBF.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Cotton2 extends BlockFlower{

	public Cotton2(int par1, Material par2Material) {
		super(par1, par2Material.plants);

	}
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.leaves.blockID || par1 == Block.wood.blockID || par1 == Block.sandStone.blockID;
    }
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconReg) {
		blockIcon = iconReg.registerIcon("bigmod:cotton2");
	}

}
