// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIndominus_rex extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body1;
	private final ModelRenderer body1_r1;
	private final ModelRenderer arm2;
	private final ModelRenderer arm2_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone10;
	private final ModelRenderer finger4;
	private final ModelRenderer finger4_r1;
	private final ModelRenderer finger4_r2;
	private final ModelRenderer finger5;
	private final ModelRenderer finger5_r1;
	private final ModelRenderer finger5_r2;
	private final ModelRenderer finger6;
	private final ModelRenderer finger6_r1;
	private final ModelRenderer finger6_r2;
	private final ModelRenderer arm1;
	private final ModelRenderer arm1_r1;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone8;
	private final ModelRenderer finger1;
	private final ModelRenderer finger1_r1;
	private final ModelRenderer finger1_r2;
	private final ModelRenderer finger3;
	private final ModelRenderer finger3_r1;
	private final ModelRenderer finger3_r2;
	private final ModelRenderer finger2;
	private final ModelRenderer finger2_r1;
	private final ModelRenderer finger2_r2;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer neck_r2;
	private final ModelRenderer neck_r3;
	private final ModelRenderer neck_r4;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer JAW;
	private final ModelRenderer JAW_r1;
	private final ModelRenderer JAW_r2;
	private final ModelRenderer JAW_r3;
	private final ModelRenderer JAW_r4;
	private final ModelRenderer JAW_r5;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail4;
	private final ModelRenderer Tail5;
	private final ModelRenderer Tail6;
	private final ModelRenderer Tail7;
	private final ModelRenderer Tail8;

	public ModelIndominus_rex() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(7.0F, 0.2F, 2.5F);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(-10.0F, 10.8F, -2.5F);
		leg1.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.2182F, 0.0F, 0.0F);
		leg1_r1.setTextureOffset(66, 25).addBox(-5.0F, -14.6F, -0.7F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-6.0F, 11.0F, -3.2F);
		leg1.addChild(bone2);

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-7.0F, 2.8F, 7.7F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.6981F, 0.0F, 0.0F);
		bone2_r1.setTextureOffset(0, 86).addBox(-1.5F, -7.7F, -3.4F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone2.addChild(bone3);

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-5.0F, 13.5F, -2.3F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, -0.2618F, 0.0F, 0.0F);
		bone3_r1.setTextureOffset(93, 98).addBox(-3.0F, -7.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone3.addChild(bone4);
		bone4.setTextureOffset(92, 31).addBox(-8.5F, 7.2F, -7.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-7.0F, 0.2F, 2.5F);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(15.0F, 10.8F, -2.5F);
		leg2.addChild(leg2_r1);
		setRotationAngle(leg2_r1, -0.2182F, 0.0F, 0.0F);
		leg2_r1.setTextureOffset(28, 63).addBox(-5.0F, -14.6F, -0.7F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(19.0F, 11.0F, -3.2F);
		leg2.addChild(bone5);

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-7.0F, 2.8F, 7.7F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.6981F, 0.0F, 0.0F);
		bone5_r1.setTextureOffset(23, 85).addBox(-1.5F, -7.7F, -3.4F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone5.addChild(bone6);

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-5.0F, 13.5F, -2.3F);
		bone6.addChild(bone6_r1);
		setRotationAngle(bone6_r1, -0.2618F, 0.0F, 0.0F);
		bone6_r1.setTextureOffset(0, 26).addBox(-3.0F, -7.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone6.addChild(bone7);
		bone7.setTextureOffset(90, 40).addBox(-8.5F, 7.2F, -7.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-11.0F, 3.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.0262F, 0.0F, 0.0F);
		body_r1.setTextureOffset(34, 23).addBox(11.0F, -16.0F, -2.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
		body_r1.setTextureOffset(46, 51).addBox(7.5F, -15.0F, -2.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
		body_r1.setTextureOffset(46, 52).addBox(14.5F, -15.0F, -2.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 26).addBox(5.5F, -14.0F, -2.0F, 11.0F, 14.0F, 12.0F, 0.0F, false);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(-6.0F, 3.0F, 0.0F);
		body.addChild(body1);

		body1_r1 = new ModelRenderer(this);
		body1_r1.setRotationPoint(12.0F, 0.0F, 0.0F);
		body1.addChild(body1_r1);
		setRotationAngle(body1_r1, 0.192F, 0.0F, 0.0F);
		body1_r1.setTextureOffset(34, 25).addBox(-3.0F, -14.75F, -11.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
		body1_r1.setTextureOffset(36, 50).addBox(-9.0F, -14.75F, -11.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
		body1_r1.setTextureOffset(34, 21).addBox(-6.0F, -15.75F, -11.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
		body1_r1.setTextureOffset(0, 0).addBox(-11.0F, -13.75F, -13.0F, 10.0F, 12.0F, 14.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(1.0F, -3.0F, -12.0F);
		body1.addChild(arm2);

		arm2_r1 = new ModelRenderer(this);
		arm2_r1.setRotationPoint(12.0F, 2.0F, -2.0F);
		arm2.addChild(arm2_r1);
		setRotationAngle(arm2_r1, 0.7854F, 0.3054F, 0.0F);
		arm2_r1.setTextureOffset(79, 97).addBox(-4.9F, -1.0F, 1.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(12.0F, 2.0F, 5.0F);
		arm2.addChild(bone9);

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.0F, 0.0F, -7.0F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -0.3927F, 0.3054F, 0.0F);
		bone9_r1.setTextureOffset(0, 69).addBox(-3.25F, -2.25F, 7.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);
		bone9_r1.setTextureOffset(16, 99).addBox(-4.5F, -2.25F, 5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(0.75F, 3.0F, -7.0F);
		bone9.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.3054F, 0.0873F);
		bone9_r2.setTextureOffset(64, 5).addBox(-5.5F, 1.75F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, -7.0F);
		bone9.addChild(bone10);

		finger4 = new ModelRenderer(this);
		finger4.setRotationPoint(-3.0F, 8.0F, 3.0F);
		bone10.addChild(finger4);

		finger4_r1 = new ModelRenderer(this);
		finger4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger4.addChild(finger4_r1);
		setRotationAngle(finger4_r1, 0.3491F, 0.3054F, 0.0F);
		finger4_r1.setTextureOffset(69, 64).addBox(-0.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger4_r2 = new ModelRenderer(this);
		finger4_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger4.addChild(finger4_r2);
		setRotationAngle(finger4_r2, 0.829F, 0.3054F, 0.0F);
		finger4_r2.setTextureOffset(4, 71).addBox(0.0F, 3.0F, -0.375F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger5 = new ModelRenderer(this);
		finger5.setRotationPoint(-3.75F, 7.25F, 3.5F);
		bone10.addChild(finger5);
		setRotationAngle(finger5, 0.0F, 0.0F, 0.2618F);

		finger5_r1 = new ModelRenderer(this);
		finger5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger5.addChild(finger5_r1);
		setRotationAngle(finger5_r1, 0.3491F, 0.3054F, 0.0F);
		finger5_r1.setTextureOffset(58, 69).addBox(-0.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger5_r2 = new ModelRenderer(this);
		finger5_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger5.addChild(finger5_r2);
		setRotationAngle(finger5_r2, 0.829F, 0.3054F, 0.0F);
		finger5_r2.setTextureOffset(20, 71).addBox(0.0F, 3.0F, -0.375F, 1.0F, 2.0F, 1.0F, 0.1F, false);

		finger6 = new ModelRenderer(this);
		finger6.setRotationPoint(-2.0F, 8.0F, 3.0F);
		bone10.addChild(finger6);
		setRotationAngle(finger6, 0.0F, 0.0F, -0.3054F);

		finger6_r1 = new ModelRenderer(this);
		finger6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger6.addChild(finger6_r1);
		setRotationAngle(finger6_r1, 0.3491F, 0.3054F, 0.0F);
		finger6_r1.setTextureOffset(54, 69).addBox(-0.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger6_r2 = new ModelRenderer(this);
		finger6_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger6.addChild(finger6_r2);
		setRotationAngle(finger6_r2, 0.829F, 0.3054F, 0.0F);
		finger6_r2.setTextureOffset(62, 65).addBox(0.0F, 3.0F, -0.375F, 1.0F, 2.0F, 1.0F, 0.1F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(11.0F, -3.0F, -12.0F);
		body1.addChild(arm1);

		arm1_r1 = new ModelRenderer(this);
		arm1_r1.setRotationPoint(-12.0F, 2.0F, -2.0F);
		arm1.addChild(arm1_r1);
		setRotationAngle(arm1_r1, 0.7854F, -0.3054F, 0.0F);
		arm1_r1.setTextureOffset(0, 0).addBox(1.7F, -1.0F, 1.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-12.0F, 2.0F, 5.0F);
		arm1.addChild(bone);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, -7.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.3927F, -0.3054F, 0.0F);
		bone_r1.setTextureOffset(62, 31).addBox(3.25F, -2.25F, 7.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(74, 47).addBox(2.0F, -2.25F, 5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-0.75F, 3.0F, -7.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, -0.3054F, -0.0873F);
		bone_r2.setTextureOffset(58, 33).addBox(4.5F, 1.75F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, -7.0F);
		bone.addChild(bone8);

		finger1 = new ModelRenderer(this);
		finger1.setRotationPoint(3.0F, 8.0F, 3.0F);
		bone8.addChild(finger1);

		finger1_r1 = new ModelRenderer(this);
		finger1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger1.addChild(finger1_r1);
		setRotationAngle(finger1_r1, 0.3491F, -0.3054F, 0.0F);
		finger1_r1.setTextureOffset(64, 47).addBox(-1.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger1_r2 = new ModelRenderer(this);
		finger1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger1.addChild(finger1_r2);
		setRotationAngle(finger1_r2, 0.829F, -0.3054F, 0.0F);
		finger1_r2.setTextureOffset(68, 47).addBox(-1.0F, 3.0F, -0.375F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger3 = new ModelRenderer(this);
		finger3.setRotationPoint(3.75F, 7.25F, 3.5F);
		bone8.addChild(finger3);
		setRotationAngle(finger3, 0.0F, 0.0F, -0.2618F);

		finger3_r1 = new ModelRenderer(this);
		finger3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger3.addChild(finger3_r1);
		setRotationAngle(finger3_r1, 0.3491F, -0.3054F, 0.0F);
		finger3_r1.setTextureOffset(10, 0).addBox(-1.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger3_r2 = new ModelRenderer(this);
		finger3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger3.addChild(finger3_r2);
		setRotationAngle(finger3_r2, 0.829F, -0.3054F, 0.0F);
		finger3_r2.setTextureOffset(38, 0).addBox(-1.0F, 3.0F, -0.375F, 1.0F, 2.0F, 1.0F, 0.1F, false);

		finger2 = new ModelRenderer(this);
		finger2.setRotationPoint(2.0F, 8.0F, 3.0F);
		bone8.addChild(finger2);
		setRotationAngle(finger2, 0.0F, 0.0F, 0.3054F);

		finger2_r1 = new ModelRenderer(this);
		finger2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger2.addChild(finger2_r1);
		setRotationAngle(finger2_r1, 0.3491F, -0.3054F, 0.0F);
		finger2_r1.setTextureOffset(0, 0).addBox(-1.05F, -0.3F, 1.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);

		finger2_r2 = new ModelRenderer(this);
		finger2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger2.addChild(finger2_r2);
		setRotationAngle(finger2_r2, 0.829F, -0.3054F, 0.0F);
		finger2_r2.setTextureOffset(34, 0).addBox(-1.0F, 3.0F, -0.375F, 1.0F, 2.0F, 1.0F, 0.1F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(6.0F, 20.0F, -4.0F);
		body1.addChild(neck);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-3.0F, -30.0F, -9.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.2618F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(0, 51).addBox(3.0F, -7.2F, -12.25F, 0.0F, 5.0F, 4.0F, 0.0F, false);
		neck_r1.setTextureOffset(63, 90).addBox(0.0F, -4.2F, -12.25F, 6.0F, 7.0F, 4.0F, 0.0F, false);

		neck_r2 = new ModelRenderer(this);
		neck_r2.setRotationPoint(-3.0F, -30.0F, -9.0F);
		neck.addChild(neck_r2);
		setRotationAngle(neck_r2, -0.5236F, 0.0F, 0.0F);
		neck_r2.setTextureOffset(34, 0).addBox(3.0F, -5.0F, -8.75F, 0.0F, 4.0F, 3.0F, 0.0F, false);
		neck_r2.setTextureOffset(38, 98).addBox(-0.05F, -2.0F, -8.75F, 6.0F, 7.0F, 3.0F, 0.0F, false);

		neck_r3 = new ModelRenderer(this);
		neck_r3.setRotationPoint(-1.5F, -30.0F, -9.0F);
		neck.addChild(neck_r3);
		setRotationAngle(neck_r3, -0.3927F, 0.0F, 0.0F);
		neck_r3.setTextureOffset(89, 89).addBox(-1.0F, 3.0F, -11.5F, 5.0F, 3.0F, 6.0F, 0.0F, false);

		neck_r4 = new ModelRenderer(this);
		neck_r4.setRotationPoint(-1.45F, -30.0F, -9.0F);
		neck.addChild(neck_r4);
		setRotationAngle(neck_r4, -0.6981F, 0.0F, 0.0F);
		neck_r4.setTextureOffset(61, 61).addBox(-1.1F, 5.5F, -6.0F, 5.0F, 2.0F, 13.0F, 0.0F, false);
		neck_r4.setTextureOffset(62, 62).addBox(1.45F, -4.0F, -6.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
		neck_r4.setTextureOffset(34, 12).addBox(-1.55F, -1.0F, -6.0F, 6.0F, 7.0F, 14.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -36.75F, -20.2F);
		neck.addChild(head);
		setRotationAngle(head, 0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(84, 61).addBox(-3.5F, -0.4578F, -5.7087F, 7.0F, 5.0F, 6.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.0F, 0.8422F, -10.8087F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.8727F, 0.0F, 0.0F);
		head_r1.setTextureOffset(54, 5).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-1.0F, 0.6922F, -9.8087F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.6109F, 0.0F, 0.0F);
		head_r2.setTextureOffset(26, 55).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-1.0F, 0.6922F, -8.6087F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.6109F, 0.0F, 0.0F);
		head_r3.setTextureOffset(26, 57).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(2.0F, 0.2922F, -6.3587F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.5672F, 0.0F, 0.3491F);
		head_r4.setTextureOffset(58, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-1.0F, 0.6922F, -7.6087F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.6109F, 0.0F, 0.0F);
		head_r5.setTextureOffset(26, 59).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-2.0F, 0.2922F, -6.3587F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.5672F, 0.0F, -0.3491F);
		head_r6.setTextureOffset(90, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0F, 1.7922F, -13.6087F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.6545F, 0.0F, 0.0F);
		head_r7.setTextureOffset(60, 19).addBox(-3.0F, -0.15F, -0.45F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(0.05F, 0.7922F, -0.6087F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.0436F, 0.0F, 0.0F);
		head_r8.setTextureOffset(34, 13).addBox(-3.1F, 3.725F, -13.5F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		head_r8.setTextureOffset(54, 0).addBox(-3.1F, 0.575F, -13.5F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		head_r8.setTextureOffset(41, 88).addBox(-3.1F, -1.425F, -10.65F, 6.0F, 5.0F, 5.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(-0.05F, 0.7922F, -0.6087F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, 0.0436F, 0.0F, -0.1745F);
		head_r9.setTextureOffset(46, 57).addBox(2.35F, 3.725F, -13.45F, 0.0F, 2.0F, 8.0F, 0.0F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(0.05F, 0.7922F, -0.6087F);
		head.addChild(head_r10);
		setRotationAngle(head_r10, 0.0436F, 0.0F, 0.1745F);
		head_r10.setTextureOffset(46, 59).addBox(-2.35F, 3.725F, -13.45F, 0.0F, 2.0F, 8.0F, 0.0F, false);

		JAW = new ModelRenderer(this);
		JAW.setRotationPoint(-0.3123F, 3.7922F, -1.6087F);
		head.addChild(JAW);

		JAW_r1 = new ModelRenderer(this);
		JAW_r1.setRotationPoint(0.5623F, -3.0F, 1.0F);
		JAW.addChild(JAW_r1);
		setRotationAngle(JAW_r1, -0.1571F, 0.0F, 0.0F);
		JAW_r1.setTextureOffset(0, 47).addBox(2.5F, 1.475F, -3.9F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		JAW_r1.setTextureOffset(26, 47).addBox(-3.0F, 1.475F, -3.9F, 0.0F, 3.0F, 5.0F, 0.0F, false);

		JAW_r2 = new ModelRenderer(this);
		JAW_r2.setRotationPoint(0.2623F, -3.0F, 1.0F);
		JAW.addChild(JAW_r2);
		setRotationAngle(JAW_r2, -0.1134F, 0.0F, 0.0F);
		JAW_r2.setTextureOffset(87, 76).addBox(-2.9F, 6.225F, -11.3F, 5.0F, 1.0F, 7.0F, 0.0F, false);

		JAW_r3 = new ModelRenderer(this);
		JAW_r3.setRotationPoint(0.3123F, -3.0F, 1.0F);
		JAW.addChild(JAW_r3);
		setRotationAngle(JAW_r3, 0.0175F, 0.0F, -0.1745F);
		JAW_r3.setTextureOffset(46, 30).addBox(-3.75F, 1.925F, -13.3F, 0.0F, 2.0F, 8.0F, 0.0F, false);

		JAW_r4 = new ModelRenderer(this);
		JAW_r4.setRotationPoint(0.3123F, -3.0F, 1.0F);
		JAW.addChild(JAW_r4);
		setRotationAngle(JAW_r4, 0.0175F, 0.0F, 0.1745F);
		JAW_r4.setTextureOffset(46, 32).addBox(3.75F, 1.925F, -13.3F, 0.0F, 2.0F, 8.0F, 0.0F, false);

		JAW_r5 = new ModelRenderer(this);
		JAW_r5.setRotationPoint(0.3123F, -3.0F, 1.0F);
		JAW.addChild(JAW_r5);
		setRotationAngle(JAW_r5, 0.0175F, 0.0F, 0.0F);
		JAW_r5.setTextureOffset(34, 0).addBox(-3.0F, 3.725F, -13.3F, 6.0F, 2.0F, 8.0F, 0.0F, false);
		JAW_r5.setTextureOffset(84, 0).addBox(-3.25F, 3.725F, -5.15F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(0.0F, -11.2F, 7.25F);
		body.addChild(Tail1);
		setRotationAngle(Tail1, -0.1803F, 0.0F, 0.0F);
		Tail1.setTextureOffset(36, 42).addBox(-4.5F, 0.2192F, 3.0335F, 9.0F, 10.0F, 10.0F, 0.0F, false);
		Tail1.setTextureOffset(34, 0).addBox(0.0F, -0.7808F, 3.0335F, 0.0F, 1.0F, 10.0F, 0.0F, false);

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 0.3F, 8.0F);
		Tail1.addChild(Tail2);
		setRotationAngle(Tail2, 0.0456F, 0.0F, 0.0F);
		Tail2.setTextureOffset(0, 52).addBox(-4.0F, 0.3571F, 3.0204F, 8.0F, 9.0F, 10.0F, 0.0F, false);
		Tail2.setTextureOffset(60, 10).addBox(0.0F, -0.6429F, 5.0204F, 0.0F, 1.0F, 8.0F, 0.0F, false);

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 0.3F, 8.0F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, 0.0911F, 0.0F, 0.0F);
		Tail3.setTextureOffset(60, 0).addBox(-3.5F, 0.6304F, 1.9753F, 7.0F, 8.0F, 10.0F, 0.0F, false);
		Tail3.setTextureOffset(0, 6).addBox(0.0F, -0.3696F, 4.9753F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		Tail4 = new ModelRenderer(this);
		Tail4.setRotationPoint(0.0F, 0.3F, 7.0F);
		Tail3.addChild(Tail4);
		setRotationAngle(Tail4, 0.0911F, 0.0F, 0.0F);
		Tail4.setTextureOffset(0, 71).addBox(-3.0F, 0.8985F, 2.9056F, 6.0F, 7.0F, 8.0F, 0.0F, false);
		Tail4.setTextureOffset(34, 6).addBox(0.0F, -0.1015F, 4.9056F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		Tail5 = new ModelRenderer(this);
		Tail5.setRotationPoint(0.0F, 0.3F, 7.0F);
		Tail4.addChild(Tail5);
		setRotationAngle(Tail5, -0.0456F, 0.0F, 0.0F);
		Tail5.setTextureOffset(69, 76).addBox(-2.5F, 0.7652F, 2.9435F, 5.0F, 6.0F, 8.0F, 0.0F, false);
		Tail5.setTextureOffset(0, 5).addBox(0.0F, -0.2348F, 3.9435F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		Tail6 = new ModelRenderer(this);
		Tail6.setRotationPoint(0.0F, 0.3F, 8.0F);
		Tail5.addChild(Tail6);
		setRotationAngle(Tail6, -0.063F, 0.0F, 0.0F);
		Tail6.setTextureOffset(84, 18).addBox(-2.0F, 0.5784F, 1.9859F, 4.0F, 5.0F, 8.0F, 0.0F, false);
		Tail6.setTextureOffset(0, 4).addBox(0.0F, -0.4216F, 2.9859F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		Tail7 = new ModelRenderer(this);
		Tail7.setRotationPoint(0.0F, 0.3F, 6.7F);
		Tail6.addChild(Tail7);
		setRotationAngle(Tail7, -0.1367F, 0.0F, 0.0F);
		Tail7.setTextureOffset(74, 47).addBox(-1.5F, 0.1662F, 2.0368F, 3.0F, 4.0F, 10.0F, 0.0F, false);
		Tail7.setTextureOffset(34, 2).addBox(0.0F, -0.8338F, 3.0368F, 0.0F, 1.0F, 9.0F, 0.0F, false);

		Tail8 = new ModelRenderer(this);
		Tail8.setRotationPoint(0.0F, 2.0F, 9.0F);
		Tail7.addChild(Tail8);
		setRotationAngle(Tail8, -0.1367F, 0.0F, 0.0F);
		Tail8.setTextureOffset(43, 74).addBox(-1.0F, -1.7491F, 1.0312F, 2.0F, 3.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}