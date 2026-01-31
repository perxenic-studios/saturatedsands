package dev.perxenic.saturatedsands;

import dev.perxenic.saturatedsands.registry.SSConditionCodecs;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

@Mod(SaturatedSands.MODID)
public class SaturatedSands {
    public static final String MODID = "saturatedsands";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SaturatedSands(IEventBus modEventBus, ModContainer modContainer) {
        SSConditionCodecs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public static ResourceLocation ssLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
