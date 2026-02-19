package dev.perxenic.saturatedsands.infra;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class TerracottaDye {
    public final TagKey<Item> itemTag;
    public final TagKey<Item> dyedItemTag;
    public final TagKey<Block> dyedBlockTag;
    public final TagKey<Item> dyedTerracottaItemTag;
    public final TagKey<Block> dyedTerracottaBlockTag;

    public final MapColor mapColor;

    public final Holder<? extends ItemLike> terracottaItem;

    public final List<TerracottaEntry> entryList = new ArrayList<>();

    public TerracottaDye(
            TagKey<Item> itemTag,
            TagKey<Item> dyedItemTag,
            TagKey<Block> dyedBlockTag,
            TagKey<Item> dyedTerracottaItemTag,
            TagKey<Block> dyedTerracottaBlockTag,
            MapColor mapColor,
            Holder<? extends ItemLike> terracottaItem
    ) {
        this.itemTag = itemTag;
        this.dyedItemTag = dyedItemTag;
        this.dyedBlockTag = dyedBlockTag;
        this.dyedTerracottaItemTag = dyedTerracottaItemTag;
        this.dyedTerracottaBlockTag = dyedTerracottaBlockTag;
        this.mapColor = mapColor;
        this.terracottaItem = terracottaItem;
    }

    public static ResourceLocation coloredLoc(String name) {
        return ssLoc("colored_terracotta/" + name);
    }
}
