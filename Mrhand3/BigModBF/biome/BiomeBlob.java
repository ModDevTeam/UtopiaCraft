package Mrhand3.BigModBF.biome;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import Mrhand3.BigModBF.blocks.BlockManager;
import Mrhand3.BigModBF.common.BaseMod;
public class BiomeBlob extends BiomeGenBase
{
private WorldGenerator UnDeadworldGeneratorBigTree;
public final Material blockMaterial;
public BiomeBlob(int par1)
{
super(par1);
this.blockMaterial = Material.water;
this.minHeight = 0.1F;
this.maxHeight = 0.6F;
this.spawnableMonsterList.clear();
this.spawnableCreatureList.clear();
this.topBlock = ((byte)Block.leaves.blockID);
this.fillerBlock = ((byte)Block.wood.blockID);
this.setBiomeName("Utopia");

/** this changes the water colour, its set to red now but ggole the java colours **/
this.waterColorMultiplier = 0x007f7f;
}
public void decorate(World par1World, Random par2Random, int par3, int par4)
{
    super.decorate(par1World, par2Random, par3, par4);
   // WorldGenFlowers candygenerator = new WorldGenFlowers(BaseMod.Candy.blockID);
    
    
   boolean doGen = TerrainGen.decorate(par1World, par2Random, par3, par4, FLOWERS);
    for (int j = 0; doGen && j < 10; ++j)
    {
        WorldGenFlowers candygenerator = new WorldGenFlowers(BlockManager.Cotton1.blockID);
        int k = par3 + par2Random.nextInt(16) + 8;
        int l = par2Random.nextInt(128);
        int i1 = par4 + par2Random.nextInt(16) + 8;
        candygenerator.generate(par1World, par2Random, k, l, i1);

    }
    for (int j = 0; doGen && j < 10; ++j)
    {
        WorldGenFlowers candygenerator = new WorldGenFlowers(BlockManager.Cotton2.blockID);
        int k = par3 + par2Random.nextInt(16) + 8;
        int l = par2Random.nextInt(128);
        int i1 = par4 + par2Random.nextInt(16) + 8;
        candygenerator.generate(par1World, par2Random, k, l, i1);

    }
    for (int j = 0; doGen && j < 10; ++j)
    {
        WorldGenFlowers candygenerator = new WorldGenFlowers(BlockManager.Candy2.blockID);
        int k = par3 + par2Random.nextInt(16) + 8;
        int l = par2Random.nextInt(128);
        int i1 = par4 + par2Random.nextInt(16) + 8;
        candygenerator.generate(par1World, par2Random, k, l, i1);

    }
    
    
    
}
}