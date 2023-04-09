// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpenguin extends EntityModel<Entity> {
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;

	public Modelpenguin() {
		textureWidth = 64;
		textureHeight = 32;

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-1.1F, 23.0F, 2.0F);
		setRotationAngle(back_left_leg, 0.0002F, 0.0038F, -0.0001F);
		back_left_leg.setTextureOffset(48, 26).addBox(0.9608F, -0.0005F, -3.7493F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(1.1F, 23.0F, 3.0F);
		back_right_leg.setTextureOffset(48, 26).addBox(-4.0F, 0.0F, -4.75F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-1.1F, 14.0F, -5.0F);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(1.1F, 14.0F, -5.0F);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 14.5F, 9.0F);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 22.5F, 9.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, 0.5F);
		setRotationAngle(head, 1.5708F, 0.0F, 0.0F);
		head.setTextureOffset(28, 0).addBox(-1.9877F, -1.75F, 0.0003F, 4.0F, 4.0F, 4.0F, 0.25F, false);
		head.setTextureOffset(56, 0).addBox(-0.9877F, -4.0F, 0.7503F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 6.1F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 11.0F, -5.1F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0019F, 0.0F);
		rotation.setTextureOffset(0, 0).addBox(-2.9877F, -3.5F, -6.1497F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(3.0F, 17.0F, 1.0F);
		setRotationAngle(left_wing, 1.5708F, 0.0F, 0.0F);
		left_wing.setTextureOffset(52, 6).addBox(0.0123F, -1.5F, -4.2497F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-3.0F, 17.0F, 1.0F);
		setRotationAngle(right_wing, 1.5708F, 0.0F, 0.0F);
		right_wing.setTextureOffset(52, 6).addBox(-0.9877F, -1.5F, -4.2497F, 1.0F, 3.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		tail2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}