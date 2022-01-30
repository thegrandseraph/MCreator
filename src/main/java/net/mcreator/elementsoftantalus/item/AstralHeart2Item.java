
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AstralHeart2Item extends Item {

	public AstralHeart2Item() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("astral_heart_2");
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
		list.add(new TextComponent("The final power of Tantalus resides within."));
	}

}
