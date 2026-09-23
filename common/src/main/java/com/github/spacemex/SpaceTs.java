package com.github.spacemex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SpaceTs {
    public static final String MOD_ID = "space_ts";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void initialize() {
        LOGGER.info("Hello World!");
    }

    public static void initializeClientOnly() {
        LOGGER.info("Hello Client!");
    }
}
