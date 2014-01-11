package Mrhand3.BigModBF.common;

import Mrhand3.BigModBF.events.ServerTickHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.src.ModLoader;


public class CommonProxy
{
    

    //client stuff
    public void registerRenders()
    {
    }

	public int addArmor(String armor) {
		return 0;
	}
	  public ModelBiped getBlobpackModel(int armorSlot) {
		    return null;
		  }

		public void init() {
			// TODO Auto-generated method stub
			
		}
	  
}
