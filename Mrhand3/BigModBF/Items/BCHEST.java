package Mrhand3.BigModBF.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BCHEST extends ItemArmor{

	public BCHEST(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(BaseMod.tabBlobfish);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconreg) {
		this.itemIcon = iconreg.registerIcon("bigmod:bchest");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return "bigmod:textures/models/armor/blobfish_1.png";
	}


}
