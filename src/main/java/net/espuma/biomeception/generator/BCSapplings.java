package net.espuma.biomeception.generator;

import net.espuma.biomeception.blocks.BCBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import static net.espuma.biomeception.blocks.BCBlocks.*;

public class BCSapplings {
    public static final ConfiguredFeature<?, ?> brownAutumnTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.brownAutumnLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(brownAutumnTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));
    public static final ConfiguredFeature<?, ?> orangeAutumnTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.orangeAutumnLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(orangeAutumnTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));
    public static final ConfiguredFeature<?, ?> redAutumnTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.redAutumnLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(redAutumnTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));
    public static final ConfiguredFeature<?, ?> yellowAutumnTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.yellowAutumnLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(yellowAutumnTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));
    public static final ConfiguredFeature<?, ?> redwoodTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    //todo: make it use redwook logs instead, and actually, we shoud instead use our own trunk placer to allow for the complex mess that is ebxl redwood
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
                    new GiantTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.redwoodLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(redwoodTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));
    public static final ConfiguredFeature<?, ?> firTree = Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    //todo: make it use redwook logs instead, and actually, we shoud instead use our own trunk placer to allow for the complex mess that is ebxl redwood
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
                    new GiantTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(BCBlocks.firLeavesBlock.getDefaultState()),
                    new SimpleBlockStateProvider(firTreeSapling.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)));

    public static void Initialize() {
        RegistryKey<ConfiguredFeature<?, ?>> treeBrownAutumn = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "brown_autumn_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeBrownAutumn.getValue(), brownAutumnTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeBrownAutumn);
        RegistryKey<ConfiguredFeature<?, ?>> treeOrangeAutumn = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "orange_autumn_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeOrangeAutumn.getValue(), orangeAutumnTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeOrangeAutumn);
        RegistryKey<ConfiguredFeature<?, ?>> treeRedAutumn = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "red_autumn_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeRedAutumn.getValue(), redAutumnTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeRedAutumn);
        RegistryKey<ConfiguredFeature<?, ?>> treeYellowAutumn = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "yellow_autumn_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeYellowAutumn.getValue(), yellowAutumnTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeYellowAutumn);
        RegistryKey<ConfiguredFeature<?, ?>> treeRedwood = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "redwood_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeRedwood.getValue(), redwoodTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeRedwood);
        RegistryKey<ConfiguredFeature<?, ?>> treeFir = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("biomeception", "fir_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeFir.getValue(), firTree);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeFir);
    }
}