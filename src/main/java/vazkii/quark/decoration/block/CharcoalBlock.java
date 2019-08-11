package vazkii.quark.decoration.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import vazkii.arl.util.RegistryHelper;
import vazkii.quark.base.block.QuarkBlock;
import vazkii.quark.base.moduleloader.Module;
import vazkii.quark.decoration.feature.CharcoalBlockModule;

public class CharcoalBlock extends QuarkBlock {

	public CharcoalBlock(Module module) {
		super("charcoal_block", module,
				Block.Properties.create(Material.ROCK, MaterialColor.BLACK)
				.hardnessAndResistance(5F, 10F)
				.sound(SoundType.STONE));
		RegistryHelper.setCreativeTab(this, ItemGroup.BUILDING_BLOCKS);
	}

	@Override
	public boolean isFireSource(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
		return side == Direction.UP && CharcoalBlockModule.burnsForever;
	}
	
}