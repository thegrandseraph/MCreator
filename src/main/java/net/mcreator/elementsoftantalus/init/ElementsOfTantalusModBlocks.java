
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementsoftantalus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.elementsoftantalus.block.WaterRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.SacrificeRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserWaterRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserSacrificeRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserInscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.LesserFireRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserEarthRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserDestructionRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserCreationRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.LesserAirRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.InscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.GildedWaterRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedSacrifceRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedFireRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedEarthRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedDestructionRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedCreationRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedBindingRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.GildedAirRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.FireRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.EmbossedInscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.EarthRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.DestructionRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.CreationRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.BindingRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralWaterRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralSacrificeRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralInscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.AstralFireRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralEarthRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralDestructionRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralCreationRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralBindingRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AstralAirRuneBlockBlock;
import net.mcreator.elementsoftantalus.block.AirRuneBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementsOfTantalusModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block LESSER_BINDING_RUNE_BLOCK = register(new LesserBindingRuneBlockBlock());
	public static final Block LESSER_INSCRIPTION_TABLE = register(new LesserInscriptionTableBlock());
	public static final Block EMBOSSED_INSCRIPTION_TABLE = register(new EmbossedInscriptionTableBlock());
	public static final Block INSCRIPTION_TABLE = register(new InscriptionTableBlock());
	public static final Block ASTRAL_INSCRIPTION_TABLE = register(new AstralInscriptionTableBlock());
	public static final Block LESSER_WATER_RUNE_BLOCK = register(new LesserWaterRuneBlockBlock());
	public static final Block LESSER_FIRE_RUNE_BLOCK = register(new LesserFireRuneBlockBlock());
	public static final Block LESSER_EARTH_RUNE_BLOCK = register(new LesserEarthRuneBlockBlock());
	public static final Block LESSER_AIR_RUNE_BLOCK = register(new LesserAirRuneBlockBlock());
	public static final Block LESSER_SACRIFICE_RUNE_BLOCK = register(new LesserSacrificeRuneBlockBlock());
	public static final Block LESSER_DESTRUCTION_RUNE_BLOCK = register(new LesserDestructionRuneBlockBlock());
	public static final Block LESSER_CREATION_RUNE_BLOCK = register(new LesserCreationRuneBlockBlock());
	public static final Block WATER_RUNE_BLOCK = register(new WaterRuneBlockBlock());
	public static final Block EARTH_RUNE_BLOCK = register(new EarthRuneBlockBlock());
	public static final Block FIRE_RUNE_BLOCK = register(new FireRuneBlockBlock());
	public static final Block AIR_RUNE_BLOCK = register(new AirRuneBlockBlock());
	public static final Block SACRIFICE_RUNE_BLOCK = register(new SacrificeRuneBlockBlock());
	public static final Block DESTRUCTION_RUNE_BLOCK = register(new DestructionRuneBlockBlock());
	public static final Block CREATION_RUNE_BLOCK = register(new CreationRuneBlockBlock());
	public static final Block BINDING_RUNE_BLOCK = register(new BindingRuneBlockBlock());
	public static final Block GILDED_WATER_RUNE_BLOCK = register(new GildedWaterRuneBlockBlock());
	public static final Block GILDED_EARTH_RUNE_BLOCK = register(new GildedEarthRuneBlockBlock());
	public static final Block GILDED_FIRE_RUNE_BLOCK = register(new GildedFireRuneBlockBlock());
	public static final Block GILDED_AIR_RUNE_BLOCK = register(new GildedAirRuneBlockBlock());
	public static final Block GILDED_SACRIFCE_RUNE_BLOCK = register(new GildedSacrifceRuneBlockBlock());
	public static final Block GILDED_DESTRUCTION_RUNE_BLOCK = register(new GildedDestructionRuneBlockBlock());
	public static final Block GILDED_CREATION_RUNE_BLOCK = register(new GildedCreationRuneBlockBlock());
	public static final Block GILDED_BINDING_RUNE_BLOCK = register(new GildedBindingRuneBlockBlock());
	public static final Block ASTRAL_WATER_RUNE_BLOCK = register(new AstralWaterRuneBlockBlock());
	public static final Block ASTRAL_EARTH_RUNE_BLOCK = register(new AstralEarthRuneBlockBlock());
	public static final Block ASTRAL_FIRE_RUNE_BLOCK = register(new AstralFireRuneBlockBlock());
	public static final Block ASTRAL_AIR_RUNE_BLOCK = register(new AstralAirRuneBlockBlock());
	public static final Block ASTRAL_SACRIFICE_RUNE_BLOCK = register(new AstralSacrificeRuneBlockBlock());
	public static final Block ASTRAL_DESTRUCTION_RUNE_BLOCK = register(new AstralDestructionRuneBlockBlock());
	public static final Block ASTRAL_CREATION_RUNE_BLOCK = register(new AstralCreationRuneBlockBlock());
	public static final Block ASTRAL_BINDING_RUNE_BLOCK = register(new AstralBindingRuneBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AstralInscriptionTableBlock.registerRenderLayer();
		}
	}
}
