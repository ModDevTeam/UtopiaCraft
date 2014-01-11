package Mrhand3.BigModBF.Items;

import Mrhand3.BigModBF.common.BaseMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BBACK extends ItemArmor{

	public BBACK(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3,
			int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		LanguageRegistry.addName(this, "Blobfish Backpack");
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconreg) {
		this.itemIcon = iconreg.registerIcon("bigmod:bchest");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return "bigmod:textures/models/armor/blobfishpack.png";
	}
	  @SideOnly(Side.CLIENT)
	  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	  {
	    return BaseMod.proxy.getBlobpackModel(armorSlot);
	  }

}
