package net.Exel.minecraftmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class compressed extends Item {
    public compressed(Properties properties) {
        super(properties);
    }


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if (!Screen.hasShiftDown()) {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        } else {
            components.add((Component.literal("Compressed Items are Items which where crafted with many resources of that specific item, because you cant (without a plugin) stack items in recipes").withStyle(ChatFormatting.AQUA)));

        }
    }
}