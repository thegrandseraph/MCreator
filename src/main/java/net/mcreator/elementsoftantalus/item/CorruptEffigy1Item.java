
package net.mcreator.elementsoftantalus.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CorruptEffigy1Item extends Item {
	public CorruptEffigy1Item() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("corrupt_effigy_1");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
