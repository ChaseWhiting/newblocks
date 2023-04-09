// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrainbowfish extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer fin_top;
	private final ModelRenderer fin_bottom;
	private final ModelRenderer tail;
	private final ModelRenderer fin_left;
	private final ModelRenderer fin_right;

	public Modelrainbowfish() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.0F, 3.0F);
		body.setTextureOffset(0, 20).addBox(-1.0F, -3.0F, -9.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 1).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 5.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(-1.0F, 2.0F, -6.0F);
		body.addChild(right_fin);
		setRotationAngle(right_fin, 0.0F, 0.7854F, 0.0F);
		right_fin.setTextureOffset(2, 16).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(1.0F, 2.0F, -6.0F);
		body.addChild(left_fin);
		setRotationAngle(left_fin, 0.0F, -0.7854F, 0.0F);
		left_fin.setTextureOffset(2, 12).addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		fin_top = new ModelRenderer(this);
		fin_top.setRotationPoint(0.0F, 18.0F, 0.0F);
		fin_top.setTextureOffset(20, 11).addBox(0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);

		fin_bottom = new ModelRenderer(this);
		fin_bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		fin_bottom.setTextureOffset(20, 21).addBox(0.0F, 0.0F, -6.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.0F, 5.0F);
		tail.setTextureOffset(21, 16).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);

		fin_left = new ModelRenderer(this);
		fin_left.setRotationPoint(0.0F, 24.0F, 0.0F);

		fin_right = new ModelRenderer(this);
		fin_right.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_top.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_left.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_fin.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_fin.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}