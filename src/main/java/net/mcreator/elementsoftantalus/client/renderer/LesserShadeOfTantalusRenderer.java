package net.mcreator.elementsoftantalus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementsoftantalus.entity.LesserShadeOfTantalusEntity;
import net.mcreator.elementsoftantalus.client.model.Modelsteve;

public class LesserShadeOfTantalusRenderer extends MobRenderer<LesserShadeOfTantalusEntity, Modelsteve<LesserShadeOfTantalusEntity>> {
	public LesserShadeOfTantalusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(LesserShadeOfTantalusEntity entity) {
		return new ResourceLocation("elements_of_tantalus:textures/63d4d1e7879aabfe28dd8f409b6e2fdc0fad6324.png");
	}
}
