package twilightforest.init;

import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import twilightforest.TwilightForestMod;

import java.util.Collection;
import java.util.List;

public class TFCreativeTabs {

	public static void registerTFBlocksTab() {
		CreativeModeTab BLOCKS = FabricItemGroup.builder(TwilightForestMod.prefix("blocks"))
				.title(Component.translatable("itemGroup.twilightforest.blocks"))
				.icon(() -> new ItemStack(TFBlocks.NAGA_COURTYARD_MINIATURE_STRUCTURE.get()))
				.displayItems((featureFlag, output, operator) -> {
					output.accept(TFBlocks.TWILIGHT_OAK_PLANKS.get());
					output.accept(TFBlocks.CANOPY_PLANKS.get());
					output.accept(TFBlocks.MANGROVE_PLANKS.get());
					output.accept(TFBlocks.DARK_PLANKS.get());
					output.accept(TFBlocks.TIME_PLANKS.get());
					output.accept(TFBlocks.TRANSFORMATION_PLANKS.get());
					output.accept(TFBlocks.MINING_PLANKS.get());
					output.accept(TFBlocks.SORTING_PLANKS.get());
					output.accept(TFBlocks.OAK_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_STAIRS.get());
					output.accept(TFBlocks.CANOPY_STAIRS.get());
					output.accept(TFBlocks.MANGROVE_STAIRS.get());
					output.accept(TFBlocks.DARK_STAIRS.get());
					output.accept(TFBlocks.TIME_STAIRS.get());
					output.accept(TFBlocks.TRANSFORMATION_STAIRS.get());
					output.accept(TFBlocks.MINING_STAIRS.get());
					output.accept(TFBlocks.SORTING_STAIRS.get());
					output.accept(TFBlocks.SPRUCE_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_SLAB.get());
					output.accept(TFBlocks.CANOPY_SLAB.get());
					output.accept(TFBlocks.MANGROVE_SLAB.get());
					output.accept(TFBlocks.DARK_SLAB.get());
					output.accept(TFBlocks.TIME_SLAB.get());
					output.accept(TFBlocks.TRANSFORMATION_SLAB.get());
					output.accept(TFBlocks.MINING_SLAB.get());
					output.accept(TFBlocks.SORTING_SLAB.get());
					output.accept(TFBlocks.BIRCH_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_FENCE.get());
					output.accept(TFBlocks.CANOPY_FENCE.get());
					output.accept(TFBlocks.MANGROVE_FENCE.get());
					output.accept(TFBlocks.DARK_FENCE.get());
					output.accept(TFBlocks.TIME_FENCE.get());
					output.accept(TFBlocks.TRANSFORMATION_FENCE.get());
					output.accept(TFBlocks.MINING_FENCE.get());
					output.accept(TFBlocks.SORTING_FENCE.get());
					output.accept(TFBlocks.JUNGLE_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_BANISTER.get());
					output.accept(TFBlocks.CANOPY_BANISTER.get());
					output.accept(TFBlocks.MANGROVE_BANISTER.get());
					output.accept(TFBlocks.DARKWOOD_BANISTER.get());
					output.accept(TFBlocks.TIME_BANISTER.get());
					output.accept(TFBlocks.TRANSFORMATION_BANISTER.get());
					output.accept(TFBlocks.MINING_BANISTER.get());
					output.accept(TFBlocks.SORTING_BANISTER.get());
					output.accept(TFBlocks.ACACIA_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_GATE.get());
					output.accept(TFBlocks.CANOPY_GATE.get());
					output.accept(TFBlocks.MANGROVE_GATE.get());
					output.accept(TFBlocks.DARK_GATE.get());
					output.accept(TFBlocks.TIME_GATE.get());
					output.accept(TFBlocks.TRANSFORMATION_GATE.get());
					output.accept(TFBlocks.MINING_GATE.get());
					output.accept(TFBlocks.SORTING_GATE.get());
					output.accept(TFBlocks.DARK_OAK_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_TRAPDOOR.get());
					output.accept(TFBlocks.CANOPY_TRAPDOOR.get());
					output.accept(TFBlocks.MANGROVE_TRAPDOOR.get());
					output.accept(TFBlocks.DARK_TRAPDOOR.get());
					output.accept(TFBlocks.TIME_TRAPDOOR.get());
					output.accept(TFBlocks.TRANSFORMATION_TRAPDOOR.get());
					output.accept(TFBlocks.MINING_TRAPDOOR.get());
					output.accept(TFBlocks.SORTING_TRAPDOOR.get());
					output.accept(TFBlocks.CRIMSON_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_PLATE.get());
					output.accept(TFBlocks.CANOPY_PLATE.get());
					output.accept(TFBlocks.MANGROVE_PLATE.get());
					output.accept(TFBlocks.DARK_PLATE.get());
					output.accept(TFBlocks.TIME_PLATE.get());
					output.accept(TFBlocks.TRANSFORMATION_PLATE.get());
					output.accept(TFBlocks.MINING_PLATE.get());
					output.accept(TFBlocks.SORTING_PLATE.get());
					output.accept(TFBlocks.WARPED_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_BUTTON.get());
					output.accept(TFBlocks.CANOPY_BUTTON.get());
					output.accept(TFBlocks.MANGROVE_BUTTON.get());
					output.accept(TFBlocks.DARK_BUTTON.get());
					output.accept(TFBlocks.TIME_BUTTON.get());
					output.accept(TFBlocks.TRANSFORMATION_BUTTON.get());
					output.accept(TFBlocks.MINING_BUTTON.get());
					output.accept(TFBlocks.SORTING_BUTTON.get());
					output.accept(TFBlocks.VANGROVE_BANISTER.get());
					output.accept(TFBlocks.TWILIGHT_OAK_DOOR.get());
					output.accept(TFBlocks.CANOPY_DOOR.get());
					output.accept(TFBlocks.MANGROVE_DOOR.get());
					output.accept(TFBlocks.DARK_DOOR.get());
					output.accept(TFBlocks.TIME_DOOR.get());
					output.accept(TFBlocks.TRANSFORMATION_DOOR.get());
					output.accept(TFBlocks.MINING_DOOR.get());
					output.accept(TFBlocks.SORTING_DOOR.get());
					output.accept(TFBlocks.HOLLOW_OAK_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.TWILIGHT_OAK_SIGN.get());
					output.accept(TFBlocks.CANOPY_SIGN.get());
					output.accept(TFBlocks.MANGROVE_SIGN.get());
					output.accept(TFBlocks.DARKWOOD_SIGN.get());
					output.accept(TFBlocks.TIME_SIGN.get());
					output.accept(TFBlocks.TRANSFORMATION_SIGN.get());
					output.accept(TFBlocks.MINING_SIGN.get());
					output.accept(TFBlocks.SORTING_SIGN.get());
					output.accept(TFBlocks.HOLLOW_SPRUCE_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.TWILIGHT_OAK_CHEST.get());
					output.accept(TFBlocks.CANOPY_CHEST.get());
					output.accept(TFBlocks.MANGROVE_CHEST.get());
					output.accept(TFBlocks.DARKWOOD_CHEST.get());
					output.accept(TFBlocks.TIME_CHEST.get());
					output.accept(TFBlocks.TRANSFORMATION_CHEST.get());
					output.accept(TFBlocks.MINING_CHEST.get());
					output.accept(TFBlocks.SORTING_CHEST.get());
					output.accept(TFBlocks.HOLLOW_BIRCH_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.TWILIGHT_OAK_WOOD.get());
					output.accept(TFBlocks.CANOPY_WOOD.get());
					output.accept(TFBlocks.MANGROVE_WOOD.get());
					output.accept(TFBlocks.DARK_WOOD.get());
					output.accept(TFBlocks.TIME_WOOD.get());
					output.accept(TFBlocks.TRANSFORMATION_WOOD.get());
					output.accept(TFBlocks.MINING_WOOD.get());
					output.accept(TFBlocks.SORTING_WOOD.get());
					output.accept(TFBlocks.HOLLOW_JUNGLE_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.TWILIGHT_OAK_LOG.get());
					output.accept(TFBlocks.CANOPY_LOG.get());
					output.accept(TFBlocks.MANGROVE_LOG.get());
					output.accept(TFBlocks.DARK_LOG.get());
					output.accept(TFBlocks.TIME_LOG.get());
					output.accept(TFBlocks.TRANSFORMATION_LOG.get());
					output.accept(TFBlocks.MINING_LOG.get());
					output.accept(TFBlocks.SORTING_LOG.get());
					output.accept(TFBlocks.HOLLOW_ACACIA_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.STRIPPED_TWILIGHT_OAK_LOG.get());
					output.accept(TFBlocks.STRIPPED_CANOPY_LOG.get());
					output.accept(TFBlocks.STRIPPED_MANGROVE_LOG.get());
					output.accept(TFBlocks.STRIPPED_DARK_LOG.get());
					output.accept(TFBlocks.STRIPPED_TIME_LOG.get());
					output.accept(TFBlocks.STRIPPED_TRANSFORMATION_LOG.get());
					output.accept(TFBlocks.STRIPPED_MINING_LOG.get());
					output.accept(TFBlocks.STRIPPED_SORTING_LOG.get());
					output.accept(TFBlocks.HOLLOW_DARK_OAK_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.STRIPPED_TWILIGHT_OAK_WOOD.get());
					output.accept(TFBlocks.STRIPPED_CANOPY_WOOD.get());
					output.accept(TFBlocks.STRIPPED_MANGROVE_WOOD.get());
					output.accept(TFBlocks.STRIPPED_DARK_WOOD.get());
					output.accept(TFBlocks.STRIPPED_TIME_WOOD.get());
					output.accept(TFBlocks.STRIPPED_TRANSFORMATION_WOOD.get());
					output.accept(TFBlocks.STRIPPED_MINING_WOOD.get());
					output.accept(TFBlocks.STRIPPED_SORTING_WOOD.get());
					output.accept(TFBlocks.HOLLOW_CRIMSON_STEM_HORIZONTAL.get());
					output.accept(TFBlocks.ROOT_BLOCK.get());
					output.accept(TFBlocks.LIVEROOT_BLOCK.get());
					output.accept(TFBlocks.MANGROVE_ROOT.get());
					output.accept(TFBlocks.CANOPY_BOOKSHELF.get());
					output.accept(TFBlocks.TIME_LOG_CORE.get());
					output.accept(TFBlocks.TRANSFORMATION_LOG_CORE.get());
					output.accept(TFBlocks.MINING_LOG_CORE.get());
					output.accept(TFBlocks.SORTING_LOG_CORE.get());
					output.accept(TFBlocks.HOLLOW_WARPED_STEM_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_TWILIGHT_OAK_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_CANOPY_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_MANGROVE_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_DARK_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_TIME_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_TRANSFORMATION_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_MINING_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_SORTING_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.HOLLOW_VANGROVE_LOG_HORIZONTAL.get());
					output.accept(TFBlocks.TWILIGHT_OAK_LEAVES.get());
					output.accept(TFBlocks.CANOPY_LEAVES.get());
					output.accept(TFBlocks.MANGROVE_LEAVES.get());
					output.accept(TFBlocks.DARK_LEAVES.get());
					output.accept(TFBlocks.TIME_LEAVES.get());
					output.accept(TFBlocks.TRANSFORMATION_LEAVES.get());
					output.accept(TFBlocks.MINING_LEAVES.get());
					output.accept(TFBlocks.SORTING_LEAVES.get());
					output.accept(TFBlocks.RAINBOW_OAK_LEAVES.get());
					output.accept(TFBlocks.TWILIGHT_OAK_SAPLING.get());
					output.accept(TFBlocks.CANOPY_SAPLING.get());
					output.accept(TFBlocks.MANGROVE_SAPLING.get());
					output.accept(TFBlocks.DARKWOOD_SAPLING.get());
					output.accept(TFBlocks.TIME_SAPLING.get());
					output.accept(TFBlocks.TRANSFORMATION_SAPLING.get());
					output.accept(TFBlocks.MINING_SAPLING.get());
					output.accept(TFBlocks.SORTING_SAPLING.get());
					output.accept(TFBlocks.RAINBOW_OAK_SAPLING.get());
					output.accept(TFBlocks.HOLLOW_OAK_SAPLING.get());
					output.accept(TFBlocks.MOSS_PATCH.get());
					output.accept(TFBlocks.MAYAPPLE.get());
					output.accept(TFBlocks.CLOVER_PATCH.get());
					output.accept(TFBlocks.FIDDLEHEAD.get());
					output.accept(TFBlocks.MUSHGLOOM.get());
					output.accept(TFBlocks.TORCHBERRY_PLANT.get());
					output.accept(TFBlocks.FALLEN_LEAVES.get());
					output.accept(TFBlocks.ROOT_STRAND.get());
					output.accept(TFBlocks.TROLLVIDR.get());
					output.accept(TFBlocks.UNRIPE_TROLLBER.get());
					output.accept(TFBlocks.TROLLBER.get());
					output.accept(TFBlocks.HUGE_MUSHGLOOM.get());
					output.accept(TFBlocks.HUGE_MUSHGLOOM_STEM.get());
					output.accept(TFBlocks.HUGE_STALK.get());
					output.accept(TFBlocks.BEANSTALK_LEAVES.get());
					output.accept(TFBlocks.HUGE_WATER_LILY.get());
					output.accept(TFBlocks.HUGE_LILY_PAD.get());
					output.accept(TFBlocks.BROWN_THORNS.get());
					output.accept(TFBlocks.GREEN_THORNS.get());
					output.accept(TFBlocks.BURNT_THORNS.get());
					output.accept(TFBlocks.THORN_ROSE.get());
					output.accept(TFBlocks.THORN_LEAVES.get());
					output.accept(TFBlocks.HEDGE.get());
					output.accept(TFBlocks.FIREFLY_JAR.get());
					output.accept(TFBlocks.CICADA_JAR.get());
					output.accept(TFBlocks.FIREFLY_SPAWNER.get());
					output.accept(TFBlocks.FIREFLY.get());
					output.accept(TFBlocks.CICADA.get());
					output.accept(TFBlocks.MOONWORM.get());
					output.accept(TFBlocks.IRONWOOD_BLOCK.get());
					output.accept(TFBlocks.STEELEAF_BLOCK.get());
					output.accept(TFBlocks.FIERY_BLOCK.get());
					output.accept(TFBlocks.KNIGHTMETAL_BLOCK.get());
					output.accept(TFBlocks.CARMINITE_BLOCK.get());
					output.accept(TFBlocks.ARCTIC_FUR_BLOCK.get());
					output.accept(TFBlocks.NAGA_TROPHY.get());
					output.accept(TFBlocks.LICH_TROPHY.get());
					output.accept(TFBlocks.MINOSHROOM_TROPHY.get());
					output.accept(TFBlocks.HYDRA_TROPHY.get());
					output.accept(TFBlocks.KNIGHT_PHANTOM_TROPHY.get());
					output.accept(TFBlocks.UR_GHAST_TROPHY.get());
					output.accept(TFBlocks.ALPHA_YETI_TROPHY.get());
					output.accept(TFBlocks.SNOW_QUEEN_TROPHY.get());
					output.accept(TFBlocks.QUEST_RAM_TROPHY.get());
					output.accept(TFBlocks.NAGA_BOSS_SPAWNER.get());
					output.accept(TFBlocks.LICH_BOSS_SPAWNER.get());
					output.accept(TFBlocks.MINOSHROOM_BOSS_SPAWNER.get());
					output.accept(TFBlocks.HYDRA_BOSS_SPAWNER.get());
					output.accept(TFBlocks.KNIGHT_PHANTOM_BOSS_SPAWNER.get());
					output.accept(TFBlocks.UR_GHAST_BOSS_SPAWNER.get());
					output.accept(TFBlocks.ALPHA_YETI_BOSS_SPAWNER.get());
					output.accept(TFBlocks.SNOW_QUEEN_BOSS_SPAWNER.get());
					output.accept(TFBlocks.FINAL_BOSS_BOSS_SPAWNER.get());
					output.accept(TFBlocks.TWILIGHT_PORTAL_MINIATURE_STRUCTURE.get());
					output.accept(TFBlocks.NAGA_COURTYARD_MINIATURE_STRUCTURE.get());
					output.accept(TFBlocks.LICH_TOWER_MINIATURE_STRUCTURE.get());
					output.accept(TFBlocks.ETCHED_NAGASTONE.get());
					output.accept(TFBlocks.CRACKED_ETCHED_NAGASTONE.get());
					output.accept(TFBlocks.MOSSY_ETCHED_NAGASTONE.get());
					output.accept(TFBlocks.NAGASTONE_PILLAR.get());
					output.accept(TFBlocks.CRACKED_NAGASTONE_PILLAR.get());
					output.accept(TFBlocks.MOSSY_NAGASTONE_PILLAR.get());
					output.accept(TFBlocks.NAGASTONE_STAIRS_LEFT.get());
					output.accept(TFBlocks.CRACKED_NAGASTONE_STAIRS_LEFT.get());
					output.accept(TFBlocks.MOSSY_NAGASTONE_STAIRS_LEFT.get());
					output.accept(TFBlocks.NAGASTONE_STAIRS_RIGHT.get());
					output.accept(TFBlocks.CRACKED_NAGASTONE_STAIRS_RIGHT.get());
					output.accept(TFBlocks.MOSSY_NAGASTONE_STAIRS_RIGHT.get());
					output.accept(TFBlocks.NAGASTONE_HEAD.get());
					output.accept(TFBlocks.NAGASTONE.get());
					output.accept(TFBlocks.SPIRAL_BRICKS.get());
					output.accept(TFBlocks.BOLD_STONE_PILLAR.get());
					output.accept(TFBlocks.TWISTED_STONE.get());
					output.accept(TFBlocks.TWISTED_STONE_PILLAR.get());
					output.accept(TFBlocks.CANDELABRA.get());
					makeSkullCandle(output, TFBlocks.ZOMBIE_SKULL_CANDLE.get());
					makeSkullCandle(output, TFBlocks.SKELETON_SKULL_CANDLE.get());
					makeSkullCandle(output, TFBlocks.WITHER_SKELE_SKULL_CANDLE.get());
					makeSkullCandle(output, TFBlocks.CREEPER_SKULL_CANDLE.get());
					makeSkullCandle(output, TFBlocks.PLAYER_SKULL_CANDLE.get());
					output.accept(TFBlocks.DEATH_TOME_SPAWNER.get());
					output.accept(TFBlocks.EMPTY_CANOPY_BOOKSHELF.get());
					output.accept(TFBlocks.KEEPSAKE_CASKET.get());
					output.accept(TFBlocks.SMOKER.get());
					output.accept(TFBlocks.FIRE_JET.get());
					output.accept(TFBlocks.MAZESTONE.get());
					output.accept(TFBlocks.MAZESTONE_BRICK.get());
					output.accept(TFBlocks.CRACKED_MAZESTONE.get());
					output.accept(TFBlocks.MOSSY_MAZESTONE.get());
					output.accept(TFBlocks.DECORATIVE_MAZESTONE.get());
					output.accept(TFBlocks.CUT_MAZESTONE.get());
					output.accept(TFBlocks.MAZESTONE_MOSAIC.get());
					output.accept(TFBlocks.MAZESTONE_BORDER.get());
					output.accept(TFBlocks.UNDERBRICK.get());
					output.accept(TFBlocks.CRACKED_UNDERBRICK.get());
					output.accept(TFBlocks.MOSSY_UNDERBRICK.get());
					output.accept(TFBlocks.UNDERBRICK_FLOOR.get());
					output.accept(TFBlocks.STRONGHOLD_SHIELD.get());
					output.accept(TFBlocks.TROPHY_PEDESTAL.get());
					output.accept(TFBlocks.TOWERWOOD.get());
					output.accept(TFBlocks.CRACKED_TOWERWOOD.get());
					output.accept(TFBlocks.MOSSY_TOWERWOOD.get());
					output.accept(TFBlocks.INFESTED_TOWERWOOD.get());
					output.accept(TFBlocks.ENCASED_TOWERWOOD.get());
					output.accept(TFBlocks.ENCASED_SMOKER.get());
					output.accept(TFBlocks.ENCASED_FIRE_JET.get());
					output.accept(TFBlocks.GHAST_TRAP.get());
					output.accept(TFBlocks.VANISHING_BLOCK.get());
					output.accept(TFBlocks.REAPPEARING_BLOCK.get());
					output.accept(TFBlocks.LOCKED_VANISHING_BLOCK.get());
					output.accept(TFBlocks.CARMINITE_BUILDER.get());
					output.accept(TFBlocks.ANTIBUILDER.get());
					output.accept(TFBlocks.CARMINITE_REACTOR.get());
					output.accept(TFBlocks.AURORA_BLOCK.get());
					output.accept(TFBlocks.AURORA_PILLAR.get());
					output.accept(TFBlocks.AURORA_SLAB.get());
					output.accept(TFBlocks.AURORALIZED_GLASS.get());
					output.accept(TFBlocks.TROLLSTEINN.get());
					output.accept(TFBlocks.UBEROUS_SOIL.get());
					output.accept(TFBlocks.WISPY_CLOUD.get());
					output.accept(TFBlocks.FLUFFY_CLOUD.get());
					output.accept(TFBlocks.GIANT_COBBLESTONE.get());
					output.accept(TFBlocks.GIANT_LOG.get());
					output.accept(TFBlocks.GIANT_LEAVES.get());
					output.accept(TFBlocks.GIANT_OBSIDIAN.get());
					output.accept(TFBlocks.DEADROCK.get());
					output.accept(TFBlocks.CRACKED_DEADROCK.get());
					output.accept(TFBlocks.WEATHERED_DEADROCK.get());
					output.accept(TFBlocks.CASTLE_BRICK.get());
					output.accept(TFBlocks.WORN_CASTLE_BRICK.get());
					output.accept(TFBlocks.CRACKED_CASTLE_BRICK.get());
					output.accept(TFBlocks.MOSSY_CASTLE_BRICK.get());
					output.accept(TFBlocks.THICK_CASTLE_BRICK.get());
					output.accept(TFBlocks.CASTLE_ROOF_TILE.get());
					output.accept(TFBlocks.ENCASED_CASTLE_BRICK_PILLAR.get());
					output.accept(TFBlocks.ENCASED_CASTLE_BRICK_TILE.get());
					output.accept(TFBlocks.BOLD_CASTLE_BRICK_PILLAR.get());
					output.accept(TFBlocks.BOLD_CASTLE_BRICK_TILE.get());
					output.accept(TFBlocks.CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.WORN_CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.CRACKED_CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.MOSSY_CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.ENCASED_CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.BOLD_CASTLE_BRICK_STAIRS.get());
					output.accept(TFBlocks.PINK_CASTLE_RUNE_BRICK.get());
					output.accept(TFBlocks.YELLOW_CASTLE_RUNE_BRICK.get());
					output.accept(TFBlocks.BLUE_CASTLE_RUNE_BRICK.get());
					output.accept(TFBlocks.VIOLET_CASTLE_RUNE_BRICK.get());
					output.accept(TFBlocks.PINK_CASTLE_DOOR.get());
					output.accept(TFBlocks.YELLOW_CASTLE_DOOR.get());
					output.accept(TFBlocks.BLUE_CASTLE_DOOR.get());
					output.accept(TFBlocks.VIOLET_CASTLE_DOOR.get());
					output.accept(TFBlocks.PINK_FORCE_FIELD.get());
					output.accept(TFBlocks.ORANGE_FORCE_FIELD.get());
					output.accept(TFBlocks.GREEN_FORCE_FIELD.get());
					output.accept(TFBlocks.BLUE_FORCE_FIELD.get());
					output.accept(TFBlocks.VIOLET_FORCE_FIELD.get());
					output.accept(TFBlocks.CINDER_FURNACE.get());
					output.accept(TFBlocks.CINDER_LOG.get());
					output.accept(TFBlocks.CINDER_WOOD.get());
					output.accept(TFBlocks.SLIDER.get());
					output.accept(TFBlocks.UNCRAFTING_TABLE.get());
					output.accept(TFBlocks.IRON_LADDER.get());
				}).build();

		CreativeModeTab ITEMS = FabricItemGroup.builder(TwilightForestMod.prefix("items"))
				.title(Component.translatable("itemGroup.twilightforest.items"))
				.icon(() -> new ItemStack(TFBlocks.TWILIGHT_PORTAL_MINIATURE_STRUCTURE.get()))
				.displayItems((featureFlag, output, operator) -> {
					output.accept(TFItems.TORCHBERRIES.get());
					output.accept(TFItems.RAVEN_FEATHER.get());
					output.accept(TFItems.MAGIC_MAP_FOCUS.get());
					output.accept(TFItems.MAZE_MAP_FOCUS.get());
					output.accept(TFItems.MAGIC_MAP.get());
					output.accept(TFItems.MAZE_MAP.get());
					output.accept(TFItems.ORE_MAP.get());
					output.accept(TFItems.ORE_METER.get());
					output.accept(TFItems.MOON_DIAL.get());
					output.accept(TFItems.LIVEROOT.get());
					output.accept(TFItems.RAW_IRONWOOD.get());
					output.accept(TFItems.IRONWOOD_INGOT.get());
					output.accept(TFItems.STEELEAF_INGOT.get());
					output.accept(TFItems.NAGA_SCALE.get());
					output.accept(TFItems.ARMOR_SHARD.get());
					output.accept(TFItems.ARMOR_SHARD_CLUSTER.get());
					output.accept(TFItems.KNIGHTMETAL_INGOT.get());
					output.accept(TFItems.KNIGHTMETAL_RING.get());
					output.accept(TFItems.FIERY_BLOOD.get());
					output.accept(TFItems.FIERY_TEARS.get());
					output.accept(TFItems.FIERY_INGOT.get());
					output.accept(TFItems.ARCTIC_FUR.get());
					output.accept(TFItems.ALPHA_YETI_FUR.get());
					output.accept(TFItems.RAW_VENISON.get());
					output.accept(TFItems.COOKED_VENISON.get());
					output.accept(TFItems.RAW_MEEF.get());
					output.accept(TFItems.COOKED_MEEF.get());
					output.accept(TFItems.MAZE_WAFER.get());
					output.accept(TFItems.MEEF_STROGANOFF.get());
					output.accept(TFItems.HYDRA_CHOP.get());
					output.accept(TFItems.EXPERIMENT_115.get());
					output.accept(TFItems.CHARM_OF_LIFE_1.get());
					output.accept(TFItems.CHARM_OF_LIFE_2.get());
					output.accept(TFItems.CHARM_OF_KEEPING_1.get());
					output.accept(TFItems.CHARM_OF_KEEPING_2.get());
					output.accept(TFItems.CHARM_OF_KEEPING_3.get());
					output.accept(TFItems.BORER_ESSENCE.get());
					output.accept(TFItems.CARMINITE.get());
					output.accept(TFItems.TOWER_KEY.get());
					output.accept(TFItems.TRANSFORMATION_POWDER.get());
					output.accept(TFItems.BRITTLE_FLASK.get());
					output.accept(TFItems.GREATER_FLASK.get());
					output.accept(TFItems.RED_THREAD.get());
					output.accept(TFItems.MAGIC_BEANS.get());
					output.accept(TFItems.CUBE_TALISMAN.get());
					output.accept(TFItems.MUSIC_DISC_THREAD.get());
					output.accept(TFItems.MUSIC_DISC_FINDINGS.get());
					output.accept(TFItems.MUSIC_DISC_RADIANCE.get());
					output.accept(TFItems.MUSIC_DISC_STEPS.get());
					output.accept(TFItems.MUSIC_DISC_MOTION.get());
					output.accept(TFItems.MUSIC_DISC_WAYFARER.get());
					output.accept(TFItems.MUSIC_DISC_HOME.get());
					output.accept(TFItems.MUSIC_DISC_MAKER.get());
					output.accept(TFItems.MUSIC_DISC_SUPERSTITIOUS.get());
					output.accept(TFItems.NAGA_BANNER_PATTERN.get());
					output.accept(TFItems.LICH_BANNER_PATTERN.get());
					output.accept(TFItems.MINOSHROOM_BANNER_PATTERN.get());
					output.accept(TFItems.HYDRA_BANNER_PATTERN.get());
					output.accept(TFItems.KNIGHT_PHANTOM_BANNER_PATTERN.get());
					output.accept(TFItems.UR_GHAST_BANNER_PATTERN.get());
					output.accept(TFItems.ALPHA_YETI_BANNER_PATTERN.get());
					output.accept(TFItems.SNOW_QUEEN_BANNER_PATTERN.get());
					output.accept(TFItems.QUEST_RAM_BANNER_PATTERN.get());
					createSpawnEggsAlphabetical(output);
				}).build();

		FabricItemGroup.builder(TwilightForestMod.prefix("equipment"))
				.title(Component.translatable("itemGroup.twilightforest.equipment"))
				.icon(() -> new ItemStack(TFItems.KNIGHTMETAL_PICKAXE.get()))
				.displayItems((featureFlag, output, operator) -> {
					generateGearWithEnchants(output, TFItems.IRONWOOD_HELMET.get(), new EnchantmentInstance(Enchantments.AQUA_AFFINITY, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_CHESTPLATE.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_LEGGINGS.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_BOOTS.get(), new EnchantmentInstance(Enchantments.FALL_PROTECTION, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_SWORD.get(), new EnchantmentInstance(Enchantments.UNBREAKING, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_SHOVEL.get(), new EnchantmentInstance(Enchantments.UNBREAKING, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_PICKAXE.get(), new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_AXE.get(), new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, 1));
					generateGearWithEnchants(output, TFItems.IRONWOOD_HOE.get(), new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 1));
					generateGearWithEnchants(output, TFItems.STEELEAF_HELMET.get(), new EnchantmentInstance(Enchantments.PROJECTILE_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_CHESTPLATE.get(), new EnchantmentInstance(Enchantments.BLAST_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_LEGGINGS.get(), new EnchantmentInstance(Enchantments.FIRE_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_BOOTS.get(), new EnchantmentInstance(Enchantments.FALL_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_SWORD.get(), new EnchantmentInstance(Enchantments.MOB_LOOTING, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_SHOVEL.get(), new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_PICKAXE.get(), new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_AXE.get(), new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 2));
					generateGearWithEnchants(output, TFItems.STEELEAF_HOE.get(), new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, 2));
					output.accept(TFItems.KNIGHTMETAL_HELMET.get());
					output.accept(TFItems.KNIGHTMETAL_CHESTPLATE.get());
					output.accept(TFItems.KNIGHTMETAL_LEGGINGS.get());
					output.accept(TFItems.KNIGHTMETAL_BOOTS.get());
					output.accept(TFItems.KNIGHTMETAL_SWORD.get());
					output.accept(TFItems.KNIGHTMETAL_PICKAXE.get());
					output.accept(TFItems.KNIGHTMETAL_AXE.get());
					output.accept(TFItems.BLOCK_AND_CHAIN.get());
					output.accept(TFItems.KNIGHTMETAL_SHIELD.get());
					output.accept(TFItems.FIERY_HELMET.get());
					output.accept(TFItems.FIERY_CHESTPLATE.get());
					output.accept(TFItems.FIERY_LEGGINGS.get());
					output.accept(TFItems.FIERY_BOOTS.get());
					output.accept(TFItems.FIERY_SWORD.get());
					output.accept(TFItems.FIERY_PICKAXE.get());
					generateGearWithEnchants(output, TFItems.MAZEBREAKER_PICKAXE.get(), new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 4), new EnchantmentInstance(Enchantments.UNBREAKING, 3), new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, 2));
					output.accept(TFItems.GOLDEN_MINOTAUR_AXE.get());
					output.accept(TFItems.DIAMOND_MINOTAUR_AXE.get());
					output.accept(TFItems.ARCTIC_HELMET.get());
					output.accept(TFItems.ARCTIC_CHESTPLATE.get());
					output.accept(TFItems.ARCTIC_LEGGINGS.get());
					output.accept(TFItems.ARCTIC_BOOTS.get());
					output.accept(TFItems.ICE_SWORD.get());
					output.accept(TFItems.TRIPLE_BOW.get());
					output.accept(TFItems.SEEKER_BOW.get());
					output.accept(TFItems.ICE_BOW.get());
					output.accept(TFItems.ENDER_BOW.get());
					generateGearWithEnchants(output, TFItems.YETI_HELMET.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.YETI_CHESTPLATE.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.YETI_LEGGINGS.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 2));
					generateGearWithEnchants(output, TFItems.YETI_BOOTS.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 2), new EnchantmentInstance(Enchantments.FALL_PROTECTION, 4));
					output.accept(TFItems.GIANT_SWORD.get());
					output.accept(TFItems.GIANT_PICKAXE.get());
					createGlassSwordAndLoreVer(output);
					output.accept(TFItems.ICE_BOMB.get());
					output.accept(TFItems.PHANTOM_HELMET.get());
					output.accept(TFItems.PHANTOM_CHESTPLATE.get());
					generateGearWithEnchants(output, TFItems.NAGA_CHESTPLATE.get(), new EnchantmentInstance(Enchantments.FIRE_PROTECTION, 3));
					generateGearWithEnchants(output, TFItems.NAGA_LEGGINGS.get(), new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 3));
					output.accept(TFItems.TWILIGHT_SCEPTER.get());
					output.accept(TFItems.LIFEDRAIN_SCEPTER.get());
					output.accept(TFItems.ZOMBIE_SCEPTER.get());
					output.accept(TFItems.FORTIFICATION_SCEPTER.get());
					output.accept(TFItems.LAMP_OF_CINDERS.get());
					output.accept(TFItems.ORE_MAGNET.get());
					output.accept(TFItems.CRUMBLE_HORN.get());
					output.accept(TFItems.PEACOCK_FEATHER_FAN.get());
					output.accept(TFItems.MOONWORM_QUEEN.get());
					output.accept(TFItems.CUBE_OF_ANNIHILATION.get());
					tfEnchants(output, CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
					tfEnchants(output, CreativeModeTab.TabVisibility.SEARCH_TAB_ONLY);
				}).build();
	}

	private static void tfEnchants(CreativeModeTab.Output output, CreativeModeTab.TabVisibility visibility) {
		for (RegistryObject<Enchantment> enchantment : TFEnchantments.ENCHANTMENTS.getEntries()) {
			if (visibility == CreativeModeTab.TabVisibility.PARENT_TAB_ONLY) {
				output.accept(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(enchantment.get(), enchantment.get().getMaxLevel())), visibility);
			} else {
				for (int i = enchantment.get().getMinLevel(); i <= enchantment.get().getMaxLevel(); ++i) {
					output.accept(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(enchantment.get(), i)), visibility);
				}
			}
		}
	}

	private static void generateGearWithEnchants(CreativeModeTab.Output output, Item item, EnchantmentInstance... instances) {
		ItemStack stack = new ItemStack(item);
		for (EnchantmentInstance enchant : instances) {
			stack.enchant(enchant.enchantment, enchant.level);
		}
		output.accept(stack);
	}

	private static void createSpawnEggsAlphabetical(CreativeModeTab.Output output) {
		Collection<Item> eggs = TFEntities.SPAWN_EGGS.getEntries().stream().map(RegistryObject::get).toList();
		eggs.forEach(output::accept);
	}

	private static void makeSkullCandle(CreativeModeTab.Output output, ItemLike item) {
		ItemStack stack = new ItemStack(item);
		CompoundTag tag = new CompoundTag();
		tag.putInt("CandleAmount", 1);
		tag.putInt("CandleColor", 0);
		stack.addTagElement("BlockEntityTag", tag);
		output.accept(stack);
	}

	private static void createGlassSwordAndLoreVer(CreativeModeTab.Output output) {
		output.accept(TFItems.GLASS_SWORD.get());
		ItemStack loreSword = new ItemStack(TFItems.GLASS_SWORD.get());
		CompoundTag tags = new CompoundTag();
		tags.putBoolean("Unbreakable", true);

		ListTag lore = new ListTag();
		lore.add(StringTag.valueOf("{\"translate\":\"item.twilightforest.glass_sword.tooltip.1\",\"italic\":false,\"color\":\"gray\"}"));
		// uncomment if someone asks if this will ever generate as loot
//		lore.add(StringTag.valueOf("{\"translate\":\"item.twilightforest.glass_sword.tooltip.2\",\"italic\":false,\"color\":\"gray\"}"));

		CompoundTag display = new CompoundTag();
		display.put("Lore", lore);

		tags.put("display", display);
		loreSword.setTag(tags);
		output.accept(loreSword);
	}
}
