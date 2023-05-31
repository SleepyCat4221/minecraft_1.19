package net.Exel.minecraftmod.item.custom;

import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface onItemRightClick {
    ItemStack onItemRightClick(ItemStack itemStackIn, WorldlyContainer worldIn, Player playerIn);
}
