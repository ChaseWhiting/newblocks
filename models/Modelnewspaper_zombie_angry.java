// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelnewspaper_zombie_angry extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hat2;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;

	public Modelnewspaper_zombie_angry() {
		textureWidth = 64;
		textureHeight = 64;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -12.0F, 0.0F);
		waist.addChild(body);
		body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		setRotationAngle(head, 0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, 0.0F, -1.0F);
		head.addChild(hat2);
		setRotationAngle(hat2, 0.2182F, 0.0F, 0.0F);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		body.addChild(rightArm);
		setRotationAngle(rightArm, -1.3963F, 0.0F, 0.0F);
		rightArm.setTextureOffset(36, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		body.addChild(leftArm);
		setRotationAngle(leftArm, -1.3963F, 0.0F, 0.0F);
		leftArm.setTextureOffset(36, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-7.0F, 7.0F, -8.0F);
		setRotationAngle(bone, 0.2182F, -0.3491F, -0.0873F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone2, 0.2182F, 0.4363F, 0.0873F);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(24, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(24, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
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