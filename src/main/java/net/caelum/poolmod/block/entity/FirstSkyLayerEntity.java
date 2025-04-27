package net.caelum.poolmod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FirstSkyLayerEntity extends BlockEntity {

    public FirstSkyLayerEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.FIRSTSKY_BE.get(), pos, blockState);
    }

    public static boolean shouldRenderFace(Direction face){
    }
}
