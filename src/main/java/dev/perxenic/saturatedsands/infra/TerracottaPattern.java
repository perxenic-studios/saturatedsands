package dev.perxenic.saturatedsands.infra;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.ArrayList;
import java.util.List;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class TerracottaPattern {
    public final TagKey<Item> itemTag;
    public final TagKey<Block> blockTag;

    public final DeferredBlock<GlazedTerracottaBlock> fadedBlock;

    public final List<TerracottaEntry> entryList = new ArrayList<>();

    public TerracottaPattern(TagKey<Item> itemTag, TagKey<Block> blockTag, DeferredBlock<GlazedTerracottaBlock> fadedBlock) {
        this.itemTag = itemTag;
        this.blockTag = blockTag;
        this.fadedBlock = fadedBlock;
    }

    public static ResourceLocation patternedLoc(String name) {
        return ssLoc("patterned_terracotta/" + name);
    }
}
