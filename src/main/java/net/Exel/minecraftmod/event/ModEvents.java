package net.Exel.minecraftmod.event;

import com.ibm.icu.impl.DayPeriodRules;
import com.ibm.icu.util.TimeArrayTimeZoneRule;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.Exel.minecraftmod.MinecraftMod;
import net.Exel.minecraftmod.item.ModItems;
import net.Exel.minecraftmod.villager.ModVillagers;
import net.minecraft.client.Timer;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MinecraftMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        //Regenmaster
        if(event.getType() == ModVillagers.REGEN_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.COMPRESSED_RABBIT_FOOT.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.REGEN_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BLUEBERRY.get(), 15);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack,10,8,0.02F));
                        //How often u can buy, Villager XP, discount
        }








        //Book_master
        //Level 1
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.MENDING,1));
            int villagerLevel = 1;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 24),
                    stack,64,4,0.02F));

            trades.get(1);
        }
        //https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/modification-development/2428876-how-to-make-any-item-make-you-teleport

        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION,4));
            int villagerLevel = 1;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    stack,8,4,0.02F));

            trades.get(1);
        }

        // Level 2
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.FALL_PROTECTION,4));
            int villagerLevel = 2;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 24),
                    stack,8,4,0.02F));

            trades.get(1);
        }
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.UNBREAKING,3));
            int villagerLevel = 2;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,10,4,0.02F));

            trades.get(1);
        }

        //Level 3
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.SHARPNESS,5));
            int villagerLevel = 3;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 28),
                    stack,12,4,0.02F));

            trades.get(1);
        }
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.BLOCK_FORTUNE,3));
            int villagerLevel = 3;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 42),
                    stack,12,4,0.02F));

            trades.get(1);
        }

        //Level 4
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY,5));
            int villagerLevel = 4;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 36),
                    stack,16,4,0.02F));

            trades.get(1);
        }
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.SWIFT_SNEAK,3));
            int villagerLevel = 4;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 42),
                    stack,16,4,0.02F));

            trades.get(1);
        }
        //Level 5
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.SILK_TOUCH,1));
            int villagerLevel = 5;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    stack,16,4,0.02F));

            trades.get(1);
        }
        if(event.getType() == ModVillagers.BOOK_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK, 1);

            EnchantedBookItem.addEnchantment(stack, new EnchantmentInstance(Enchantments.MOB_LOOTING,5));
            int villagerLevel = 5;


            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 128),
                    stack,16,16,0.02F));

            trades.get(1);
        }





        //Builder Master
        //Level 1
        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.QUARTZ_BLOCK, 16);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack,32,3,0.02F));

            trades.get(1);
        }


        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.GLOWSTONE, 16);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 7),
                    stack,32,3,0.02F));

            trades.get(1);
        }

        //Level 2
        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ARMOR_STAND, 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    stack,32,2,0.02F));

            trades.get(1);
        }


        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.RAW_GOLD, 2),
                    stack,64,1,0.02F));

            trades.get(1);
        }

        //Level 3
        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.BLACK_CONCRETE, 16);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,32,2,0.02F));

            trades.get(1);
        }

        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ICE, 16);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    stack,32,2,0.02F));

            trades.get(1);
        }

        //Level 4
        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.OBSIDIAN, 16);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,32,4,0.02F));

            trades.get(1);
        }

        if(event.getType() == ModVillagers.BUILDER_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.CRYING_OBSIDIAN, 8);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,32,4,0.02F));

            trades.get(1);
        }
    }
}