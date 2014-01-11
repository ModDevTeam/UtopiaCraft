package Mrhand3.BigModBF.Items;

import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class Fuel extends Item{

	public Fuel(int par1) {
		super(par1);
		this.setCreativeTab(BaseMod.tabBlobfish);
	}
	
	  @SideOnly(Side.CLIENT)
	  public void registerIcons(IconRegister iconReg) {
	    this.itemIcon = iconReg.registerIcon("bigmod:rdust");
	  }

}
