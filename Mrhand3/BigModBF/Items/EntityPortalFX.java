package Mrhand3.BigModBF.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class EntityPortalFX extends EntityFX
{
public EntityPortalFX(World par1World, double par2, double par4, double par6, float par8, float par9, float par10)
{
this(par1World, par2, par4, par6, 1.0F, par8, par9, par10);
}
public EntityPortalFX(World par1World, double par2, double par4, double par6, float par8, float par9, float par10, float par11)
{
super(par1World, par2, par4, par6, 0.0D, 0.0D, 0.0D);
this.motionX = par9;//initial motion value X
this.motionY = par10;
this.motionZ = par11;
if (par9 == 0.0F)
{
par9 = 1.0F;
}
float var12 = (float)Math.random() * 0.4F + 0.6F;
this.particleTextureIndexX = 0; //
this.particleTextureIndexY = 0;
this.particleRed = 1.0F;//RGB of your particle
this.particleGreen = 1.0F;
this.particleBlue = 1.0F;
this.particleScale *= 1.4F;
this.particleScale *= par8;

this.particleMaxAge = 80;//how soon the particle dies. You can use randomizer for this
this.noClip = true;//does your particle collide with blocks?
}
@Override
public void onUpdate()
{
this.prevPosX = this.posX;
this.prevPosY = this.posY;
this.prevPosZ = this.posZ;

if (this.particleAge++ >= this.particleMaxAge)
{
this.setDead();//make sure to have this
}
this.moveEntity(this.motionX, this.motionY, this.motionZ);// also important if you want your particle to move
this.motionX *= motionX>=0.04D?1D:1.03D;
this.motionY *= motionY>=0.04D?1D:1.03D;
this.motionZ *= motionZ>=0.04D?1D:1.03D;
}
@Override
@SideOnly(Side.CLIENT)
public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
{

par1Tessellator.draw();
Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("bigmod:textures/particle/particles.png"));
par1Tessellator.startDrawingQuads();
par1Tessellator.setBrightness(200);//make sure you have this!!
super.renderParticle(par1Tessellator, par2, par3, par4, par5, par6, par7);
par1Tessellator.draw();
Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("textures/particle/particles.png"));
par1Tessellator.startDrawingQuads();
}
}