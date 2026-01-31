package dev.perxenic.saturatedsands.content.conditions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.perxenic.saturatedsands.Config;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;

public record SSConfigCondition(String configKey) implements ICondition {
    public static final MapCodec<SSConfigCondition> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.STRING.fieldOf("config_key").forGetter(SSConfigCondition::configKey)
    ).apply(inst, SSConfigCondition::new));

    @Override
    public boolean test(@NotNull IContext iContext) {
        if (!Config.configDict.containsKey(configKey)) return false;
        return Config.configDict.get(configKey);
    }

    @Override
    public @NotNull MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
