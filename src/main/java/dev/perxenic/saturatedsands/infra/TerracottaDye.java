package dev.perxenic.saturatedsands.infra;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class TerracottaDye {
    public final TagKey<Item> itemTag;

    public final List<TerracottaEntry> entryList = new ArrayList<>();

    public TerracottaDye(TagKey<Item> itemTag) {
        this.itemTag = itemTag;
    }
}
