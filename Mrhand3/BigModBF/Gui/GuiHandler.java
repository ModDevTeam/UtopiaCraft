	package Mrhand3.BigModBF.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Mrhand3.BigModBF.TIleEntity.TileEntityBlobEngine;
import Mrhand3.BigModBF.blocks.TEF;
import Mrhand3.BigModBF.common.BaseMod;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

	public class GuiHandler implements IGuiHandler {
		public GuiHandler() {
			NetworkRegistry.instance().registerGuiHandler(BaseMod.instance, this);
		}

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			TileEntity entity = world.getBlockTileEntity(x, y, z);

			if(entity != null){
				switch (id) {
					case 173:
						if (entity instanceof TEF) {
							return new ContainerFossilizer(player.inventory, (TEF) entity);
						} 
					case 174:
						if (entity instanceof TileEntityBlobEngine){
	                        return new ContainerBenjin(player.inventory, (TileEntityBlobEngine) entity);
						}
						
						return null;
					default:
						return null;
				}
			}
			
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			TileEntity entity = world.getBlockTileEntity(x, y, z);

			if(entity != null){
				switch (id) {
					case 173:
						if (entity instanceof TEF) {
							return new GuiFossilizer(player.inventory, (TEF) entity);
						} 
					case 174:
						if (entity instanceof TileEntityBlobEngine){
	                        return new ContainerBenjin(player.inventory, (TileEntityBlobEngine) entity);
						}

						
						return null;
					default:
						return null;
				}
			}

			return null;
		}	
	}