// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelskeleton_phone extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelskeleton_phone() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(9, 33).addBox(-6.0F, 0.0F, -1.0F, 12.0F, 24.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 12.0F, 0.1F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 12.0F, 0.1F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}