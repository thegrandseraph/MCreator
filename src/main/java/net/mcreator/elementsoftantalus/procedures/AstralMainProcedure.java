package net.mcreator.elementsoftantalus.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModItems;

import java.util.function.Supplier;
import java.util.Map;

public class AstralMainProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRA_EARTH_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_AIR_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_FIRE_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(4)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_CREATION_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_DESTRUCTION_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(3)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_SACRIFICE_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ElementsOfTantalusModItems.ASTRAL_WATER_RUNE);
			_setstack.setCount(1);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
