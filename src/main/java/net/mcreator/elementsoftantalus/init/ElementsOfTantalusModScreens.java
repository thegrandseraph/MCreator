
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.elementsoftantalus.client.gui.InscriptionTableGUIScreen;
import net.mcreator.elementsoftantalus.client.gui.InscriptionGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementsOfTantalusModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIPTION_TABLE_GUI, InscriptionTableGUIScreen::new);
			MenuScreens.register(ElementsOfTantalusModMenus.INSCRIPTION_GUI, InscriptionGUIScreen::new);
		});
	}
}
