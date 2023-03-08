package net.Exel.minecraftmod.item.custom.glow;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class Glow extends Enchantment {
    protected Glow(Rarity rarity, EnchantmentCategory enchantmentCategory, EquipmentSlot[] equipmentSlots) {
        super(rarity, enchantmentCategory, equipmentSlots);
    }



    public boolean conflictsWith(Enchantment arg0) {
        // TODO Auto-generated method stub
        return false;
    }




    @Override
    public int getMaxLevel() {
        // TODO Auto-generated method stub
        return 0;
    }


    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }


    public int getStartLevel() {
        // TODO Auto-generated method stub
        return 0;
    }


    public boolean isCursed() {
        // TODO Auto-generated method stub
        return false;
    }


    public boolean isTreasure() {
        // TODO Auto-generated method stub
        return false;
    }


}