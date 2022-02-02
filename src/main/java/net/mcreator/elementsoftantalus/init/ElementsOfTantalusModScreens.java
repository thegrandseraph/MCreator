
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.elementsoftantalus.client.gui.Inscriber4Screen;
import net.mcreator.elementsoftantalus.client.gui.Inscriber3Screen;
import net.mcreator.elementsoftantalus.client.gui.Inscriber2GuiScreen;
import net.mcreator.elementsoftantalus.client.gui.Inscriber1GUIScreen;
import net.mcreator.elementsoftantalus.client.gui.GuidebookPg2Screen;
import net.mcreator.elementsoftantalus.client.gui.Guidebook1Pg1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementsOfTantalusModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIBER_1_GUI, Inscriber1GUIScreen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIBER_2_GUI, Inscriber2GuiScreen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIBER_3, Inscriber3Screen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIBER_4, Inscriber4Screen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.GUIDEBOOK_1_PG_1, Guidebook1Pg1Screen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.GUIDEBOOK_PG_2, GuidebookPg2Screen::new);
		});
	}
}
