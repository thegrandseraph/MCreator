package net.mcreator.elementsoftantalus.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SelfSacrifceProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementsOfTantalusModItems.KNIFE_OF_SACRIFICE
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("sacrifice").bypassArmor(), 6);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.BOTTLE_OF_BLOOD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
