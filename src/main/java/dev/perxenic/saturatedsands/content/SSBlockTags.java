package dev.perxenic.saturatedsands.content;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;
import static dev.perxenic.saturatedsands.infra.TerracottaPattern.patternedLoc;

public class SSBlockTags {
    public static class Pattern {
        public final static TagKey<Block> ALL = BlockTags.create(ssLoc("patterned_terracotta"));

        // Terracotta patterns, comments describe which colour glazed terracotta they originated from
        public final static TagKey<Block> SUN = BlockTags.create(patternedLoc("sun")); // White
        public final static TagKey<Block> MODERN = BlockTags.create(patternedLoc("modern")); // Light Gray
        public final static TagKey<Block> CROSS = BlockTags.create(patternedLoc("cross")); // Gray
        public final static TagKey<Block> CRAWL = BlockTags.create(patternedLoc("crawl")); // Black
        public final static TagKey<Block> TARGET = BlockTags.create(patternedLoc("target")); // Brown
        public final static TagKey<Block> POTION = BlockTags.create(patternedLoc("potion")); // Red
        public final static TagKey<Block> FISH = BlockTags.create(patternedLoc("fish")); // Orange
        public final static TagKey<Block> FLOWER = BlockTags.create(patternedLoc("flower")); // Yellow
        public final static TagKey<Block> SPOKE = BlockTags.create(patternedLoc("spoke")); // Lime
        public final static TagKey<Block> PLANT = BlockTags.create(patternedLoc("plant")); // Green
        public final static TagKey<Block> CREEP = BlockTags.create(patternedLoc("creep")); // Cyan
        public final static TagKey<Block> GEO = BlockTags.create(patternedLoc("geo")); // Light Blue
        public final static TagKey<Block> FAN = BlockTags.create(patternedLoc("fan")); // Blue
        public final static TagKey<Block> BLADE = BlockTags.create(patternedLoc("blade")); // Purple
        public final static TagKey<Block> ARROW = BlockTags.create(patternedLoc("arrow")); // Magenta
        public final static TagKey<Block> LEAF = BlockTags.create(patternedLoc("leaf")); // Pink
    }
}
