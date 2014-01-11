package Mrhand3.BigModBF.helpers;
import net.minecraft.util.ChunkCoordinates;
public class TutorialPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final TeleporterPromised field_85088_e;
public TutorialPortalPosition(TeleporterPromised tutorialTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = tutorialTeleporter;
this.field_85087_d = par5;
}
}