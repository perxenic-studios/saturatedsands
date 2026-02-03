package dev.perxenic.saturatedsands.datagen;

import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.SSBlockTags;
import dev.perxenic.saturatedsands.content.SSItemTags;
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

        addConfig("fadedTerracottaDyeing");
        addConfig("fadedTerracottaStonecutting");
        addConfig("fadedReverseStonecutting");

        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach(((location, entry) -> {
            addBlock(
                    entry.block(),
                    "%s %s Terracotta".formatted(snakeToTitle(entry.color()), snakeToTitle(entry.pattern()))
            );
        }));

        TerracottaDatabase.TERRACOTTA_DYES.forEach((name, dye) -> {
            addTag(() -> dye.dyedTerracottaItemTag, snakeToTitle(name) + " Terracotta");
            addTag(() -> dye.dyedTerracottaBlockTag, snakeToTitle(name) + " Terracotta");
        });

        TerracottaDatabase.TERRACOTTA_PATTERNS.forEach((name, pattern) -> {
            addTag(() -> pattern.itemTag, snakeToTitle(name) + " Terracotta");
            addTag(() -> pattern.blockTag, snakeToTitle(name) + " Terracotta");
        });

        addTag(() -> SSItemTags.Color.FADED, "Uncolored Terracotta");
        addTag(() -> SSBlockTags.Color.FADED, "Uncolored Terracotta");

        addTag(() -> SSItemTags.Pattern.ALL, "Patterned Terracotta");
        addTag(() -> SSBlockTags.Pattern.ALL, "Patterned Terracotta");
        addTag(() -> SSItemTags.Color.ALL, "All Terracotta Palettes");
        addTag(() -> SSBlockTags.Color.ALL, "All Terracotta Palettes");
    }

    public String capitaliseStart(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public String snakeToTitle(String input) {
        return Arrays.stream(input.split("_")).map(this::capitaliseStart).collect(Collectors.joining(" "));
    }

    public String camelToTitle(String input) {
        StringBuilder outputString = new StringBuilder();
        for (char letter : input.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                outputString.append(' ');
            }
            outputString.append(letter);
        }
        return capitaliseStart(outputString.toString());
    }

    public void addConfig(String configName, String translation) {
        add("saturatedsands.configuration."+configName, translation);
    }

    public void addConfig(String configName) {
        addConfig(configName, camelToTitle(configName));
    }
}
