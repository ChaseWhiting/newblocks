// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp106 extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer pa;

	public Modelscp106() {
		textureWidth = 64;
		textureHeight = 64;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.0F, 0.0F);
		waist.addChild(body);
		body.setTextureOffset(16, 16).addBox(-4.0F, -13.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -13.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, -11.0F, 0.0F);
		body.addChild(rightArm);
		rightArm.setTextureOffset(32, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(40, 22).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.001F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, -11.0F, 0.0F);
		body.addChild(leftArm);
		leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(32, 54).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.001F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 0.0F, 0.0F);
		waist.addChild(rightLeg);
		rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		rightLeg.setTextureOffset(16, 53).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.001F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 0.0F, 0.0F);
		waist.addChild(leftLeg);
		leftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		leftLeg.setTextureOffset(0, 21).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.001F, false);

		pa = new ModelRenderer(this);
		pa.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
		pa.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}