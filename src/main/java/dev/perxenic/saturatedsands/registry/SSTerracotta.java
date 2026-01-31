package dev.perxenic.saturatedsands.registry;

import dev.perxenic.saturatedsands.infra.TerracottaDatabase;
import dev.perxenic.saturatedsands.infra.TerracottaEntry;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.perxenic.saturatedsands.SaturatedSands.MODID;
import static dev.perxenic.saturatedsands.infra.TerracottaDatabase.SS_PATTERNS;
import static dev.perxenic.saturatedsands.infra.TerracottaDatabase.VANILLA_DYES;

public class SSTerracotta {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static void register(IEventBus eventBus) {
        for (String pattern : SS_PATTERNS) {
            for (String dye : VANILLA_DYES) {
                registerTerracotta(BLOCKS, ITEMS, pattern, dye);
            }
        }

        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    public static void registerTerracotta(
            DeferredRegister.Blocks blockRegister,
            DeferredRegister.Items itemRegister,
            String pattern,
            String color
    ) {
        DeferredBlock<GlazedTerracottaBlock> block = blockRegister.register(terracottaName(color, pattern),
                () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.of()
                        .mapColor(TerracottaDatabase.TERRACOTTA_DYES.get(color).mapColor)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .strength(1.4F)
                        .pushReaction(PushReaction.PUSH_ONLY)
                ));

        itemRegister.registerSimpleBlockItem(block);

        TerracottaDatabase.addEntry(new TerracottaEntry(
                pattern,
                color,
                block
        ));
    }

    public static String terracottaName(String color, String pattern) {
        return "%s_%s_terracotta".formatted(color, pattern);
    }
}
