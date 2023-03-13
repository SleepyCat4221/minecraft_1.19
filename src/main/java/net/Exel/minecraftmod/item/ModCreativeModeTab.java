package net.Exel.minecraftmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MinecartItem;

public class ModCreativeModeTab {
    public static final CreativeModeTab CORN = new CreativeModeTab("CornTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CORN_SWORD.get());
        }
    };

    public static final CreativeModeTab COMPRESSED_SUGARCANE = new CreativeModeTab("Compressed_sugarcane") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COMPRESSED_SUGARCANE.get());
        }
    };



}
