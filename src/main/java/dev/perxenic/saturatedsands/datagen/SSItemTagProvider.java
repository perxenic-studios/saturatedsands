package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.mirage.registry.ModItems;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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
        tag(Pattern.SUN).add(
                ModItems.WHITE_FADED_TERRACOTTA.get()
        );
        tag(Pattern.MODERN).add(
                ModItems.LIGHT_GRAY_FADED_TERRACOTTA.get()
        );
        tag(Pattern.CROSS).add(
                ModItems.GRAY_FADED_TERRACOTTA.get()
        );
        tag(Pattern.CRAWL).add(
                ModItems.BLACK_FADED_TERRACOTTA.get()
        );
        tag(Pattern.TARGET).add(
                ModItems.BROWN_FADED_TERRACOTTA.get()
        );
        tag(Pattern.POTION).add(
                ModItems.RED_FADED_TERRACOTTA.get()
        );
        tag(Pattern.FISH).add(
                ModItems.ORANGE_FADED_TERRACOTTA.get()
        );
        tag(Pattern.FLOWER).add(
                ModItems.YELLOW_FADED_TERRACOTTA.get()
        );
        tag(Pattern.SPOKE).add(
                ModItems.LIME_FADED_TERRACOTTA.get()
        );
        tag(Pattern.PLANT).add(
                ModItems.GREEN_FADED_TERRACOTTA.get()
        );
        tag(Pattern.CREEP).add(
                ModItems.CYAN_FADED_TERRACOTTA.get()
        );
        tag(Pattern.GEO).add(
                ModItems.LIGHT_BLUE_FADED_TERRACOTTA.get()
        );
        tag(Pattern.FAN).add(
                ModItems.BLUE_FADED_TERRACOTTA.get()
        );
        tag(Pattern.BLADE).add(
                ModItems.PURPLE_FADED_TERRACOTTA.get()
        );
        tag(Pattern.ARROW).add(
                ModItems.MAGENTA_FADED_TERRACOTTA.get()
        );
        tag(Pattern.LEAF).add(
                ModItems.PINK_FADED_TERRACOTTA.get()
        );

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
