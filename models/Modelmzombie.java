// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmzombie extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer topbody;
	private final ModelRenderer head;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarm2;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightarm2;
	private final ModelRenderer bone;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftleg2;

	public Modelmzombie() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 0.0F);
		body.setTextureOffset(39, 39).addBox(-8.0F, -15.0F, -6.0F, 16.0F, 17.0F, 12.0F, 0.0F, false);

		topbody = new ModelRenderer(this);
		topbody.setRotationPoint(0.0F, -12.0F, 0.0F);
		body.addChild(topbody);
		setRotationAngle(topbody, 0.1745F, 0.0F, 0.0F);
		topbody.setTextureOffset(0, 0).addBox(-12.0F, -12.0F, -8.0F, 24.0F, 21.0F, 16.0F, 0.0F, false);
		topbody.setTextureOffset(62, 68).addBox(-7.0F, -12.0F, 8.0F, 14.0F, 18.0F, 10.0F, 0.0F, false);
		topbody.setTextureOffset(114, 10).addBox(-4.0F, -19.0F, 8.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		topbody.setTextureOffset(56, 116).addBox(-6.0F, -13.4196F, 1.7742F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		topbody.setTextureOffset(75, 6).addBox(4.0F, -13.4196F, 1.7742F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		topbody.setTextureOffset(39, 37).addBox(-13.0F, -8.0F, -9.0F, 26.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(0, 59).addBox(7.0F, -8.0F, 9.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		topbody.setTextureOffset(36, 73).addBox(-8.0F, -4.0F, 18.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(36, 75).addBox(-8.0F, -8.0F, 18.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(114, 89).addBox(7.0F, -4.0F, 9.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		topbody.setTextureOffset(64, 6).addBox(-8.0F, -8.0F, 9.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		topbody.setTextureOffset(11, 60).addBox(-8.0F, -4.0F, 9.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		topbody.setTextureOffset(98, 8).addBox(-11.0F, -8.0F, 9.0F, 22.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(98, 6).addBox(-11.0F, -4.0F, 9.0F, 22.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(110, 87).addBox(-9.0F, -8.0F, 10.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(110, 85).addBox(-9.0F, -4.0F, 10.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(64, 2).addBox(-13.0F, -8.0F, 8.0F, 26.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(64, 0).addBox(-13.0F, -4.0F, -9.0F, 26.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(64, 4).addBox(-13.0F, -4.0F, 8.0F, 26.0F, 1.0F, 1.0F, 0.0F, false);
		topbody.setTextureOffset(80, 6).addBox(-13.0F, -4.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		topbody.setTextureOffset(0, 73).addBox(-13.0F, -8.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		topbody.setTextureOffset(36, 80).addBox(12.0F, -8.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		topbody.setTextureOffset(18, 74).addBox(12.0F, -4.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -12.0F, -6.0F);
		topbody.addChild(head);
		setRotationAngle(head, -0.1745F, 0.0F, 0.0F);
		head.setTextureOffset(0, 113).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(114, 114).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(15.0F, -8.0F, 0.0F);
		topbody.addChild(leftarm);
		leftarm.setTextureOffset(0, 37).addBox(-3.0F, -3.0F, -3.0F, 7.0F, 15.0F, 7.0F, 0.0F, false);

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 12.0F, 0.0F);
		leftarm.addChild(leftarm2);
		setRotationAngle(leftarm2, -0.5236F, 0.0F, 0.0F);
		leftarm2.setTextureOffset(0, 91).addBox(-3.01F, -1.99F, -3.5459F, 7.0F, 15.0F, 7.0F, 0.01F, false);
		leftarm2.setTextureOffset(32, 115).addBox(-2.0F, 3.0F, -34.0F, 3.0F, 15.0F, 3.0F, 0.01F, false);
		leftarm2.setTextureOffset(0, 0).addBox(-1.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		leftarm2.setTextureOffset(3, 1).addBox(-1.0F, 15.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		leftarm2.setTextureOffset(0, 2).addBox(-1.0F, 15.0F, -35.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		leftarm2.setTextureOffset(3, 3).addBox(-1.0F, 5.0F, -35.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		leftarm2.setTextureOffset(44, 115).addBox(-2.0F, 3.0F, -25.0F, 3.0F, 15.0F, 3.0F, 0.01F, false);
		leftarm2.setTextureOffset(0, 37).addBox(-2.0F, 9.0F, -36.0F, 3.0F, 3.0F, 33.0F, 0.01F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-15.0F, -8.0F, 0.0F);
		topbody.addChild(rightarm);
		rightarm.setTextureOffset(93, 23).addBox(-4.0F, -3.0F, -3.0F, 7.0F, 15.0F, 7.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 12.0F, 0.0F);
		rightarm.addChild(rightarm2);
		setRotationAngle(rightarm2, -0.5236F, 0.0F, 0.0F);
		rightarm2.setTextureOffset(95, 45).addBox(-3.99F, -1.99F, -3.5459F, 7.0F, 15.0F, 7.0F, 0.01F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-6.0F, 5.0F, 0.0F);
		setRotationAngle(rightleg, -0.2182F, 0.0F, 0.0F);
		rightleg.setTextureOffset(28, 97).addBox(-3.0F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 9.0F, 0.0F);
		rightleg.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.3491F, 0.0F, 0.0F);
		rightleg2.setTextureOffset(62, 96).addBox(-2.99F, -1.3581F, -3.7488F, 7.0F, 12.0F, 8.0F, 0.01F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(6.0F, 5.0F, 0.0F);
		setRotationAngle(leftleg, -0.2182F, 0.0F, 0.0F);
		leftleg.setTextureOffset(110, 67).addBox(-4.0F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 9.0F, 0.0F);
		leftleg.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.3491F, 0.0F, 0.0F);
		leftleg2.setTextureOffset(92, 96).addBox(-3.99F, -1.3581F, -3.7488F, 7.0F, 12.0F, 8.0F, 0.01F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}