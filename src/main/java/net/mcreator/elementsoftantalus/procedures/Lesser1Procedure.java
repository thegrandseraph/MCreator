package net.mcreator.elementsoftantalus.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Lesser1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == ElementsOfTantalusModItems.FLIMSY_ETCHER) {
			LesserMainProcedure.execute(entity);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == ElementsOfTantalusModItems.ETCHER) {
			LesserMainProcedure.execute(entity);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == ElementsOfTantalusModItems.MASTERWORK_ETCHER) {
			LesserMainProcedure.execute(entity);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == ElementsOfTantalusModItems.ASTRAL_ETCHER) {
			LesserMainProcedure.execute(entity);
		}
	}
}
