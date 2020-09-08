package com.miros77.better_diamond.registry;

import com.miros77.better_diamond.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item POLISHED_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "polished_diamond"), POLISHED_DIAMOND);
    }
}
