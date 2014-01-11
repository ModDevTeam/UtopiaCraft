package Mrhand3.BigModBF.Items;

import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.helpers.Configs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHandler {
    public static Item BMF;
    public static Item Fuel;
    public static Item BINGOT;
    public static Item BPICK;
    public static Item BSWORD;
    public static Item BSPADE;
    public static Item BAXE;
    public static Item BHOE;
    public static Item blobfishHelmet;
    public static Item blobfishChest;
    public static Item blobfishLegs;
    public static Item blobfishBoots;
    public static Item Launcher;
    public static Item LauncherB;
    public static Item CaneI;
    public static Item PP;

    
    public static void loadItems() {
		BINGOT = new BINGOT(Configs.BINGOTID).setFull3D().setUnlocalizedName("BINGOT");
		BPICK = new BPICK(Configs.BPICKID, BaseMod.Blobfish).setUnlocalizedName("BPICK");
		BSWORD = new BSWORD(Configs.BSWORDID, BaseMod.Blobfish).setUnlocalizedName("BSWORD");
		BSPADE = new BSPADE(Configs.BSPADEID, BaseMod.Blobfish).setUnlocalizedName("BSPADE");
		BAXE = new BAXE(Configs.BAXEID, BaseMod.Blobfish).setUnlocalizedName("BAXE");
		BHOE = new BHOE(Configs.BHOEID, BaseMod.Blobfish).setUnlocalizedName("BHOE");
		
		Fuel = new Fuel(Configs.FuelID).setUnlocalizedName("Fuel");
		
		BMF = new BMF(Configs.BMFID, 3, 10, true).setUnlocalizedName("BMF");
		
		Launcher = new Launcher(Configs.LauncherID).setFull3D().setUnlocalizedName("LAUNCHER");
		LauncherB = new BLauncher(Configs.LauncherBID).setFull3D().setUnlocalizedName("LAUNCHERB");
		
		CaneI = new CaneI(Configs.CaneIID, 3, 2, false).setFull3D().setUnlocalizedName("Cane");
		
		PP = new PP(Configs.PPID).setUnlocalizedName("PP");
		
	  	//Armor
	    int renderBlobfishArmor = BaseMod.proxy.addArmor("blobfishArmor");
	    
	    blobfishHelmet = new BHELM(Configs.blobfishHelmID, BaseMod.blobfishArmor, renderBlobfishArmor, 0).setUnlocalizedName("BHELM");
	    blobfishChest = new BCHEST(Configs.blobfishChestID, BaseMod.blobfishArmor, renderBlobfishArmor, 1).setUnlocalizedName("BCHEST");
	    blobfishLegs = new BLEGS(Configs.blobfishLegsID, BaseMod.blobfishArmor, renderBlobfishArmor, 2).setUnlocalizedName("BLEGS");
	    blobfishBoots = new BBOOTS(Configs.blobfishBootsID, BaseMod.blobfishArmor, renderBlobfishArmor, 3).setUnlocalizedName("BBOOTS");
	    
	    

		
	}
}
