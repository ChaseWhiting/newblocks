// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelconehead_zombie extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer head2;
	private final ModelRenderer hat2;

	public Modelconehead_zombie() {
		textureWidth = 64;
		textureHeight = 64;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -12.0F, 0.0F);
		waist.addChild(body);
		body.setTextureOffset(0, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(rightArm, -1.3526F, 0.0F, 0.0F);
		rightArm.setTextureOffset(0, 42).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(leftArm, -1.3526F, 0.0F, 0.0F);
		leftArm.setTextureOffset(36, 38).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(24, 26).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(24, 26).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(hat);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -7.0F, 0.0F);

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, 0.3F, -0.25F);
		head2.addChild(hat2);
		setRotationAngle(hat2, 0.0873F, 0.0F, 0.0F);
		hat2.setTextureOffset(24, 0).addBox(-3.64F, -4.372F, -3.64F, 7.0F, 1.0F, 7.0F, 0.5F, false);
		hat2.setTextureOffset(0, 16).addBox(-4.56F, -2.612F, -4.56F, 9.0F, 1.0F, 9.0F, 0.5F, false);
		hat2.setTextureOffset(36, 24).addBox(-2.72F, -6.132F, -2.72F, 5.0F, 1.0F, 5.0F, 0.5F, false);
		hat2.setTextureOffset(40, 30).addBox(-1.8F, -8.972F, -1.8F, 3.0F, 2.0F, 3.0F, 0.5F, false);
		hat2.setTextureOffset(0, 0).addBox(-0.88F, -10.812F, -0.88F, 1.0F, 1.0F, 1.0F, 0.5F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}