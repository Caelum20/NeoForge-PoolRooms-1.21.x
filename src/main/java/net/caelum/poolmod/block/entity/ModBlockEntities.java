package net.caelum.poolmod.block.entity;

import net.caelum.poolmod.PoolMod;
import net.caelum.poolmod.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCk_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, PoolMod.MOD_ID);

    public static final Supplier<BlockEntityType<FirstSkyLayerEntity>> FIRSTSKY_BE =
            BLOCk_ENTITIES.register("firstsky_be", ()-> BlockEntityType.Builder.of(
                FirstSkyLayerEntity::new, ModBlocks.FIRSTSKYLAYER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCk_ENTITIES.register(eventBus);
    }
}
