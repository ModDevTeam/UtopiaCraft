package Mrhand3.BigModBF.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import Mrhand3.BigModBF.TIleEntity.TileEntityStandOrb;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.helpers.TeleporterPromised;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class StandOrb extends BlockContainer {

        //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
        //And the second three are the top-right corner.
        public StandOrb(int id, Material rock) {
                super(id, Material.rock);
                this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
                this.setCreativeTab(BaseMod.tabBlobfish);
        }

        //Make sure you set this as your TileEntity class relevant for the block!
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityStandOrb();
        }
        
        //You don't want the normal render type, or it wont render properly.
        @Override
        public int getRenderType() {
                return -1;
        }
        
        //It's not an opaque cube, so you need this.
        @Override
        public boolean isOpaqueCube() {
                return false;
        }
        
        //It's not a normal block, so you need this too.
        public boolean renderAsNormalBlock() {
                return false;
        }
        
        //This is the icon to use for showing the block in your hand.
        public void registerIcons(IconRegister icon) {
                this.blockIcon = icon.registerIcon("bigmod:bblockitem");
        }
        
          @SideOnly(Side.CLIENT)


    	
    	@Override
    	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    	{
    	if (entity == null)
    	{
    	return;
    	}

    	TileEntityStandOrb tile = (TileEntityStandOrb) world.getBlockTileEntity(x, y, z);
    	tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
    	
    	
    	}
    	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    	{
    		if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
    		{
    			EntityPlayerMP player = (EntityPlayerMP) par5Entity;
    			ModLoader.getMinecraftServerInstance();
    			MinecraftServer mServer = MinecraftServer.getServer();

    			if (player.timeUntilPortal > 0)
    			{
    				player.timeUntilPortal = 10;
    			} 
    			else if (player.dimension != 173)
    			{
    				player.timeUntilPortal = 10;

    				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 173, new TeleporterPromised(mServer.worldServerForDimension(173)));
    			} 
    			else if (player.dimension == 173)
    			{
    				player.timeUntilPortal = 10;
    				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterPromised(mServer.worldServerForDimension(1)));
    			}
    		}
    	}
    	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            if (par5Random.nextInt(100) == 0)
            {
                par1World.playSound((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "bigmod.portal", 0.5F, par5Random.nextFloat() * 0.4F + 0.8F, false);
            }

            for (int l = 0; l < 4; ++l)
            {
                double d0 = (double)((float)par2 + par5Random.nextFloat());
                double d1 = (double)((float)par3 + par5Random.nextFloat());
                double d2 = (double)((float)par4 + par5Random.nextFloat());
                double d3 = 0.0D;
                double d4 = 0.0D;
                double d5 = 0.0D;
                int i1 = par5Random.nextInt(2) * 2 - 1;
                d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
                d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
                d5 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;

                if (par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && par1World.getBlockId(par2 + 1, par3, par4) != this.blockID)
                {
                    d0 = (double)par2 + 0.5D + 0.25D * (double)i1;
                    d3 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
                }
                else
                {
                    d2 = (double)par4 + 0.5D + 0.25D * (double)i1;
                    d5 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
                }

                par1World.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
            }
        }
    	

}