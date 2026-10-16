package com.amir.elemental;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Minimal bootstrap. Item/armor/ore/boss registrations will be added after 26.2 API validation. */
public final class ElementalArsenal implements ModInitializer {
    public static final String MOD_ID = "elemental_arsenal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override public void onInitialize() {
        ModItems.register();
        LOGGER.info("Elemental Arsenal item registration initialized (v5 prototype)");
    }
}
