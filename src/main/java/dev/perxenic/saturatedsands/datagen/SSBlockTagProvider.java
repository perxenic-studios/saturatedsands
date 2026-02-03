package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import dev.perxenic.saturatedsands.infra.TerracottaEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.content.SSBlockTags.Pattern;

public class SSBlockTagProvider extends BlockTagsProvider {
    public SSBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SaturatedSands.MODID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            Block[] blocks = new Block[pattern.entryList.size()];
            int i = 0;
            for (TerracottaEntry terracottaEntry : pattern.entryList) {
                blocks[i] = terracottaEntry.block().get();
                i++;
            }
            tag(pattern.blockTag).add(blocks).add(pattern.fadedBlock.get());
        });

        TerracottaDatabase.TERRACOTTA_DYES.forEach((name, dye) -> {
            Block[] blocks = new Block[dye.entryList.size()];
            int i = 0;
            for (TerracottaEntry terracottaEntry : dye.entryList) {
                blocks[i] = terracottaEntry.block().get();
                i++;
            }
            tag(dye.dyedBlockTag).add(blocks);
            tag(dye.dyedTerracottaBlockTag).add(blocks);
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
