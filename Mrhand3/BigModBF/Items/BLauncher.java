package Mrhand3.BigModBF.Items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.mob.EntityBlobArrow;
import Mrhand3.BigModBF.mob.EntityBlobfish;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BLauncher extends Item{

	public BLauncher(int par1) {
		super(par1);
		 this.setCreativeTab(BaseMod.tabBlobfish);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("This Launcher has the ability to");
		dataList.add("launch Blobfish.");
	}
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("bigmod:Launcher");
	}
	
	


    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityBlobArrow(par2World));
        }

        return par1ItemStack;
    }

}
