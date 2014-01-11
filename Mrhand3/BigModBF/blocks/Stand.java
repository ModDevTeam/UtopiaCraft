package Mrhand3.BigModBF.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.TIleEntity.TileEntityCowBlockEntity;
import Mrhand3.BigModBF.TIleEntity.TileEntityStand;
import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class Stand extends BlockContainer {

        //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
        //And the second three are the top-right corner.
        public Stand(int id, Material rock) {
                super(id, Material.rock);
                this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
                this.setCreativeTab(BaseMod.tabBlobfish);
        }

        //Make sure you set this as your TileEntity class relevant for the block!
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityStand();
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
        
      /**  @SideOnly(Side.CLIENT)
        public void randomDisplayTick(World world, int x, int y, int z, Random random){
        	float f1 = (float)x + 0.5F;
        	float f2 = (float)y + 1.0F;
        	float f3 = (float)z + 0.5F;
        	float f4 = random.nextFloat() * 0.6F -0.3F;
        	float f5 = random.nextFloat() * -0.6F - -0.3F;
        	
        	world.spawnParticle("happyVillager", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, 0.0D, 0.0D);
        	
        }*/

    	
    	@Override
    	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    	{
    	if (entity == null)
    	{
    	return;
    	}

    	TileEntityStand tile = (TileEntityStand) world.getBlockTileEntity(x, y, z);
    	tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
    	
    	
    
    	}
    	@Override
    	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t){
    		if(player.inventory.hasItem(ItemHandler.PP.itemID)){
    			world.setBlock(x, y, z, BlockManager.StandOrb.blockID);
    			player.inventory.consumeInventoryItem(ItemHandler.PP.itemID);
    		}
    		return true;
    		
    	}

}