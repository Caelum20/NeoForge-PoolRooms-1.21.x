package net.caelum.poolmod.block;

import net.caelum.poolmod.PoolMod;
import net.caelum.poolmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PoolMod.MOD_ID);

    public static final DeferredBlock<Block> POOLTILE_BLOCK = registerBlock("pooltile_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> LIMINAGLAE_BLOCK = registerBlock("liminalgae_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.2f).sound(SoundType.GRASS).lightLevel(GlowLichenBlock.emission(7)).instabreak().noOcclusion().randomTicks()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
