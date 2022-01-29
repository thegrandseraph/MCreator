
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModTabs;

import java.util.List;

public class StoneTabletItem extends Item {
	public StoneTabletItem() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("stone_tablet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Base Material for Etching Runes"));
		list.add(new TextComponent("Use an Etcher to Make a Rune"));
	}
}
