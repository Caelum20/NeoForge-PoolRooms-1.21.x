package net.caelum.poolmod.item;

import net.caelum.poolmod.PoolMod;
import net.caelum.poolmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoolMod.MOD_ID);

    public static final Supplier<CreativeModeTab> POOL_ITEMS_TABS = CREATIVE_MODE_TAB.register("pool_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LIMINALGAE_LEAF.get()))
                    .title(Component.translatable("creativetab.poolmod.pool_items"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.LIMINALGAE_LEAF.get());
                        output.accept(ModItems.POOLFISH.get());
                    }).build());
    public static final Supplier<CreativeModeTab> POOL_BLOCK_TABS = CREATIVE_MODE_TAB.register("pool_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POOLTILE_BLOCK.get()))
                    .title(Component.translatable("creativetab.poolmod.pool_blocks"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModBlocks.POOLTILE_BLOCK.get());
                        output.accept(ModBlocks.LIMINAGLAE_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
