package Mrhand3.BigModBF.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BMF extends ItemFood
{
  public BMF(int id, int hunger, float saturation, boolean wolfFood)
  {
    super(id, hunger, saturation, wolfFood);
    LanguageRegistry.addName(this, "BMF");
    
  }

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("WHY???");
		dataList.add("WHY DID YOU KILL A BLOBFISH?!?!?!");
	}
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("bigmod:BFM");
    }
}