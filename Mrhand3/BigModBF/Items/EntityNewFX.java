package Mrhand3.BigModBF.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.Item;
import net.minecraft.world.World;
public class EntityNewFX
{
         private static Minecraft mc = Minecraft.getMinecraft();
         private static World theWorld = mc.theWorld;
         private static TextureManager renderEngine = mc.renderEngine;
         
         public EntityFX doSpawnParticle(String par1Str, double par2, double par4, double par6, double par8, double par10, double par12)
         {
             if (this.mc != null && this.mc.renderViewEntity != null && this.mc.effectRenderer != null)
             {
                 int i = this.mc.gameSettings.particleSetting;

                 if (i == 1 && this.theWorld.rand.nextInt(3) == 0)
                 {
                     i = 2;
                 }

                 double d6 = this.mc.renderViewEntity.posX - par2;
                 double d7 = this.mc.renderViewEntity.posY - par4;
                 double d8 = this.mc.renderViewEntity.posZ - par6;
                 EntityFX entityfx = null;

                 if (par1Str.equals("hugeexplosion"))
                 {
                     this.mc.effectRenderer.addEffect(entityfx = new EntityHugeExplodeFX(this.theWorld, par2, par4, par6, par8, par10, par12));
                 }
                 else if (par1Str.equals("largeexplode"))
                 {
                     this.mc.effectRenderer.addEffect(entityfx = new EntityLargeExplodeFX(this.renderEngine, this.theWorld, par2, par4, par6, par8, par10, par12));
                 }
                 else if (par1Str.equals("fireworksSpark"))
                 {
                     this.mc.effectRenderer.addEffect(entityfx = new EntityFireworkSparkFX(this.theWorld, par2, par4, par6, par8, par10, par12, this.mc.effectRenderer));
                 }

                 if (entityfx != null)
                 {
                     return (EntityFX)entityfx;
                 }
                 else
                 {
                     double d9 = 16.0D;

                     if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9)
                     {
                         return null;
                     }
                     else if (i > 1)
                     {
                         return null;
                     }
                     else
                     {
                         if (par1Str.equals("bubble"))
                         {
                             entityfx = new EntityBubbleFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }

                         else if (par1Str.equals("depthsuspend"))
                         {
                             entityfx = new EntityAuraFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("townaura"))
                         {
                             entityfx = new EntityAuraFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("crit"))
                         {
                             entityfx = new EntityCritFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("magicCrit"))
                         {
                             entityfx = new EntityCritFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                             ((EntityFX)entityfx).setRBGColorF(((EntityFX)entityfx).getRedColorF() * 0.3F, ((EntityFX)entityfx).getGreenColorF() * 0.8F, ((EntityFX)entityfx).getBlueColorF());
                             ((EntityFX)entityfx).nextTextureIndexX();
                         }

                         else if (par1Str.equals("mobSpell"))
                         {
                             entityfx = new EntitySpellParticleFX(this.theWorld, par2, par4, par6, 0.0D, 0.0D, 0.0D);
                             ((EntityFX)entityfx).setRBGColorF((float)par8, (float)par10, (float)par12);
                         }
                         else if (par1Str.equals("mobSpellAmbient"))
                         {
                             entityfx = new EntitySpellParticleFX(this.theWorld, par2, par4, par6, 0.0D, 0.0D, 0.0D);
                             ((EntityFX)entityfx).setAlphaF(0.15F);
                             ((EntityFX)entityfx).setRBGColorF((float)par8, (float)par10, (float)par12);
                         }
                         else if (par1Str.equals("spell"))
                         {
                             entityfx = new EntitySpellParticleFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("instantSpell"))
                         {
                             entityfx = new EntitySpellParticleFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                             ((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
                         }
                         else if (par1Str.equals("witchMagic"))
                         {
                             entityfx = new EntitySpellParticleFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                             ((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
                             float f = this.theWorld.rand.nextFloat() * 0.5F + 0.35F;
                             ((EntityFX)entityfx).setRBGColorF(1.0F * f, 0.0F * f, 1.0F * f);
                         }
                         else if (par1Str.equals("note"))
                         {
                             entityfx = new EntityNoteFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("portal"))
                         {
                             entityfx = new EntityPortalFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("enchantmenttable"))
                         {
                             entityfx = new EntityEnchantmentTableParticleFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("explode"))
                         {
                             entityfx = new EntityExplodeFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("flame"))
                         {
                             entityfx = new EntityFlameFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("lava"))
                         {
                             entityfx = new EntityLavaFX(this.theWorld, par2, par4, par6);
                         }
                         else if (par1Str.equals("footstep"))
                         {
                             entityfx = new EntityFootStepFX(this.renderEngine, this.theWorld, par2, par4, par6);
                         }
                         else if (par1Str.equals("splash"))
                         {
                             entityfx = new EntitySplashFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("largesmoke"))
                         {
                             entityfx = new EntitySmokeFX(this.theWorld, par2, par4, par6, par8, par10, par12, 2.5F);
                         }
                         else if (par1Str.equals("cloud"))
                         {
                             entityfx = new EntityCloudFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("reddust"))
                         {
                             entityfx = new EntityReddustFX(this.theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
                         }
                         else if (par1Str.equals("snowballpoof"))
                         {
                             entityfx = new EntityBreakingFX(this.theWorld, par2, par4, par6, Item.snowball);
                         }
                         else if (par1Str.equals("dripWater"))
                         {
                             entityfx = new EntityDropParticleFX(this.theWorld, par2, par4, par6, Material.water);
                         }
                         else if (par1Str.equals("dripLava"))
                         {
                             entityfx = new EntityDropParticleFX(this.theWorld, par2, par4, par6, Material.lava);
                         }
                         else if (par1Str.equals("snowshovel"))
                         {
                             entityfx = new EntitySnowShovelFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("slime"))
                         {
                             entityfx = new EntityBreakingFX(this.theWorld, par2, par4, par6, Item.slimeBall);
                         }
                         else if (par1Str.equals("bigmod1"))
                         {
                             entityfx = new EntityPortalFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                         }
                         else if (par1Str.equals("angryVillager"))
                         {
                             entityfx = new EntityHeartFX(this.theWorld, par2, par4 + 0.5D, par6, par8, par10, par12);
                             ((EntityFX)entityfx).setParticleTextureIndex(81);
                             ((EntityFX)entityfx).setRBGColorF(1.0F, 1.0F, 1.0F);
                         }
                         else if (par1Str.equals("happyVillager"))
                         {
                             entityfx = new EntityAuraFX(this.theWorld, par2, par4, par6, par8, par10, par12);
                             ((EntityFX)entityfx).setParticleTextureIndex(82);
                             ((EntityFX)entityfx).setRBGColorF(1.0F, 1.0F, 1.0F);
                         }
                         else
                         {
                             int j;
                             String[] astring;
                             int k;

                             if (par1Str.startsWith("iconcrack_"))
                             {
                                 astring = par1Str.split("_", 3);
                                 j = Integer.parseInt(astring[1]);

                                 if (astring.length > 2)
                                 {
                                     k = Integer.parseInt(astring[2]);
                                     entityfx = new EntityBreakingFX(this.theWorld, par2, par4, par6, par8, par10, par12, Item.itemsList[j], k);
                                 }
                                 else
                                 {
                                     entityfx = new EntityBreakingFX(this.theWorld, par2, par4, par6, par8, par10, par12, Item.itemsList[j], 0);
                                 }
                             }
                             else if (par1Str.startsWith("tilecrack_"))
                             {
                                 astring = par1Str.split("_", 3);
                                 j = Integer.parseInt(astring[1]);
                                 k = Integer.parseInt(astring[2]);
                                 entityfx = (new EntityDiggingFX(this.theWorld, par2, par4, par6, par8, par10, par12, Block.blocksList[j], k)).applyRenderColor(k);
                             }
                         }

                         if (entityfx != null)
                         {
                             this.mc.effectRenderer.addEffect((EntityFX)entityfx);
                         }

                         return (EntityFX)entityfx;
                     }
                 }
             }
             else
             {
                 return null;
             }
         }

}