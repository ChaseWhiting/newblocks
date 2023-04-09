// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp999 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer slime;
	private final ModelRenderer eye1;
	private final ModelRenderer eye2;
	private final ModelRenderer slime_arm;
	private final ModelRenderer slime_arm2;

	public Modelscp999() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);

		slime = new ModelRenderer(this);
		slime.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(slime);
		slime.setTextureOffset(0, 23).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 5.0F, 6.0F, 0.0F, false);
		slime.setTextureOffset(0, 0).addBox(3.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		slime.setTextureOffset(0, 5).addBox(-4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		slime.setTextureOffset(22, 28).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		slime.setTextureOffset(24, 17).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		slime.setTextureOffset(0, 34).addBox(-3.0F, -7.0F, -4.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		slime.setTextureOffset(14, 35).addBox(-3.0F, -7.0F, 3.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		slime.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		slime.setTextureOffset(0, 54).addBox(-5.0F, -1.5F, -5.0F, 10.0F, 0.0F, 10.0F, 0.0F, false);

		eye1 = new ModelRenderer(this);
		eye1.setRotationPoint(-4.0F, -7.0F, -1.5F);
		slime.addChild(eye1);
		setRotationAngle(eye1, 0.0F, 0.0F, -0.6109F);
		eye1.setTextureOffset(0, 19).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		eye2 = new ModelRenderer(this);
		eye2.setRotationPoint(4.0F, -7.0F, -1.5F);
		slime.addChild(eye2);
		setRotationAngle(eye2, 0.0F, 0.0F, 0.6109F);
		eye2.setTextureOffset(22, 24).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		slime_arm = new ModelRenderer(this);
		slime_arm.setRotationPoint(3.0F, -4.0F, -0.5F);
		all.addChild(slime_arm);
		setRotationAngle(slime_arm, 0.0F, 0.0F, 2.7925F);
		slime_arm.setTextureOffset(0, 13).addBox(-1.2817F, -3.4023F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		slime_arm2 = new ModelRenderer(this);
		slime_arm2.setRotationPoint(-4.0F, -4.5F, -0.5F);
		all.addChild(slime_arm2);
		setRotationAngle(slime_arm2, 0.0F, 0.0F, -2.7925F);
		slime_arm2.setTextureOffset(28, 35).addBox(-1.342F, -2.4397F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		all.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}