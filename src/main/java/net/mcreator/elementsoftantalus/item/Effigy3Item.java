
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Effigy3Item extends Item {

	public Effigy3Item() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("effigy_3");
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
		list.add(new TextComponent("A carefully crafted form for the dead king to inhabit."));
		list.add(new TextComponent("Are you sure this is a good idea?"));
		list.add(new TextComponent("Contains a gilded heart."));
	}

}
