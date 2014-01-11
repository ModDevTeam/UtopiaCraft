package Mrhand3.BigModBF.mob;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import assets.bigmod.textures.models.Barrow;
import assets.bigmod.textures.models.blobfish;

public class RenderBarrow extends RenderLiving
{
 protected Barrow model;
 
 public RenderBarrow (Barrow barrow)
 {
  super(barrow, NAME_TAG_RANGE);
  model = ((Barrow)mainModel);
 }
 
 public void renderTutorial(EntityBlobfish entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityBlobfish par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityBlobfish)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityBlobfish)par1Entity, par2, par4, par6, par8, par9);
    }



@Override
protected ResourceLocation getEntityTexture(Entity entity) {
	return new ResourceLocation("bigmod:textures/models/blobfish.png");
} 
}