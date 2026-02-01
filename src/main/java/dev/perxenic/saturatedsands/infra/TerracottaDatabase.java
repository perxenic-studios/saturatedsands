package dev.perxenic.saturatedsands.infra;

import com.google.common.collect.ImmutableList;
import dev.perxenic.mirage.registry.MirageBlocks;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSBlockTags;
import dev.perxenic.saturatedsands.content.SSItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;
import java.util.List;

public class TerracottaDatabase {
    public static final HashMap<ResourceLocation, TerracottaEntry> TERRACOTTA_ENTRIES = new HashMap<>();

    public static final HashMap<String, TerracottaDye> TERRACOTTA_DYES = new HashMap<>();
    public static final List<String> VANILLA_DYES = ImmutableList.of(
            "white",
            "light_gray",
            "gray",
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "lime",
            "green",
            "cyan",
            "light_blue",
            "blue",
            "purple",
            "magenta",
            "pink"
    );

    public static final HashMap<String, TerracottaPattern> TERRACOTTA_PATTERNS = new HashMap<>();
    public static final List<String> SS_PATTERNS = ImmutableList.of(
            "sun",
            "modern",
            "cross",
            "crawl",
            "target",
            "potion",
            "fish",
            "flower",
            "spoke",
            "plant",
            "creep",
            "geo",
            "fan",
            "blade",
            "arrow",
            "leaf"
    );

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
        TERRACOTTA_DYES.put("white", new TerracottaDye(
                Tags.Items.DYES_WHITE,
                Tags.Items.DYED_WHITE,
                Tags.Blocks.DYED_WHITE,
                DyeColor.WHITE.getMapColor()
        ));
        TERRACOTTA_DYES.put("light_gray", new TerracottaDye(
                Tags.Items.DYES_LIGHT_GRAY,
                Tags.Items.DYED_LIGHT_GRAY,
                Tags.Blocks.DYED_LIGHT_GRAY,
                DyeColor.LIGHT_GRAY.getMapColor()
        ));
        TERRACOTTA_DYES.put("gray", new TerracottaDye(
                Tags.Items.DYES_GRAY,
                Tags.Items.DYED_GRAY,
                Tags.Blocks.DYED_GRAY,
                DyeColor.GRAY.getMapColor()
        ));
        TERRACOTTA_DYES.put("black", new TerracottaDye(
                Tags.Items.DYES_BLACK,
                Tags.Items.DYED_BLACK,
                Tags.Blocks.DYED_BLACK,
                DyeColor.BLACK.getMapColor()
        ));
        TERRACOTTA_DYES.put("brown", new TerracottaDye(
                Tags.Items.DYES_BROWN,
                Tags.Items.DYED_BROWN,
                Tags.Blocks.DYED_BROWN,
                DyeColor.BROWN.getMapColor()
        ));
        TERRACOTTA_DYES.put("red", new TerracottaDye(
                Tags.Items.DYES_RED,
                Tags.Items.DYED_RED,
                Tags.Blocks.DYED_RED,
                DyeColor.RED.getMapColor()
        ));
        TERRACOTTA_DYES.put("orange", new TerracottaDye(
                Tags.Items.DYES_ORANGE,
                Tags.Items.DYED_ORANGE,
                Tags.Blocks.DYED_ORANGE,
                DyeColor.ORANGE.getMapColor()
        ));
        TERRACOTTA_DYES.put("yellow", new TerracottaDye(
                Tags.Items.DYES_YELLOW,
                Tags.Items.DYED_YELLOW,
                Tags.Blocks.DYED_YELLOW,
                DyeColor.YELLOW.getMapColor()
        ));
        TERRACOTTA_DYES.put("lime", new TerracottaDye(
                Tags.Items.DYES_LIME,
                Tags.Items.DYED_LIME,
                Tags.Blocks.DYED_LIME,
                DyeColor.LIME.getMapColor()
        ));
        TERRACOTTA_DYES.put("green", new TerracottaDye(
                Tags.Items.DYES_GREEN,
                Tags.Items.DYED_GREEN,
                Tags.Blocks.DYED_GREEN,
                DyeColor.GREEN.getMapColor()
        ));
        TERRACOTTA_DYES.put("cyan", new TerracottaDye(
                Tags.Items.DYES_CYAN,
                Tags.Items.DYED_CYAN,
                Tags.Blocks.DYED_CYAN,
                DyeColor.CYAN.getMapColor()
        ));
        TERRACOTTA_DYES.put("light_blue", new TerracottaDye(
                Tags.Items.DYES_LIGHT_BLUE,
                Tags.Items.DYED_LIGHT_BLUE,
                Tags.Blocks.DYED_LIGHT_BLUE,
                DyeColor.LIGHT_BLUE.getMapColor()
        ));
        TERRACOTTA_DYES.put("blue", new TerracottaDye(
                Tags.Items.DYES_BLUE,
                Tags.Items.DYED_BLUE,
                Tags.Blocks.DYED_BLUE,
                DyeColor.BLUE.getMapColor()
        ));
        TERRACOTTA_DYES.put("purple", new TerracottaDye(
                Tags.Items.DYES_PURPLE,
                Tags.Items.DYED_PURPLE,
                Tags.Blocks.DYED_PURPLE,
                DyeColor.PURPLE.getMapColor()
        ));
        TERRACOTTA_DYES.put("magenta", new TerracottaDye(
                Tags.Items.DYES_MAGENTA,
                Tags.Items.DYED_MAGENTA,
                Tags.Blocks.DYED_MAGENTA,
                DyeColor.MAGENTA.getMapColor()
        ));
        TERRACOTTA_DYES.put("pink", new TerracottaDye(
                Tags.Items.DYES_PINK,
                Tags.Items.DYED_PINK,
                Tags.Blocks.DYED_PINK,
                DyeColor.PINK.getMapColor()
        ));

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
