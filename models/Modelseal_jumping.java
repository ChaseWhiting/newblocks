// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelseal_jumping extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer tail_fin;
	private final ModelRenderer tail_fin_r1;
	private final ModelRenderer right_fin;
	private final ModelRenderer right_fin_r1;
	private final ModelRenderer left_fin;
	private final ModelRenderer left_fin_r1;
	private final ModelRenderer back_fin;

	public Modelseal_jumping() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 21.0F, -3.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 2.0F, 2.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.3491F, 0.0F, 0.0F);
		head_r1.setTextureOffset(53, 15).addBox(-5.0F, -3.0F, -8.0F, 2.0F, 3.0F, 0.0F, 0.0F, false);
		head_r1.setTextureOffset(33, 17).addBox(2.0F, -3.0F, -8.0F, 2.0F, 3.0F, 0.0F, 0.0F, false);
		head_r1.setTextureOffset(44, 22).addBox(-3.0F, -5.0F, -8.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, -3.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -1.0F, 2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 14).addBox(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 9.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.5F, 3.0F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, 1.5F, -4.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, -0.3491F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, 5.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		tail_fin = new ModelRenderer(this);
		tail_fin.setRotationPoint(0.0F, 0.0F, 3.0F);
		tail.addChild(tail_fin);

		tail_fin_r1 = new ModelRenderer(this);
		tail_fin_r1.setRotationPoint(0.0F, 1.5F, -7.0F);
		tail_fin.addChild(tail_fin_r1);
		setRotationAngle(tail_fin_r1, -0.3491F, 0.0F, 0.0F);
		tail_fin_r1.setTextureOffset(18, 0).addBox(-4.0F, -3.0F, 9.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(4.5F, 24.0F, -2.0F);

		right_fin_r1 = new ModelRenderer(this);
		right_fin_r1.setRotationPoint(-6.5F, -4.5F, 0.0F);
		right_fin.addChild(right_fin_r1);
		setRotationAngle(right_fin_r1, -0.3491F, 0.0F, 0.0F);
		right_fin_r1.setTextureOffset(48, 0).addBox(-3.0F, -2.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(-4.5F, 24.0F, -2.0F);

		left_fin_r1 = new ModelRenderer(this);
		left_fin_r1.setRotationPoint(6.5F, -4.5F, 0.0F);
		left_fin.addChild(left_fin_r1);
		setRotationAngle(left_fin_r1, -0.3491F, 0.0F, 0.0F);
		left_fin_r1.setTextureOffset(48, 0).addBox(1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		back_fin = new ModelRenderer(this);
		back_fin.setRotationPoint(0.0F, 13.0F, -5.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_fin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}