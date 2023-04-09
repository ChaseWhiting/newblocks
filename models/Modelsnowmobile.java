// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsnowmobile extends EntityModel<Entity> {
	private final ModelRenderer tire1;
	private final ModelRenderer tire2;
	private final ModelRenderer seat;
	private final ModelRenderer seat_handletype;
	private final ModelRenderer controller;
	private final ModelRenderer controller_3_r1;
	private final ModelRenderer controller_2_r1;
	private final ModelRenderer controller_1_r1;
	private final ModelRenderer seat_metal_bars;
	private final ModelRenderer front_2;
	private final ModelRenderer front_2_2_r1;
	private final ModelRenderer front_3_3_r1;
	private final ModelRenderer front_4_4_r1;
	private final ModelRenderer front_2_2_r2;
	private final ModelRenderer front_2_1_r1;
	private final ModelRenderer front_3;
	private final ModelRenderer front_3_3_r2;
	private final ModelRenderer front_4_4_r2;
	private final ModelRenderer front_3_3_r3;
	private final ModelRenderer front_3_3_r4;
	private final ModelRenderer front_2_2_r3;
	private final ModelRenderer seat_storage_container;
	private final ModelRenderer front;
	private final ModelRenderer front_7_r1;
	private final ModelRenderer front_5_r1;
	private final ModelRenderer front_4_r1;
	private final ModelRenderer front_3_r1;

	public Modelsnowmobile() {
		textureWidth = 64;
		textureHeight = 32;

		tire1 = new ModelRenderer(this);
		tire1.setRotationPoint(0.0F, 24.0F, 0.0F);
		tire1.setTextureOffset(0, 9).addBox(-1.0F, -5.0F, 1.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		tire2 = new ModelRenderer(this);
		tire2.setRotationPoint(0.0F, 24.0F, -4.25F);
		tire2.setTextureOffset(0, 9).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		seat = new ModelRenderer(this);
		seat.setRotationPoint(0.0F, 24.0F, 0.0F);
		seat.setTextureOffset(38, 0).addBox(2.0F, -7.25F, -7.0F, 1.0F, 3.0F, 12.0F, 0.0F, false);
		seat.setTextureOffset(38, 0).addBox(-3.0F, -7.25F, -7.0F, 1.0F, 3.0F, 12.0F, 0.0F, false);
		seat.setTextureOffset(32, 0).addBox(-2.0F, -7.25F, -7.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		seat_handletype = new ModelRenderer(this);
		seat_handletype.setRotationPoint(0.0F, -5.5F, 5.75F);
		seat.addChild(seat_handletype);
		setRotationAngle(seat_handletype, -0.1745F, 0.0F, 0.0F);
		seat_handletype.setTextureOffset(32, 0).addBox(1.75F, -5.8875F, -2.1433F, 1.0F, 5.0F, 1.0F, 0.03F, false);
		seat_handletype.setTextureOffset(32, 0).addBox(-2.75F, -5.8875F, -2.1433F, 1.0F, 5.0F, 1.0F, 0.03F, false);
		seat_handletype.setTextureOffset(32, 0).addBox(-2.0F, -5.8875F, -2.1433F, 4.0F, 1.0F, 1.0F, -0.0023F, false);

		controller = new ModelRenderer(this);
		controller.setRotationPoint(0.0F, -6.5F, -8.0F);
		seat.addChild(controller);
		setRotationAngle(controller, -1.1345F, 0.0F, 0.0F);

		controller_3_r1 = new ModelRenderer(this);
		controller_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		controller.addChild(controller_3_r1);
		setRotationAngle(controller_3_r1, 2.3209F, -1.4127F, -2.6871F);
		controller_3_r1.setTextureOffset(13, 0).addBox(-4.1158F, -3.2503F, -5.7402F, 1.0F, 1.0F, 5.0F, 0.0F, true);

		controller_2_r1 = new ModelRenderer(this);
		controller_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		controller.addChild(controller_2_r1);
		setRotationAngle(controller_2_r1, 2.2773F, 1.4127F, 2.6871F);
		controller_2_r1.setTextureOffset(13, 0).addBox(3.1158F, -3.2503F, -5.7402F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		controller_1_r1 = new ModelRenderer(this);
		controller_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		controller.addChild(controller_1_r1);
		setRotationAngle(controller_1_r1, -1.0908F, 0.0F, 0.0F);
		controller_1_r1.setTextureOffset(13, 0).addBox(-2.0F, 1.8588F, -5.0434F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		seat_metal_bars = new ModelRenderer(this);
		seat_metal_bars.setRotationPoint(0.0F, -4.0F, 2.0F);
		seat.addChild(seat_metal_bars);
		seat_metal_bars.setTextureOffset(13, 18).addBox(4.5F, 1.0F, -8.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(4.5F, 0.6F, -9.0F, 1.0F, 1.0F, 6.0F, -0.02F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-5.5F, 0.6F, -9.0F, 1.0F, 1.0F, 6.0F, -0.02F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-5.5F, 1.0F, -8.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-0.5F, 1.5F, 1.0F, 5.0F, 1.0F, 1.0F, 0.2F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-0.5F, 1.5F, -4.0F, 5.0F, 1.0F, 1.0F, 0.2F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-4.5F, 1.5F, 1.0F, 5.0F, 1.0F, 1.0F, 0.2F, false);
		seat_metal_bars.setTextureOffset(13, 18).addBox(-4.5F, 1.5F, -4.0F, 5.0F, 1.0F, 1.0F, 0.2F, false);

		front_2 = new ModelRenderer(this);
		front_2.setRotationPoint(6.0F, 0.0F, -3.0F);
		seat_metal_bars.addChild(front_2);

		front_2_2_r1 = new ModelRenderer(this);
		front_2_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_2.addChild(front_2_2_r1);
		setRotationAngle(front_2_2_r1, 0.0436F, -1.4399F, 0.0F);
		front_2_2_r1.setTextureOffset(0, 6).addBox(-10.5F, 2.6F, -6.3F, 12.0F, 1.0F, 1.0F, -0.02F, false);

		front_3_3_r1 = new ModelRenderer(this);
		front_3_3_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
		front_2.addChild(front_3_3_r1);
		setRotationAngle(front_3_3_r1, 0.257F, 1.0217F, 1.1571F);
		front_3_3_r1.setTextureOffset(10, 6).addBox(1.75F, -2.4F, 2.15F, 1.0F, 1.0F, 3.0F, -0.07F, false);

		front_4_4_r1 = new ModelRenderer(this);
		front_4_4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_2.addChild(front_4_4_r1);
		setRotationAngle(front_4_4_r1, 0.1745F, -1.4399F, 0.0F);
		front_4_4_r1.setTextureOffset(7, 6).addBox(-5.5F, -0.65F, -2.8F, 1.0F, 1.0F, 6.0F, -0.03F, false);

		front_2_2_r2 = new ModelRenderer(this);
		front_2_2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_2.addChild(front_2_2_r2);
		setRotationAngle(front_2_2_r2, -0.257F, -1.0217F, 1.1571F);
		front_2_2_r2.setTextureOffset(10, 6).addBox(-4.25F, -1.4F, -8.65F, 1.0F, 1.0F, 3.0F, -0.07F, false);

		front_2_1_r1 = new ModelRenderer(this);
		front_2_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_2.addChild(front_2_1_r1);
		setRotationAngle(front_2_1_r1, 0.8727F, -1.4399F, 0.0F);
		front_2_1_r1.setTextureOffset(8, 6).addBox(-5.5F, -2.4F, -6.3F, 1.0F, 1.0F, 5.0F, -0.02F, false);

		front_3 = new ModelRenderer(this);
		front_3.setRotationPoint(-6.0F, 0.0F, -3.0F);
		seat_metal_bars.addChild(front_3);

		front_3_3_r2 = new ModelRenderer(this);
		front_3_3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_3.addChild(front_3_3_r2);
		setRotationAngle(front_3_3_r2, 0.0436F, 1.4399F, 0.0F);
		front_3_3_r2.setTextureOffset(0, 6).addBox(-1.5F, 2.6F, -6.3F, 12.0F, 1.0F, 1.0F, -0.02F, true);

		front_4_4_r2 = new ModelRenderer(this);
		front_4_4_r2.setRotationPoint(0.0F, 0.0F, -4.0F);
		front_3.addChild(front_4_4_r2);
		setRotationAngle(front_4_4_r2, 0.257F, -1.0217F, -1.1571F);
		front_4_4_r2.setTextureOffset(10, 6).addBox(-2.75F, -2.4F, 2.15F, 1.0F, 1.0F, 3.0F, -0.07F, true);

		front_3_3_r3 = new ModelRenderer(this);
		front_3_3_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_3.addChild(front_3_3_r3);
		setRotationAngle(front_3_3_r3, -0.257F, 1.0217F, -1.1571F);
		front_3_3_r3.setTextureOffset(10, 6).addBox(3.25F, -1.4F, -8.65F, 1.0F, 1.0F, 3.0F, -0.07F, true);

		front_3_3_r4 = new ModelRenderer(this);
		front_3_3_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_3.addChild(front_3_3_r4);
		setRotationAngle(front_3_3_r4, 0.1745F, 1.4399F, 0.0F);
		front_3_3_r4.setTextureOffset(7, 6).addBox(4.5F, -0.65F, -2.8F, 1.0F, 1.0F, 6.0F, -0.03F, true);

		front_2_2_r3 = new ModelRenderer(this);
		front_2_2_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_3.addChild(front_2_2_r3);
		setRotationAngle(front_2_2_r3, 0.8727F, 1.4399F, 0.0F);
		front_2_2_r3.setTextureOffset(8, 6).addBox(4.5F, -2.4F, -6.3F, 1.0F, 1.0F, 5.0F, -0.02F, true);

		seat_storage_container = new ModelRenderer(this);
		seat_storage_container.setRotationPoint(0.0F, -5.5F, 5.75F);
		seat.addChild(seat_storage_container);
		seat_storage_container.setTextureOffset(0, 0).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.54F, false);

		front = new ModelRenderer(this);
		front.setRotationPoint(0.0F, 20.0F, -6.0F);

		front_7_r1 = new ModelRenderer(this);
		front_7_r1.setRotationPoint(0.0F, -4.3F, -4.0F);
		front.addChild(front_7_r1);
		setRotationAngle(front_7_r1, -1.0472F, 0.0F, 0.0F);
		front_7_r1.setTextureOffset(45, 25).addBox(-1.0F, -3.7102F, 1.2408F, 1.0F, 1.0F, 6.0F, -0.12F, false);
		front_7_r1.setTextureOffset(45, 25).addBox(0.0F, -3.7102F, 1.2408F, 1.0F, 1.0F, 6.0F, -0.12F, false);

		front_5_r1 = new ModelRenderer(this);
		front_5_r1.setRotationPoint(0.0F, -4.3F, -4.0F);
		front.addChild(front_5_r1);
		setRotationAngle(front_5_r1, -0.2182F, 0.0F, 0.0F);
		front_5_r1.setTextureOffset(41, 22).addBox(-1.0F, -1.7102F, 1.2408F, 2.0F, 2.0F, 2.0F, 0.3F, false);

		front_4_r1 = new ModelRenderer(this);
		front_4_r1.setRotationPoint(0.0F, -4.3F, -4.0F);
		front.addChild(front_4_r1);
		setRotationAngle(front_4_r1, 0.3927F, 0.0F, 0.0F);
		front_4_r1.setTextureOffset(41, 22).addBox(-1.6F, -2.0102F, -4.2592F, 3.0F, 3.0F, 2.0F, 0.3F, false);

		front_3_r1 = new ModelRenderer(this);
		front_3_r1.setRotationPoint(0.0F, -4.3F, -4.0F);
		front.addChild(front_3_r1);
		setRotationAngle(front_3_r1, -1.2654F, 0.0F, 0.0F);
		front_3_r1.setTextureOffset(41, 22).addBox(-2.0F, -2.7102F, -2.2592F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		front_3_r1.setTextureOffset(41, 22).addBox(-2.0F, -2.7102F, -1.8592F, 2.0F, 6.0F, 3.0F, 0.01F, false);
		front_3_r1.setTextureOffset(41, 22).addBox(0.0F, -2.7102F, -1.8592F, 2.0F, 6.0F, 3.0F, 0.01F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		tire1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tire2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		seat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		front.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.tire1.rotateAngleZ = f4 / (180F / (float) Math.PI);
		this.tire2.rotateAngleZ = f4 / (180F / (float) Math.PI);
	}
}