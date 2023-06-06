package net.Exel.minecraftmod.item.custom;

import com.mojang.math.Vector3f;
import net.minecraft.commands.arguments.coordinates.Vec2Argument;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import org.spongepowered.asm.mixin.Interface;

public class TpStaff extends Item  {

    public TpStaff(Properties properties){
        super(properties);
    }

    




        public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
            /*if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
                Vec3 positionVector = new Vec3(player.getEyePosition().x() + 10, player.getEyePosition().y , player.getEyePosition().z());
                player.setPos(positionVector.x, positionVector.y, positionVector.z);
            }
            if (level.isClientSide() && hand == InteractionHand.MAIN_HAND ) {
                Vec3 positionVector = new Vec3(player.getEyePosition().x() + 10, player.getEyePosition().y , player.getEyePosition().z());
                player.setPos(positionVector.x, positionVector.y, positionVector.z);
            }

             */


            if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
                Vec3 pos = new Vec3(player.getX()   , player.getZ() , player.getZ());
                Direction dir =    player.getDirection();


                if (dir == Direction.SOUTH){
                    player.setPos(pos.x ,pos.y + 10, pos.z);
                }else if (dir == Direction.WEST){
                    player.setPos(pos.x - 10,pos.y, pos.z);
                }else if (dir == Direction.NORTH){
                    player.setPos(pos.x ,pos.y -10, pos.z);
                }else if (dir == Direction.EAST){
                    player.setPos(pos.x  + 10,pos.y, pos.z);
                }else if (dir == Direction.DOWN){
                    player.setPos(pos.x ,pos.y , pos.z - 10);
                }else if(dir == Direction.UP){
                    player.setPos(pos.x ,pos.y , pos.z + 10);
                }else {
                    player.sendSystemMessage(Component.literal("Some Error accured!!!"));
                }


            }



            return super.use(level, player, hand);
        }





}
