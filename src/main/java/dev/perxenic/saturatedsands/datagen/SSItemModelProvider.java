package dev.perxenic.saturatedsands.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static dev.perxenic.saturatedsands.SaturatedSands.MODID;

public class SSItemModelProvider extends ItemModelProvider {
    public SSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
