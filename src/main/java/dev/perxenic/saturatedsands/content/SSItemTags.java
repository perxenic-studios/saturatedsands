package dev.perxenic.saturatedsands.content;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSItemTags {
    public final static TagKey<Item> FADED_TERRACOTTA = ItemTags.create(ssLoc("faded_terracotta"));

    // Terracotta patterns, comments describe which colour glazed terracotta they originated from
    public final static TagKey<Item> SUN_PATTERN = ItemTags.create(fadedLoc("sun_pattern")); // White
    public final static TagKey<Item> MODERN_PATTERN = ItemTags.create(fadedLoc("modern_pattern")); // Light Gray
    public final static TagKey<Item> CROSS_PATTERN = ItemTags.create(fadedLoc("cross_pattern")); // Gray
    public final static TagKey<Item> CRAWL_PATTERN = ItemTags.create(fadedLoc("crawl_pattern")); // Black
    public final static TagKey<Item> TARGET_PATTERN = ItemTags.create(fadedLoc("target_pattern")); // Brown
    public final static TagKey<Item> POTION_PATTERN = ItemTags.create(fadedLoc("potion_pattern")); // Red
    public final static TagKey<Item> FISH_PATTERN = ItemTags.create(fadedLoc("fish_pattern")); // Orange
    public final static TagKey<Item> FLOWER_PATTERN = ItemTags.create(fadedLoc("flower_pattern")); // Yellow
    public final static TagKey<Item> SPOKE_PATTERN = ItemTags.create(fadedLoc("spoke_pattern")); // Lime
    public final static TagKey<Item> PLANT_PATTERN = ItemTags.create(fadedLoc("plant_pattern")); // Green
    public final static TagKey<Item> CREEP_PATTERN = ItemTags.create(fadedLoc("creep_pattern")); // Cyan
    public final static TagKey<Item> GEO_PATTERN = ItemTags.create(fadedLoc("geo_pattern")); // Light Blue
    public final static TagKey<Item> FAN_PATTERN = ItemTags.create(fadedLoc("fan_pattern")); // Blue
    public final static TagKey<Item> BLADE_PATTERN = ItemTags.create(fadedLoc("blade_pattern")); // Purple
    public final static TagKey<Item> ARROW_PATTERN = ItemTags.create(fadedLoc("arrow_pattern")); // Magenta
    public final static TagKey<Item> LEAF_PATTERN = ItemTags.create(fadedLoc("leaf_pattern")); // Pink

    public static ResourceLocation fadedLoc(String name) {
        return ssLoc("faded_terracotta/" + name);
    }
}
