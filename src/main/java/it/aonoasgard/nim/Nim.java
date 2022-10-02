package it.aonoasgard.nim;

import it.aonoasgard.nim.inits.MainInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Nim implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("NIM");

    private MainInitializer mainInit;

    @Override
    public void onInitialize() {
        LOGGER.info("Inizializing NIM!");
        mainInit = new MainInitializer(this);
    }
}
