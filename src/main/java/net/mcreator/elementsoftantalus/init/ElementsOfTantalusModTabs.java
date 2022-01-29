
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElementsOfTantalusModTabs {
	public static CreativeModeTab TAB_ELEMENTS_OF_TANTALUS;
	public static CreativeModeTab TAB_RUNES;

	public static void load() {
		TAB_ELEMENTS_OF_TANTALUS = new CreativeModeTab("tabelements_of_tantalus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementsOfTantalusModItems.DREAM_SPARK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RUNES = new CreativeModeTab("tabrunes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementsOfTantalusModItems.EMBOSSED_CREATION_RUNE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
