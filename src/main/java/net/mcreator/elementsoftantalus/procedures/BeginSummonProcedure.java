package net.mcreator.elementsoftantalus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModItems;

public class BeginSummonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementsOfTantalusModItems.EFFIGY_OF_TANTALUS) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ElementsOfTantalusModItems.EFFIGY_OF_TANTALUS));
		}
	}
}
