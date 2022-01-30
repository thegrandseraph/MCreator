
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TantalusHeartItem extends Item {

	public TantalusHeartItem() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("tantalus_heart");
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
		list.add(new TextComponent("For his crimes he can never attain what he wants."));
		list.add(new TextComponent("Will you fall in the same way?"));
	}

}
