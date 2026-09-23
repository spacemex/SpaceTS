package com.github.spacemex.client;

import com.github.spacemex.SpaceTs;
import net.fabricmc.api.ClientModInitializer;

public class SpaceTsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SpaceTs.initializeClientOnly();
    }
}
