// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltumbleweed extends EntityModel<Entity> {
	private final ModelRenderer group;

	public Modeltumbleweed() {
		textureWidth = 128;
		textureHeight = 128;

		group = new ModelRenderer(this);
		group.setRotationPoint(8.0F, 24.0F, -8.0F);
		group.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, -1.0F, 16.0F, 16.0F, 16.0F, -0.3F, false);
		group.setTextureOffset(0, 0).addBox(-17.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, -0.34F, false);
		group.setTextureOffset(0, 0).addBox(-15.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, -0.33F, false);
		group.setTextureOffset(0, 0).addBox(-17.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, -0.31F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, 1.0F, 16.0F, 16.0F, 16.0F, -0.32F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -17.0F, 0.0F, 16.0F, 16.0F, 16.0F, -0.35F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -15.0F, 0.0F, 16.0F, 16.0F, 16.0F, -0.33F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, -1.0F, false);
		group.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, -2.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		group.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}