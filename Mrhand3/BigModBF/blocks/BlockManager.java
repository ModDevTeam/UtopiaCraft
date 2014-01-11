package Mrhand3.BigModBF.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Mrhand3.BigModBF.TIleEntity.BlobbyEntity;
import Mrhand3.BigModBF.TIleEntity.TileEntityBlobEngine;
import Mrhand3.BigModBF.TIleEntity.TileEntityCandy;
import Mrhand3.BigModBF.TIleEntity.TileEntityCowBlockEntity;
import Mrhand3.BigModBF.TIleEntity.TileEntityStand;
import Mrhand3.BigModBF.TIleEntity.TileEntityStandOrb;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.helpers.Configs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
    public static Block teleporter;
    public static Block BORE;
    public static Block BlobfishPedistalBlock;
    public static Block Blobby;
    public static Block Machine1Idle;
    public static Block Wood;
    public static Block Leaf;
    public static Block Leaf1;
    public static Block Leaf2;
    public static Block Leaf3;
    public static Block Leaf4;
    public static Block HolyWaterF;
    public static Block HolyWaterS;
    public static Block Candy;
    public static Block Cotton1;
    public static Block Cotton2;
    public static Block Candy2;
    public static Block Stand;
    public static Block StandOrb;
    public static Block benjin;
    
    public static void registerGame(){
	       GameRegistry.registerBlock(BORE, "BORE");
	       GameRegistry.registerBlock(BlobfishPedistalBlock, "BPB");
	        GameRegistry.registerTileEntity(TileEntityCowBlockEntity.class, "tileEntityCowBlock");

	        GameRegistry.registerBlock(Blobby, "Blobby");
	    GameRegistry.registerTileEntity(BlobbyEntity.class, "Blobby");
	        
		GameRegistry.registerBlock(Machine1Idle, "M1I");
		GameRegistry.registerBlock(teleporter, "dimteleporter");
		GameRegistry.registerBlock(Wood, "Wood");
		GameRegistry.registerBlock(Leaf, "Leaf");
		GameRegistry.registerBlock(Leaf1, "Leaf1");
		GameRegistry.registerBlock(Leaf2, "Leaf2");
		GameRegistry.registerBlock(Leaf3, "Leaf3");
		GameRegistry.registerBlock(Leaf4, "Leaf4");
		GameRegistry.registerBlock(HolyWaterF, "HolyWaterF");
		GameRegistry.registerBlock(HolyWaterS, "HolyWaterS");
		GameRegistry.registerBlock(Candy, "Candy");
		GameRegistry.registerBlock(Cotton1, "Cotton1");

		GameRegistry.registerBlock(Cotton2, "Cotton2");
		GameRegistry.registerBlock(Stand, "Stand");
		GameRegistry.registerBlock(StandOrb, "StandOrb");
		GameRegistry.registerBlock(benjin, "benjin");

		
		GameRegistry.registerTileEntity(TEF.class, "tileEntityFossilizer");     
		GameRegistry.registerTileEntity(TileEntityCandy.class, "Candy");
		GameRegistry.registerTileEntity(TileEntityStand.class, "Stand");
		GameRegistry.registerTileEntity(TileEntityStandOrb.class, "StandOrb");
		GameRegistry.registerTileEntity(TileEntityBlobEngine.class, "benji");
    }
    
    public static void registerBlocks(){
    	BORE = new BORE(Configs.BOREID, Material.rock).setUnlocalizedName("BORE");
        Leaf3 = new BLeaf3(2011, Material.leaves).setUnlocalizedName("Leaf3");
        Wood = new BWood(Configs.WoodID, Material.wood).setUnlocalizedName("Wood").setHardness(0.2F);
        Leaf = new BLeaf(Configs.LeafID, Material.leaves).setUnlocalizedName("Leaf").setHardness(0.1F);
        Leaf1 = new BLeaf1(Configs.Leaf1ID, Material.leaves).setUnlocalizedName("Leaf1").setHardness(0.1F);
        Leaf2 = new BLeaf2(Configs.Leaf2ID, Material.leaves).setUnlocalizedName("Leaf2").setHardness(0.1F);

        Leaf4 = new BLeaf4(Configs.Leaf4ID, Material.leaves).setUnlocalizedName("Leaf4").setHardness(0.1F);
        BlobfishPedistalBlock = new TileEntityCowBlock(Configs.BPBID, Material.rock).setUnlocalizedName("BPB");
 
        
        Blobby = new BlobbyBlock(Configs.BID, Material.rock).setUnlocalizedName("Blobby");
        
        Machine1Idle = new Fossilizer(1901, false).setUnlocalizedName("FossilizerIdle").setHardness(3.5F).setCreativeTab(BaseMod.tabBlobfish);
        
      
        teleporter = new UPortal(Configs.teleporterID, null).setUnlocalizedName("Portal");
        
        HolyWaterF = new HWF(Configs.HolyWaterFID).setUnlocalizedName("HWF").setCreativeTab(BaseMod.tabBlobfish);
        HolyWaterS = new HWS(Configs.HolyWaterSID).setUnlocalizedName("HWS").setCreativeTab(BaseMod.tabBlobfish);
        
	    Candy = new Candy(Configs.CandyID).setUnlocalizedName("Candy");
	    Candy2 = new Candy2(3000, Material.plants).setUnlocalizedName("Candy2");
	    Cotton1 = new Cotton1(Configs.Cotton1ID, Material.plants).setUnlocalizedName("Cotton1");
	    Cotton2 = new Mrhand3.BigModBF.blocks.Cotton2(Configs.Cotton2ID, Material.plants).setUnlocalizedName("Cotton2");
        Stand = new Stand(Configs.StandID, Material.rock).setUnlocalizedName("Stand");
        StandOrb = new StandOrb(Configs.StandOrbID, Material.rock).setUnlocalizedName("StandOrb");
        benjin = new BlobEngine(Configs.benjinID, Material.rock).setUnlocalizedName("benji");
    }
}
