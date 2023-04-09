// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelducktube_zombie extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer duckytube;
	private final ModelRenderer tail;

	public Modelducktube_zombie() {
		textureWidth = 64;
		textureHeight = 32;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -12.0F, 0.0F);
		waist.addChild(body);
		body.setTextureOffset(16, 16).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, 3.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(hat);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		body.addChild(rightArm);
		setRotationAngle(rightArm, 0.0F, 0.0F, 0.2618F);
		rightArm.setTextureOffset(40, 16).addBox(-0.153F, 8.6252F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		body.addChild(leftArm);
		setRotationAngle(leftArm, 0.0F, 0.0F, -0.2182F);
		leftArm.setTextureOffset(40, 16).addBox(-3.3808F, 8.7393F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		body.addChild(rightLeg);
		rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		body.addChild(leftLeg);
		leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		duckytube = new ModelRenderer(this);
		duckytube.setRotationPoint(0.0F, 24.0F, 0.0F);
		duckytube.setTextureOffset(40, 0).addBox(-5.5F, -5.0F, -5.0F, 11.0F, 4.0F, 10.0F, 0.24F, false);
		duckytube.setTextureOffset(24, 0).addBox(-2.0F, -8.0F, -8.0F, 4.0F, 4.0F, 3.0F, 0.4F, false);
		duckytube.setTextureOffset(56, 16).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.4F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -1.0F, 12.0F);
		duckytube.addChild(tail);
		setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
		tail.setTextureOffset(52, 0).addBox(-1.0F, -5.8748F, -7.847F, 2.0F, 1.0F, 4.0F, 0.4F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
		duckytube.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}