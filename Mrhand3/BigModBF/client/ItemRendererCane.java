package Mrhand3.BigModBF.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;


import Mrhand3.BigModBF.common.BaseMod;
import assets.bigmod.textures.models.CandyModel;
import assets.bigmod.textures.models.ModelDubGun;

public class ItemRendererCane implements IItemRenderer
{
protected CandyModel sniperModel;
float scale = 0.7F;

public ItemRendererCane()
{
  sniperModel= new CandyModel();
}

@Override
public boolean handleRenderType(ItemStack item, ItemRenderType type)
{
  switch(type)
  {
  case EQUIPPED: return true;

  case EQUIPPED_FIRST_PERSON: return true;

  default: return false;
  }
}
@Override
public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
   ItemRendererHelper helper)
{

  return false;
}
@Override
public void renderItem(ItemRenderType type, ItemStack item, Object... data)
{

  switch(type)
  {
  case EQUIPPED:
  {
   GL11.glPushMatrix();


   GL11.glScalef(scale, scale, scale);

   GL11.glRotatef(-5070000, 1.0F, 0.0F, 0F);
   GL11.glRotatef(50F, 0.0F, 1.0F, 0F);
   GL11.glRotatef(28000.0F, 0.0F, 0.0F, 1.0F);
   boolean isFirstPerson = false;
   


   
   if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
   {
       GL11.glTranslatef(0.1F, 0.32F, 1F);
	   }
	   else
	   {
	    isFirstPerson = true;
	   }




   Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(BaseMod.modid + ":/textures/blocks/CandyCane.png"));

   sniperModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

   GL11.glPopMatrix();
   break;
  }

  case EQUIPPED_FIRST_PERSON:
  {
   GL11.glPushMatrix();


   GL11.glScalef(scale, scale, scale);
   GL11.glRotatef(-5070000, 1.0F, 0.0F, 0F);
   GL11.glRotatef(50F, 0.0F, 1.0F, 0F);
   GL11.glRotatef(28000.0F, 0.0F, 0.0F, 1.0F);
   GL11.glTranslatef(0.1F, 0.32F, 1F);
   boolean isFirstPerson = true;

   Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(BaseMod.modid + ":/textures/blocks/CandyCane.png"));

   sniperModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

   GL11.glPopMatrix();
  }


  default:

   break;

  }

}

}