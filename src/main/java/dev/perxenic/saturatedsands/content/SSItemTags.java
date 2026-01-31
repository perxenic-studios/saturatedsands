package dev.perxenic.saturatedsands.content;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSItemTags {
    public static class Pattern {
        public final static TagKey<Item> ALL = ItemTags.create(ssLoc("patterned_terracotta"));

        // Terracotta patterns, comments describe which colour glazed terracotta they originated from
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

        public static ResourceLocation patternedLoc(String name) {
            return ssLoc("patterned_terracotta/" + name);
        }
    }
}
