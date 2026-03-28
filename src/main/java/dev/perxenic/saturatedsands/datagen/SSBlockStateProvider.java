package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import dev.perxenic.saturatedsands.infra.TerracottaEntry;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static dev.perxenic.saturatedsands.SaturatedSands.MODID;
import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSBlockStateProvider extends BlockStateProvider {
    ExistingFileHelper existingFileHelper;

    public SSBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);

        this.existingFileHelper = existingFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach(((location, entry) ->
                terracotta(entry.block().get(), entry)
        ));

        // Register block states for new faded terracotta
        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            if (pattern.fadedBlock.getId().getNamespace().equals(MODID))
                terracotta(pattern.fadedBlock.get(), "block/faded_%s_terracotta".formatted(name));
        });
    }

    private void terracotta(Block block, TerracottaEntry entry) {
        terracotta(block, entry.getTexturePath(), entry.getModelPath());
    }

    private void terracotta(Block block, String path) {
        terracotta(block, path, path);
    }

    private void terracotta(Block block, String texturePath, String savePath) {
        getVariantBuilder(block).forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            // Trick existing file helper into thinking paletted texture created from sprite source exists
            existingFileHelper.trackGenerated(ssLoc(texturePath), PackType.CLIENT_RESOURCES, ".png", "textures");

            return ConfiguredModel.builder().modelFile(models().singleTexture(
                    savePath,
                    mcLoc("block/template_glazed_terracotta"),
                    "pattern",
                    ssLoc(texturePath)
            )).rotationY((int) facing.toYRot()).build();
        });
        simpleBlockItem(block, models().getExistingFile(ssLoc(savePath)));
    }
}
