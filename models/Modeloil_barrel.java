// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeloil_barrel extends EntityModel<Entity> {
	private final ModelRenderer outline;
	private final ModelRenderer outline2_r1;
	private final ModelRenderer outline2_r2;
	private final ModelRenderer outline1_r1;
	private final ModelRenderer outline3;
	private final ModelRenderer outline3_r1;
	private final ModelRenderer outline5_r1;
	private final ModelRenderer outline4_r1;
	private final ModelRenderer outline3_r2;
	private final ModelRenderer outline2_r3;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Modeloil_barrel() {
		textureWidth = 32;
		textureHeight = 32;

		outline = new ModelRenderer(this);
		outline.setRotationPoint(0.0F, 24.0F, 0.0F);

		outline2_r1 = new ModelRenderer(this);
		outline2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline.addChild(outline2_r1);
		setRotationAngle(outline2_r1, -3.1416F, 0.829F, 3.1416F);
		outline2_r1.setTextureOffset(20, 13).addBox(5.0F, -14.0F, -2.5F, 1.0F, 14.0F, 5.0F, -0.3F, false);

		outline2_r2 = new ModelRenderer(this);
		outline2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline.addChild(outline2_r2);
		setRotationAngle(outline2_r2, 0.0F, 1.5708F, 0.0F);
		outline2_r2.setTextureOffset(0, 12).addBox(5.0F, -14.0F, -2.75F, 1.0F, 14.0F, 6.0F, -0.3F, false);

		outline1_r1 = new ModelRenderer(this);
		outline1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline.addChild(outline1_r1);
		setRotationAngle(outline1_r1, -3.1416F, 0.0873F, 3.1416F);
		outline1_r1.setTextureOffset(18, 12).addBox(5.0F, -14.0F, -3.25F, 1.0F, 14.0F, 6.0F, -0.3F, false);

		outline3 = new ModelRenderer(this);
		outline3.setRotationPoint(0.0F, 24.0F, 0.0F);

		outline3_r1 = new ModelRenderer(this);
		outline3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline3.addChild(outline3_r1);
		setRotationAngle(outline3_r1, -3.1416F, 0.829F, 3.1416F);
		outline3_r1.setTextureOffset(20, 13).addBox(-6.0F, -14.0F, -2.5F, 1.0F, 14.0F, 5.0F, -0.3F, true);

		outline5_r1 = new ModelRenderer(this);
		outline5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline3.addChild(outline5_r1);
		setRotationAngle(outline5_r1, 0.0F, 0.7418F, 0.0F);
		outline5_r1.setTextureOffset(20, 13).addBox(-6.25F, -14.0F, -2.5F, 1.0F, 14.0F, 5.0F, -0.3F, true);

		outline4_r1 = new ModelRenderer(this);
		outline4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline3.addChild(outline4_r1);
		setRotationAngle(outline4_r1, -3.1416F, -0.7418F, 3.1416F);
		outline4_r1.setTextureOffset(20, 13).addBox(-6.25F, -14.0F, -2.5F, 1.0F, 14.0F, 5.0F, -0.3F, true);

		outline3_r2 = new ModelRenderer(this);
		outline3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline3.addChild(outline3_r2);
		setRotationAngle(outline3_r2, -3.1416F, 0.0873F, 3.1416F);
		outline3_r2.setTextureOffset(18, 12).addBox(-6.0F, -14.0F, -2.75F, 1.0F, 14.0F, 6.0F, -0.3F, true);

		outline2_r3 = new ModelRenderer(this);
		outline2_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		outline3.addChild(outline2_r3);
		setRotationAngle(outline2_r3, 0.0F, 1.5708F, 0.0F);
		outline2_r3.setTextureOffset(18, 12).addBox(-6.0F, -14.0F, -3.25F, 1.0F, 14.0F, 6.0F, -0.3F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-1.75F, -13.5F, -5.25F, 5.0F, 2.0F, 5.0F, -0.0001F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.75F, -13.5F, 1.5F, 5.0F, 2.0F, 4.0F, -0.0001F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.75F, -2.5F, 1.5F, 5.0F, 2.0F, 4.0F, -0.0001F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.75F, -2.5F, -5.25F, 5.0F, 2.0F, 5.0F, -0.0001F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 11.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-5.5F, -13.5F, -2.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, -13.5F, -3.0F, 7.0F, 2.0F, 5.0F, -0.0002F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, -24.5F, -3.0F, 7.0F, 2.0F, 5.0F, -0.0002F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-5.5F, -24.5F, -2.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 11.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.829F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-2.0F, -13.5F, 1.75F, 4.0F, 2.0F, 4.0F, -0.03F, false);
		cube_r2.setTextureOffset(0, 0).addBox(-2.0F, -13.5F, -5.75F, 4.0F, 2.0F, 4.0F, -0.03F, true);
		cube_r2.setTextureOffset(0, 0).addBox(-2.0F, -24.5F, -5.75F, 4.0F, 2.0F, 4.0F, -0.03F, true);
		cube_r2.setTextureOffset(0, 0).addBox(-2.0F, -24.5F, 1.75F, 4.0F, 2.0F, 4.0F, -0.03F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 11.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.829F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-2.0F, -13.5F, 1.5F, 4.0F, 2.0F, 4.0F, -0.03F, true);
		cube_r3.setTextureOffset(0, 0).addBox(-2.0F, -24.5F, 1.75F, 4.0F, 2.0F, 4.0F, -0.03F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 11.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 2.3998F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(1.5F, -13.5F, -1.75F, 4.0F, 2.0F, 4.0F, -0.03F, false);
		cube_r4.setTextureOffset(0, 0).addBox(1.5F, -13.5F, -1.25F, 4.0F, 2.0F, 4.0F, -0.0032F, false);
		cube_r4.setTextureOffset(0, 0).addBox(1.5F, -24.5F, -1.25F, 4.0F, 2.0F, 4.0F, -0.0032F, false);
		cube_r4.setTextureOffset(0, 0).addBox(1.5F, -24.5F, -1.75F, 4.0F, 2.0F, 4.0F, -0.03F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		outline.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		outline3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}