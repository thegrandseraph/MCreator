
package net.mcreator.elementsoftantalus.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LesserSacrificeRuneBlockBlock extends Block {

	public LesserSacrificeRuneBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).requiresCorrectToolForDrops());

		setRegistryName("lesser_sacrifice_rune_block");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 30; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.2D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.2D * 100;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.2D;
			world.addParticle(ParticleTypes.ANGRY_VILLAGER, x0, y0, z0, 0, 0, 0);
		}
	}

}
