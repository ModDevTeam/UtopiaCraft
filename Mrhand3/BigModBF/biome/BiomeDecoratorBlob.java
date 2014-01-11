package Mrhand3.BigModBF.biome;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DEAD_BUSH;
import Mrhand3.BigModBF.worldgen.WorldGenTreeBlob;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeDecoratorBlob extends BiomeDecorator{

	protected int deadBush2PerChunk;
	protected WorldGenerator genDeadBush2;
	
	public BiomeDecoratorBlob(BiomeGenBase biomegenbase)
	{
		super(biomegenbase);
		genDeadBush2 = new WorldGenTreeBlob(false);
	}

	@Override
	protected void decorate()
	{
		super.decorate();
		boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, DEAD_BUSH);
        for (int j = 0; doGen && j < this.deadBush2PerChunk; ++j)
        {
            int rx = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            int ry = 60 + this.randomGenerator.nextInt(50);
            int rz = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            genDeadBush2.generate(this.currentWorld, this.randomGenerator, rx, ry, rz);
        }
	}
	
}