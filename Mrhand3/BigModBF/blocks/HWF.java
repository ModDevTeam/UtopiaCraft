package Mrhand3.BigModBF.blocks;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HWF extends BlockFlowing {
        
        public HWF(int par1) {
                super(par1, Material.water);

                this.blockHardness = 100.0F;
                this.setLightOpacity(3);
                //this.setCreativeTab(CreativeTabs.tabBlocks);
                //Uncomment this if you wish to test and need it in creative mode!
                }
        
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.theIcon = new Icon[] {
                iconRegister.registerIcon("bigmod:hw_still"),
                iconRegister.registerIcon("bigmod:hw_flow") };
    }

}