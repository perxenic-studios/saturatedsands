package dev.perxenic.saturatedsands.infra;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.neoforged.neoforge.registries.DeferredBlock;

public record TerracottaEntry(String pattern, String color, DeferredBlock<GlazedTerracottaBlock> block) {
    public TerracottaPattern getTerracottaPattern() {
        return TerracottaDatabase.TERRACOTTA_PATTERNS.get(pattern);
    }

    public TerracottaDye getTerracottaDye() {
        return TerracottaDatabase.TERRACOTTA_DYES.get(color);
    }

    public TagKey<Item> itemTagForPattern() {
        return getTerracottaPattern().itemTag;
    }

    public TagKey<Block> blockTagForPattern() {
        return getTerracottaPattern().blockTag;
    }

    public TagKey<Item> itemTagForDye() {
        return getTerracottaDye().itemTag;
    }
}
