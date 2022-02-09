
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
