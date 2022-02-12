package net.mcreator.elementsoftantalus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementsoftantalus.entity.LesserShadeOfTantalusEntity;
import net.mcreator.elementsoftantalus.client.model.Modelsteve;

public class LesserShadeOfTantalusRenderer extends MobRenderer<LesserShadeOfTantalusEntity, Modelsteve<LesserShadeOfTantalusEntity>> {
	public LesserShadeOfTantalusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.75f);
		this.addLayer(new EyesLayer<LesserShadeOfTantalusEntity, Modelsteve<LesserShadeOfTantalusEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elements_of_tantalus:textures/63d4d1e7879aabfe28dd8f409b6e2fdc0fad6324.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LesserShadeOfTantalusEntity entity) {
		return new ResourceLocation("elements_of_tantalus:textures/tantalusblank.png");
	}
}
