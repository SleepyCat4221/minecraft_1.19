package net.Exel.minecraftmod.block;

import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.block.custom.*;
import net.Exel.minecraftmod.item.ModCreativeModeTab;
import net.Exel.minecraftmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    //Blocks

    public static final RegistryObject<Block> ATOM_ORE = registerBlock("atom_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    //Lucky Blocks
    public static final RegistryObject<Block> LUCKYBLOCK1 = registerBlock("luckyblock1", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f), UniformInt.of(20, 60)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LUCKYBLOCK2 = registerBlock("luckyblock2", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f), UniformInt.of(40, 80)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LUCKYBLOCK3 = registerBlock("luckyblock3", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f), UniformInt.of(60, 100)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Speed Blocks
    public static final RegistryObject<Block> SPEEDBLOCK = registerBlock("speedblock", () -> new SpeedBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> SPEEDBLOCK2 = registerBlock("speedblock2", () -> new Speedblock2(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> SPEEDBLOCK3 = registerBlock("speedblock5", () -> new SpeedBlock5(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    //Strengh Blocks
    public static final RegistryObject<Block> STRENGHBLOCK = registerBlock("strenghblock", () -> new StrenghBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> STRENGHBLOCK2 = registerBlock("strenghblock2", () -> new StrenghBlock2(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    //Jump Blocks
    public static final RegistryObject<Block> JUMP_BLOCK = registerBlock("jumpblock", () -> new JumpBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> JUMP_BLOCK2 = registerBlock("jumpblock2", () -> new JumpBlock2(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> JUMP_BLOCK20 = registerBlock("jumpblock20", () -> new JumpBlock20(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    //Regeneration Blocks
    public static final RegistryObject<Block> REGENERATION = registerBlock("regen", () -> new Regeneration(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);
    public static final RegistryObject<Block> REGENERATION2 = registerBlock("regen2", () -> new Regeneration2(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f).explosionResistance(100)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    public static final RegistryObject<Block> COMPRESSED_SLIME_BLOCK = registerBlock("compressed_slime_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1f)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    public static final RegistryObject<Block> EXTRA_STICKY_SLIME_BLOCK = registerBlock("extra_sticky_slime_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1f)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    public static final RegistryObject<Block> CORN_LAMP = registerBlock("corn_lamp", () -> new CornLamp(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1f).lightLevel(state -> state.getValue(CornLamp.LIT) ? 15 : 0)), ModCreativeModeTab.COMPRESSED_SUGARCANE);

    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop", () -> new CornCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)
            ));



}