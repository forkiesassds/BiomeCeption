package net.espuma.biomeception.blocks;

import net.espuma.biomeception.generator.sapling.BCSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.stat.Stat;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static net.espuma.biomeception.generator.BCSapplings.*;

public class BCBlocks {
    public static final Block crackedSandBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5f, 6.0f));
    public static final Block redRockBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5f, 6.0f));
    public static final Block redCobblestoneBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f));
    public static final Block redRockBricksBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5f, 6.0f));
    public static final Block quickSandBlock = new CobwebBlock(FabricBlockSettings.of(Material.COBWEB).noCollision().sounds(BlockSoundGroup.SAND).requiresTool().strength(1.5f, 6.0f));
    public static final Block brownAutumnLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final Block orangeAutumnLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final Block redAutumnLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final Block yellowAutumnLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final Block firLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final Block redwoodLeavesBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final FernBlock autumnShrubPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final Block hydrangeaPlant = new FlowerBlock(StatusEffects.WATER_BREATHING, 10, FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final Block orangeFlowerPlant = new FlowerBlock(StatusEffects.HASTE, 5, FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final Block purpleFlowerPlant = new FlowerBlock(StatusEffects.MINING_FATIGUE, 7, FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock tinyCactusPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock rootPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock toadStoolPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final Block whiteFlowerPlant = new FlowerBlock(StatusEffects.GLOWING, 8, FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock brownGrassPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock shortBrownGrassPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock deadGrassPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock tallDeadGrassPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final FernBlock yellowDeadGrassPlant = new AutumnShrubBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    //todo: make it actually a leaf pile.
    public static final Block leafPileBlock = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).allowsSpawning(BCBlocks::canSpawnOnLeaves).suffocates(BCBlocks::never).blockVision(BCBlocks::never));
    public static final SeagrassBlock catTailPlant = new CatTailBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock brownAutumnTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(brownAutumnTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock orangeAutumnTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(orangeAutumnTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock redAutumnTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(redAutumnTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock yellowAutumnTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(yellowAutumnTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock redwoodTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(redwoodTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));
    public static final SaplingBlock firTreeSapling = new BCSapplingBlock(new BCSaplingGenerator(firTree), FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).strength(0.2f));


    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    private static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    public static void Initialize() {
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "cracked_sand"), crackedSandBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "red_rock"), redRockBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "red_cobblestone"), redCobblestoneBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "red_rock_bricks"), redRockBricksBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "quicksand"), quickSandBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "brown_autumn_leaves"), brownAutumnLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "orange_autumn_leaves"), orangeAutumnLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "red_autumn_leaves"), redAutumnLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "yellow_autumn_leaves"), yellowAutumnLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "fir_leaves"), firLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "redwood_leaves"), redwoodLeavesBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "autumn_shrub"), autumnShrubPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "hydrangea"), hydrangeaPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "orange_flower"), orangeFlowerPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "purple_flower"), purpleFlowerPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "tiny_cactus"), tinyCactusPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "root"), rootPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "toad_stool"), toadStoolPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "white_flower"), whiteFlowerPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "brown_grass"), brownGrassPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "short_brown_grass"), shortBrownGrassPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "dead_grass"), deadGrassPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "tall_dead_grass"), tallDeadGrassPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "yellow_dead_grass"), yellowDeadGrassPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "leaf_pile"), leafPileBlock);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "cat_tail"), catTailPlant);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "brown_autumn_tree_sapling"), brownAutumnTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "orange_autumn_tree_sapling"), orangeAutumnTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "red_autumn_tree_sapling"), redAutumnTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "yellow_autumn_tree_sapling"), yellowAutumnTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "redwood_tree_sapling"), redwoodTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier("biomeception", "fir_tree_sapling"), firTreeSapling);

        Registry.register(Registry.ITEM, new Identifier("biomeception", "cracked_sand"), new BlockItem(crackedSandBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "red_rock"), new BlockItem(redRockBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "red_cobblestone"), new BlockItem(redCobblestoneBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "red_rock_bricks"), new BlockItem(redRockBricksBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "quicksand"), new BlockItem(quickSandBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "brown_autumn_leaves"), new BlockItem(brownAutumnLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "orange_autumn_leaves"), new BlockItem(orangeAutumnLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "red_autumn_leaves"), new BlockItem(redAutumnLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "yellow_autumn_leaves"), new BlockItem(yellowAutumnLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "fir_leaves"), new BlockItem(firLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "redwood_leaves"), new BlockItem(redwoodLeavesBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "autumn_shrub"), new BlockItem(autumnShrubPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "hydrangea"), new BlockItem(hydrangeaPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "orange_flower"), new BlockItem(orangeFlowerPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "purple_flower"), new BlockItem(purpleFlowerPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "tiny_cactus"), new BlockItem(tinyCactusPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "root"), new BlockItem(rootPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "toad_stool"), new BlockItem(toadStoolPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "white_flower"), new BlockItem(whiteFlowerPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "brown_grass"), new BlockItem(brownGrassPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "short_brown_grass"), new BlockItem(shortBrownGrassPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "dead_grass"), new BlockItem(deadGrassPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "tall_dead_grass"), new BlockItem(tallDeadGrassPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "yellow_dead_grass"), new BlockItem(yellowDeadGrassPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "leaf_pile"), new BlockItem(leafPileBlock, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "cat_tail"), new BlockItem(catTailPlant, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "brown_autumn_tree_sapling"), new BlockItem(brownAutumnTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "orange_autumn_tree_sapling"), new BlockItem(orangeAutumnTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "red_autumn_tree_sapling"), new BlockItem(redAutumnTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "yellow_autumn_tree_sapling"), new BlockItem(yellowAutumnTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "redwood_tree_sapling"), new BlockItem(redwoodTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("biomeception", "fir_tree_sapling"), new BlockItem(firTreeSapling, new Item.Settings().group(ItemGroup.MISC)));
    }
}