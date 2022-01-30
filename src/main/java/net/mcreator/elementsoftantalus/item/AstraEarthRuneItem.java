
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

public class AstraEarthRuneItem extends Item {
	public AstraEarthRuneItem() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_RUNES).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("astra_earth_rune");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A perfect rune bearing the symbol for Earth"));
	}
}
