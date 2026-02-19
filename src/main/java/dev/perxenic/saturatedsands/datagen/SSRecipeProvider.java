package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.mirage.Mirage;
import dev.perxenic.saturatedsands.content.SSItemTags;
import dev.perxenic.saturatedsands.content.conditions.SSConfigCondition;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
                    .save(
                            outputWithConfig(recipeOutput, "fadedTerracottaDyeing"),
                            ssLoc(entry.getPath())
                    );

            SingleItemRecipeBuilder.stonecutting(
                    Ingredient.of(entry.getTerracottaDye().dyedTerracottaItemTag),
                            RecipeCategory.BUILDING_BLOCKS,
                            entry.block().asItem()
                    ).unlockedBy("has_"+entry.color()+"_terracotta", has(entry.getTerracottaDye().dyedTerracottaItemTag))
                    .save(
                            outputWithConfig(recipeOutput, "coloredTerracottaStonecutting"),
                            ssLoc(entry.getPath()+"_stonecutting")
                    );
        }));

        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            SingleItemRecipeBuilder.stonecutting(
                    Ingredient.of(SSItemTags.Color.FADED),
                    RecipeCategory.BUILDING_BLOCKS,
                    pattern.fadedBlock)
                    .unlockedBy("has_faded_terracotta", has(SSItemTags.Color.FADED))
                    .save(
                            outputWithConfig(recipeOutput, "fadedTerracottaStonecutting"),
                            ssLoc("terracotta/"+name+"/faded_stonecutting")
                    );
        });

        TerracottaDatabase.TERRACOTTA_DYES.forEach((name, dye) -> {
            SingleItemRecipeBuilder.stonecutting(
                    Ingredient.of(dye.dyedTerracottaItemTag),
                    RecipeCategory.BUILDING_BLOCKS,
                    dye.terracottaItem.value()
            ).unlockedBy("has_"+name+"_terracotta", has(dye.dyedTerracottaItemTag))
                    .save(
                            outputWithConfig(recipeOutput, "coloredReverseStonecutting"),
                            ssLoc(name+"_terracotta_stonecutting")
                    );
        });

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(SSItemTags.Color.FADED),
                RecipeCategory.BUILDING_BLOCKS,
                Items.TERRACOTTA
        ).unlockedBy("has_faded_terracotta", has(SSItemTags.Color.FADED))
                .save(
                        outputWithConfig(recipeOutput, "fadedReverseStonecutting"),
                        ssLoc("basic_terracotta_stonecutting")
                );
    }

    private RecipeOutput outputWithConfig(RecipeOutput recipeOutput, String configName) {
        return recipeOutput.withConditions(new SSConfigCondition(configName));
    }
}
