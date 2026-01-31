package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.mirage.registry.ModItems;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSItemTags;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import dev.perxenic.saturatedsands.infra.TerracottaEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.content.SSItemTags.Pattern;

public class SSItemTagProvider extends ItemTagsProvider {
    public SSItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SaturatedSands.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            Item[] items = (Item[]) pattern.entryList.stream().map(entry -> entry.block().asItem()).toArray();
            tag(pattern.itemTag).add(items);
        });

        TerracottaDatabase.TERRACOTTA_DYES.forEach((name, dye) -> {
            Item[] items = (Item[]) dye.entryList.stream().map(entry -> entry.block().asItem()).toArray();
            tag(dye.dyedItemTag).add(items);
        });

        tag(Pattern.ALL)
                .addTag(Pattern.SUN)
                .addTag(Pattern.MODERN)
                .addTag(Pattern.CROSS)
                .addTag(Pattern.CRAWL)
                .addTag(Pattern.TARGET)
                .addTag(Pattern.POTION)
                .addTag(Pattern.FISH)
                .addTag(Pattern.FLOWER)
                .addTag(Pattern.SPOKE)
                .addTag(Pattern.PLANT)
                .addTag(Pattern.CREEP)
                .addTag(Pattern.GEO)
                .addTag(Pattern.FAN)
                .addTag(Pattern.BLADE)
                .addTag(Pattern.ARROW)
                .addTag(Pattern.LEAF);
    }
}
