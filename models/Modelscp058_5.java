// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp058_5 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r1_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer stinger;
	private final ModelRenderer stinger2;
	private final ModelRenderer stinger3;
	private final ModelRenderer stinger4;
	private final ModelRenderer stinger5;
	private final ModelRenderer stinger6;
	private final ModelRenderer stinger7;
	private final ModelRenderer stinger8;
	private final ModelRenderer stinger8_r1;
	private final ModelRenderer stinger8_r2;
	private final ModelRenderer stinger8_r3;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_r1;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_r1;

	public Modelscp058_5() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 26.5F, 9.0F);
		setRotationAngle(all, 0.6545F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -14.0F, 0.0F);
		all.addChild(body);
		setRotationAngle(body, -0.6981F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-2.5F, 4.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -1.5272F, 0.0F, 0.0F);
		body_r4.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 8.0F, 6.0F, -1.4F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -1.0472F, 0.0F, 0.0F);
		body_r5.setTextureOffset(0, 0).addBox(-3.0F, -9.0F, -5.25F, 6.0F, 8.0F, 6.0F, -0.8F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, -0.6545F, 0.0F, 0.0F);
		body_r6.setTextureOffset(0, 0).addBox(-3.0F, -13.5F, -2.25F, 6.0F, 8.0F, 6.0F, -0.6F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r7);
		setRotationAngle(body_r7, -0.3054F, 0.0F, 0.0F);
		body_r7.setTextureOffset(0, 0).addBox(-3.0F, -15.5F, 1.75F, 6.0F, 8.0F, 6.0F, -0.3F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 1.1345F, 0.0F, 0.0F);

		body_r1_r1 = new ModelRenderer(this);
		body_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body_r1.addChild(body_r1_r1);
		setRotationAngle(body_r1_r1, -0.7854F, 0.0F, 0.0F);
		body_r1_r1.setTextureOffset(0, 0).addBox(-3.0F, -25.5F, 9.25F, 6.0F, 8.0F, 6.0F, -0.6F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.6109F, 0.0F, 0.0F);
		body_r2.setTextureOffset(0, 0).addBox(-3.0F, -16.5F, 13.5F, 6.0F, 8.0F, 6.0F, -0.3F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.2182F, 0.0F, 0.0F);
		body_r3.setTextureOffset(0, 0).addBox(-3.0F, -17.5F, 8.5F, 6.0F, 8.0F, 6.0F, -0.1F, false);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, -5.0F, 0.0F);
		body.addChild(stinger);
		setRotationAngle(stinger, 2.4871F, 0.0F, 0.0F);
		stinger.setTextureOffset(8, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger2 = new ModelRenderer(this);
		stinger2.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger.addChild(stinger2);
		setRotationAngle(stinger2, -0.4363F, 0.0F, 0.0F);
		stinger2.setTextureOffset(0, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger3 = new ModelRenderer(this);
		stinger3.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger2.addChild(stinger3);
		setRotationAngle(stinger3, -0.3491F, 0.0F, 0.0F);
		stinger3.setTextureOffset(32, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger4 = new ModelRenderer(this);
		stinger4.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger3.addChild(stinger4);
		setRotationAngle(stinger4, -0.3491F, 0.0F, 0.0F);
		stinger4.setTextureOffset(24, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger5 = new ModelRenderer(this);
		stinger5.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger4.addChild(stinger5);
		setRotationAngle(stinger5, -0.2618F, 0.0F, 0.0F);
		stinger5.setTextureOffset(16, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger6 = new ModelRenderer(this);
		stinger6.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger5.addChild(stinger6);
		setRotationAngle(stinger6, -0.3491F, 0.0F, 0.0F);
		stinger6.setTextureOffset(8, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger7 = new ModelRenderer(this);
		stinger7.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger6.addChild(stinger7);
		setRotationAngle(stinger7, -0.3491F, 0.0F, 0.0F);
		stinger7.setTextureOffset(0, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger8 = new ModelRenderer(this);
		stinger8.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger7.addChild(stinger8);
		setRotationAngle(stinger8, -0.4363F, 0.0F, 0.0F);
		stinger8.setTextureOffset(32, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger8_r1 = new ModelRenderer(this);
		stinger8_r1.setRotationPoint(0.0F, 3.5834F, -1.6811F);
		stinger8.addChild(stinger8_r1);
		setRotationAngle(stinger8_r1, -1.1345F, 0.0F, 0.0F);
		stinger8_r1.setTextureOffset(16, 22).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, true);

		stinger8_r2 = new ModelRenderer(this);
		stinger8_r2.setRotationPoint(0.0F, 1.9F, -0.5F);
		stinger8.addChild(stinger8_r2);
		setRotationAngle(stinger8_r2, -0.3491F, 0.0F, 0.0F);
		stinger8_r2.setTextureOffset(36, 14).addBox(-1.0F, -0.9736F, -0.9809F, 2.0F, 3.0F, 3.0F, -0.49F, true);

		stinger8_r3 = new ModelRenderer(this);
		stinger8_r3.setRotationPoint(0.0F, 1.9F, -0.5F);
		stinger8.addChild(stinger8_r3);
		setRotationAngle(stinger8_r3, -0.6109F, 0.0F, 0.0F);
		stinger8_r3.setTextureOffset(24, 22).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, true);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_wing_r1 = new ModelRenderer(this);
		left_wing_r1.setRotationPoint(3.0F, -11.5F, -1.0F);
		left_wing.addChild(left_wing_r1);
		setRotationAngle(left_wing_r1, 0.3054F, 0.0F, 0.0F);
		left_wing_r1.setTextureOffset(52, 54).addBox(0.0F, -6.0F, 0.0F, 6.0F, 10.0F, 0.0F, 0.0F, true);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(0.0F, 24.0F, 0.0F);

		right_wing_r1 = new ModelRenderer(this);
		right_wing_r1.setRotationPoint(-3.0F, -11.5F, -1.0F);
		right_wing.addChild(right_wing_r1);
		setRotationAngle(right_wing_r1, 0.3054F, 0.0F, 0.0F);
		right_wing_r1.setTextureOffset(52, 54).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 10.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		all.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_wing_r1.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_wing_r1.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}