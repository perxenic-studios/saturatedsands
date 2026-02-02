package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SSLanguageProvider extends LanguageProvider {
    public SSLanguageProvider(PackOutput output) {
        super(output, SaturatedSands.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.%s.terracotta".formatted(SaturatedSands.MODID), "Patterned Terracotta");

        add("saturatedsands.configuration.title", "Saturated Sands Configs");
        add("saturatedsands.configuration.section.saturatedsands.common.toml", "Saturated Sands Configs");
        add("saturatedsands.configuration.section.saturatedsands.common.toml.title", "Saturated Sands Configs");

        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach(((location, entry) -> {
            addBlock(
                    entry.block(),
                    "%s %s Terracotta".formatted(snakeToTitle(entry.color()), snakeToTitle(entry.pattern()))
            );
        }));
    }

    public String capitaliseStart(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public String snakeToTitle(String input) {
        return Arrays.stream(input.split("_")).map(this::capitaliseStart).collect(Collectors.joining(" "));
    }
}
