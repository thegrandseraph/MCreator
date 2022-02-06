
package net.mcreator.elementsoftantalus.client.gui;

public class Guidebook1Pg1Screen extends AbstractContainerScreen<Guidebook1Pg1Menu> {

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Guidebook1Pg1Screen(Guidebook1Pg1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elements_of_tantalus:textures/guidebook_1_pg_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/emptybottle.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/knife.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 61, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "To Summon Tantalus...", 33, 7, -12829636);
		this.font.draw(poseStack, "1. Get some blood...", 6, 34, -12829636);
		this.font.draw(poseStack, "Left Hand", 15, 79, -12829636);
		this.font.draw(poseStack, "Right Hand", 96, 79, -12829636);
		this.font.draw(poseStack, "Right click to fill the bottle.", 6, 115, -12829636);
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
	}

}
