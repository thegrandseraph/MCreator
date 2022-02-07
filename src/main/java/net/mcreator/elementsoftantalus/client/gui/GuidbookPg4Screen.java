
package net.mcreator.elementsoftantalus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.elementsoftantalus.world.inventory.GuidbookPg4Menu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuidbookPg4Screen extends AbstractContainerScreen<GuidbookPg4Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuidbookPg4Screen(GuidbookPg4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elements_of_tantalus:textures/guidbook_pg_4.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/bindingrune1.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/airrune1.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/earthrune1.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 97, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/firerune1.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/waterrune1.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/creationrune1.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/destructionrune1.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 97, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "4. Summon Tantalus...", 6, 7, -12829636);
		this.font.draw(poseStack, "Set up your rune blocks as such", 6, 43, -12829636);
		this.font.draw(poseStack, "Now just right click the center", 6, 115, -12829636);
		this.font.draw(poseStack, "with your crafted effigy", 24, 124, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
