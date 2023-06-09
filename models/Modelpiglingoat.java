// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpiglingoat extends EntityModel<Entity> {
	private final ModelRenderer headwear;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer head;
	private final ModelRenderer bb_main;

	public Modelpiglingoat() {
		textureWidth = 128;
		textureHeight = 64;

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-5.0F, -6.0F, 0.0F);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(5.0F, -6.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
		jacket.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(32, 48).addBox(9.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setRotationPoint(-5.0F, 2.0F, 0.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(40, 16).addBox(-12.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setRotationPoint(5.0F, 2.0F, 0.0F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		left_leg.setTextureOffset(16, 48).addBox(3.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setRotationPoint(-2.0F, 12.0F, 0.0F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setRotationPoint(2.0F, 12.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 25.0F, 1.5F);
		setRotationAngle(head, 0.6545F, 0.0F, 0.0F);
		head.setTextureOffset(98, 46).addBox(-2.5F, -27.0F, 5.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(76, 55).addBox(-2.49F, -33.0F, -4.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(76, 55).addBox(0.26F, -33.0F, -4.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(87, 52).addBox(0.0F, -21.0F, -8.0F, 0.0F, 7.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(66, 61).addBox(-5.25F, -28.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(66, 61).addBox(2.25F, -28.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		jacket.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_sleeve.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_sleeve.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_pants.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_pants.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}