package net.Exel.minecraftmod.item;

import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.item.custom.LuckyDice;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.antlr.v4.Tool;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.CORN)));


    public static final RegistryObject<Item> LUCKY_DICE = ITEMS.register("lucky_dice", () -> new LuckyDice(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COMPRESSED_SUGARCANE = ITEMS.register("compressed_sugarcane", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COMPRESSED_SUGARCANE_2 = ITEMS.register("compressed_sugarcane_2", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COMPRESSED_RABBIT_FOOT = ITEMS.register("compressed_rabbit_foot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COMPRESSED_ROTTEN_FLESH = ITEMS.register("compressed_rotten_flesh", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> INDUSTRIAL_COMPRESSED_ROTTEN_FLESH = ITEMS.register("industrial_compressed_rotten_flesh", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



}
