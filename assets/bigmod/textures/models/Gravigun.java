package assets.bigmod.textures.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Gravigun extends ModelBase
{
  public ModelRenderer base;
  public ModelRenderer core;
  public ModelRenderer corething1;
  public ModelRenderer corething2;
  public ModelRenderer corething3;
  public ModelRenderer corething4;
  public ModelRenderer frontbig;
  public ModelRenderer frontsmall;
  public ModelRenderer clawbottom1;
  public ModelRenderer claw1;
  public ModelRenderer clawbottom2;
  public ModelRenderer claw2;
  public ModelRenderer clawbottom3;
  public ModelRenderer claw3;
  public ModelRenderer baseright_box;
  public ModelRenderer baseleft_box;
  public ModelRenderer gripside1;
  public ModelRenderer gripside2;
  public ModelRenderer gripback;

  public Gravigun()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;

    this.base = new ModelRenderer(this, 0, 0);
    this.base.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5);
    this.base.setRotationPoint(-2.0F, 19.0F, -3.0F);
    this.base.setTextureSize(64, 32);
    this.base.mirror = true;
    setRotation(this.base, 0.0F, 0.0F, 0.0F);
    this.core = new ModelRenderer(this, 10, 24);
    this.core.addBox(-11.0F, 0.0F, 0.0F, 6, 4, 4);
    this.core.setRotationPoint(3.0F, 19.5F, -2.5F);
    this.core.setTextureSize(64, 32);
    this.core.mirror = true;
    setRotation(this.core, 0.0F, 0.0F, 0.0F);
    this.corething1 = new ModelRenderer(this, 0, 12);
    this.corething1.addBox(-11.0F, 0.0F, 0.0F, 6, 1, 1);
    this.corething1.setRotationPoint(3.0F, 19.0F, -3.0F);
    this.corething1.setTextureSize(64, 32);
    this.corething1.mirror = true;
    setRotation(this.corething1, 0.0F, 0.0F, 0.0F);
    this.corething2 = new ModelRenderer(this, 0, 10);
    this.corething2.addBox(-11.0F, 0.0F, 0.0F, 6, 1, 1);
    this.corething2.setRotationPoint(3.0F, 19.0F, 1.0F);
    this.corething2.setTextureSize(64, 32);
    this.corething2.mirror = true;
    setRotation(this.corething2, 0.0F, 0.0F, 0.0F);
    this.corething3 = new ModelRenderer(this, 0, 14);
    this.corething3.addBox(-11.0F, 0.0F, 0.0F, 6, 1, 1);
    this.corething3.setRotationPoint(3.0F, 21.0F, 1.0F);
    this.corething3.setTextureSize(64, 32);
    this.corething3.mirror = true;
    setRotation(this.corething3, 0.0F, 0.0F, 0.0F);
    this.corething4 = new ModelRenderer(this, 0, 16);
    this.corething4.addBox(-11.0F, 0.0F, 0.0F, 6, 1, 1);
    this.corething4.setRotationPoint(3.0F, 21.0F, -3.0F);
    this.corething4.setTextureSize(64, 32);
    this.corething4.mirror = true;
    setRotation(this.corething4, 0.0F, 0.0F, 0.0F);
    this.frontbig = new ModelRenderer(this, 38, 0);
    this.frontbig.addBox(-18.0F, 0.0F, 0.0F, 1, 5, 5);
    this.frontbig.setRotationPoint(9.0F, 19.0F, -3.0F);
    this.frontbig.setTextureSize(64, 32);
    this.frontbig.mirror = true;
    setRotation(this.frontbig, 0.0F, 0.0F, 0.0F);
    this.frontsmall = new ModelRenderer(this, 0, 26);
    this.frontsmall.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3);
    this.frontsmall.setRotationPoint(-10.0F, 20.0F, -2.0F);
    this.frontsmall.setTextureSize(64, 32);
    this.frontsmall.mirror = true;
    setRotation(this.frontsmall, 0.0F, 0.0F, 0.0F);
    this.clawbottom1 = new ModelRenderer(this, 0, 18);
    this.clawbottom1.addBox(-18.0F, 0.0F, 0.0F, 1, 1, 1);
    this.clawbottom1.setRotationPoint(9.0F, 18.0F, -1.0F);
    this.clawbottom1.setTextureSize(64, 32);
    this.clawbottom1.mirror = true;
    setRotation(this.clawbottom1, 0.0F, 0.0F, 0.0F);
    this.claw1 = new ModelRenderer(this, 0, 20);
    this.claw1.addBox(-21.0F, 0.0F, 0.0F, 3, 1, 1);
    this.claw1.setRotationPoint(9.0F, 17.5F, -1.0F);
    this.claw1.setTextureSize(64, 32);
    this.claw1.mirror = true;
    setRotation(this.claw1, 0.0F, 0.0F, 0.0F);
    this.clawbottom2 = new ModelRenderer(this, 0, 18);
    this.clawbottom2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.clawbottom2.setRotationPoint(-9.0F, 23.0F, -4.0F);
    this.clawbottom2.setTextureSize(64, 32);
    this.clawbottom2.mirror = true;
    setRotation(this.clawbottom2, 0.0F, 0.0F, 0.0F);
    this.claw2 = new ModelRenderer(this, 0, 24);
    this.claw2.addBox(-21.0F, 0.0F, 0.0F, 3, 1, 1);
    this.claw2.setRotationPoint(9.0F, 23.5F, -4.5F);
    this.claw2.setTextureSize(64, 32);
    this.claw2.mirror = true;
    setRotation(this.claw2, 0.0F, 0.0F, 0.0F);
    this.clawbottom3 = new ModelRenderer(this, 0, 18);
    this.clawbottom3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.clawbottom3.setRotationPoint(-9.0F, 23.0F, 2.0F);
    this.clawbottom3.setTextureSize(64, 32);
    this.clawbottom3.mirror = true;
    setRotation(this.clawbottom3, 0.0F, 0.0F, 0.0F);
    this.claw3 = new ModelRenderer(this, 0, 22);
    this.claw3.addBox(-21.0F, 0.0F, 0.0F, 3, 1, 1);
    this.claw3.setRotationPoint(9.0F, 23.5F, 2.5F);
    this.claw3.setTextureSize(64, 32);
    this.claw3.mirror = true;
    setRotation(this.claw3, 0.0F, 0.0F, 0.0F);
    this.baseright_box = new ModelRenderer(this, 40, 10);
    this.baseright_box.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2);
    this.baseright_box.setRotationPoint(-1.0F, 20.0F, 2.0F);
    this.baseright_box.setTextureSize(64, 32);
    this.baseright_box.mirror = true;
    setRotation(this.baseright_box, 0.0F, 0.0F, 0.0F);
    this.baseleft_box = new ModelRenderer(this, 40, 15);
    this.baseleft_box.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2);
    this.baseleft_box.setRotationPoint(-1.0F, 20.0F, -5.0F);
    this.baseleft_box.setTextureSize(64, 32);
    this.baseleft_box.mirror = true;
    setRotation(this.baseleft_box, 0.0F, 0.0F, 0.0F);
    this.gripside1 = new ModelRenderer(this, 28, 14);
    this.gripside1.addBox(0.0F, 0.0F, -12.0F, 2, 2, 4);
    this.gripside1.setRotationPoint(-0.5F, 20.5F, 3.0F);
    this.gripside1.setTextureSize(64, 32);
    this.gripside1.mirror = true;
    setRotation(this.gripside1, 0.0F, 0.0F, 0.0F);
    this.gripside2 = new ModelRenderer(this, 28, 14);
    this.gripside2.addBox(0.0F, 0.0F, -12.0F, 2, 2, 4);
    this.gripside2.setRotationPoint(-0.5F, 20.5F, 16.0F);
    this.gripside2.setTextureSize(64, 32);
    this.gripside2.mirror = true;
    setRotation(this.gripside2, 0.0F, 0.0F, 0.0F);
    this.gripback = new ModelRenderer(this, 28, 20);
    this.gripback.addBox(10.0F, 0.0F, 0.0F, 5, 2, 2);
    this.gripback.setRotationPoint(-7.0F, 22.0F, -1.5F);
    this.gripback.setTextureSize(64, 32);
    this.gripback.mirror = true;
    setRotation(this.gripback, 0.0F, 0.0F, 0.0F);
  }


  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.base.render(f5);
    this.core.render(f5);
    this.corething1.render(f5);
    this.corething2.render(f5);
    this.corething3.render(f5);
    this.corething4.render(f5);
    this.frontbig.render(f5);
    this.frontsmall.render(f5);
    this.clawbottom1.render(f5);
    this.claw1.render(f5);
    this.clawbottom2.render(f5);
    this.claw2.render(f5);
    this.clawbottom3.render(f5);
    this.claw3.render(f5);
    this.baseright_box.render(f5);
    this.baseleft_box.render(f5);
    this.gripback.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
  }
}