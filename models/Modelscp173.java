// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp173 extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer leg;
	private final ModelRenderer leg2;
	private final ModelRenderer body2;
	private final ModelRenderer head;
	private final ModelRenderer arm3;
	private final ModelRenderer arm;
	private final ModelRenderer arm2;
	private final ModelRenderer arm4;

	public Modelscp173() {
		textureWidth = 128;
		textureHeight = 128;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -10.0F, 0.5F);
		waist.addChild(body);
		setRotationAngle(body, 0.2618F, 0.0F, 0.0F);
		body.setTextureOffset(27, 34).addBox(-5.0F, -10.0F, -3.5F, 10.0F, 10.0F, 7.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(2.8F, -11.5F, 0.0F);
		waist.addChild(leg);
		setRotationAngle(leg, 0.0F, 0.0F, -0.0349F);
		leg.setTextureOffset(60, 22).addBox(-1.9969F, 0.5F, -1.6F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.0F, -11.5F, 0.0F);
		waist.addChild(leg2);
		setRotationAngle(leg2, 0.0F, 0.0F, 0.0349F);
		leg2.setTextureOffset(58, 58).addBox(-1.7978F, 0.5F, -1.7F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, -20.0F, 0.5F);
		waist.addChild(body2);
		body2.setTextureOffset(0, 21).addBox(-4.995F, -11.7584F, -5.9639F, 10.0F, 13.0F, 7.0F, 0.01F, false);
		body2.setTextureOffset(34, 28).addBox(-3.995F, -12.7584F, -4.9639F, 8.0F, 1.0F, 5.0F, 0.0F, false);
		body2.setTextureOffset(38, 9).addBox(-2.995F, -13.7584F, -3.9639F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -14.1798F, -0.9807F);
		body2.addChild(head);
		setRotationAngle(head, -0.0524F, 0.0F, 0.0F);
		head.setTextureOffset(18, 51).addBox(4.005F, -13.4173F, -4.9551F, 1.0F, 12.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.995F, -13.4173F, -5.9551F, 10.0F, 12.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 124).addBox(-5.395F, -10.4173F, -6.0551F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 124).addBox(0.605F, -10.4173F, -6.0551F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(122, 125).addBox(0.605F, -6.4173F, -6.0551F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(116, 123).addBox(-1.595F, -9.8173F, -6.0551F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(116, 123).addBox(-1.495F, -6.5173F, -6.0551F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(116, 123).addBox(-1.495F, -5.0173F, -6.0551F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(122, 125).addBox(-4.395F, -6.4173F, -6.0551F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(29, 0).addBox(-5.995F, -1.4173F, -4.9551F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 41).addBox(-6.995F, -13.4173F, -4.9551F, 1.0F, 12.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(30, 13).addBox(-5.995F, -14.4173F, -4.9551F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(36, 51).addBox(-5.995F, -13.4173F, 3.0449F, 10.0F, 12.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(27, 22).addBox(-4.995F, -0.4173F, -3.9551F, 8.0F, 1.0F, 5.0F, 0.0F, false);

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(-5.0F, -29.0F, 1.0F);
		waist.addChild(arm3);
		setRotationAngle(arm3, 0.3491F, 0.0F, 0.0F);
		arm3.setTextureOffset(57, 0).addBox(-2.995F, -1.568F, -6.5422F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		arm = new ModelRenderer(this);
		arm.setRotationPoint(6.0F, -29.0F, 1.0F);
		waist.addChild(arm);
		setRotationAngle(arm, 0.3491F, 0.0F, 0.0F);
		arm.setTextureOffset(58, 46).addBox(-0.995F, -1.568F, -6.5422F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(6.0F, -29.0F, -3.0F);
		waist.addChild(arm2);
		arm2.setTextureOffset(58, 9).addBox(-1.0F, 0.5782F, -6.6629F, 3.0F, 3.0F, 5.0F, 0.001F, false);

		arm4 = new ModelRenderer(this);
		arm4.setRotationPoint(-7.0F, -28.2556F, -2.7786F);
		waist.addChild(arm4);
		arm4.setTextureOffset(10, 41).addBox(-0.99F, -0.1662F, -6.8843F, 3.0F, 3.0F, 5.0F, 0.005F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}