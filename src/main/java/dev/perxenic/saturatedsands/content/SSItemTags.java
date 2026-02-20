package dev.perxenic.saturatedsands.content;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;
import static dev.perxenic.saturatedsands.infra.TerracottaDye.coloredLoc;
import static dev.perxenic.saturatedsands.infra.TerracottaPattern.patternedLoc;

public class SSItemTags {
    public static class Pattern {
        public final static TagKey<Item> ALL = ItemTags.create(ssLoc("patterned_terracotta"));

        // Vanilla
        public final static TagKey<Item> SUN = ItemTags.create(patternedLoc("sun")); // White
        public final static TagKey<Item> MODERN = ItemTags.create(patternedLoc("modern")); // Light Gray
        public final static TagKey<Item> CROSS = ItemTags.create(patternedLoc("cross")); // Gray
        public final static TagKey<Item> CRAWL = ItemTags.create(patternedLoc("crawl")); // Black
        public final static TagKey<Item> TARGET = ItemTags.create(patternedLoc("target")); // Brown
        public final static TagKey<Item> POTION = ItemTags.create(patternedLoc("potion")); // Red
        public final static TagKey<Item> FISH = ItemTags.create(patternedLoc("fish")); // Orange
        public final static TagKey<Item> FLOWER = ItemTags.create(patternedLoc("flower")); // Yellow
        public final static TagKey<Item> SPOKE = ItemTags.create(patternedLoc("spoke")); // Lime
        public final static TagKey<Item> PLANT = ItemTags.create(patternedLoc("plant")); // Green
        public final static TagKey<Item> CREEP = ItemTags.create(patternedLoc("creep")); // Cyan
        public final static TagKey<Item> GEO = ItemTags.create(patternedLoc("geo")); // Light Blue
        public final static TagKey<Item> FAN = ItemTags.create(patternedLoc("fan")); // Blue
        public final static TagKey<Item> BLADE = ItemTags.create(patternedLoc("blade")); // Purple
        public final static TagKey<Item> ARROW = ItemTags.create(patternedLoc("arrow")); // Magenta
        public final static TagKey<Item> LEAF = ItemTags.create(patternedLoc("leaf")); // Pink

        // Dye Depot
        public final static TagKey<Item> RING = ItemTags.create(patternedLoc("ring")); // Maroon
        public final static TagKey<Item> PETAL = ItemTags.create(patternedLoc("petal")); // Rose
        public final static TagKey<Item> HEART = ItemTags.create(patternedLoc("heart")); // Coral
        public final static TagKey<Item> BIRD = ItemTags.create(patternedLoc("bird")); // Ginger
    }

    public static class Color {
        public final static TagKey<Item> ALL = ItemTags.create(ssLoc("colored_terracotta"));
        public final static TagKey<Item> FADED = ItemTags.create(coloredLoc("faded"));

        // Vanilla
        public final static TagKey<Item> WHITE = ItemTags.create(coloredLoc("white"));
        public final static TagKey<Item> LIGHT_GRAY = ItemTags.create(coloredLoc("light_gray"));
        public final static TagKey<Item> GRAY = ItemTags.create(coloredLoc("gray"));
        public final static TagKey<Item> BLACK = ItemTags.create(coloredLoc("black"));
        public final static TagKey<Item> BROWN = ItemTags.create(coloredLoc("brown"));
        public final static TagKey<Item> RED = ItemTags.create(coloredLoc("red"));
        public final static TagKey<Item> ORANGE = ItemTags.create(coloredLoc("orange"));
        public final static TagKey<Item> YELLOW = ItemTags.create(coloredLoc("yellow"));
        public final static TagKey<Item> LIME = ItemTags.create(coloredLoc("lime"));
        public final static TagKey<Item> GREEN = ItemTags.create(coloredLoc("green"));
        public final static TagKey<Item> CYAN = ItemTags.create(coloredLoc("cyan"));
        public final static TagKey<Item> LIGHT_BLUE = ItemTags.create(coloredLoc("light_blue"));
        public final static TagKey<Item> BLUE = ItemTags.create(coloredLoc("blue"));
        public final static TagKey<Item> PURPLE = ItemTags.create(coloredLoc("purple"));
        public final static TagKey<Item> MAGENTA = ItemTags.create(coloredLoc("magenta"));
        public final static TagKey<Item> PINK = ItemTags.create(coloredLoc("pink"));

        // Dye Depot
        public final static TagKey<Item> MAROON = ItemTags.create(coloredLoc("maroon"));
        public final static TagKey<Item> ROSE = ItemTags.create(coloredLoc("rose"));
        public final static TagKey<Item> CORAL = ItemTags.create(coloredLoc("coral"));
        public final static TagKey<Item> GINGER = ItemTags.create(coloredLoc("ginger"));
        public final static TagKey<Item> TAN = ItemTags.create(coloredLoc("tan"));
        public final static TagKey<Item> BEIGE = ItemTags.create(coloredLoc("beige"));
    }
}
