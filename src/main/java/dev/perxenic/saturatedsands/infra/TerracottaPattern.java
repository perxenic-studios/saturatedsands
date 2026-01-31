package dev.perxenic.saturatedsands.infra;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class TerracottaPattern {
    public final TagKey<Item> itemTag;
    public final TagKey<Block> blockTag;

    public final List<TerracottaEntry> entryList = new ArrayList<>();

    public TerracottaPattern(TagKey<Item> itemTag, TagKey<Block> blockTag) {
        this.itemTag = itemTag;
        this.blockTag = blockTag;
    }

    public static ResourceLocation patternedLoc(String name) {
        return ssLoc("patterned_terracotta/" + name);
    }
}
