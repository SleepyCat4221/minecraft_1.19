package net.Exel.minecraftmod.villager;

import com.google.common.collect.ImmutableSet;
import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

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
                "registerBlockStates", PoiType.class).invoke(null,REGEN_BLOCK_POI.get(),BLOCK_POI.get());
        }catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }







    public static final RegistryObject<PoiType> REGEN_BLOCK_POI = POI_TYPES.register("regen_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.REGENERATION.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> REGEN_MASTER = VILLAGER_PROFESSIONS.register("regen_master",
            () -> new VillagerProfession("regen_master", x -> x.get() == REGEN_BLOCK_POI.get(),
                    x -> x.get() == REGEN_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));




    public static final RegistryObject<PoiType> BLOCK_POI = POI_TYPES.register("block_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.NOTE_BLOCK.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> BLOCK_MASTER = VILLAGER_PROFESSIONS.register("block_master",
            () -> new VillagerProfession("block_master", x -> x.get() == BLOCK_POI.get(),
                    x -> x.get() == BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
}
