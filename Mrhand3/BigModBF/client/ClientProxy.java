package Mrhand3.BigModBF.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.TIleEntity.BlobbyEntity;
import Mrhand3.BigModBF.TIleEntity.BlobbyRenderer;
import Mrhand3.BigModBF.TIleEntity.CandyRenderer;
import Mrhand3.BigModBF.TIleEntity.RenderStand;
import Mrhand3.BigModBF.TIleEntity.RenderStandOrb;
import Mrhand3.BigModBF.TIleEntity.TileEntityCandy;
import Mrhand3.BigModBF.TIleEntity.TileEntityCowBlockEntity;
import Mrhand3.BigModBF.TIleEntity.TileEntityCowBlockRenderer;
import Mrhand3.BigModBF.TIleEntity.TileEntityStand;
import Mrhand3.BigModBF.TIleEntity.TileEntityStandOrb;
import Mrhand3.BigModBF.blocks.BlockManager;
import Mrhand3.BigModBF.common.BaseMod;
import Mrhand3.BigModBF.common.CommonProxy;
import Mrhand3.BigModBF.mob.EntityBlobArrow;
import Mrhand3.BigModBF.mob.EntityBlobfish;
import Mrhand3.BigModBF.mob.RenderBlobfish;
import assets.bigmod.textures.models.ModelBlobPack;
import assets.bigmod.textures.models.blobfish;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;


public class ClientProxy extends CommonProxy


{
	ModelBiped[] blobPackModel;
	public static int engineRenderID;
   
    public static final FontRendererWithIcons fontRWithIcons = new FontRendererWithIcons(
			Minecraft.getMinecraft().gameSettings, new ResourceLocation("textures/font/ascii.png"), Minecraft.getMinecraft().renderEngine, false);
	
	public static final FontRendererContourShadow fontRContourShadow = new FontRendererContourShadow(
			Minecraft.getMinecraft().gameSettings, new ResourceLocation("textures/font/ascii.png"), Minecraft.getMinecraft().renderEngine, false);
	
	public static final IconInText ICON_GOLD = new IconInText("$gold$", 12, 12, "bigmod:textures/gui/gold_coins.png", -1, -3, 2);
    
    @Override
    public void registerRenders()
    {
        this.blobPackModel = new ModelBiped[4];
        this.blobPackModel[1] = new ModelBlobPack();
        
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCowBlockEntity.class, new TileEntityCowBlockRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(BlobbyEntity.class, new BlobbyRenderer());
//    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilizer.class, new RendererFossilizer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCandy.class, new CandyRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStand.class, new RenderStand());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStandOrb.class, new RenderStandOrb());
    	
        RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlobfish.class, new RenderBlobfish(new blobfish(), 0.5F));
        engineRenderID = RenderingRegistry.getNextAvailableRenderId();
  
    }
    @Override
    public void init()
    {
    	MinecraftForgeClient.registerItemRenderer(ItemHandler.Launcher.itemID, (IItemRenderer)new ItemRendererTest());
    	MinecraftForgeClient.registerItemRenderer(ItemHandler.LauncherB.itemID, (IItemRenderer)new ItemRendererTest());
    	MinecraftForgeClient.registerItemRenderer(ItemHandler.CaneI.itemID, (IItemRenderer)new ItemRendererCane());
    	
    	MinecraftForgeClient.registerItemRenderer(BlockManager.Machine1Idle.blockID, (IItemRenderer)new ItemRendererFossilizer());
    	
    	EntityRegistry.registerModEntity(EntityBlobArrow.class,
				"Blob Arrow", 1, BaseMod.instance, 64,
				10, true);

    	
    }
    @Override
    public int addArmor(String armor) {
    	return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    public ModelBiped getBlobpackModel(int armorSlot)
    {
      return this.blobPackModel[armorSlot];
    }
    

    
    
}