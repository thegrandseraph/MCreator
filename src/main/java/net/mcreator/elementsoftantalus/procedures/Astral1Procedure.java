package net.mcreator.elementsoftantalus.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModItems;

import java.util.function.Supplier;
import java.util.Map;

public class Astral1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double SlotsFilled = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == ElementsOfTantalusModItems.ASTRAL_ETCHER) {
			SlotsFilled = SlotsFilled + 1;
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
				? ((Slot) _slt.get(1)).getItem()
				: ItemStack.EMPTY).getItem() == ElementsOfTantalusModItems.ASTRAL_TABLET) {
			SlotsFilled = SlotsFilled + 1;
		}
		if (SlotsFilled == 2) {
			AstralMainProcedure.execute(entity);
		} else if (SlotsFilled < 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(2)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(3)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(4)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(5)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(6)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(7)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				((Slot) _slots.get(8)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
