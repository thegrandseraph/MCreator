
package net.mcreator.elementsoftantalus.client.gui;

public class GuidebookPg2Screen extends AbstractContainerScreen<GuidebookPg2Menu> {

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuidebookPg2Screen(GuidebookPg2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elements_of_tantalus:textures/guidebook_pg_2.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/blood.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/tablet1.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/plus.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/plus.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/etcher1a.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/equals.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/bindingrune1.png"));
		this.blit(ms, this.leftPos + 132, this.topPos + 43, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "2. Next make the binding rune...", 6, 7, -12829636);
		this.font.draw(poseStack, "Be sure to use", 51, 79, -12829636);
		this.font.draw(poseStack, "the correct tier", 46, 88, -12829636);
		this.font.draw(poseStack, "tablet for which tier", 35, 97, -12829636);
		this.font.draw(poseStack, "of Tantalus you need.", 36, 106, -12829636);
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

		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 133, 30, 20, new TextComponent(">"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 133, 30, 20, new TextComponent("<"), e -> {
		}));
	}

}
