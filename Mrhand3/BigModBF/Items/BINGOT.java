package Mrhand3.BigModBF.Items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.mob.EntityBlobfish;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BINGOT extends Item
{
	
  private Entity EntityBlobfish;
  
  

public BINGOT(int id)
  {
    super(id);
    this.setCreativeTab(BaseMod.tabBlobfish);
    
    
  }


	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("At least you didn't kill a");
		dataList.add("Blobfish for it");
	}
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("bigmod:BINGOT");
	}
	

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
    

    
    }
    
    
	 
	   
	   
