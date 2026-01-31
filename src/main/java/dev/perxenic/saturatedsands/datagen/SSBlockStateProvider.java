package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static dev.perxenic.saturatedsands.SaturatedSands.MODID;
import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSBlockStateProvider extends BlockStateProvider {
    public SSBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //TODO: Uncomment when textures added
        /*
        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach(((location, entry) ->
                terracotta(entry.block().get(), entry.getPath())
        ));
         */
    }

    public void terracotta(Block block, String name) {
        getVariantBuilder(block).forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            return ConfiguredModel.builder().modelFile(models().singleTexture(
                    name,
                    mcLoc("block/template_glazed_terracotta"),
                    "pattern",
                    ssLoc("block/" + name)
            )).rotationY((int) facing.toYRot()).build();
        });
        simpleBlockItem(block, models().getExistingFile(ssLoc(name)));
    }
}
