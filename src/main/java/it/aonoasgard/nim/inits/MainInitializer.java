package it.aonoasgard.nim.inits;

import it.aonoasgard.nim.Nim;

public class MainInitializer {

    private static Nim mod;
    private BlockInitializer bi;

    public MainInitializer(Nim mod) {
        this.mod = mod;
        bi = new BlockInitializer();
    }
}
