package Mrhand3.BigModBF.client;

import java.lang.reflect.Method;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.ReflectionHelper;

public class FontRendererContourShadow extends FontRenderer {
	private static String[] renderStringObfNames = {"renderString", "func_78258_a", "a"};
	
	public FontRendererContourShadow(GameSettings settings, ResourceLocation resourceLocation,
			TextureManager textureManager, boolean unicodeFlag) {
		super(settings, resourceLocation, textureManager, unicodeFlag);
	}
	
	@Override
	public int drawString(String text, int x, int y, int color, boolean dropShadow) {
		if (dropShadow) {
			Method renderString = ReflectionHelper.findMethod(FontRenderer.class, this, renderStringObfNames,
					String.class, int.class, int.class, int.class, boolean.class);
			try {
				renderString.invoke(this, text, x, y+1, color, true);
				renderString.invoke(this, text, x, y-1, color, true);
				renderString.invoke(this, text, x-1, y, color, true);
				renderString.invoke(this, text, x+1, y, color, true);
			} catch (Exception e) {}
			return super.drawString(text, x, y, color, false);
		} else {
			return super.drawString(text, x, y, color, false);
		}
	}
	
	public int drawString(String text, int x, int y, int color, boolean dropShadow, int shadowColor) {
		if (dropShadow) {
			super.drawString(text, x, y-1, shadowColor, false);
			super.drawString(text, x, y+1, shadowColor, false);
			super.drawString(text, x-1, y, shadowColor, false);
			super.drawString(text, x+1, y, shadowColor, false);
			return super.drawString(text, x, y, color, false);
		} else {
			return super.drawString(text, x, y, color, false);
		}
	}
	
	public int drawStringWithShadow(String text, int x, int y, int color, int shadowColor) {
		return this.drawString(text, x, y, color, true, shadowColor);
	}
}
