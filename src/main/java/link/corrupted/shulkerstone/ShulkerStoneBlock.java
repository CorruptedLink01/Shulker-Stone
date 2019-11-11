package link.corrupted.shulkerstone;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class ShulkerStoneBlock extends DirectionalBlock {

	private final DyeColor color;



	public ShulkerStoneBlock(@Nullable DyeColor color,  Properties properties) {
		super(properties);
		this.color = color;
		this.setDefaultState(this.getDefaultState().with(FACING, Direction.UP));
	}

	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getFace());
	}

	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}


	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static DyeColor getColorFromItem(Item item) {
		return getColorFromBlock(Block.getBlockFromItem(item));
	}

	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static DyeColor getColorFromBlock(Block block) {
		return block instanceof ShulkerStoneBlock ? ((ShulkerStoneBlock)block).getColor() : null;
	}

	@Nullable
	public DyeColor getColor() {
		return this.color;
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}

}
