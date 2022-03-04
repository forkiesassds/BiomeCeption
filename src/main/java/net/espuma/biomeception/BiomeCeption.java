package net.espuma.biomeception;

import net.espuma.biomeception.blocks.BCBlocks;
import net.espuma.biomeception.generator.BCSapplings;
import net.fabricmc.api.ModInitializer;

public class BiomeCeption implements ModInitializer {
    @Override
    public void onInitialize() {
        BCSapplings.Initialize();
        BCBlocks.Initialize();
    }
}
