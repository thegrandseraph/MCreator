
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class TestBItem extends Item {
	public TestBItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("test_b");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
