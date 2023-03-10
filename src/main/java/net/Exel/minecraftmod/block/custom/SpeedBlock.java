package net.Exel.minecraftmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.apache.logging.log4j.core.jmx.Server;

public class SpeedBlock extends Block {
    public SpeedBlock(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {


        if(level.isClientSide){
            if (hand == InteractionHand.MAIN_HAND){
                player.sendSystemMessage(Component.literal("Right Clicked this!"));
            }else {
                player.sendSystemMessage(Component.literal("Right Clicked this!"));
            }
        } else {
            if (hand == InteractionHand.MAIN_HAND){
                player.sendSystemMessage(Component.literal("Right Clicked this!"));
            }else {
                player.sendSystemMessage(Component.literal("Right Clicked this!"));
            }
        }


        return super.use(state, level, pos, player, hand, hitResult);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200, 0));
        }


        super.stepOn(level, pos, state, entity);
    }
}
