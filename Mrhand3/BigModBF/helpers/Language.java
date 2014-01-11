package Mrhand3.BigModBF.helpers;

import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.blocks.BlockManager;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Language {
	public static void registerLanguages(){
		LanguageRegistry.addName(BlockManager.BORE, "Fossilized Blobfish Ore");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabBlobfish", "en_US", "Blobfish Items");
	  	LanguageRegistry.addName(ItemHandler.BPICK, "Fossilized Blobfish Pick");
	  	LanguageRegistry.addName(ItemHandler.BSWORD, "Fossilized Blobfish Sword");
	  	LanguageRegistry.addName(ItemHandler.BSPADE, "Fossilized Blobfish Shovel");
	  	LanguageRegistry.addName(ItemHandler.BAXE, "Fossilized Blobfish Axe");
	  	LanguageRegistry.addName(ItemHandler.BHOE, "Fossilized Blobfish Hoe");
	  	LanguageRegistry.addName(BlockManager.BlobfishPedistalBlock, "Block Pedistal");
	  	LanguageRegistry.instance().addStringLocalization("container.fossilizer", "Fossilizer");
	  	LanguageRegistry.addName(BlockManager.Blobby, "Blobby The Blobfish");
	  	LanguageRegistry.addName(ItemHandler.Fuel, "Regenerative Powder");
	  	LanguageRegistry.addName(ItemHandler.BMF, "Blobfish Flesh");
	  	LanguageRegistry.addName(ItemHandler.Launcher, "Launcher");
	  	LanguageRegistry.addName(ItemHandler.LauncherB, "Launcher");
	  	LanguageRegistry.addName(BlockManager.Leaf, "Orange-Yellow Leaves");
	  	LanguageRegistry.addName(BlockManager.Leaf1, "Orange Leaves");
	  	LanguageRegistry.addName(BlockManager.Leaf2, "Yellow Leaves");
	  	LanguageRegistry.addName(BlockManager.Leaf3, "Orange-Red Leaves");
	  	LanguageRegistry.addName(BlockManager.Leaf4, "Red Leaves");
	  	
	  	LanguageRegistry.addName(BlockManager.Candy, "Large Candy-Cane");
	}
}
