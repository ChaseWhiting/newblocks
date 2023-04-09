// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwallnut extends EntityModel<Entity> {
	private final ModelRenderer wallnut;
	private final ModelRenderer base;
	private final ModelRenderer eyes;
	private final ModelRenderer body;

	public Modelwallnut() {
		textureWidth = 128;
		textureHeight = 128;

		wallnut = new ModelRenderer(this);
		wallnut.setRotationPoint(0.0F, 24.0F, 0.0F);

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 0.0F, 0.0F);
		wallnut.addChild(base);

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(eyes);
		eyes.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		eyes.setTextureOffset(0, 4).addBox(2.0F, -11.5F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(body);
		body.setTextureOffset(46, 20).addBox(-3.0F, -1.0F, -2.0F, 7.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-4.0F, -7.5F, -3.0F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.5F, -7.0F, -3.5F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(24, 20).addBox(-3.0F, -12.5F, -3.5F, 7.0F, 5.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 40).addBox(-2.5F, -15.0F, -3.5F, 6.0F, 2.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(26, 8).addBox(-4.5F, -7.3F, -2.7F, 10.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(30, 33).addBox(-4.0F, -12.3F, -2.7F, 9.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(-3.5F, -14.3F, -2.7F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(-3.5F, -12.5F, -3.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(21, 43).addBox(-3.0F, -14.5F, -3.0F, 7.0F, 2.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(45, 0).addBox(-2.5F, -15.5F, -3.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(42, 45).addBox(-2.0F, -16.0F, -3.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		wallnut.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}