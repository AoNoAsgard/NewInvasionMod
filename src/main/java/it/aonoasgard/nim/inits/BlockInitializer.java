package it.aonoasgard.nim.inits;

import it.aonoasgard.nim.block.ExampleBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInitializer {

    public static final ExampleBlock EXAMPLE_BLOCK = new ExampleBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));

    public BlockInitializer() {
        Registry.register(Registry.BLOCK, new Identifier("nim", "example_block"), EXAMPLE_BLOCK);
        Registry.register( Registry.ITEM, new Identifier("nim", "example_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC))  );
    }
}
