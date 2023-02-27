package net.Exel.minecraftmod.block;

import com.mojang.blaze3d.shaders.Uniform;
import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.item.ModCreativeModeTab;
import net.Exel.minecraftmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ForcedChunksSavedData;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.time.format.TextStyle;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block>BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftMod.MOD_ID);


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }







    //Blocks

   public static final RegistryObject<Block> ATOM_ORE = registerBlock("atom_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
           .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> LUCKYBLOCK1 = registerBlock("luckyblock1", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f), UniformInt.of(20,60)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LUCKYBLOCK2 = registerBlock("luckyblock2", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
            .strength(1f), UniformInt.of(40,80)), CreativeModeTab.TAB_BUILDING_BLOCKS);


}
