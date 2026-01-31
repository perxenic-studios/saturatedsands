package dev.perxenic.saturatedsands.infra;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class TerracottaDye {
    public final TagKey<Item> itemTag;
    public final TagKey<Item> dyedItemTag;
    public final TagKey<Block> dyedBlockTag;

    public final MapColor mapColor;

    public final List<TerracottaEntry> entryList = new ArrayList<>();

    public TerracottaDye(TagKey<Item> itemTag, TagKey<Item> dyedItemTag, TagKey<Block> dyedBlockTag, MapColor mapColor) {
        this.itemTag = itemTag;
        this.dyedItemTag = dyedItemTag;
        this.dyedBlockTag = dyedBlockTag;
        this.mapColor = mapColor;
    }
}
