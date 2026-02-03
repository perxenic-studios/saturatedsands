package dev.perxenic.saturatedsands;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.HashMap;

@EventBusSubscriber
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue FADED_TERRACOTTA_DYEING = BUILDER
            .comment("Whether to add dyeing recipes for faded terracotta")
            .define("fadedTerracottaDyeing", true);

    public static final ModConfigSpec.BooleanValue FADED_TERRACOTTA_STONECUTTING = BUILDER
            .comment("Whether to add stonecutting recipes for faded terracotta")
            .define("fadedTerracottaStonecutting", true);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean fadedTerracottaDyeing;
    public static boolean fadedTerracottaStonecutting;

    public static final HashMap<String, Boolean> configDict = new HashMap<>();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        fadedTerracottaDyeing = FADED_TERRACOTTA_DYEING.get();
        configDict.put("fadedTerracottaDyeing", fadedTerracottaDyeing);

        fadedTerracottaStonecutting = FADED_TERRACOTTA_STONECUTTING.get();
        configDict.put("fadedTerracottaStonecutting", fadedTerracottaStonecutting);
    }
}