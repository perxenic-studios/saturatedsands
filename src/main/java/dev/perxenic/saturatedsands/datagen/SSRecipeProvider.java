package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SSRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach(((location, entry) -> {
            Item fadedItem = entry.getTerracottaPattern().fadedBlock.asItem();
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, entry.block().toStack())
                    .pattern("###")
                    .pattern("#.#")
                    .pattern("###")
                    .define('#', entry.getTerracottaPattern().fadedBlock.asItem())
                    .define('.', entry.itemTagForDye())
                    .unlockedBy("has_faded_"+entry.pattern(), has(fadedItem))
                    .save(recipeOutput, ssLoc(entry.getPath()));
        }));
    }
}
