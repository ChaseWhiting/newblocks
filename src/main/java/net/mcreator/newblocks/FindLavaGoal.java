package net.minecraft.entity.ai.goal;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class FindLavaGoal extends Goal {
   private final CreatureEntity creature;

   public FindLavaGoal(CreatureEntity creature) {
      this.creature = creature;
   }

   
   public boolean shouldExecute() {
      return this.creature.isOnGround() && !this.creature.world.getFluidState(this.creature.getPosition()).isTagged(FluidTags.LAVA);
   }

   
   public void startExecuting() {
      BlockPos blockpos = null;

      for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(MathHelper.floor(this.creature.getPosX() - 12.0D), MathHelper.floor(this.creature.getPosY() - 8.0D), MathHelper.floor(this.creature.getPosZ() - 12.0D), MathHelper.floor(this.creature.getPosX() + 12.0D), MathHelper.floor(this.creature.getPosY()), MathHelper.floor(this.creature.getPosZ() + 12.0D))) {
         if (this.creature.world.getFluidState(blockpos1).isTagged(FluidTags.LAVA)) {
            blockpos = blockpos1;
            break;
         }
      }

      if (blockpos != null) {
         this.creature.getMoveHelper().setMoveTo((double)blockpos.getX(), (double)blockpos.getY(), (double)blockpos.getZ(), 1.0D);
      }

   }
}