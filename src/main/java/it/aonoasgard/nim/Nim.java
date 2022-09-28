package it.aonoasgard.nim;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Nim implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("NIM");

    @Override
    public void onInitialize() {
        LOGGER.info("Inizializing NIM!");
    }
}
