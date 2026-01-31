package dev.perxenic.saturatedsands.registry;

import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.perxenic.saturatedsands.SaturatedSands.MODID;
import static dev.perxenic.saturatedsands.SaturatedSands.ssLoc;

public class SSCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> TERRACOTTA = CREATIVE_MODE_TABS.register("terracotta",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.%s.terracotta".formatted(MODID)))
                    .icon(() -> TerracottaDatabase.TERRACOTTA_ENTRIES.get(ssLoc("red_geo_terracotta")).block().toStack())
                    .displayItems(((itemDisplayParameters, output) -> {
                        TerracottaDatabase.TERRACOTTA_ENTRIES.forEach((location, entry) -> {
                            output.accept(entry.block().asItem());
                        });
                    }))
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
