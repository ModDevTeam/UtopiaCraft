 package Mrhand3.BigModBF.common;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumArt;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import Mrhand3.BigModBF.Gui.GuiHandler;
import Mrhand3.BigModBF.Items.BAXE;
import Mrhand3.BigModBF.Items.BBOOTS;
import Mrhand3.BigModBF.Items.BCHEST;
import Mrhand3.BigModBF.Items.BHELM;
import Mrhand3.BigModBF.Items.BHOE;
import Mrhand3.BigModBF.Items.BINGOT;
import Mrhand3.BigModBF.Items.BLEGS;
import Mrhand3.BigModBF.Items.BLauncher;
import Mrhand3.BigModBF.Items.BMF;
import Mrhand3.BigModBF.Items.BPICK;
import Mrhand3.BigModBF.Items.BSPADE;
import Mrhand3.BigModBF.Items.BSWORD;
import Mrhand3.BigModBF.Items.CaneI;
import Mrhand3.BigModBF.Items.Fuel;
import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.Items.Launcher;
import Mrhand3.BigModBF.Items.PP;
import Mrhand3.BigModBF.TIleEntity.BlobbyEntity;
import Mrhand3.BigModBF.TIleEntity.TileEntityCandy;
import Mrhand3.BigModBF.TIleEntity.TileEntityCowBlockEntity;
import Mrhand3.BigModBF.biome.BiomeBlob;
import Mrhand3.BigModBF.blocks.BLeaf;
import Mrhand3.BigModBF.blocks.BLeaf1;
import Mrhand3.BigModBF.blocks.BLeaf2;
import Mrhand3.BigModBF.blocks.BLeaf3;
import Mrhand3.BigModBF.blocks.BLeaf4;
import Mrhand3.BigModBF.blocks.BORE;
import Mrhand3.BigModBF.blocks.BWood;
import Mrhand3.BigModBF.blocks.BlobbyBlock;
import Mrhand3.BigModBF.blocks.BlockManager;
import Mrhand3.BigModBF.blocks.Candy;
import Mrhand3.BigModBF.blocks.Candy2;
import Mrhand3.BigModBF.blocks.Cotton1;
import Mrhand3.BigModBF.blocks.Fossilizer;
import Mrhand3.BigModBF.blocks.HWF;
import Mrhand3.BigModBF.blocks.HWS;
import Mrhand3.BigModBF.blocks.UPortal;
import Mrhand3.BigModBF.blocks.TileEntityCowBlock;
import Mrhand3.BigModBF.blocks.TEF;
import Mrhand3.BigModBF.client.CommandModelUpdate;
import Mrhand3.BigModBF.events.EventManager;
import Mrhand3.BigModBF.helpers.AchievementHelper;
import Mrhand3.BigModBF.helpers.Configs;
import Mrhand3.BigModBF.helpers.Language;
import Mrhand3.BigModBF.mob.EntityBlobArrow;
import Mrhand3.BigModBF.mob.EntityBlobfish;
import Mrhand3.BigModBF.world.WorldProviderPromised;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "bigmod", name = "Big Mod Blobfish Addon Pack", version = "Beta 0.1.7")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BaseMod
{
    @Instance("bigmod")
    public static BaseMod instance;

    
    
    public static String modid = "bigmod";
    public static String Poop = "Yes";
    
    @SidedProxy(clientSide = "Mrhand3.BigModBF.client.ClientProxy", serverSide = "Mrhand3.BigModBF.common.CommonProxy")
    public static CommonProxy proxy;
    public static Configs config;
    //public static BlockManager BlockManager;


    public static String Version = "Beta 0.1.7";
    
    public static final int guiIdFossilizer = 0;
    
    public static final int guiIdCraft2 = 1;
    


    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor){
    	int id = getUniqueEntityId();
    	EntityList.IDtoClassMapping.put(id, entity);
    	EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }


    private static int getUniqueEntityId() {
		do {
			Configs.startEntityId++;
			
		}
		while(EntityList.getStringFromID(Configs.startEntityId) != null);
		return Configs.startEntityId++;
	}

    
    
    
	public static EnumToolMaterial Blobfish = EnumHelper.addToolMaterial("Blobfish", (int) 2.5, 1200, 7.0F, 3, 30);
    public static EnumArmorMaterial blobfishArmor = EnumHelper.addArmorMaterial("blobfisharmor", 1200, new int[] {3, 7, 6, 3}, 30);
    public static EnumArmorMaterial backpack = EnumHelper.addArmorMaterial("backpack", 9999, new int[] {0, 0, 0, 0}, 0);
    		
    EventManager eventmanager = new EventManager();
    
    public static CreativeTabs tabBlobfish = new CreativeTabs("tabBlobfish") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ItemHandler.BINGOT, 1, 0);
        }
};
    
    


	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		System.out.printf("Launching Utopia-Craft, Version ", BaseMod.Version);
        {
            ModMetadata m = event.getModMetadata(); //This is required or it will not work
            m.autogenerated = false; //This is required otherwise it will not work
            m.logoFile = "logo.png";
            m.modId = "Blobfish";
            m.version = BaseMod.Version;
            m.name = "Big Mod Blobfish Pack";
            m.description = "Blobfish galore! All you can love blobfish! Thanks soooo much for Chris_110 for his amazing art that he did for this mod :D";
            m.authorList.add("Mrhand3");
        }
Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        
        Configs.BOREID = config.get("Blobfish Items", "Fossilized Blobfish Ore", 1810).getInt();
        Configs.BINGOTID = config.get("Blobfish Items", "Fossilized Blobfish _____", 1811).getInt();
        
        Configs.BPICKID = config.get("Blobfish Tools", "Fossilized Blobfish Pickaxe", 1812).getInt();
        Configs.BSWORDID = config.get("Blobfish Tools", "Fossilized Blobfish Sword", 1813).getInt();
        Configs. BSPADEID = config.get("Blobfish Tools", "Fossilized Blobfish Shovel", 1814).getInt();
        Configs. BAXEID = config.get("Blobfish Tools", "Fossilized Blobfish Axe", 1815).getInt();
        Configs. BHOEID = config.get("Blobfish Tools", "Fossilized Blobfish Hoe", 1816).getInt();
        Configs. blobfishHelmID = config.get("Blobfish Armor", "Fossilized Blobfish Hat", 1817).getInt();
        Configs. blobfishChestID = config.get("Blobfish Armor", "Fossilized Blobfish Shirt", 1818).getInt();
        Configs. blobfishLegsID = config.get("Blobfish Armor", "Fossilized Blobfish Pants", 1819).getInt();
        Configs. blobfishBootsID = config.get("Blobfish Armor", "Fossilized Blobfish Boots", 1820).getInt();
        Configs. BPBID = config.get("Blobfish Blocks", "Blobfish Pedistal", 1822).getInt();
        Configs. M1IID = config.get("Machines", "Fossil Machine Idle", 1823).getInt();
        Configs. FuelID = config.get("Items", "Regenerative Powder", 1825).getInt();
        Configs. BID = config.get("Blobfish Blocks", "Blobby-Blobfish", 1826).getInt();
        Configs. BMFID = config.get("Blobfish Items", "Blobfish Flesh", 1827).getInt();
        Configs. teleporterID = config.get("Blobfish Blocks", "Blobfish Portal", 1828).getInt();
        Configs.  blobdimID = config.get("Blobfish Dimension", "Blobfish Dimension Id", 173).getInt();
        Configs.  LauncherID = config.get("Tools", "Null Launcher", 1830).getInt();
        Configs. blobdimID = config.get("Tools", "Blobfish Launcher", 1831).getInt();
        Configs. LeafID = config.get("Blobfish Dimension", "Tree Leaf", 1832).getInt();
        Configs. Leaf1ID = config.get("Blobfish Dimension", "Tree Leaf 2", 1833).getInt();
        Configs.  Leaf2ID = config.get("Blobfish Dimension", "Tree Leaf 3", 1834).getInt();
        Configs. Leaf3ID = config.get("Blobfish Dimension", "Tree Leaf 4", 1835).getInt();
        Configs. Leaf4ID = config.get("Blobfish Dimension", "Tree Leaf 5", 1836).getInt();
        Configs.  WoodID = config.get("Blobfish Dimension", "Tree Wood", 1837).getInt();
        Configs. HolyWaterFID = config.get("Blobfish Dimension", "Holy Water Flowing", 1838).getInt();
        Configs. HolyWaterSID = config.get("Blobfish Dimension", "Holy Water Still", 1839).getInt();
        Configs. CandyID = config.get("Blobfish Dimension", "Large-Candy Cane", 1841).getInt();
        Configs.  Candy2ID = config.get("Blobfish Dimension", "Candy Cane Plant", 1842).getInt();
        Configs.  Cotton1ID = config.get("Blobfish Dimension", "Cotton Candy Plant Pink", 1843).getInt();
        Configs.  Cotton2ID = config.get("Blobfish Dimension", "Cotton Candy Plant Blue", 1844).getInt();
        
        Configs. CaneIID = config.get("Blobfish Dimension", "Candy Cane", 1845).getInt();
        Configs. PPID = config.get("Blobfish Dimension", "Portal Placer", 1846).getInt();
        Configs. StandID = config.get("Blobfish Dimension", "Universe in a ball Stand", 1847).getInt();
        Configs. StandOrbID = config.get("Blobfish Dimension", "Universe in a ball stand with a ball in it!", 1848).getInt();
        Configs. benjinID = config.get("Blobfish Powah!", "Blobfish Engine", 1849).getInt();
        
        
        Configs.achievements = config.get("Miscellanious Settings", "Add Utopiacraft Achievements?", true).getBoolean(false);
        proxy.registerRenders();
        
        AchievementHelper.init();
        NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
    	
        BlockManager.registerBlocks();
        registerGame();
        registerLanguage();
        addRecipes();
        ItemHandler.loadItems();
        mobSettings();
        
		registerDims();
		registerBiomes();
    }
    //Armorrrrrr




	private void registerDims() {
    	DimensionManager.registerProviderType(173, WorldProviderPromised.class, false);
		DimensionManager.registerDimension(173, 173);
	}




	private void mobSettings() {
    	

        
        
        LanguageRegistry.instance().addStringLocalization("entity.Seaweed.name", "Seaweed");
    	LanguageRegistry.instance().addStringLocalization("entity.Salmon.name", "en_US", "Salmon");
    	LanguageRegistry.instance().addStringLocalization("entity.Starfish.name", "en_US", "Starfish");
    	LanguageRegistry.instance().addStringLocalization("entity.Blobfish.name", "en_US", "Blobfish");
    	LanguageRegistry.instance().addStringLocalization("entity.Geoduck.name", "en_US", "Geoduck");
    	LanguageRegistry.instance().addStringLocalization("entity.Jellyfish.name", "en_US", "Jellyfish");
    	
    	
		
	}


	

	private void registerGame() {
		BlockManager.registerGame();
		
		//GameRegistry.addBiome(this.blobbiome1);
		

	}
	
	


    private void addRecipes()
    {
    }

    private void registerLanguage()
    {

    	
    }

    private void registerBiomes() {
		Configs.blobbiome1 = new BiomeBlob(174).setBiomeName("Utopia").setDisableRain().setMinMaxHeight(0.2F, 0.2F);	
	}

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    	
    proxy.init();
    	
  	Language.registerLanguages();
  	

  	
  	
  	
    proxy.registerRenders();

  	
    GuiHandler guiHandler = new GuiHandler();
  	
  //\\
	  EntityRegistry.registerGlobalEntityID(EntityBlobfish.class, "Blobfish", 4);
	  EntityRegistry.addSpawn(EntityBlobfish.class, 10, 2, 4, EnumCreatureType.waterCreature, BiomeGenBase.ocean);
	  EntityRegistry.addSpawn(EntityBlobfish.class, 5000, 5000, 5000, EnumCreatureType.waterCreature, Configs.blobbiome1);
	  EntityRegistry.findGlobalUniqueEntityId();
    registerEntityEgg(EntityBlobfish.class, 0x000000, 0x000000);
    //\\
	  EntityRegistry.registerGlobalEntityID(EntityBlobArrow.class, "Barrow", 5);
	  EntityRegistry.findGlobalUniqueEntityId();
  	EntityRegistry.registerModEntity(EntityBlobArrow.class,
				"Blob Arrow", 1, BaseMod.instance, 64,
				10, true);
    //\\
	  EntityRegistry.registerGlobalEntityID(EntityBlobArrow.class, "BARROW", 5);
	  EntityRegistry.findGlobalUniqueEntityId();
    //GameRegistry.addBiome(blobbiome1);
	  //GameRegistry.registerWorldGenerator(new BlobGenerator());
  	//Recipes
	  

	
  	


    
    //Bakcpack
    int renderBackpackArmor = proxy.addArmor("backpack");
    
    
  	//Blobfish Part Name
  	

	GameRegistry.registerWorldGenerator(eventmanager);
        
        
        

        
        
        
      


        //Settings for Biomes
        //Register Biomes
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
    
    @ServerStarting
    public void onServerStart(FMLServerStartingEvent e){
    	ServerCommandManager scm = (ServerCommandManager)MinecraftServer.getServer().getCommandManager();
    	scm.registerCommand(new CommandModelUpdate());
    }
	


	
	

}
 


