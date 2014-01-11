package Mrhand3.BigModBF.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class BlobGenerator implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case -1: generateNether(world, random, chunkX*16, chunkZ*16); //Forge provides true chunk coordinates, while ModLoader provides block coordinates and calls them chunkX & chunkZ
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16); //To make these values the same as ModLoader they need to be multiplied by 16
			case 173: generateBlob(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateBlob(World world, Random random, int blockX, int blockZ) {

        for(int k = 0; k < 2; k++)
        {
        	int RandPosX = blockX + random.nextInt(100);
            int RandPosY = random.nextInt(128);
            int RandPosZ = blockZ + random.nextInt(100);
            (new WorldGenBlobShrine()).generate(world, random, RandPosX, RandPosY, RandPosZ);
        }
	}

	public void generateSurface(World world, Random random, int blockX, int blockZ)
	{
	


	}

	public void generateNether(World world, Random random, int blockX, int blockZ)
	{
	}
}