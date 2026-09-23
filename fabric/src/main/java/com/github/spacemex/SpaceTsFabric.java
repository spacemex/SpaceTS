package com.github.spacemex;

import net.fabricmc.api.ModInitializer;

public class SpaceTsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        SpaceTs.initialize();
    }
}
