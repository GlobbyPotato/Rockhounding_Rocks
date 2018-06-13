package com.globbypotato.rockhounding_rocks.items;

import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.items.io.ConsumableIO;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

public class CuttingBlade extends ConsumableIO {

	public CuttingBlade(String name, int uses) {
		super(name, uses);
		setCreativeTab(ModConfig.CAN_USE_CUTTING_STATION ? Reference.RockhoundingRocks : null);
	}

    @Override
	public int getItemEnchantability(){
    	return 30;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
    	return enchantment.type == EnumEnchantmentType.DIGGER;
    }
}