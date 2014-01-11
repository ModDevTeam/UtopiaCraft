package Mrhand3.BigModBF.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import Mrhand3.BigModBF.blocks.BlockManager;
import Mrhand3.BigModBF.common.BaseMod;

public class PP extends Item{

	public PP(int par1) {
		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(BaseMod.tabBlobfish);
	}
	
	  @SideOnly(Side.CLIENT)
	  public void registerIcons(IconRegister iconReg) {
	    this.itemIcon = iconReg.registerIcon("bigmod:pp");
	  }

}
