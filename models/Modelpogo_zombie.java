// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpogo_zombie extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;

	public Modelpogo_zombie() {
		textureWidth = 64;
		textureHeight = 64;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 10.0F, 4.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -12.0F, 0.0F);
		waist.addChild(body);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.6981F, 0.0F, 0.0F);
		body_r1.setTextureOffset(24, 24).addBox(4.0F, -1.3F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		body_r1.setTextureOffset(32, 0).addBox(-8.0F, -1.3F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.1396F, 0.0F, 0.0F);
		body_r2.setTextureOffset(0, 33).addBox(-4.3F, -8.7F, -9.3F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		body_r2.setTextureOffset(32, 11).addBox(-4.3F, -4.2F, -9.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		body_r2.setTextureOffset(44, 44).addBox(0.9F, -4.2F, -9.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		body_r2.setTextureOffset(16, 35).addBox(0.3F, -8.7F, -9.3F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.6807F, 0.0F, 0.0F);
		body_r3.setTextureOffset(32, 35).addBox(-4.4F, -8.7F, -12.3F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		body_r3.setTextureOffset(36, 18).addBox(0.3F, -8.7F, -12.3F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -0.0873F, 0.0F, 0.0F);
		body_r4.setTextureOffset(0, 16).addBox(-4.0F, -25.0F, -5.0F, 8.0F, 13.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(53, 14).addBox(-0.9F, -1.3F, -4.5F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(58, 15).addBox(-0.6F, -0.8F, -4.5F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(46, 8).addBox(-1.0F, -1.5F, -4.3F, 2.0F, 0.0F, 7.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(-1.0F, -1.4F, -0.1F);
		head.addChild(hat);
		setRotationAngle(hat, -0.0175F, -0.2618F, 0.0698F);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r1);
		setRotationAngle(hat_r1, 0.0F, -1.309F, -0.0349F);
		hat_r1.setTextureOffset(2, 2).addBox(-4.3F, -3.5F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(47, 0).addBox(-4.1F, -3.4F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(47, 0).addBox(-4.1F, -3.4F, -4.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(2, 4).addBox(-4.3F, -3.5F, -4.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(0, 0).addBox(-4.3F, -3.1F, -2.1F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(0, 0).addBox(-4.3F, -3.3F, -0.1F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		hat_r1.setTextureOffset(0, 0).addBox(-4.3F, -3.3F, -2.1F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		hat_r1.setTextureOffset(0, 0).addBox(-4.3F, -3.3F, 1.9F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		hat_r1.setTextureOffset(0, 0).addBox(-4.3F, -3.3F, -4.1F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		hat_r1.setTextureOffset(4, 0).addBox(-4.3F, -2.6F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		hat_r1.setTextureOffset(4, 2).addBox(-4.3F, -2.6F, -4.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		body.addChild(rightArm);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(5.0F, -1.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, -1.4312F, -0.0175F, 0.0F);
		rightArm_r1.setTextureOffset(0, 43).addBox(-7.5F, 2.4F, 2.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(5.0F, -1.0F, 0.0F);
		rightArm.addChild(rightItem);
		rightItem.setTextureOffset(20, 16).addBox(-7.0F, 4.0F, -9.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(24, 20).addBox(-2.4F, 3.8F, -9.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(40, 28).addBox(-2.0F, 2.7F, -10.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		rightItem.setTextureOffset(44, 34).addBox(-1.7F, 5.7F, -9.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		rightItem.setTextureOffset(24, 45).addBox(-1.0F, 6.7F, -9.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(0, 0).addBox(-0.7F, 17.7F, -8.8F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(2, 6).addBox(-0.7F, 22.7F, -8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(20, 17).addBox(-4.7F, 19.2F, -9.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(0, 4).addBox(-0.4F, 20.7F, -8.6F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		body.addChild(leftArm);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(-5.0F, -1.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, -1.4312F, -0.0175F, 0.0F);
		leftArm_r1.setTextureOffset(12, 45).addBox(4.1F, 3.4F, 2.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}