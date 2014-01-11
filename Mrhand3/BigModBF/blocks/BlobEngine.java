package Mrhand3.BigModBF.blocks;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import Mrhand3.BigModBF.TIleEntity.TileEntityBlobEngine;
import Mrhand3.BigModBF.client.ClientProxy;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.helpers.BlobEnergy;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlobEngine extends BlockContainer implements BlobEnergy {
int[] coords = {42,42,42};

	public BlobEngine(int par1, Material par2Material) {
		super(par1, par2Material);
		
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public int getRenderType()
    {
        return ClientProxy.engineRenderID;
    }
	public void onBlockAdded(World world, int x, int y, int z) 
	{
		super.onBlockAdded(world, x, y, z);
		coords[0]=x;
		coords[1]=y;
		coords[2]=z;
		TileEntityBlobEngine tile = (TileEntityBlobEngine)world.getBlockTileEntity(x, y, z);
		tile.setCoords();
		
	}
	@Override
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	@Override
	public int[] checkConnect(WorldServer world, int x, int y, int z){
		int[] connectors = {42,42,42,42,42,42};
		
		return connectors;
	}
	
	@Override
	public void getEnergy()
	{
		// TODO Auto-generated method stub
		
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        float f = 0.362F;
        return AxisAlignedBB.getBoundingBox((float)(i + 0.25F), j, (float)(k + 0.25F), (float)(i + 0.75F), (float)(j + 1) + f, (float)(k + 0.75F));
    }
	 @SideOnly(Side.CLIENT)

	    public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int i, int j, int k)
	    {
		 float f = 0.362F;
	        return AxisAlignedBB.getAABBPool().getAABB((float)(i + 0.25F), j, (float)(k + 0.25F), (float)(i + 0.75F), (float)(j + 1) + f, (float)(k + 0.75F));
	    }
	 public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	    {
	        AxisAlignedBB var8 = this.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);

	        if (var8 != null && par5AxisAlignedBB.intersectsWith(var8))
	        {
	            par6List.add(var8);
	        }
	    }
	
	@Override
	public void sendEnergy() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityBlobEngine();
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if(!world.isRemote) {
			FMLNetworkHandler.openGui(player, BaseMod.instance, 174, world, x, y, z);
		}
		
		return true;
	}
    
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) 
	{
		
		
	}
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("bigmod:engine");

    	
    }

}