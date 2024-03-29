package net.Exel.minecraftmod.villager;

import com.google.common.collect.ImmutableSet;
import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public  static  final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MinecraftMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MinecraftMod.MOD_ID);
    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

    public static void registerPOIs(){
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                "registerBlockStates", PoiType.class).invoke(null,REGEN_BLOCK_POI.get(),BOOK_POI.get(),BUILDER_POI.get());
        }catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }





    //Regen Villager

    public static final RegistryObject<PoiType> REGEN_BLOCK_POI = POI_TYPES.register("regen_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.REGENERATION.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> REGEN_MASTER = VILLAGER_PROFESSIONS.register("regen_master",
            () -> new VillagerProfession("regen_master", x -> x.get() == REGEN_BLOCK_POI.get(),
                    x -> x.get() == REGEN_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));


    //Enchanting Villager

    public static final RegistryObject<PoiType> BOOK_POI = POI_TYPES.register("book_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.ENCHANTING_TABLE.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> BOOK_MASTER = VILLAGER_PROFESSIONS.register("book_master",
            () -> new VillagerProfession("book_master", x -> x.get() == BOOK_POI.get(),
                        x -> x.get() == BOOK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_LIBRARIAN));



    //Builder Villager

    public static final RegistryObject<PoiType> BUILDER_POI = POI_TYPES.register("builder_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.COMPRESSED_DIAMOND_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> BUILDER_MASTER = VILLAGER_PROFESSIONS.register("builder_master",
            () -> new VillagerProfession("builder_master", x -> x.get() == BUILDER_POI.get(),
                    x -> x.get() == BUILDER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_TRADE));
}
