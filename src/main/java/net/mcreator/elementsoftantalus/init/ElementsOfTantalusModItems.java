
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.elementsoftantalus.item.WoodenTabletItem;
import net.mcreator.elementsoftantalus.item.WaterRuneItem;
import net.mcreator.elementsoftantalus.item.TantalusHeartItem;
import net.mcreator.elementsoftantalus.item.TantalusHeart2Item;
import net.mcreator.elementsoftantalus.item.StoneTabletItem;
import net.mcreator.elementsoftantalus.item.SkySparkItem;
import net.mcreator.elementsoftantalus.item.SacrificeRuneItem;
import net.mcreator.elementsoftantalus.item.MetalSparkItem;
import net.mcreator.elementsoftantalus.item.MasterworkEtcherItem;
import net.mcreator.elementsoftantalus.item.LightSparkItem;
import net.mcreator.elementsoftantalus.item.LifeSparkItem;
import net.mcreator.elementsoftantalus.item.LesserWaterRuneItem;
import net.mcreator.elementsoftantalus.item.LesserTantalusHeartItem;
import net.mcreator.elementsoftantalus.item.LesserSacrificeRuneItem;
import net.mcreator.elementsoftantalus.item.LesserFireRuneItem;
import net.mcreator.elementsoftantalus.item.LesserEarthRuneItem;
import net.mcreator.elementsoftantalus.item.LesserDestructionRuneItem;
import net.mcreator.elementsoftantalus.item.LesserCreationRuneItem;
import net.mcreator.elementsoftantalus.item.LesserAirRuneItem;
import net.mcreator.elementsoftantalus.item.KnifeOfSacrificeItem;
import net.mcreator.elementsoftantalus.item.FlimsyEtcherItem;
import net.mcreator.elementsoftantalus.item.FireRuneItem;
import net.mcreator.elementsoftantalus.item.EtcherItem;
import net.mcreator.elementsoftantalus.item.EnergySparkItem;
import net.mcreator.elementsoftantalus.item.EmbossedWaterRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedTantalusHeartItem;
import net.mcreator.elementsoftantalus.item.EmbossedTabletItem;
import net.mcreator.elementsoftantalus.item.EmbossedSacrificeRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedHeart2Item;
import net.mcreator.elementsoftantalus.item.EmbossedFireRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedEarthRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedDestructionRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedCreationRuneItem;
import net.mcreator.elementsoftantalus.item.EmbossedAirRuneItem;
import net.mcreator.elementsoftantalus.item.EffigyOfTantalusItem;
import net.mcreator.elementsoftantalus.item.Effigy4Item;
import net.mcreator.elementsoftantalus.item.Effigy3Item;
import net.mcreator.elementsoftantalus.item.Effigy2Item;
import net.mcreator.elementsoftantalus.item.EarthRuneItem;
import net.mcreator.elementsoftantalus.item.DreamSparkItem;
import net.mcreator.elementsoftantalus.item.DestructionRuneItem;
import net.mcreator.elementsoftantalus.item.DarkSparkItem;
import net.mcreator.elementsoftantalus.item.CreationRuneItem;
import net.mcreator.elementsoftantalus.item.BottleOfBloodItem;
import net.mcreator.elementsoftantalus.item.AstralWaterRuneItem;
import net.mcreator.elementsoftantalus.item.AstralTabletItem;
import net.mcreator.elementsoftantalus.item.AstralSacrificeRuneItem;
import net.mcreator.elementsoftantalus.item.AstralHeartItem;
import net.mcreator.elementsoftantalus.item.AstralHeart2Item;
import net.mcreator.elementsoftantalus.item.AstralFireRuneItem;
import net.mcreator.elementsoftantalus.item.AstralEtcherItem;
import net.mcreator.elementsoftantalus.item.AstralDestructionRuneItem;
import net.mcreator.elementsoftantalus.item.AstralCreationRuneItem;
import net.mcreator.elementsoftantalus.item.AstralAirRuneItem;
import net.mcreator.elementsoftantalus.item.AstraEarthRuneItem;
import net.mcreator.elementsoftantalus.item.AirRuneItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementsOfTantalusModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FLIMSY_ETCHER = register(new FlimsyEtcherItem());
	public static final Item ETCHER = register(new EtcherItem());
	public static final Item MASTERWORK_ETCHER = register(new MasterworkEtcherItem());
	public static final Item ASTRAL_ETCHER = register(new AstralEtcherItem());
	public static final Item WOODEN_TABLET = register(new WoodenTabletItem());
	public static final Item STONE_TABLET = register(new StoneTabletItem());
	public static final Item EMBOSSED_TABLET = register(new EmbossedTabletItem());
	public static final Item ASTRAL_TABLET = register(new AstralTabletItem());
	public static final Item DREAM_SPARK = register(new DreamSparkItem());
	public static final Item METAL_SPARK = register(new MetalSparkItem());
	public static final Item ENERGY_SPARK = register(new EnergySparkItem());
	public static final Item LIFE_SPARK = register(new LifeSparkItem());
	public static final Item SKY_SPARK = register(new SkySparkItem());
	public static final Item LIGHT_SPARK = register(new LightSparkItem());
	public static final Item DARK_SPARK = register(new DarkSparkItem());
	public static final Item LESSER_INSCRIPTION_TABLE = register(ElementsOfTantalusModBlocks.LESSER_INSCRIPTION_TABLE,
			ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS);
	public static final Item EMBOSSED_INSCRIPTION_TABLE = register(ElementsOfTantalusModBlocks.EMBOSSED_INSCRIPTION_TABLE,
			ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS);
	public static final Item INSCRIPTION_TABLE = register(ElementsOfTantalusModBlocks.INSCRIPTION_TABLE,
			ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS);
	public static final Item ASTRAL_INSCRIPTION_TABLE = register(ElementsOfTantalusModBlocks.ASTRAL_INSCRIPTION_TABLE,
			ElementsOfTantalusModTabs.TAB_ELEMENTS_OF_TANTALUS);
	public static final Item LESSER_TANTALUS_HEART = register(new LesserTantalusHeartItem());
	public static final Item TANTALUS_HEART = register(new TantalusHeartItem());
	public static final Item EMBOSSED_TANTALUS_HEART = register(new EmbossedTantalusHeartItem());
	public static final Item ASTRAL_HEART = register(new AstralHeartItem());
	public static final Item TANTALUS_HEART_2 = register(new TantalusHeart2Item());
	public static final Item EMBOSSED_HEART_2 = register(new EmbossedHeart2Item());
	public static final Item ASTRAL_HEART_2 = register(new AstralHeart2Item());
	public static final Item EFFIGY_OF_TANTALUS = register(new EffigyOfTantalusItem());
	public static final Item EFFIGY_2 = register(new Effigy2Item());
	public static final Item EFFIGY_3 = register(new Effigy3Item());
	public static final Item EFFIGY_4 = register(new Effigy4Item());
	public static final Item KNIFE_OF_SACRIFICE = register(new KnifeOfSacrificeItem());
	public static final Item LESSER_EARTH_RUNE = register(new LesserEarthRuneItem());
	public static final Item LESSER_AIR_RUNE = register(new LesserAirRuneItem());
	public static final Item LESSER_FIRE_RUNE = register(new LesserFireRuneItem());
	public static final Item LESSER_WATER_RUNE = register(new LesserWaterRuneItem());
	public static final Item LESSER_CREATION_RUNE = register(new LesserCreationRuneItem());
	public static final Item LESSER_DESTRUCTION_RUNE = register(new LesserDestructionRuneItem());
	public static final Item LESSER_SACRIFICE_RUNE = register(new LesserSacrificeRuneItem());
	public static final Item EARTH_RUNE = register(new EarthRuneItem());
	public static final Item AIR_RUNE = register(new AirRuneItem());
	public static final Item FIRE_RUNE = register(new FireRuneItem());
	public static final Item WATER_RUNE = register(new WaterRuneItem());
	public static final Item CREATION_RUNE = register(new CreationRuneItem());
	public static final Item DESTRUCTION_RUNE = register(new DestructionRuneItem());
	public static final Item SACRIFICE_RUNE = register(new SacrificeRuneItem());
	public static final Item EMBOSSED_EARTH_RUNE = register(new EmbossedEarthRuneItem());
	public static final Item EMBOSSED_AIR_RUNE = register(new EmbossedAirRuneItem());
	public static final Item EMBOSSED_FIRE_RUNE = register(new EmbossedFireRuneItem());
	public static final Item EMBOSSED_WATER_RUNE = register(new EmbossedWaterRuneItem());
	public static final Item EMBOSSED_CREATION_RUNE = register(new EmbossedCreationRuneItem());
	public static final Item EMBOSSED_DESTRUCTION_RUNE = register(new EmbossedDestructionRuneItem());
	public static final Item EMBOSSED_SACRIFICE_RUNE = register(new EmbossedSacrificeRuneItem());
	public static final Item ASTRA_EARTH_RUNE = register(new AstraEarthRuneItem());
	public static final Item ASTRAL_AIR_RUNE = register(new AstralAirRuneItem());
	public static final Item ASTRAL_FIRE_RUNE = register(new AstralFireRuneItem());
	public static final Item ASTRAL_WATER_RUNE = register(new AstralWaterRuneItem());
	public static final Item ASTRAL_CREATION_RUNE = register(new AstralCreationRuneItem());
	public static final Item ASTRAL_DESTRUCTION_RUNE = register(new AstralDestructionRuneItem());
	public static final Item ASTRAL_SACRIFICE_RUNE = register(new AstralSacrificeRuneItem());
	public static final Item LESSER_EARTH_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_EARTH_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_AIR_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_AIR_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_FIRE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_FIRE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_WATER_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_WATER_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_CREATION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_CREATION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_DESTRUCTION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_DESTRUCTION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_SACRIFICE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_SACRIFICE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item LESSER_BINDING_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.LESSER_BINDING_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item EARTH_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.EARTH_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item AIR_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.AIR_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item FIRE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.FIRE_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item WATER_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.WATER_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item CREATION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.CREATION_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item DESTRUCTION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.DESTRUCTION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item SACRIFICE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.SACRIFICE_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item BINDING_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.BINDING_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_EARTH_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_EARTH_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_AIR_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_AIR_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_FIRE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_FIRE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_WATER_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_WATER_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_CREATION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_CREATION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_DESTRUCTION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_DESTRUCTION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_SACRIFCE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_SACRIFCE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item GILDED_BINDING_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.GILDED_BINDING_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_EARTH_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_EARTH_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_AIR_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_AIR_RUNE_BLOCK, ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_FIRE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_FIRE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_WATER_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_WATER_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_CREATION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_CREATION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_DESTRUCTION_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_DESTRUCTION_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_SACRIFICE_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_SACRIFICE_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item ASTRAL_BINDING_RUNE_BLOCK = register(ElementsOfTantalusModBlocks.ASTRAL_BINDING_RUNE_BLOCK,
			ElementsOfTantalusModTabs.TAB_RUNES);
	public static final Item BOTTLE_OF_BLOOD = register(new BottleOfBloodItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
