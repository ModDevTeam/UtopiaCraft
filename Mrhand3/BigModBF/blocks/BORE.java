package Mrhand3.BigModBF.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BORE extends Block{

	public BORE(int par1, Material par2Material) {
		super(par1, par2Material);
	    this.setCreativeTab(BaseMod.tabBlobfish);
	    this.blockHardness = 3.0F;
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconReg) {
		blockIcon = iconReg.registerIcon("bigmod:Bore");
	}
	public int idDropped(int par1, Random rand, int par2) {
		return ItemHandler.BINGOT.itemID;
	}
	public int quantityDropped(Random rand) {
		return rand.nextInt(4);
	}

}
