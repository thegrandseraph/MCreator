package net.mcreator.elementsoftantalus.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementsOfTantalusModItems.EFFIGY_OF_TANTALUS) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 3))))
					.getBlock() == ElementsOfTantalusModBlocks.LESSER_DESTRUCTION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_DESTRUCTION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_CREATION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 3))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_CREATION_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_AIR_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_FIRE_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_WATER_RUNE_BLOCK
					&& (world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 1))))
							.getBlock() == ElementsOfTantalusModBlocks.LESSER_EARTH_RUNE_BLOCK) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ElementsOfTantalusModItems.CORRUPT_EFFIGY_1));
				for (int index0 = 0; index0 < (int) (25); index0++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1.5), z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0 0 0 5 ~ ~1.5 ~ 0.50 0.50 0.50 0 50 normal");
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new Cow(EntityType.COW, _level);
							entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 12);
			}
		}
	}
}
