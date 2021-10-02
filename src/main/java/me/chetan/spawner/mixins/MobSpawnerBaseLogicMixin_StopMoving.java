package me.chetan.spawner.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MobSpawnerBaseLogic.class)
public class MobSpawnerBaseLogicMixin_StopMoving {
    @Redirect(method="updateSpawner",at=@At(value="INVOKE",target = "Lnet/minecraft/entity/Entity;setLocationAndAngles(DDDFF)V"))
    public void setLocation$angles(Entity entity, double x, double y, double z, float yaw, float pitch){
    }
}
