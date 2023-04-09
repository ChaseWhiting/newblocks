// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelphoenix_riding extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer saddle;
	private final ModelRenderer bone11;
	private final ModelRenderer bone5;
	private final ModelRenderer bone14;
	private final ModelRenderer lilwing;
	private final ModelRenderer lilwing2;
	private final ModelRenderer tail;
	private final ModelRenderer tail4;
	private final ModelRenderer tail3;
	private final ModelRenderer tail2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer brow2;
	private final ModelRenderer brow;
	private final ModelRenderer NECK;
	private final ModelRenderer NECK2;
	private final ModelRenderer body_sub_5;
	private final ModelRenderer bone;
	private final ModelRenderer fronhair;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg2;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg2;
	private final ModelRenderer hair_left_top;
	private final ModelRenderer hair_left_top_rotation;
	private final ModelRenderer bristle3;
	private final ModelRenderer hair_left_middle;
	private final ModelRenderer hair_left_middle_rotation;
	private final ModelRenderer hair_left_bottom;
	private final ModelRenderer hair_left_bottom_rotation;
	private final ModelRenderer bristle4;
	private final ModelRenderer hair_right_top;
	private final ModelRenderer hair_right_top_rotation;
	private final ModelRenderer bristle2;
	private final ModelRenderer hair_right_top_sub_2;
	private final ModelRenderer hair_right_middle;
	private final ModelRenderer hair_right_middle_rotation;
	private final ModelRenderer hair_right_bottom;
	private final ModelRenderer hair_right_bottom_rotation;
	private final ModelRenderer bristle1;
	private final ModelRenderer hair_right_bottom_sub_2;

	public Modelphoenix_riding() {
		textureWidth = 256;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.0F, 0.0F);
		body.setTextureOffset(128, 117).addBox(-5.5F, -6.0F, -2.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);

		saddle = new ModelRenderer(this);
		saddle.setRotationPoint(0.0F, -5.0F, 3.0F);
		body.addChild(saddle);
		saddle.setTextureOffset(0, 117).addBox(-5.5F, -1.0F, -5.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);
		saddle.setTextureOffset(0, 114).addBox(-5.5F, -2.0F, 2.0F, 11.0F, 1.0F, 2.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 28.0F, -3.0F);
		saddle.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.3491F, 0.0F);
		bone11.setTextureOffset(168, 108).addBox(9.5F, -35.0F, -16.0F, 0.0F, 6.0F, 14.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.0F, 28.0F, 0.0F);
		saddle.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.3491F, 0.0F);
		bone5.setTextureOffset(168, 108).addBox(-9.2F, -35.0F, -18.7F, 0.0F, 6.0F, 14.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 23.0F, 0.0F);
		body.addChild(bone14);
		bone14.setTextureOffset(58, 97).addBox(-7.0F, -16.0F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		bone14.setTextureOffset(0, 0).addBox(-8.0F, -26.0F, -8.0F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		bone14.setTextureOffset(1, 97).addBox(-7.0F, -28.0F, -8.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);

		lilwing = new ModelRenderer(this);
		lilwing.setRotationPoint(0.0F, 7.0F, 0.0F);
		body.addChild(lilwing);
		setRotationAngle(lilwing, 1.4399F, -1.309F, -1.5708F);
		lilwing.setTextureOffset(72, 88).addBox(-8.0747F, -9.657F, -9.287F, 11.0F, 9.0F, 0.0F, 0.0F, false);

		lilwing2 = new ModelRenderer(this);
		lilwing2.setRotationPoint(-7.75F, 9.0F, -11.0F);
		body.addChild(lilwing2);
		setRotationAngle(lilwing2, 1.6591F, 1.3017F, 1.8222F);
		lilwing2.setTextureOffset(72, 78).addBox(-14.0F, -9.0F, -2.3F, 11.0F, 9.0F, 0.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 7.0F, 6.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.2182F, 0.0F, 0.0F);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(16.75F, -3.1572F, -1.7161F);
		tail.addChild(tail4);
		setRotationAngle(tail4, -0.1329F, -0.173F, -0.1079F);
		tail4.setTextureOffset(96, 68).addBox(-22.3272F, -7.4618F, 6.0511F, 7.0F, 0.0F, 9.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(-1.0F, 0.0276F, 1.0304F);
		tail.addChild(tail3);
		setRotationAngle(tail3, -0.0519F, 0.346F, 0.258F);
		tail3.setTextureOffset(96, 77).addBox(-1.1906F, -8.0914F, 0.217F, 7.0F, 0.0F, 9.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.0873F, 0.0F, 0.0F);
		tail2.setTextureOffset(92, 95).addBox(0.0F, -14.2F, 0.2F, 0.0F, 9.0F, 18.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(bone4);
		bone4.setTextureOffset(57, 60).addBox(-7.5F, -6.0F, -0.8F, 15.0F, 0.0F, 18.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -9.0F, -9.0F);
		body.addChild(bone2);
		bone2.setTextureOffset(64, 0).addBox(-4.0F, -6.7F, -5.2F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		bone2.setTextureOffset(81, 30).addBox(0.0F, -9.7F, 0.8F, 0.0F, 12.0F, 9.0F, 0.0F, false);
		bone2.setTextureOffset(90, 17).addBox(-3.0F, -3.1F, -10.4F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 16.0F, 9.0F);
		bone2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.2618F, 0.0F);
		bone7.setTextureOffset(81, 43).addBox(-4.1907F, -25.7011F, -7.4352F, 0.0F, 8.0F, 9.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 16.0F, 9.0F);
		bone2.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.2618F, 0.0F);
		bone6.setTextureOffset(81, 43).addBox(4.1907F, -25.7011F, -7.4352F, 0.0F, 8.0F, 9.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 13.75F, 11.25F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.1309F, 0.0F, 0.0F);
		bone3.setTextureOffset(64, 15).addBox(-3.2F, -22.1F, -20.4F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		bone3.setTextureOffset(58, 4).addBox(-3.2F, -20.8F, -21.3F, 6.0F, 3.0F, 1.0F, 0.0F, false);

		brow2 = new ModelRenderer(this);
		brow2.setRotationPoint(0.0F, 16.0F, 9.0F);
		bone2.addChild(brow2);
		setRotationAngle(brow2, 0.0873F, -0.1309F, -0.0873F);
		brow2.setTextureOffset(63, 29).addBox(-3.4198F, -26.6557F, -7.1931F, 0.0F, 7.0F, 9.0F, 0.0F, false);

		brow = new ModelRenderer(this);
		brow.setRotationPoint(0.0F, 16.0F, 9.0F);
		bone2.addChild(brow);
		setRotationAngle(brow, 0.0873F, 0.1309F, 0.0873F);
		brow.setTextureOffset(63, 29).addBox(3.4198F, -26.6557F, -7.1931F, 0.0F, 7.0F, 9.0F, 0.0F, false);

		NECK = new ModelRenderer(this);
		NECK.setRotationPoint(8.0F, 4.0F, 9.0F);
		bone2.addChild(NECK);
		setRotationAngle(NECK, 0.0F, 0.0F, 1.0908F);
		NECK.setTextureOffset(16, 31).addBox(-8.5968F, 0.9922F, -14.4F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		NECK2 = new ModelRenderer(this);
		NECK2.setRotationPoint(-2.0F, 4.0F, 9.0F);
		bone2.addChild(NECK2);
		setRotationAngle(NECK2, 0.0F, 0.0F, -1.0908F);

		body_sub_5 = new ModelRenderer(this);
		body_sub_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		NECK2.addChild(body_sub_5);
		body_sub_5.setTextureOffset(16, 31).addBox(-6.1737F, -4.3299F, -14.4F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 2.0F, 3.25F);
		body.addChild(bone);
		setRotationAngle(bone, 0.5236F, 0.0F, 0.0F);
		bone.setTextureOffset(96, 0).addBox(-3.0F, -17.2F, -8.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		fronhair = new ModelRenderer(this);
		fronhair.setRotationPoint(-8.0F, 4.0F, 0.0F);
		body.addChild(fronhair);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(8.0F, 4.0F, -10.35F);
		fronhair.addChild(bone8);
		setRotationAngle(bone8, -0.1651F, 0.3077F, 0.0257F);
		bone8.setTextureOffset(58, 102).addBox(-7.9308F, -12.2933F, -1.8846F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(8.0F, 6.75F, 2.0F);
		fronhair.addChild(bone9);
		setRotationAngle(bone9, -0.2065F, -0.2221F, -0.0385F);
		bone9.setTextureOffset(58, 93).addBox(-2.3542F, -12.3263F, -13.9819F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(8.0F, 1.5F, -10.5F);
		fronhair.addChild(bone10);
		setRotationAngle(bone10, -0.2182F, 0.0F, 0.0F);
		bone10.setTextureOffset(72, 88).addBox(-4.0F, -6.0474F, 1.1329F, 8.0F, 9.0F, 0.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 7.0F, 0.0F);
		left_leg.setTextureOffset(0, 55).addBox(-8.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(-8.0F, 1.0F, 0.0F);
		left_leg.addChild(left_leg2);
		left_leg2.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		left_leg2.setTextureOffset(16, 45).addBox(-1.0F, 14.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg2.setTextureOffset(17, 53).addBox(-1.0F, 14.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		left_leg2.setTextureOffset(16, 49).addBox(1.0F, 14.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg2.setTextureOffset(16, 49).addBox(-3.0F, 14.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.0F, 7.0F, 0.0F);
		right_leg.setTextureOffset(0, 32).addBox(6.0F, 10.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(8.0F, 1.0F, 0.0F);
		right_leg.addChild(right_leg2);
		right_leg2.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		right_leg2.setTextureOffset(16, 45).addBox(-1.0F, 14.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg2.setTextureOffset(17, 53).addBox(-1.0F, 14.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		right_leg2.setTextureOffset(16, 49).addBox(1.0F, 14.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg2.setTextureOffset(16, 49).addBox(-3.0F, 14.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		hair_left_top = new ModelRenderer(this);
		hair_left_top.setRotationPoint(-8.0F, -5.0F, -8.0F);

		hair_left_top_rotation = new ModelRenderer(this);
		hair_left_top_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
		hair_left_top.addChild(hair_left_top_rotation);
		setRotationAngle(hair_left_top_rotation, 0.0F, 0.0F, 1.0472F);
		hair_left_top_rotation.setTextureOffset(4, 33).addBox(7.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		bristle3 = new ModelRenderer(this);
		bristle3.setRotationPoint(0.0F, 1.0F, 0.0F);
		hair_left_top_rotation.addChild(bristle3);
		bristle3.setTextureOffset(12, 47).addBox(-0.009F, 0.2835F, -8.0F, 14.0F, 0.0F, 20.0F, 0.0F, false);

		hair_left_middle = new ModelRenderer(this);
		hair_left_middle.setRotationPoint(-8.0F, -1.0F, -8.0F);

		hair_left_middle_rotation = new ModelRenderer(this);
		hair_left_middle_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
		hair_left_middle.addChild(hair_left_middle_rotation);
		setRotationAngle(hair_left_middle_rotation, 0.0F, 0.0F, 1.0472F);
		hair_left_middle_rotation.setTextureOffset(4, 49).addBox(0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		hair_left_bottom = new ModelRenderer(this);
		hair_left_bottom.setRotationPoint(-8.0F, 4.0F, -8.0F);

		hair_left_bottom_rotation = new ModelRenderer(this);
		hair_left_bottom_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
		hair_left_bottom.addChild(hair_left_bottom_rotation);
		setRotationAngle(hair_left_bottom_rotation, 0.0F, 0.0F, 1.0472F);
		hair_left_bottom_rotation.setTextureOffset(4, 65).addBox(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, false);

		bristle4 = new ModelRenderer(this);
		bristle4.setRotationPoint(0.0F, -4.0F, 3.0F);
		hair_left_bottom_rotation.addChild(bristle4);
		bristle4.setTextureOffset(9, 67).addBox(-2.0F, 2.4641F, -7.0F, 16.0F, 0.0F, 23.0F, 0.0F, false);

		hair_right_top = new ModelRenderer(this);
		hair_right_top.setRotationPoint(8.0F, -4.0F, -8.0F);

		hair_right_top_rotation = new ModelRenderer(this);
		hair_right_top_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
		hair_right_top.addChild(hair_right_top_rotation);
		setRotationAngle(hair_right_top_rotation, 0.0F, 0.0F, -1.0472F);
		hair_right_top_rotation.setTextureOffset(4, 33).addBox(-7.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		bristle2 = new ModelRenderer(this);
		bristle2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair_right_top_rotation.addChild(bristle2);

		hair_right_top_sub_2 = new ModelRenderer(this);
		hair_right_top_sub_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bristle2.addChild(hair_right_top_sub_2);
		hair_right_top_sub_2.setTextureOffset(12, 47).addBox(-13.616F, 0.933F, -8.0F, 14.0F, 0.0F, 20.0F, 0.0F, true);

		hair_right_middle = new ModelRenderer(this);
		hair_right_middle.setRotationPoint(8.0F, 0.0F, -8.0F);

		hair_right_middle_rotation = new ModelRenderer(this);
		hair_right_middle_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
		hair_right_middle.addChild(hair_right_middle_rotation);
		setRotationAngle(hair_right_middle_rotation, 0.0F, 0.0F, -1.0472F);
		hair_right_middle_rotation.setTextureOffset(4, 49).addBox(0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		hair_right_bottom = new ModelRenderer(this);
		hair_right_bottom.setRotationPoint(8.0F, 5.0F, -8.0F);

		hair_right_bottom_rotation = new ModelRenderer(this);
		hair_right_bottom_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
		hair_right_bottom.addChild(hair_right_bottom_rotation);
		setRotationAngle(hair_right_bottom_rotation, 0.0F, 0.0F, -1.0472F);
		hair_right_bottom_rotation.setTextureOffset(4, 65).addBox(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		bristle1 = new ModelRenderer(this);
		bristle1.setRotationPoint(0.0F, -5.0F, 0.0F);
		hair_right_bottom_rotation.addChild(bristle1);

		hair_right_bottom_sub_2 = new ModelRenderer(this);
		hair_right_bottom_sub_2.setRotationPoint(0.0F, 0.0F, 4.0F);
		bristle1.addChild(hair_right_bottom_sub_2);
		hair_right_bottom_sub_2.setTextureOffset(9, 67).addBox(-13.5F, 3.3301F, -8.0F, 16.0F, 0.0F, 23.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_left_top.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_left_middle.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_left_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_right_top.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_right_middle.render(matrixStack, buffer, packedLight, packedOverlay);
		hair_right_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.hair_right_bottom.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.hair_right_top.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.hair_left_bottom.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.tail2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail2.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.hair_left_top.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}