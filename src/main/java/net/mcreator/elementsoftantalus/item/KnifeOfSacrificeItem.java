
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementsoftantalus.procedures.SelfSacrifceProcedure;
import net.mcreator.elementsoftantalus.init.ElementsOfTantalusModTabs;

import java.util.List;

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

		SelfSacrifceProcedure.execute(entity, itemstack);
		return ar;
	}
}
