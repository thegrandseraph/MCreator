package net.mcreator.elementsoftantalus.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BeginSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean FoundFire = false;
		boolean FoundEarth = false;
		boolean FoundAir = false;
		boolean FoundCreation = false;
		boolean FoundDestruction = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double previousRecipe = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementsOfTantalusModItems.EFFIGY_OF_TANTALUS) {
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 1))))
					.getBlock() == ElementsOfTantalusModBlocks.LESSER_WATER_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_DESTRUCTION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_EARTH_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_FIRE_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_AIR_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_DESTRUCTION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_CREATION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_CREATION_RUNE_BLOCK) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Cow(EntityType.COW, _level);
					entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ElementsOfTantalusModItems.EFFIGY_OF_TANTALUS));
			}
		}
	}
}
