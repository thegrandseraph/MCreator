
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

import net.mcreator.elementsoftantalus.block.LesserInscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.InscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.EmbossedInscriptionTableBlock;
import net.mcreator.elementsoftantalus.block.AstralInscriptionTableBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementsOfTantalusModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block LESSER_INSCRIPTION_TABLE = register(new LesserInscriptionTableBlock());
	public static final Block EMBOSSED_INSCRIPTION_TABLE = register(new EmbossedInscriptionTableBlock());
	public static final Block INSCRIPTION_TABLE = register(new InscriptionTableBlock());
	public static final Block ASTRAL_INSCRIPTION_TABLE = register(new AstralInscriptionTableBlock());

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
