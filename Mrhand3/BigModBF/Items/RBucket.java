package Mrhand3.BigModBF.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RBucket extends ItemBucket {

    public RBucket(int id, int liquidid) {
        super(id, liquidid);
    }

    // gets the icon
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon("bigmod:bucket");
    }
}