package Mrhand3.BigModBF.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.IItemRenderer;
import Mrhand3.BigModBF.Items.ItemHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CommandModelUpdate extends CommandBase{

	@Override
	public String getCommandName() {
		return "mupdate";
	}


	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
			updateModels();	
	}

	@SideOnly(Side.CLIENT)
	private void updateModels() {
		RenderManager.instance.entityRenderMap.put(ItemHandler.BINGOT.itemID, (IItemRenderer)new ItemRendererTest());
		Render BlobGun = (Render)RenderManager.instance.entityRenderMap.get(ItemRendererTest.class);
		BlobGun.setRenderManager(RenderManager.instance);
	}
	
	public int getRequiredPermissionLevel(){
		return 2;
	}


	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}
