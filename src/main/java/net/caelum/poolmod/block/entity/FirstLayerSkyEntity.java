package net.caelum.poolmod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class FirstLayerSkyEntity extends BlockEntity {
    protected FirstLayerSkyEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }

    public FirstLayerSkyEntity(BlockPos pos, BlockState blockState) {
        this(BlockEntityType.END_PORTAL, pos , blockState);
    }

    public boolean shouldRenderFace(Direction face) {return face.getAxis() == Direction.Axis.Y; }
}
