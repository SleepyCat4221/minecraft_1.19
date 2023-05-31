package net.Exel.minecraftmod.item.custom;

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
            if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
                Vec3 positionVector = new Vec3(player.getEyePosition().x() + 10, player.getEyePosition().y , player.getEyePosition().z());
                player.setPos(positionVector.x, positionVector.y, positionVector.z);
            }
            if (level.isClientSide() && hand == InteractionHand.MAIN_HAND ) {
                Vec3 positionVector = new Vec3(player.getEyePosition().x() + 10, player.getEyePosition().y , player.getEyePosition().z());
                player.setPos(positionVector.x, positionVector.y, positionVector.z);
            }


            return super.use(level, player, hand);
        }





}
