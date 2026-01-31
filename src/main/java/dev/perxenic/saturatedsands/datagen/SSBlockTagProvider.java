package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SSBlockTagProvider extends BlockTagsProvider {
    public SSBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SaturatedSands.MODID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            Block[] items = (Block[]) pattern.entryList.stream().map(entry -> entry.block().value()).toArray();
            tag(pattern.blockTag).add(items);
        });

        TerracottaDatabase.TERRACOTTA_DYES.forEach((name, dye) -> {
            Block[] items = (Block[]) dye.entryList.stream().map(entry -> entry.block().value()).toArray();
            tag(dye.dyedBlockTag).add(items);
        });
    }
}
