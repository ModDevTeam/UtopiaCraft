package Mrhand3.BigModBF.mob;

import java.util.Random;

import Mrhand3.BigModBF.Items.ItemHandler;
import Mrhand3.BigModBF.common.BaseMod;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;


public class EntityBlobfish extends EntityWaterMob
{
  public EntityBlobfish(World par1World)
  {
    super(par1World);
    this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
  }

  protected boolean isAIEnabled()
  {
    return true;
  }


  protected int getDropItemId()
  {
      return ItemHandler.BMF.itemID;
  }
  protected void applyEntityAttributes()
  {
      super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);
      this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25D);
  }

public void initCreature() {
	// TODO Auto-generated method stub
	
}

public float motionX(double d) {
	// TODO Auto-generated method stub
	return 0;
}

public void setLocationAndAngles(int x, int i, int z, float motionX,
		float wrapAngleTo180_float, float f) {
	// TODO Auto-generated method stub
	
}

}