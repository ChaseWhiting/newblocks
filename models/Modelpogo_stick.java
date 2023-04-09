// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpogo_stick extends EntityModel<Entity> {
	private final ModelRenderer rightItem;

	public Modelpogo_stick() {
		textureWidth = 64;
		textureHeight = 64;

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(0.0F, 0.0F, 6.0F);
		rightItem.setTextureOffset(20, 16).addBox(-7.0F, 4.0F, -9.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(24, 20).addBox(-2.4F, 3.8F, -9.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(40, 28).addBox(-2.0F, 2.7F, -10.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		rightItem.setTextureOffset(44, 34).addBox(-1.7F, 5.7F, -9.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		rightItem.setTextureOffset(24, 45).addBox(-1.0F, 6.7F, -9.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(0, 0).addBox(-0.7F, 17.7F, -8.8F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(2, 6).addBox(-0.7F, 22.7F, -8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(20, 17).addBox(-4.7F, 19.2F, -9.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);
		rightItem.setTextureOffset(0, 4).addBox(-0.4F, 20.7F, -8.6F, 1.0F, 4.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		rightItem.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}