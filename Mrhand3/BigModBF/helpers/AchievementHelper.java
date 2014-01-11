package Mrhand3.BigModBF.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AchievementHelper
{
	// Achievement declaration
	public static Achievement achEnter;

	
	static Achievement[] achievementList;

	public static void init()
	{
		achEnter = (new Achievement(4328, "achEnter", 3, 0, new ItemStack(Item.appleGold, 1, 2), achEnter)).registerAchievement().setIndependent();
		

		

		// Add Achievement registration
		addAchievementDesc("achEnter", "Utopia!", "Nice Texture eh?");
		
	}
	
	

	private static void addAchievementDesc(String ach, String name, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}
}
