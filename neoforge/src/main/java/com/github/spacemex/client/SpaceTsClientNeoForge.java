package com.github.spacemex.client;

import com.github.spacemex.SpaceTs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = SpaceTs.MOD_ID, dist = Dist.CLIENT)
public final class SpaceTsClientNeoForge {

    public SpaceTsClientNeoForge(IEventBus eventBus) {
        eventBus.addListener(this::clientInitialization);
    }

    private void clientInitialization(FMLClientSetupEvent event) {
        SpaceTs.initializeClientOnly();
    }
}
