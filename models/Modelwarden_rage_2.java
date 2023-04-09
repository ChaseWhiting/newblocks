// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwarden_rage_2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelwarden_rage_2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -19.0F);
		setRotationAngle(head, -0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(0, 32).addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(8.0F, -12.5F, 1.0F);
		head.addChild(left_ear);
		left_ear.setTextureOffset(58, 6).addBox(0.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-8.0F, -12.5F, 1.0F);
		head.addChild(right_ear);
		right_ear.setTextureOffset(58, 38).addBox(-10.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.0F, -15.0F);
		setRotationAngle(body, 0.9599F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-9.0F, 0.0F, -5.0F, 18.0F, 21.0F, 11.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-11.0F, -6.0F, 0.0F);
		setRotationAngle(right_arm, 1.92F, -0.4971F, -0.1719F);
		right_arm.setTextureOffset(44, 50).addBox(-6.0F, -12.0F, -9.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(11.0F, -6.0F, 0.0F);
		setRotationAngle(left_arm, 1.92F, 0.4971F, 0.1719F);
		left_arm.setTextureOffset(0, 58).addBox(-2.0F, -12.0F, -9.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(6.0F, 11.0F, -1.0F);
		left_leg.setTextureOffset(76, 76).addBox(-3.25F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-6.0F, 11.0F, -1.0F);
		right_leg.setTextureOffset(76, 48).addBox(-2.75F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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