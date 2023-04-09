// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelallay extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_r1;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_r1;

	public Modelallay() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 19.75F, 0.0F);
		setRotationAngle(body, 0.1745F, 0.0F, 0.0F);
		body.setTextureOffset(0, 10).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, -0.2F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.75F, 20.5F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
		right_arm.setTextureOffset(23, 0).addBox(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.75F, 20.5F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
		left_arm.setTextureOffset(23, 6).addBox(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.5F, 21.0F, 1.0F);
		setRotationAngle(left_wing, 0.1745F, 0.0F, 0.0F);

		left_wing_r1 = new ModelRenderer(this);
		left_wing_r1.setRotationPoint(0.6068F, 0.25F, 0.2938F);
		left_wing.addChild(left_wing_r1);
		setRotationAngle(left_wing_r1, 0.0F, 0.1745F, 0.0F);
		left_wing_r1.setTextureOffset(16, 14).addBox(-0.1154F, -0.5F, -0.4663F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-0.5F, 21.0F, 1.0F);
		setRotationAngle(right_wing, 0.1745F, 0.0F, 0.0F);

		right_wing_r1 = new ModelRenderer(this);
		right_wing_r1.setRotationPoint(-0.6068F, 0.25F, 0.2938F);
		right_wing.addChild(right_wing_r1);
		setRotationAngle(right_wing_r1, 0.0F, -0.1745F, 0.0F);
		right_wing_r1.setTextureOffset(16, 14).addBox(0.1154F, -0.5F, -0.4663F, 0.0F, 5.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_wing_r1.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing_r1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}