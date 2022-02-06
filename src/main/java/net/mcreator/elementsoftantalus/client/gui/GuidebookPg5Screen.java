
package net.mcreator.elementsoftantalus.client.gui;

public class GuidebookPg5Screen extends AbstractContainerScreen<GuidebookPg5Menu> {

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuidebookPg5Screen(GuidebookPg5Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elements_of_tantalus:textures/guidebook_pg_5.png");

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
		this.font.draw(poseStack, "Defeat tantalus and he will", 15, 17, -12829636);
		this.font.draw(poseStack, "drop the actualized version of", 7, 29, -12829636);
		this.font.draw(poseStack, "the heart you used.", 36, 42, -12829636);
		this.font.draw(poseStack, "This can be used to craft", 20, 70, -12829636);
		this.font.draw(poseStack, "the next tier of heart, allowing", 3, 81, -12829636);
		this.font.draw(poseStack, "you to progress tiers", 32, 94, -12829636);
		this.font.draw(poseStack, "Good luck, and happy hunting", 14, 118, -12829636);
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

		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 133, 30, 20, new TextComponent("<"), e -> {
		}));
	}

}
