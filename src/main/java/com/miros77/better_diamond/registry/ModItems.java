package com.miros77.better_diamond.registry;

import static net.minecraft.util.registry.Registry.register;

import com.miros77.better_diamond.Tutorial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;

public class ModItems {
//Item
    public static final Item POLISHED_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
//Block
    public static final Block POLISHED_DIAMOND_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).resistance(6.0f).breakByTool(FabricToolTags.PICKAXES, 2).build());
    public static void registerItems() {
//Item
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "polished_diamond"), POLISHED_DIAMOND);
//Block
        Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, "polished_diamond_block"), POLISHED_DIAMOND_BLOCK);
//BlockItem
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "polished_diamond_block"), new BlockItem(POLISHED_DIAMOND_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS)));
    }
}
