package com.miros77.better_diamond;

import com.miros77.better_diamond.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

public static final String MOD_ID = "better_diamond";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
