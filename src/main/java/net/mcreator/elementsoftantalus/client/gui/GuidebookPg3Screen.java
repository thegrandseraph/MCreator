
package net.mcreator.elementsoftantalus.client.gui;

public class GuidebookPg3Screen extends AbstractContainerScreen<GuidebookPg3Menu> {

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuidebookPg3Screen(GuidebookPg3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elements_of_tantalus:textures/guidebook_pg_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/effigy.png"));
		this.blit(ms, this.leftPos + 77, this.topPos + 46, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elements_of_tantalus:textures/heart1.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 82, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "3. Prepare an effigy...", 6, 7, -12829636);
		this.font.draw(poseStack, "Craft a simple effigy", 32, 31, -12829636);
		this.font.draw(poseStack, "And the tier of heart you need", 9, 66, -12829636);
		this.font.draw(poseStack, "Then combine in a craft table", 11, 105, -12829636);
		this.font.draw(poseStack, "You will get a tiered effigy", 15, 119, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 133, 30, 20, new TextComponent("<"), e -> {
		}));
	}

}
