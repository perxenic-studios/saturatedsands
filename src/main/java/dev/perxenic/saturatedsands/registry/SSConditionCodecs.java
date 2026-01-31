package dev.perxenic.saturatedsands.registry;

import com.mojang.serialization.MapCodec;
import dev.perxenic.saturatedsands.SaturatedSands;
import dev.perxenic.saturatedsands.content.conditions.SSConfigCondition;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class SSConditionCodecs {
    public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITION_CODECS =
            DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, SaturatedSands.MODID);

    public static final Supplier<MapCodec<SSConfigCondition>> CONFIG =
            CONDITION_CODECS.register("config", () -> SSConfigCondition.CODEC);

    public static void register(IEventBus eventBus) {
        CONDITION_CODECS.register(eventBus);
    }
}
