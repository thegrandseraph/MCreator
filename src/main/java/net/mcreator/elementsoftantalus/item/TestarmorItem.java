
package net.mcreator.elementsoftantalus.item;

import net.minecraft.sounds.SoundEvent;

public abstract class TestarmorItem extends ArmorItem {

	public TestarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "testarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TestarmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS));

			setRegistryName("testarmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elements_of_tantalus:textures/models/armor/test1_layer_1.png";
		}

	}

	public static class Chestplate extends TestarmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS));

			setRegistryName("testarmor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elements_of_tantalus:textures/models/armor/test1_layer_1.png";
		}

	}

	public static class Leggings extends TestarmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS));

			setRegistryName("testarmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elements_of_tantalus:textures/models/armor/test1_layer_2.png";
		}

	}

	public static class Boots extends TestarmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS));

			setRegistryName("testarmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elements_of_tantalus:textures/models/armor/test1_layer_1.png";
		}

	}

}
