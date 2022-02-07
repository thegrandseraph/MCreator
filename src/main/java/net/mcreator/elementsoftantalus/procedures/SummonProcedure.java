package net.mcreator.elementsoftantalus.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModItems;
import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModBlocks;

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
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elements_of_tantalus:bosssummon")), SoundSource.NEUTRAL,
								1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elements_of_tantalus:bosssummon")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
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
						for (int index0 = 0; index0 < (int) (30); index0++) {
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
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 1), (z + 0.5)), Vec2.ZERO, _level,
														4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"particle minecraft:dust 0 0 0 5 ~0.5 ~1 ~0.5 0.50 0.50 0.50 0 50 normal");
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 10);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 200);
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
							entityToSpawn.moveTo((x + 0.5), (y + 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 500);
			}
		}
	}
}
