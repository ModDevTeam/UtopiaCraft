package Mrhand3.BigModBF.Items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.mob.EntityBlobfish;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Launcher extends Item{

	public Launcher(int par1) {
		super(par1);
		 this.setCreativeTab(BaseMod.tabBlobfish);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("This Launcher has null atributes.");
	}
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("bigmod:Launcher");
	}
	
	


    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }

}
