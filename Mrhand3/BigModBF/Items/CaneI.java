package Mrhand3.BigModBF.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mrhand3.BigModBF.common.BaseMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class CaneI extends ItemFood{

	public CaneI(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setCreativeTab(BaseMod.tabBlobfish);
	}
	  @SideOnly(Side.CLIENT)
	  public void registerIcons(IconRegister iconReg) {
	    this.itemIcon = iconReg.registerIcon("bigmod:cane");
	  }

}
