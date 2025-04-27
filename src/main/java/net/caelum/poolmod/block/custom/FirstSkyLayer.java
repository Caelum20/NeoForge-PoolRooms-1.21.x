package net.caelum.poolmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.caelum.poolmod.block.entity.FirstSkyLayerEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FirstSkyLayer extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(0,0,7,16,16,16);
    public static final MapCodec<FirstSkyLayer> CODEC = simpleCodec(FirstSkyLayer::new);

    public FirstSkyLayer(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    /* BLOCK ENTITY */

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockState) {
        return new FirstSkyLayerEntity(pos, blockState);
    }




}