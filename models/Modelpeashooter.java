// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpeashooter extends EntityModel<Entity> {
	private final ModelRenderer peashooter;
	private final ModelRenderer leaves;
	private final ModelRenderer leaf1;
	private final ModelRenderer leaf1_r1;
	private final ModelRenderer leaf1_r2;
	private final ModelRenderer leaf2;
	private final ModelRenderer leaf2_r1;
	private final ModelRenderer leaf2_r2;
	private final ModelRenderer leaf3;
	private final ModelRenderer leaf3_r1;
	private final ModelRenderer leaf3_r2;
	private final ModelRenderer leaf4;
	private final ModelRenderer leaf4_r1;
	private final ModelRenderer leaf4_r2;
	private final ModelRenderer stem;
	private final ModelRenderer stem1;
	private final ModelRenderer stem1_r1;
	private final ModelRenderer stem2;
	private final ModelRenderer stem2_r1;
	private final ModelRenderer head;
	private final ModelRenderer snout;
	private final ModelRenderer upleaf;
	private final ModelRenderer upleaf_r1;
	private final ModelRenderer upleaf_r2;
	private final ModelRenderer base;

	public Modelpeashooter() {
		textureWidth = 48;
		textureHeight = 48;

		peashooter = new ModelRenderer(this);
		peashooter.setRotationPoint(0.0F, 24.0F, 0.0F);

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
		peashooter.addChild(leaves);

		leaf1 = new ModelRenderer(this);
		leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf1);

		leaf1_r1 = new ModelRenderer(this);
		leaf1_r1.setRotationPoint(3.0F, -3.0F, 0.0F);
		leaf1.addChild(leaf1_r1);
		setRotationAngle(leaf1_r1, 0.0F, 0.0F, 0.7854F);
		leaf1_r1.setTextureOffset(2, 39).addBox(0.4019F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 0.0F, false);

		leaf1_r2 = new ModelRenderer(this);
		leaf1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf1.addChild(leaf1_r2);
		setRotationAngle(leaf1_r2, 0.0F, 0.0F, -0.5236F);
		leaf1_r2.setTextureOffset(15, 36).addBox(0.0F, -0.7F, -1.05F, 4.0F, 0.0F, 2.0F, 0.0F, false);

		leaf2 = new ModelRenderer(this);
		leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf2);

		leaf2_r1 = new ModelRenderer(this);
		leaf2_r1.setRotationPoint(0.0F, -1.0F, 4.0F);
		leaf2.addChild(leaf2_r1);
		setRotationAngle(leaf2_r1, -0.4363F, 0.0F, 0.0F);
		leaf2_r1.setTextureOffset(2, 38).addBox(-0.8F, -0.4F, -0.2F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		leaf2_r2 = new ModelRenderer(this);
		leaf2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf2.addChild(leaf2_r2);
		setRotationAngle(leaf2_r2, 0.1745F, 0.0F, 0.0F);
		leaf2_r2.setTextureOffset(15, 37).addBox(-1.05F, -0.7F, 0.0F, 2.0F, 0.0F, 4.0F, 0.0F, false);

		leaf3 = new ModelRenderer(this);
		leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf3);

		leaf3_r1 = new ModelRenderer(this);
		leaf3_r1.setRotationPoint(-4.0F, -1.0F, 0.0F);
		leaf3.addChild(leaf3_r1);
		setRotationAngle(leaf3_r1, 0.0F, 0.0F, -0.5236F);
		leaf3_r1.setTextureOffset(2, 38).addBox(-1.4F, -0.5F, -0.8F, 2.0F, 0.0F, 1.0F, 0.0F, false);

		leaf3_r2 = new ModelRenderer(this);
		leaf3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf3.addChild(leaf3_r2);
		setRotationAngle(leaf3_r2, 0.0F, 0.0F, 0.2618F);
		leaf3_r2.setTextureOffset(15, 39).addBox(-4.2F, -0.7F, -1.05F, 4.0F, 0.0F, 2.0F, 0.0F, false);

		leaf4 = new ModelRenderer(this);
		leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf4);

		leaf4_r1 = new ModelRenderer(this);
		leaf4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf4.addChild(leaf4_r1);
		setRotationAngle(leaf4_r1, -0.4363F, 0.0F, 0.0F);
		leaf4_r1.setTextureOffset(15, 37).addBox(-1.05F, -0.7F, -4.2F, 2.0F, 0.0F, 4.0F, 0.0F, false);

		leaf4_r2 = new ModelRenderer(this);
		leaf4_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
		leaf4.addChild(leaf4_r2);
		setRotationAngle(leaf4_r2, 0.0873F, 0.0F, 0.0F);
		leaf4_r2.setTextureOffset(2, 38).addBox(-0.8F, -0.3F, -2.6358F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		stem = new ModelRenderer(this);
		stem.setRotationPoint(0.0F, 0.0F, 0.0F);
		peashooter.addChild(stem);

		stem1 = new ModelRenderer(this);
		stem1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(stem1);

		stem1_r1 = new ModelRenderer(this);
		stem1_r1.setRotationPoint(0.0F, -5.0F, 1.0F);
		stem1.addChild(stem1_r1);
		setRotationAngle(stem1_r1, 0.2618F, 0.0F, 0.0F);
		stem1_r1.setTextureOffset(8, 30).addBox(-0.7F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		stem2 = new ModelRenderer(this);
		stem2.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(stem2);

		stem2_r1 = new ModelRenderer(this);
		stem2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem2.addChild(stem2_r1);
		setRotationAngle(stem2_r1, -0.192F, 0.0F, 0.0F);
		stem2_r1.setTextureOffset(0, 0).addBox(-0.7F, -5.2F, -0.7F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, 0.0F);
		stem.addChild(head);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 7.0114F, 0.2615F);
		head.addChild(snout);
		snout.setTextureOffset(4, 30).addBox(-2.1F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(0, 30).addBox(1.2F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(10, 28).addBox(-2.0F, -12.8F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(0, 28).addBox(-2.0F, -9.1F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(0, 14).addBox(-1.8F, -12.4F, -6.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(19, 0).addBox(-1.51F, -11.8F, -6.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		upleaf = new ModelRenderer(this);
		upleaf.setRotationPoint(0.0F, 6.0114F, 3.2615F);
		head.addChild(upleaf);
		setRotationAngle(upleaf, 0.1745F, 0.0F, 0.0F);
		upleaf.setTextureOffset(22, 2).addBox(-0.65F, -11.2152F, 4.0263F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf_r1 = new ModelRenderer(this);
		upleaf_r1.setRotationPoint(0.0F, -9.6174F, 8.8038F);
		upleaf.addChild(upleaf_r1);
		setRotationAngle(upleaf_r1, -0.9599F, 0.0F, 0.0F);
		upleaf_r1.setTextureOffset(2, 38).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf_r2 = new ModelRenderer(this);
		upleaf_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf.addChild(upleaf_r2);
		setRotationAngle(upleaf_r2, -0.4363F, 0.0F, 0.0F);
		upleaf_r2.setTextureOffset(16, 38).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 7.0114F, 0.2615F);
		head.addChild(base);
		base.setTextureOffset(29, 0).addBox(-1.4F, -7.7F, -1.4F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		base.setTextureOffset(21, 7).addBox(-2.8F, -14.3F, -2.8F, 5.0F, 6.0F, 7.0F, 0.0F, false);
		base.setTextureOffset(0, 0).addBox(-2.8F, -13.8F, -3.8F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		base.setTextureOffset(0, 14).addBox(-3.4F, -13.9F, -3.2F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		base.setTextureOffset(22, 22).addBox(-3.9F, -13.7F, -2.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		peashooter.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}