package Mrhand3.BigModBF.Items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Mrhand3.BigModBF.blocks.BlockManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {

	public void registerRecipes(){
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Launcher), new Object[]{
	        " XO",
	        "XLX",
	        "YX ",
	        'X', Block.planks, 'Y', Block.blockIron, 'O', BlockManager.Blobby, 'L', Item.diamond
	 });
	  GameRegistry.addRecipe(new ItemStack(BlockManager.teleporter), new Object[]{
	        "XXX",
	        "XLX",
	        "XXX",
	        'X', Block.blockDiamond, 'L', Item.diamond
	 });

	  GameRegistry.addRecipe(new ItemStack(BlockManager.Machine1Idle), new Object[]{
	        "XLX",
	        "XYX",
	        "XLX",
	        'X', Block.stoneBrick, 'Y', Item.bucketLava, 'L', Item.redstone
	 });
	  GameRegistry.addRecipe(new ItemStack(BlockManager.BlobfishPedistalBlock), new Object[]{
	        "XXX",
	        " Y ",
	        "YYY",
	        'X', Block.woodSingleSlab, 'Y', Block.planks
	  });

    GameRegistry.addRecipe(new ItemStack(ItemHandler.BPICK), new Object[]{
        "XXX",
        " Y ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSWORD), new Object[]{
        " X ",
        " X ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSWORD), new Object[]{
        "X  ",
        "X  ",
        "Y  ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSWORD), new Object[]{
        "  X",
        "  X",
        "  Y",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSPADE), new Object[]{
        " X ",
        " Y ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSPADE), new Object[]{
        "X  ",
        "Y  ",
        "Y  ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BSPADE), new Object[]{
        "  X",
        "  Y",
        "  Y",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BAXE), new Object[]{
        "XX ",
        "XY ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BAXE), new Object[]{
        " XX",
        " YX",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BHOE), new Object[]{
        "XX ",
        " Y ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });
    GameRegistry.addRecipe(new ItemStack(ItemHandler.BHOE), new Object[]{
        " XX",
        " Y ",
        " Y ",
        'X', ItemHandler.BINGOT, 'Y', Item.stick
 });   
    GameRegistry.addRecipe(new ItemStack(ItemHandler.Fuel, 10), new Object[]{
        "XZX",
        "XYX",
        "XLX",
        'X', Item.redstone, 'Z', Item.ghastTear, 'Y', Item.gunpowder, 'L', Item.glowstone
 });  
	}
}
