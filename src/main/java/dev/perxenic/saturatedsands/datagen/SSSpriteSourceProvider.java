package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SpriteSourceProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;
import static dev.perxenic.saturatedsands.infra.TerracottaDatabase.TERRACOTTA_DYES;
import static dev.perxenic.saturatedsands.infra.TerracottaDatabase.TERRACOTTA_PATTERNS;

public class SSSpriteSourceProvider extends SpriteSourceProvider {
    public SSSpriteSourceProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SaturatedSands.MODID, existingFileHelper);
    }

    @Override
    protected void gather() {
        atlas(BLOCKS_ATLAS).addSource(new PalettedPermutations(
                patternTextures(),
                ssLoc("terracotta/color_palettes/pattern_palette"),
                patternPermutations()
        ));
    }

    private static List<ResourceLocation> patternTextures() {
        return TERRACOTTA_PATTERNS.keySet().stream()
                .map(pattern -> ssLoc("terracotta/block/" + pattern))
                .toList();
    }

    private static Map<String, ResourceLocation> patternPermutations() {
        HashMap<String, ResourceLocation> permutations = new HashMap<>(TERRACOTTA_DYES.size());

        for (String dyeId : TERRACOTTA_DYES.keySet()) {
            permutations.put(dyeId, ssLoc("terracotta/color_palettes/" + dyeId));
        }
        return permutations;
    }
}
