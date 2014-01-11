package Mrhand3.BigModBF.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Mrhand3.BigModBF.TIleEntity.TileEntityCandy;
import Mrhand3.BigModBF.common.BaseMod;


public class Candy extends BlockContainer {

        //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
        //And the second three are the top-right corner.
        public Candy(int id) {
                super(id, Material.iron);
                this.setCreativeTab(BaseMod.tabBlobfish);
                this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 2.0F, 0.6F);
        }

        //Make sure you set this as your TileEntity class relevant for the block!
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityCandy();
        }
        
        //You don't want the normal render type, or it wont render properly.
        
        //This is the icon to use for showing the block in your hand.

        protected boolean canThisPlantGrowOnThisBlockID(int par1)
        {
            return par1 == Block.leaves.blockID || par1 == Block.wood.blockID || par1 == Block.sandStone.blockID;
        }
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

}