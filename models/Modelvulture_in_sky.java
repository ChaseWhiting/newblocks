// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelvulture_in_sky extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck0;
	private final ModelRenderer neck0_r1;
	private final ModelRenderer neck1;
	private final ModelRenderer neck1_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_tip;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_tip;
	private final ModelRenderer tail;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r1;

	public Modelvulture_in_sky() {
		textureWidth = 80;
		textureHeight = 80;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 20.75F, 1.0F);
		body.setTextureOffset(0, 24).addBox(-4.0F, -2.5F, -6.0F, 8.0F, 6.0F, 11.0F, 0.0F, false);

		neck0 = new ModelRenderer(this);
		neck0.setRotationPoint(0.0F, 1.0F, -6.0F);
		body.addChild(neck0);
		setRotationAngle(neck0, 0.3491F, 0.0F, 0.0F);

		neck0_r1 = new ModelRenderer(this);
		neck0_r1.setRotationPoint(0.0F, -3.4624F, -0.4482F);
		neck0.addChild(neck0_r1);
		setRotationAngle(neck0_r1, 1.3963F, 0.0F, 0.0F);
		neck0_r1.setTextureOffset(34, 12).addBox(-3.0F, -1.5376F, -5.5518F, 6.0F, 5.0F, 5.0F, 0.0F, false);

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, -0.4624F, -2.4482F);
		neck0.addChild(neck1);

		neck1_r1 = new ModelRenderer(this);
		neck1_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
		neck1.addChild(neck1_r1);
		setRotationAngle(neck1_r1, -0.0873F, 0.0F, 0.0F);
		neck1_r1.setTextureOffset(46, 34).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -2.0F);
		neck1.addChild(head);
		setRotationAngle(head, 0.0436F, 0.0F, 0.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -1.1299F, -2.9535F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.1309F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 24).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(15, 44).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-4.5F, -1.5F, -1.75F);
		body.addChild(right_wing);
		setRotationAngle(right_wing, 0.2528F, 0.1733F, 0.2402F);
		right_wing.setTextureOffset(0, 0).addBox(-11.0F, -0.5F, -5.25F, 12.0F, 2.0F, 10.0F, 0.0F, true);
		right_wing.setTextureOffset(3, 55).addBox(-11.0F, -0.5F, 4.75F, 12.0F, 0.0F, 3.0F, 0.0F, true);

		right_wing_tip = new ModelRenderer(this);
		right_wing_tip.setRotationPoint(-11.0F, 0.5F, -4.25F);
		right_wing.addChild(right_wing_tip);
		right_wing_tip.setTextureOffset(27, 24).addBox(-12.0F, -1.0F, -1.0F, 12.0F, 1.0F, 9.0F, 0.0F, true);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(4.5F, -1.5F, -1.75F);
		body.addChild(left_wing);
		setRotationAngle(left_wing, 0.2528F, -0.1733F, -0.2402F);
		left_wing.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -5.25F, 12.0F, 2.0F, 10.0F, 0.0F, false);
		left_wing.setTextureOffset(3, 55).addBox(-1.0F, -0.5F, 4.75F, 12.0F, 0.0F, 3.0F, 0.0F, false);

		left_wing_tip = new ModelRenderer(this);
		left_wing_tip.setRotationPoint(11.0F, 0.5F, -4.25F);
		left_wing.addChild(left_wing_tip);
		left_wing_tip.setTextureOffset(27, 24).addBox(0.0F, -1.0F, -1.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 5.0F);
		body.addChild(tail);
		tail.setTextureOffset(0, 41).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 4.0F, 0.1F, false);
		tail.setTextureOffset(30, 34).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 5.0F, 8.0F, 0.1F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 3.0F, 3.0F);
		body.addChild(right_leg);
		setRotationAngle(right_leg, 0.9163F, 0.0F, 0.0F);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(0.0F, -0.9779F, -1.0109F);
		right_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.2618F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 3.0F, 3.0F);
		body.addChild(left_leg);
		setRotationAngle(left_leg, 0.9163F, 0.0F, 0.0F);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(0.0F, -0.9779F, -1.0109F);
		left_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.2618F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}