// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsnowmobile2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body0;
	private final ModelRenderer body1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;

	public Modelsnowmobile2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(0, 0).addBox(-10.0F, 8.0F, -14.0F, 3.0F, 1.0F, 13.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(7.0F, 8.0F, -14.0F, 3.0F, 1.0F, 13.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.0F, 4.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(8.0F, 4.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 14).addBox(-9.0F, 3.0F, -6.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(2.0F, -1.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 8.0F, 9.0F, 5.0F, 1.0F, 18.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 7.0F, 27.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-2.5F, 4.0F, 28.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 3.0F, 27.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 2.0F, 26.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 1.5F, 25.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 1.0F, 24.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 0.5F, 23.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 0.0F, 22.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, -0.5F, 21.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, -1.0F, 20.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 7.5F, 8.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 7.0F, 7.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 6.5F, 6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 6.0F, 5.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 5.5F, 4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 5.0F, 3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 4.5F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 4.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.5F, 0.5F, 0.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(-2.0F, 3.0F, 24.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(-2.0F, 4.0F, 27.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(-2.0F, 4.0F, 23.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(-2.0F, 3.0F, 9.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(-2.0F, 4.0F, 12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(-2.0F, 4.0F, 8.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(1.0F, 3.0F, 24.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(1.0F, 4.0F, 27.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(1.0F, 4.0F, 23.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(1.0F, 3.0F, 9.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(1.0F, 4.0F, 12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(8, 22).addBox(1.0F, 4.0F, 8.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 35).addBox(-1.0F, 5.5F, 9.0F, 2.0F, 1.0F, 17.0F, 0.0F, false);

		body0 = new ModelRenderer(this);
		body0.setRotationPoint(0.0F, 18.0F, -13.0F);
		setRotationAngle(body0, 0.7854F, 0.0F, 0.0F);
		body0.setTextureOffset(0, 53).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 5.0F, 17.0F, 0.0F, false);
		body0.setTextureOffset(4, 0).addBox(-10.0F, -1.8F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(4, 0).addBox(7.0F, -1.8F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(0, 75).addBox(-2.5F, -4.5F, 11.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		body0.setTextureOffset(24, 75).addBox(-3.5F, 1.0F, 10.0F, 7.0F, 7.0F, 6.0F, 0.0F, false);
		body0.setTextureOffset(0, 83).addBox(-0.5F, 9.0F, 12.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(4, 83).addBox(-0.5F, 20.0F, 20.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(8, 83).addBox(-0.5F, 15.0F, 20.0F, 1.0F, 5.0F, 1.0F, 0.35F, false);
		body0.setTextureOffset(0, 35).addBox(-3.5F, 24.0F, 32.0F, 7.0F, 5.0F, 1.0F, -0.01F, false);
		body0.setTextureOffset(12, 83).addBox(-1.0F, 2.0F, 15.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(0, 91).addBox(-1.0F, -2.0F, 16.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		body0.setTextureOffset(4, 89).addBox(-5.5F, -1.5F, 18.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		body0.setTextureOffset(18, 83).addBox(-3.0F, -2.0F, 18.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body0.setTextureOffset(18, 83).addBox(2.0F, -2.0F, 18.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 18.0F, -13.0F);
		setRotationAngle(body1, 0.1745F, 0.0F, 0.0F);
		body1.setTextureOffset(0, 91).addBox(-3.5F, 0.0F, 14.0F, 7.0F, 2.0F, 27.0F, 0.0F, false);
		body1.setTextureOffset(38, 0).addBox(-4.0F, -3.0F, 14.0F, 8.0F, 3.0F, 17.0F, 0.0F, false);
		body1.setTextureOffset(38, 20).addBox(-3.0F, 0.5F, 4.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		body1.setTextureOffset(38, 20).addBox(2.0F, 0.5F, 4.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		body1.setTextureOffset(60, 20).addBox(-6.5F, -7.0F, 8.0F, 3.0F, 10.0F, 7.0F, 0.0F, false);
		body1.setTextureOffset(60, 37).addBox(3.5F, -7.0F, 8.0F, 3.0F, 10.0F, 7.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-4.0F, 15.0F, 2.0F);
		leg0.setTextureOffset(18, 0).addBox(-15.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 15.0F, 2.0F);
		leg1.setTextureOffset(18, 0).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 15.0F, 1.0F);
		leg2.setTextureOffset(18, 0).addBox(-15.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 15.0F, 1.0F);
		leg3.setTextureOffset(18, 0).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 15.0F, 0.0F);
		leg4.setTextureOffset(18, 0).addBox(-15.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(4.0F, 15.0F, 0.0F);
		leg5.setTextureOffset(18, 0).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-4.0F, 15.0F, -1.0F);
		leg6.setTextureOffset(18, 0).addBox(-15.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(4.0F, 15.0F, -1.0F);
		leg7.setTextureOffset(18, 0).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}