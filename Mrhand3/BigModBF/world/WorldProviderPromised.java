package Mrhand3.BigModBF.world;


import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import Mrhand3.BigModBF.helpers.Configs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderPromised extends WorldProvider
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(Configs.blobbiome1, 0.8F, 0.1F);
		this.dimensionId = 173;
	}

	public String getSaveFolder()
	{
		return "DIM-Utopia";
	}

	public String getWelcomeMessage()
	{
		return "Entering Utopia";
	}

	public String getDepartMessage()
	{
		return "Leaving Utopia";
	}

	public boolean canRespawnHere()
	{
		return true;
	}

	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderPromised(worldObj, worldObj.getSeed(), true);
	}

	public String getDimensionName()
	{
		return "Utopia";
	}

	/**
	* Gets the hard-coded portal location to use when entering this dimension.
	*/
	public ChunkCoordinates getEntrancePortalLocation()
	{
		return new ChunkCoordinates(100, 50, 0);
	}

	public boolean canDoLightning(Chunk chunk)
	{
		return true;
	}

	public boolean canDoRainSnowIce(Chunk chunk)
	{
		return false;
	}
	@Override
	public int getAverageGroundLevel()
	{
		return 64;
	}

	@Override
	public double getHorizon()
	{
		return 0.0D;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasVoidParticles(boolean var1)
	{
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isSkyColored()
	{
		return true;
	}

	@Override
	public double getVoidFogYFactor()
	{
		return 1.0D;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3 getFogColor(float par1, float par2)
	{
		float var3 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

		if (var3 < 0.0F)
		{
			var3 = 0.0F;
		}

		if (var3 > 1.0F)
		{
			var3 = 1.0F;
		}

		float var4 = 1.0F;
		float var5 = 0.91764705882F;
		float var6 = 0.4F;
		var4 *= var3 * 3.94F + 0.06F;
		var5 *= var3 * 0.94F + 0.06F;
		var6 *= var3 * 0.91F + 0.09F;
		return worldObj.getWorldVec3Pool().getVecFromPool(var4, var5, var6);
	}


}