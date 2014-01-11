package Mrhand3.BigModBF.blocks;

import Mrhand3.BigModBF.common.BaseMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BWood extends Block{
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	public BWood(int par1, Material wood) {
		super(par1, wood);
		this.setCreativeTab(BaseMod.tabBlobfish);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon("bigmod:log_redoak_top");
		sideIcon = icon.registerIcon("bigmod:log_redoak_side");
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
	if(side == 0) {
	return topIcon;
	} else if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
}
