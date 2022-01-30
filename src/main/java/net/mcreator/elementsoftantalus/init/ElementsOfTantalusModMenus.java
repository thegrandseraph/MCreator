
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.elementsoftantalus.world.inventory.InscriptionTableGUIMenu;
import net.mcreator.elementsoftantalus.world.inventory.Inscriber2GuiMenu;
import net.mcreator.elementsoftantalus.world.inventory.Inscriber1GUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementsOfTantalusModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<Inscriber1GUIMenu> INSCRIBER_1_GUI = register("inscriber_1_gui",
			(id, inv, extraData) -> new Inscriber1GUIMenu(id, inv, extraData));
	public static final MenuType<InscriptionTableGUIMenu> INSCRIPTION_TABLE_GUI = register("inscription_table_gui",
			(id, inv, extraData) -> new InscriptionTableGUIMenu(id, inv, extraData));
	public static final MenuType<Inscriber2GuiMenu> INSCRIBER_2_GUI = register("inscriber_2_gui",
			(id, inv, extraData) -> new Inscriber2GuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
