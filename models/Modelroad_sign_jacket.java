// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelroad_sign_jacket extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer left_shoe;
	private final ModelRenderer right_shoe;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;

	public Modelroad_sign_jacket() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.75F, false);
		body.setTextureOffset(0, 2).addBox(-4.5F, 0.0F, -3.0F, 4.0F, 6.0F, 7.0F, 0.75F, false);
		body.setTextureOffset(0, 0).addBox(-6.75F, 0.0F, -2.25F, 3.0F, 6.0F, 7.0F, 0.75F, false);
		body.setTextureOffset(0, 5).addBox(-6.5F, 3.0F, -0.25F, 3.0F, 4.0F, 3.0F, 0.75F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.2618F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-6.75F, -25.0F, -4.5F, 4.0F, 6.0F, 7.0F, 0.75F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.1745F, 0.0F);
		body_r2.setTextureOffset(50, 22).addBox(-3.0F, -24.0F, 2.75F, 7.0F, 10.0F, 0.0F, 0.75F, false);

		left_shoe = new ModelRenderer(this);
		left_shoe.setRotationPoint(2.0F, 12.0F, 0.0F);

		right_shoe = new ModelRenderer(this);
		right_shoe.setRotationPoint(-2.0F, 12.0F, 0.0F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(46, 0).addBox(0.5F, -2.0F, -3.0F, 4.0F, 7.0F, 5.0F, 0.75F, true);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0681F, -0.298F, -0.2284F);
		left_arm_r1.setTextureOffset(24, 0).addBox(6.5F, -26.0F, -4.5F, 6.0F, 7.0F, 5.0F, 0.75F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_shoe.render(matrixStack, buffer, packedLight, packedOverlay);
		right_shoe.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}