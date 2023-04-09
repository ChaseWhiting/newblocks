// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrobot_searcher extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelrobot_searcher() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 32).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		bb_main.setTextureOffset(38, 2).addBox(-4.0F, -23.0F, -2.0F, 8.0F, 9.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(57, 20).addBox(2.0F, -21.0F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 19).addBox(2.0F, -22.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -14.5F, 0.5F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.877F, 0.9967F, 1.6741F);
		cube_r1.setTextureOffset(33, 16).addBox(-4.0F, -6.5F, 3.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -14.5F, 0.5F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(50, 34).addBox(-3.0F, -6.5F, 3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(60, 31).addBox(-1.0F, -6.5F, 3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -14.5F, 0.5F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9518F, -0.0297F, 0.5577F);
		cube_r3.setTextureOffset(56, 31).addBox(-1.0F, -1.5F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
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