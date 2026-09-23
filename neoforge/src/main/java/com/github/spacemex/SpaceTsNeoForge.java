package com.github.spacemex;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SpaceTs.MOD_ID)
public final class SpaceTsNeoForge {

    public SpaceTsNeoForge(IEventBus eventBus) {
        SpaceTs.initialize();
    }
}
