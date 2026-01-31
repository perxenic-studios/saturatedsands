package dev.perxenic.saturatedsands.infra;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSBlockTags;
import dev.perxenic.saturatedsands.content.SSItemTags;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;

public class TerracottaDatabase {
    public static final HashMap<ResourceLocation, TerracottaEntry> TERRACOTTA_ENTRIES = new HashMap<>();

    public static final HashMap<String, TerracottaDye> TERRACOTTA_DYES = new HashMap<>();

    public static final HashMap<String, TerracottaPattern> TERRACOTTA_PATTERNS = new HashMap<>();

    public static void addEntry(TerracottaEntry entry) {
        TERRACOTTA_ENTRIES.put(entry.block().getId(), entry);

        if (!TERRACOTTA_DYES.containsKey(entry.color())) {
            SaturatedSands.LOGGER.info("Invalid terracotta color: {}", entry.color());
        } else {
            TERRACOTTA_DYES.get(entry.color()).entryList.add(entry);
        }

        if (!TERRACOTTA_PATTERNS.containsKey(entry.pattern())) {
            SaturatedSands.LOGGER.info("Invalid terracotta pattern: {}", entry.pattern());
        } else {
            TERRACOTTA_PATTERNS.get(entry.pattern()).entryList.add(entry);
        }
    }

    static {
        TERRACOTTA_DYES.put("white", new TerracottaDye(
                Tags.Items.DYES_WHITE,
                Tags.Items.DYED_WHITE,
                Tags.Blocks.DYED_WHITE
        ));
        TERRACOTTA_DYES.put("light_gray", new TerracottaDye(
                Tags.Items.DYES_LIGHT_GRAY,
                Tags.Items.DYED_LIGHT_GRAY,
                Tags.Blocks.DYED_LIGHT_GRAY
        ));
        TERRACOTTA_DYES.put("gray", new TerracottaDye(
                Tags.Items.DYES_GRAY,
                Tags.Items.DYED_GRAY,
                Tags.Blocks.DYED_GRAY
        ));
        TERRACOTTA_DYES.put("black", new TerracottaDye(
                Tags.Items.DYES_BLACK,
                Tags.Items.DYED_BLACK,
                Tags.Blocks.DYED_BLACK
        ));
        TERRACOTTA_DYES.put("brown", new TerracottaDye(
                Tags.Items.DYES_BROWN,
                Tags.Items.DYED_BROWN,
                Tags.Blocks.DYED_BROWN
        ));
        TERRACOTTA_DYES.put("red", new TerracottaDye(
                Tags.Items.DYES_RED,
                Tags.Items.DYED_RED,
                Tags.Blocks.DYED_RED
        ));
        TERRACOTTA_DYES.put("orange", new TerracottaDye(
                Tags.Items.DYES_ORANGE,
                Tags.Items.DYED_ORANGE,
                Tags.Blocks.DYED_ORANGE
        ));
        TERRACOTTA_DYES.put("yellow", new TerracottaDye(
                Tags.Items.DYES_YELLOW,
                Tags.Items.DYED_YELLOW,
                Tags.Blocks.DYED_YELLOW
        ));
        TERRACOTTA_DYES.put("lime", new TerracottaDye(
                Tags.Items.DYES_LIME,
                Tags.Items.DYED_LIME,
                Tags.Blocks.DYED_LIME
        ));
        TERRACOTTA_DYES.put("green", new TerracottaDye(
                Tags.Items.DYES_GREEN,
                Tags.Items.DYED_GREEN,
                Tags.Blocks.DYED_GREEN
        ));
        TERRACOTTA_DYES.put("cyan", new TerracottaDye(
                Tags.Items.DYES_CYAN,
                Tags.Items.DYED_CYAN,
                Tags.Blocks.DYED_CYAN
        ));
        TERRACOTTA_DYES.put("light_blue", new TerracottaDye(
                Tags.Items.DYES_LIGHT_BLUE,
                Tags.Items.DYED_LIGHT_BLUE,
                Tags.Blocks.DYED_LIGHT_BLUE
        ));
        TERRACOTTA_DYES.put("blue", new TerracottaDye(
                Tags.Items.DYES_BLUE,
                Tags.Items.DYED_BLUE,
                Tags.Blocks.DYED_BLUE
        ));
        TERRACOTTA_DYES.put("purple", new TerracottaDye(
                Tags.Items.DYES_PURPLE,
                Tags.Items.DYED_PURPLE,
                Tags.Blocks.DYED_PURPLE
        ));
        TERRACOTTA_DYES.put("magenta", new TerracottaDye(
                Tags.Items.DYES_MAGENTA,
                Tags.Items.DYED_MAGENTA,
                Tags.Blocks.DYED_MAGENTA
        ));
        TERRACOTTA_DYES.put("pink", new TerracottaDye(
                Tags.Items.DYES_PINK,
                Tags.Items.DYED_PINK,
                Tags.Blocks.DYED_PINK
        ));

        TERRACOTTA_PATTERNS.put("sun", new TerracottaPattern(SSItemTags.Pattern.SUN, SSBlockTags.Pattern.SUN));
        TERRACOTTA_PATTERNS.put("modern", new TerracottaPattern(SSItemTags.Pattern.MODERN, SSBlockTags.Pattern.MODERN));
        TERRACOTTA_PATTERNS.put("cross", new TerracottaPattern(SSItemTags.Pattern.CROSS, SSBlockTags.Pattern.CROSS));
        TERRACOTTA_PATTERNS.put("crawl", new TerracottaPattern(SSItemTags.Pattern.CRAWL, SSBlockTags.Pattern.CRAWL));
        TERRACOTTA_PATTERNS.put("target", new TerracottaPattern(SSItemTags.Pattern.TARGET, SSBlockTags.Pattern.TARGET));
        TERRACOTTA_PATTERNS.put("potion", new TerracottaPattern(SSItemTags.Pattern.POTION, SSBlockTags.Pattern.POTION));
        TERRACOTTA_PATTERNS.put("fish", new TerracottaPattern(SSItemTags.Pattern.FISH, SSBlockTags.Pattern.FISH));
        TERRACOTTA_PATTERNS.put("flower", new TerracottaPattern(SSItemTags.Pattern.FLOWER, SSBlockTags.Pattern.FLOWER));
        TERRACOTTA_PATTERNS.put("spoke", new TerracottaPattern(SSItemTags.Pattern.SPOKE, SSBlockTags.Pattern.SPOKE));
        TERRACOTTA_PATTERNS.put("plant", new TerracottaPattern(SSItemTags.Pattern.PLANT, SSBlockTags.Pattern.PLANT));
        TERRACOTTA_PATTERNS.put("creep", new TerracottaPattern(SSItemTags.Pattern.CREEP, SSBlockTags.Pattern.CREEP));
        TERRACOTTA_PATTERNS.put("geo", new TerracottaPattern(SSItemTags.Pattern.GEO, SSBlockTags.Pattern.GEO));
        TERRACOTTA_PATTERNS.put("fan", new TerracottaPattern(SSItemTags.Pattern.FAN, SSBlockTags.Pattern.FAN));
        TERRACOTTA_PATTERNS.put("blade", new TerracottaPattern(SSItemTags.Pattern.BLADE, SSBlockTags.Pattern.BLADE));
        TERRACOTTA_PATTERNS.put("arrow", new TerracottaPattern(SSItemTags.Pattern.ARROW, SSBlockTags.Pattern.ARROW));
        TERRACOTTA_PATTERNS.put("leaf", new TerracottaPattern(SSItemTags.Pattern.LEAF, SSBlockTags.Pattern.LEAF));
    }
}
