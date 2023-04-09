// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelalien extends EntityModel<Entity> {
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer ear1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer ear2;
	private final ModelRenderer cube_r4;

	public Modelalien() {
		textureWidth = 560;
		textureHeight = 560;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_leg.setTextureOffset(146, 309).addBox(-4.0F, -7.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_leg.setTextureOffset(148, 308).addBox(1.0F, -7.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(56, 221).addBox(-5.0F, -17.0F, -2.0F, 10.0F, 11.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(56, 221).addBox(-4.0F, -16.0F, -3.0F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(56, 221).addBox(-4.0F, -16.0F, 2.0F, 8.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
		cube_r1.setTextureOffset(27, 214).addBox(-12.0F, -12.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.1F, false);
		cube_r1.setTextureOffset(23, 181).addBox(-12.0F, -11.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
		cube_r2.setTextureOffset(27, 214).addBox(10.0F, -12.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.1F, true);
		cube_r2.setTextureOffset(23, 181).addBox(10.0F, -11.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(43, 153).addBox(-3.0F, -22.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(21, 204).addBox(-4.0F, -22.75F, -2.5F, 8.0F, 6.0F, 6.0F, 0.0F, false);

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(0.0F, 7.25F, 0.5F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		ear1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.setTextureOffset(68, 178).addBox(1.0F, -10.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		cube_r3.setTextureOffset(68, 178).addBox(1.0F, -10.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(0.0F, 7.25F, 0.5F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ear2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6109F);
		cube_r4.setTextureOffset(68, 178).addBox(-2.0F, -10.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, true);
		cube_r4.setTextureOffset(68, 178).addBox(-2.0F, -10.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		ear1.render(matrixStack, buffer, packedLight, packedOverlay);
		ear2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}