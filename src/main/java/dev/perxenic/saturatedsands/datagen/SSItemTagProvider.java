package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.mirage.registry.ModItems;
import dev.perxenic.saturatedsands.SaturatedSands;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.content.SSItemTags.*;

public class SSItemTagProvider extends ItemTagsProvider {
    public SSItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SaturatedSands.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(SUN_PATTERN).add(
                ModItems.WHITE_FADED_TERRACOTTA.get()
        );
        tag(MODERN_PATTERN).add(
                ModItems.LIGHT_GRAY_FADED_TERRACOTTA.get()
        );
        tag(CROSS_PATTERN).add(
                ModItems.GRAY_FADED_TERRACOTTA.get()
        );
        tag(CRAWL_PATTERN).add(
                ModItems.BLACK_FADED_TERRACOTTA.get()
        );
        tag(TARGET_PATTERN).add(
                ModItems.BROWN_FADED_TERRACOTTA.get()
        );
        tag(POTION_PATTERN).add(
                ModItems.RED_FADED_TERRACOTTA.get()
        );
        tag(FISH_PATTERN).add(
                ModItems.ORANGE_FADED_TERRACOTTA.get()
        );
        tag(FLOWER_PATTERN).add(
                ModItems.YELLOW_FADED_TERRACOTTA.get()
        );
        tag(SPOKE_PATTERN).add(
                ModItems.LIME_FADED_TERRACOTTA.get()
        );
        tag(PLANT_PATTERN).add(
                ModItems.GREEN_FADED_TERRACOTTA.get()
        );
        tag(CREEP_PATTERN).add(
                ModItems.CYAN_FADED_TERRACOTTA.get()
        );
        tag(GEO_PATTERN).add(
                ModItems.LIGHT_BLUE_FADED_TERRACOTTA.get()
        );
        tag(FAN_PATTERN).add(
                ModItems.BLUE_FADED_TERRACOTTA.get()
        );
        tag(BLADE_PATTERN).add(
                ModItems.PURPLE_FADED_TERRACOTTA.get()
        );
        tag(ARROW_PATTERN).add(
                ModItems.MAGENTA_FADED_TERRACOTTA.get()
        );
        tag(LEAF_PATTERN).add(
                ModItems.PINK_FADED_TERRACOTTA.get()
        );
    }
}
