package dev.perxenic.saturatedsands.infra;

import com.ninni.dye_depot.registry.DDBlocks;
import com.ninni.dye_depot.registry.DDDyes;
import dev.perxenic.mirage.registry.MirageBlocks;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSBlockTags;
import dev.perxenic.saturatedsands.content.SSItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;

import static dev.perxenic.saturatedsands.SaturatedSands.cLoc;

public class TerracottaDatabase {
    public static final HashMap<ResourceLocation, TerracottaEntry> TERRACOTTA_ENTRIES = new HashMap<>();

    public static final HashMap<String, TerracottaDye> TERRACOTTA_DYES = new HashMap<>();

    public static final HashMap<String, TerracottaPattern> TERRACOTTA_PATTERNS = new HashMap<>();

    public static void addEntry(TerracottaEntry entry) {

        if (TERRACOTTA_ENTRIES.containsKey(entry.block().getId())) {
            SaturatedSands.LOGGER.error("Terracotta entry already exists: {}", entry.block().getId());
        }

        if (!TERRACOTTA_DYES.containsKey(entry.color())) {
            SaturatedSands.LOGGER.error("Invalid terracotta color: {}", entry.color());
            return;
        }

        if (!TERRACOTTA_PATTERNS.containsKey(entry.pattern())) {
            SaturatedSands.LOGGER.error("Invalid terracotta pattern: {}", entry.pattern());
            return;
        }

        TERRACOTTA_ENTRIES.put(entry.block().getId(), entry);

        TERRACOTTA_DYES.get(entry.color()).entryList.add(entry);

        TERRACOTTA_PATTERNS.get(entry.pattern()).entryList.add(entry);
    }

    static {
        // Vanilla Dyes

        TERRACOTTA_DYES.put("white", new TerracottaDye(
                Tags.Items.DYES_WHITE,
                Tags.Items.DYED_WHITE,
                Tags.Blocks.DYED_WHITE,
                SSItemTags.Color.WHITE,
                SSBlockTags.Color.WHITE,
                DyeColor.WHITE.getMapColor(),
                Items.WHITE_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("light_gray", new TerracottaDye(
                Tags.Items.DYES_LIGHT_GRAY,
                Tags.Items.DYED_LIGHT_GRAY,
                Tags.Blocks.DYED_LIGHT_GRAY,
                SSItemTags.Color.LIGHT_GRAY,
                SSBlockTags.Color.LIGHT_GRAY,
                DyeColor.LIGHT_GRAY.getMapColor(),
                Items.LIGHT_GRAY_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("gray", new TerracottaDye(
                Tags.Items.DYES_GRAY,
                Tags.Items.DYED_GRAY,
                Tags.Blocks.DYED_GRAY,
                SSItemTags.Color.GRAY,
                SSBlockTags.Color.GRAY,
                DyeColor.GRAY.getMapColor(),
                Items.GRAY_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("black", new TerracottaDye(
                Tags.Items.DYES_BLACK,
                Tags.Items.DYED_BLACK,
                Tags.Blocks.DYED_BLACK,
                SSItemTags.Color.BLACK,
                SSBlockTags.Color.BLACK,
                DyeColor.BLACK.getMapColor(),
                Items.BLACK_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("brown", new TerracottaDye(
                Tags.Items.DYES_BROWN,
                Tags.Items.DYED_BROWN,
                Tags.Blocks.DYED_BROWN,
                SSItemTags.Color.BROWN,
                SSBlockTags.Color.BROWN,
                DyeColor.BROWN.getMapColor(),
                Items.BROWN_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("red", new TerracottaDye(
                Tags.Items.DYES_RED,
                Tags.Items.DYED_RED,
                Tags.Blocks.DYED_RED,
                SSItemTags.Color.RED,
                SSBlockTags.Color.RED,
                DyeColor.RED.getMapColor(),
                Items.RED_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("orange", new TerracottaDye(
                Tags.Items.DYES_ORANGE,
                Tags.Items.DYED_ORANGE,
                Tags.Blocks.DYED_ORANGE,
                SSItemTags.Color.ORANGE,
                SSBlockTags.Color.ORANGE,
                DyeColor.ORANGE.getMapColor(),
                Items.ORANGE_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("yellow", new TerracottaDye(
                Tags.Items.DYES_YELLOW,
                Tags.Items.DYED_YELLOW,
                Tags.Blocks.DYED_YELLOW,
                SSItemTags.Color.YELLOW,
                SSBlockTags.Color.YELLOW,
                DyeColor.YELLOW.getMapColor(),
                Items.YELLOW_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("lime", new TerracottaDye(
                Tags.Items.DYES_LIME,
                Tags.Items.DYED_LIME,
                Tags.Blocks.DYED_LIME,
                SSItemTags.Color.LIME,
                SSBlockTags.Color.LIME,
                DyeColor.LIME.getMapColor(),
                Items.LIME_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("green", new TerracottaDye(
                Tags.Items.DYES_GREEN,
                Tags.Items.DYED_GREEN,
                Tags.Blocks.DYED_GREEN,
                SSItemTags.Color.GREEN,
                SSBlockTags.Color.GREEN,
                DyeColor.GREEN.getMapColor(),
                Items.GREEN_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("cyan", new TerracottaDye(
                Tags.Items.DYES_CYAN,
                Tags.Items.DYED_CYAN,
                Tags.Blocks.DYED_CYAN,
                SSItemTags.Color.CYAN,
                SSBlockTags.Color.CYAN,
                DyeColor.CYAN.getMapColor(),
                Items.CYAN_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("light_blue", new TerracottaDye(
                Tags.Items.DYES_LIGHT_BLUE,
                Tags.Items.DYED_LIGHT_BLUE,
                Tags.Blocks.DYED_LIGHT_BLUE,
                SSItemTags.Color.LIGHT_BLUE,
                SSBlockTags.Color.LIGHT_BLUE,
                DyeColor.LIGHT_BLUE.getMapColor(),
                Items.LIGHT_BLUE_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("blue", new TerracottaDye(
                Tags.Items.DYES_BLUE,
                Tags.Items.DYED_BLUE,
                Tags.Blocks.DYED_BLUE,
                SSItemTags.Color.BLUE,
                SSBlockTags.Color.BLUE,
                DyeColor.BLUE.getMapColor(),
                Items.BLUE_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("purple", new TerracottaDye(
                Tags.Items.DYES_PURPLE,
                Tags.Items.DYED_PURPLE,
                Tags.Blocks.DYED_PURPLE,
                SSItemTags.Color.PURPLE,
                SSBlockTags.Color.PURPLE,
                DyeColor.PURPLE.getMapColor(),
                Items.PURPLE_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("magenta", new TerracottaDye(
                Tags.Items.DYES_MAGENTA,
                Tags.Items.DYED_MAGENTA,
                Tags.Blocks.DYED_MAGENTA,
                SSItemTags.Color.MAGENTA,
                SSBlockTags.Color.MAGENTA,
                DyeColor.MAGENTA.getMapColor(),
                Items.MAGENTA_TERRACOTTA.builtInRegistryHolder()
        ));
        TERRACOTTA_DYES.put("pink", new TerracottaDye(
                Tags.Items.DYES_PINK,
                Tags.Items.DYED_PINK,
                Tags.Blocks.DYED_PINK,
                SSItemTags.Color.PINK,
                SSBlockTags.Color.PINK,
                DyeColor.PINK.getMapColor(),
                Items.PINK_TERRACOTTA.builtInRegistryHolder()
        ));

        // Dye Depot Dyes

        TERRACOTTA_DYES.put("maroon", new TerracottaDye(
                ItemTags.create(cLoc("dyes/maroon")),
                ItemTags.create(cLoc("dyed/maroon")),
                BlockTags.create(cLoc("dyed/maroon")),
                SSItemTags.Color.MAROON,
                SSBlockTags.Color.MAROON,
                DDDyes.MAROON.getMapColor(),
                DDBlocks.TERRACOTTA.holder(DDDyes.MAROON.get()).orElseThrow()
        ));

        TERRACOTTA_DYES.put("rose", new TerracottaDye(
                ItemTags.create(cLoc("dyes/rose")),
                ItemTags.create(cLoc("dyed/rose")),
                BlockTags.create(cLoc("dyed/rose")),
                SSItemTags.Color.ROSE,
                SSBlockTags.Color.ROSE,
                DDDyes.ROSE.getMapColor(),
                DDBlocks.TERRACOTTA.holder(DDDyes.ROSE.get()).orElseThrow()
        ));

        TERRACOTTA_DYES.put("coral", new TerracottaDye(
                ItemTags.create(cLoc("dyes/coral")),
                ItemTags.create(cLoc("dyed/coral")),
                BlockTags.create(cLoc("dyed/coral")),
                SSItemTags.Color.CORAL,
                SSBlockTags.Color.CORAL,
                DDDyes.CORAL.getMapColor(),
                DDBlocks.TERRACOTTA.holder(DDDyes.CORAL.get()).orElseThrow()
        ));

        // Vanilla Patterns

        TERRACOTTA_PATTERNS.put("sun", new TerracottaPattern(
                SSItemTags.Pattern.SUN,
                SSBlockTags.Pattern.SUN,
                MirageBlocks.FADED_SUN_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("modern", new TerracottaPattern(
                SSItemTags.Pattern.MODERN,
                SSBlockTags.Pattern.MODERN,
                MirageBlocks.FADED_MODERN_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("cross", new TerracottaPattern(
                        SSItemTags.Pattern.CROSS,
                        SSBlockTags.Pattern.CROSS,
                MirageBlocks.FADED_CROSS_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("crawl", new TerracottaPattern(
                SSItemTags.Pattern.CRAWL,
                SSBlockTags.Pattern.CRAWL,
                MirageBlocks.FADED_CRAWL_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("target", new TerracottaPattern(
                SSItemTags.Pattern.TARGET,
                SSBlockTags.Pattern.TARGET,
                MirageBlocks.FADED_TARGET_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("potion", new TerracottaPattern(
                SSItemTags.Pattern.POTION,
                SSBlockTags.Pattern.POTION,
                MirageBlocks.FADED_POTION_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("fish", new TerracottaPattern(
                SSItemTags.Pattern.FISH,
                SSBlockTags.Pattern.FISH,
                MirageBlocks.FADED_FISH_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("flower", new TerracottaPattern(
                SSItemTags.Pattern.FLOWER,
                SSBlockTags.Pattern.FLOWER,
                MirageBlocks.FADED_FLOWER_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("spoke", new TerracottaPattern(
                SSItemTags.Pattern.SPOKE,
                SSBlockTags.Pattern.SPOKE,
                MirageBlocks.FADED_SPOKE_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("plant", new TerracottaPattern(
                SSItemTags.Pattern.PLANT,
                SSBlockTags.Pattern.PLANT,
                MirageBlocks.FADED_PLANT_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("creep", new TerracottaPattern(
                SSItemTags.Pattern.CREEP,
                SSBlockTags.Pattern.CREEP,
                MirageBlocks.FADED_CREEP_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("geo", new TerracottaPattern(
                SSItemTags.Pattern.GEO,
                SSBlockTags.Pattern.GEO,
                MirageBlocks.FADED_GEO_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("fan", new TerracottaPattern(
                SSItemTags.Pattern.FAN,
                SSBlockTags.Pattern.FAN,
                MirageBlocks.FADED_FAN_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("blade", new TerracottaPattern(
                SSItemTags.Pattern.BLADE,
                SSBlockTags.Pattern.BLADE,
                MirageBlocks.FADED_BLADE_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("arrow", new TerracottaPattern(
                SSItemTags.Pattern.ARROW,
                SSBlockTags.Pattern.ARROW,
                MirageBlocks.FADED_ARROW_TERRACOTTA
        ));
        TERRACOTTA_PATTERNS.put("leaf", new TerracottaPattern(
                SSItemTags.Pattern.LEAF,
                SSBlockTags.Pattern.LEAF,
                MirageBlocks.FADED_LEAF_TERRACOTTA
        ));
    }
}
