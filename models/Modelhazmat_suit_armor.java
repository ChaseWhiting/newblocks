// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhazmat_suit_armor extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_shoe;
	private final ModelRenderer right_shoe;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;

	public Modelhazmat_suit_armor() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.1F, false);
		head.setTextureOffset(32, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.26F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

		left_shoe = new ModelRenderer(this);
		left_shoe.setRotationPoint(1.9F, 12.0F, 0.0F);
		left_shoe.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, true);

		right_shoe = new ModelRenderer(this);
		right_shoe.setRotationPoint(-1.9F, 12.0F, 0.0F);
		right_shoe.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_shoe.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_shoe.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}