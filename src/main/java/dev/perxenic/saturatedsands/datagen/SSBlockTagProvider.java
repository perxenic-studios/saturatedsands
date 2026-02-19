package dev.perxenic.saturatedsands.datagen;

import com.ninni.dye_depot.registry.DDBlocks;
import com.ninni.dye_depot.registry.DDDyes;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import dev.perxenic.saturatedsands.infra.TerracottaEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.content.SSBlockTags.Color;
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
            tag(Color.FADED).add(pattern.fadedBlock.get());
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

        tag(Color.FADED).add(Blocks.TERRACOTTA);
        tag(Color.WHITE).add(Blocks.WHITE_TERRACOTTA);
        tag(Color.LIGHT_GRAY).add(Blocks.LIGHT_GRAY_TERRACOTTA);
        tag(Color.GRAY).add(Blocks.GRAY_TERRACOTTA);
        tag(Color.BLACK).add(Blocks.BLACK_TERRACOTTA);
        tag(Color.BROWN).add(Blocks.BROWN_TERRACOTTA);
        tag(Color.RED).add(Blocks.RED_TERRACOTTA);
        tag(Color.ORANGE).add(Blocks.ORANGE_TERRACOTTA);
        tag(Color.YELLOW).add(Blocks.YELLOW_TERRACOTTA);
        tag(Color.LIME).add(Blocks.LIME_TERRACOTTA);
        tag(Color.GREEN).add(Blocks.GREEN_TERRACOTTA);
        tag(Color.CYAN).add(Blocks.CYAN_TERRACOTTA);
        tag(Color.LIGHT_BLUE).add(Blocks.LIGHT_BLUE_TERRACOTTA);
        tag(Color.BLUE).add(Blocks.BLUE_TERRACOTTA);
        tag(Color.PURPLE).add(Blocks.PURPLE_TERRACOTTA);
        tag(Color.MAGENTA).add(Blocks.MAGENTA_TERRACOTTA);
        tag(Color.PINK).add(Blocks.PINK_TERRACOTTA);

        tag(Color.MAROON).add(DDBlocks.TERRACOTTA.get(DDDyes.MAROON.get()).orElseThrow());

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

        tag(Color.ALL)
                .addTag(Color.FADED)
                .addTag(Color.WHITE)
                .addTag(Color.LIGHT_GRAY)
                .addTag(Color.GRAY)
                .addTag(Color.BLACK)
                .addTag(Color.BROWN)
                .addTag(Color.RED)
                .addTag(Color.ORANGE)
                .addTag(Color.YELLOW)
                .addTag(Color.LIME)
                .addTag(Color.GREEN)
                .addTag(Color.CYAN)
                .addTag(Color.LIGHT_BLUE)
                .addTag(Color.BLUE)
                .addTag(Color.PURPLE)
                .addTag(Color.MAGENTA)
                .addTag(Color.PINK)

                .addTag(Color.MAROON);
    }
}
