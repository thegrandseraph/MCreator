
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class KnifeOfSacrificeItem extends Item {

	public KnifeOfSacrificeItem() {
		super(new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("knife_of_sacrifice");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 2;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Tantalus never knew self sacrifice."));
		list.add(new TextComponent("Perhaps you can teach him."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SelfSacrifceProcedure.execute(entity);
		return ar;
	}

}
