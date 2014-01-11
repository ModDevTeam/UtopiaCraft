package Mrhand3.BigModBF.Items;

import Mrhand3.BigModBF.common.BaseMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BPICK extends ItemPickaxe
{
  public BPICK(int par1, EnumToolMaterial blobfish)
  {
    super(par1, blobfish);
    this.setCreativeTab(BaseMod.tabBlobfish);
  }
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister iconReg) {
    this.itemIcon = iconReg.registerIcon("bigmod:BPICK");
  }
}