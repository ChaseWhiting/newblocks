// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsculk_stabber extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelsculk_stabber() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.75F, 0.0F, -0.5F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
		cube_r1.setTextureOffset(0, 3).addBox(-6.0F, -13.0F, 0.0F, 14.0F, 13.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.75F, 0.0F, -0.5F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.setTextureOffset(0, 3).addBox(-7.0F, -13.0F, 1.0F, 14.0F, 13.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}