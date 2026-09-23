package com.github.spacemex.client;

import com.example.mod.ExampleMod;
import net.fabricmc.api.ClientModInitializer;

public class SpaceTsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ExampleMod.initializeClientOnly();
    }
}
