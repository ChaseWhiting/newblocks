// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspinosaurus extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer tail7;
	private final ModelRenderer tail8;
	private final ModelRenderer tail9;
	private final ModelRenderer arm3;
	private final ModelRenderer arm3_r1;
	private final ModelRenderer arm1a3;
	private final ModelRenderer arm1a3_r1;
	private final ModelRenderer arm1b3;
	private final ModelRenderer arm1b3_r1;
	private final ModelRenderer arm1b3_r2;
	private final ModelRenderer arm1b3_r3;
	private final ModelRenderer arm1b3_r4;
	private final ModelRenderer arm1b3_r5;
	private final ModelRenderer arm1b3_r6;
	private final ModelRenderer arm2;
	private final ModelRenderer arm2_r1;
	private final ModelRenderer arm1a2;
	private final ModelRenderer arm1a2_r1;
	private final ModelRenderer arm1b2;
	private final ModelRenderer arm1b2_r1;
	private final ModelRenderer arm1b2_r2;
	private final ModelRenderer arm1b2_r3;
	private final ModelRenderer arm1b2_r4;
	private final ModelRenderer arm1b2_r5;
	private final ModelRenderer arm1b2_r6;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer neck_r2;
	private final ModelRenderer neck_r3;
	private final ModelRenderer neck_r4;
	private final ModelRenderer neck_r5;
	private final ModelRenderer neck_r6;
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
	private final ModelRenderer jaw;
	private final ModelRenderer jaw_r1;
	private final ModelRenderer jaw_r2;
	private final ModelRenderer fin;

	public Modelspinosaurus() {
		textureWidth = 256;
		textureHeight = 256;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(9.0F, -2.8F, 5.5F);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(-13.0F, 9.3F, -7.25F);
		leg1.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.2182F, 0.0F, 0.0F);
		leg1_r1.setTextureOffset(58, 81).addBox(-6.0F, -14.0F, 1.0F, 6.0F, 16.0F, 9.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-9.0F, 14.0F, -6.2F);
		leg1.addChild(bone2);

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-7.0F, 0.6F, 7.7F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.6981F, 0.0F, 0.0F);
		bone2_r1.setTextureOffset(117, 79).addBox(-2.5F, -7.7F, -4.3F, 5.0F, 11.0F, 6.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone2.addChild(bone3);

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-5.0F, 13.5F, -2.3F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, -0.2618F, 0.0F, 0.0F);
		bone3_r1.setTextureOffset(92, 131).addBox(-4.0F, -8.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone3.addChild(bone7);
		bone7.setTextureOffset(69, 117).addBox(-9.5F, 7.2F, -9.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-9.0F, -2.8F, 5.5F);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(13.0F, 9.3F, -7.25F);
		leg2.addChild(leg2_r1);
		setRotationAngle(leg2_r1, -0.2182F, 0.0F, 0.0F);
		leg2_r1.setTextureOffset(0, 74).addBox(0.0F, -14.0F, 1.0F, 6.0F, 16.0F, 9.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(9.0F, 14.0F, -6.2F);
		leg2.addChild(bone4);

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(7.0F, 0.6F, 7.7F);
		bone4.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.6981F, 0.0F, 0.0F);
		bone4_r1.setTextureOffset(26, 117).addBox(-2.5F, -7.7F, -4.3F, 5.0F, 11.0F, 6.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone4.addChild(bone5);

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(5.0F, 13.5F, -2.3F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, -0.2618F, 0.0F, 0.0F);
		bone5_r1.setTextureOffset(0, 130).addBox(0.0F, -8.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(116, 8).addBox(4.5F, 7.2F, -9.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.0F, 4.0F);
		body.setTextureOffset(48, 0).addBox(-5.5F, -12.0F, -16.4F, 11.0F, 14.0F, 11.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(5.0F, -1.0F, -5.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0873F, 0.0F, 0.0F);
		body_r1.setTextureOffset(58, 58).addBox(-10.0F, -12.0F, -20.4F, 10.0F, 13.0F, 10.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.75F, -10.0F, -5.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.1571F, 0.0F, 0.0F);
		body_r2.setTextureOffset(21, 90).addBox(-9.5F, 10.9F, -18.1F, 9.0F, 4.0F, 9.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(5.25F, -10.0F, -5.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.0698F, 0.0F, 0.0F);
		body_r3.setTextureOffset(88, 88).addBox(-10.5F, 10.6F, -10.6F, 10.0F, 4.0F, 9.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(5.75F, -10.0F, -5.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 0.0175F, 0.0F, 0.0F);
		body_r4.setTextureOffset(0, 59).addBox(-11.5F, 11.7F, -2.6F, 11.0F, 3.0F, 11.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(6.0F, -1.0F, -5.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -0.1571F, 0.0F, 0.0F);
		body_r5.setTextureOffset(0, 0).addBox(-12.0F, -11.0F, -2.0F, 12.0F, 15.0F, 12.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -12.14F, 6.5F);
		body.addChild(tail2);
		setRotationAngle(tail2, -0.1571F, 0.0F, 0.0F);
		tail2.setTextureOffset(68, 25).addBox(-5.0F, 2.0F, 0.0F, 10.0F, 13.0F, 8.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.2F, 5.5F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.0349F, 0.0F, 0.0F);
		tail3.setTextureOffset(92, 0).addBox(-4.5F, 2.0F, 2.0F, 9.0F, 11.0F, 6.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.2F, 5.41F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, 0.0524F, 0.0F, 0.0F);
		tail4.setTextureOffset(104, 63).addBox(-4.0F, 2.0F, 2.05F, 8.0F, 10.0F, 6.0F, 0.0F, false);

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.19F, 5.44F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.0349F, 0.0F, 0.0F);
		tail5.setTextureOffset(109, 109).addBox(-3.5F, 2.0F, 2.0F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(0.0F, 0.2F, 6.78F);
		tail5.addChild(tail6);
		setRotationAngle(tail6, 0.0524F, 0.0F, 0.0F);
		tail6.setTextureOffset(0, 99).addBox(-3.0F, 2.0F, 0.85F, 6.0F, 8.0F, 9.0F, 0.0F, false);

		tail7 = new ModelRenderer(this);
		tail7.setRotationPoint(0.0F, 0.29F, 7.5F);
		tail6.addChild(tail7);
		setRotationAngle(tail7, -0.0175F, 0.0F, 0.0F);
		tail7.setTextureOffset(52, 109).addBox(-2.5F, 2.0F, 1.85F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		tail8 = new ModelRenderer(this);
		tail8.setRotationPoint(0.0F, 0.18F, 7.9F);
		tail7.addChild(tail8);
		setRotationAngle(tail8, -0.0873F, 0.0F, 0.0F);
		tail8.setTextureOffset(0, 116).addBox(-2.0F, 2.0F, 1.85F, 4.0F, 5.0F, 9.0F, 0.0F, false);

		tail9 = new ModelRenderer(this);
		tail9.setRotationPoint(0.0F, 0.2F, 8.9F);
		tail8.addChild(tail9);
		setRotationAngle(tail9, -0.0873F, 0.0F, 0.0F);
		tail9.setTextureOffset(84, 67).addBox(-1.5F, 2.0F, 1.85F, 3.0F, 4.0F, 14.0F, 0.0F, false);

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(-1.5F, -1.0F, -21.0F);
		body.addChild(arm3);

		arm3_r1 = new ModelRenderer(this);
		arm3_r1.setRotationPoint(-5.0F, 1.0F, -4.0F);
		arm3.addChild(arm3_r1);
		setRotationAngle(arm3_r1, 0.5236F, -0.0436F, 0.1745F);
		arm3_r1.setTextureOffset(74, 128).addBox(-1.5F, -1.0F, 0.25F, 4.0F, 8.0F, 5.0F, 0.0F, false);

		arm1a3 = new ModelRenderer(this);
		arm1a3.setRotationPoint(-5.0F, 6.0F, 2.0F);
		arm3.addChild(arm1a3);

		arm1a3_r1 = new ModelRenderer(this);
		arm1a3_r1.setRotationPoint(0.0F, -5.0F, -6.0F);
		arm1a3.addChild(arm1a3_r1);
		setRotationAngle(arm1a3_r1, -0.48F, 0.0F, -0.0873F);
		arm1a3_r1.setTextureOffset(16, 131).addBox(-2.25F, 0.0F, 5.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		arm1b3 = new ModelRenderer(this);
		arm1b3.setRotationPoint(1.5F, 14.5F, -5.5F);
		arm1a3.addChild(arm1b3);
		setRotationAngle(arm1b3, 0.0F, -0.6545F, 0.0F);

		arm1b3_r1 = new ModelRenderer(this);
		arm1b3_r1.setRotationPoint(12.1F, -20.0F, -8.3F);
		arm1b3.addChild(arm1b3_r1);
		setRotationAngle(arm1b3_r1, 0.0F, 0.0F, -0.48F);
		arm1b3_r1.setTextureOffset(5, 59).addBox(-17.025F, 7.8F, 11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b3_r1.setTextureOffset(40, 10).addBox(-17.025F, 6.8F, 11.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);

		arm1b3_r2 = new ModelRenderer(this);
		arm1b3_r2.setRotationPoint(12.1F, -20.0F, -8.3F);
		arm1b3.addChild(arm1b3_r2);
		setRotationAngle(arm1b3_r2, 0.0F, 0.0F, -0.2618F);
		arm1b3_r2.setTextureOffset(33, 59).addBox(-15.15F, 7.0F, 11.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);

		arm1b3_r3 = new ModelRenderer(this);
		arm1b3_r3.setRotationPoint(0.9F, -19.5F, 3.1F);
		arm1b3.addChild(arm1b3_r3);
		setRotationAngle(arm1b3_r3, -1.0472F, -0.3054F, -0.2618F);
		arm1b3_r3.setTextureOffset(24, 31).addBox(-5.125F, 9.15F, 6.925F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b3_r3.setTextureOffset(44, 10).addBox(-5.125F, 8.15F, 6.925F, 1.0F, 1.0F, 1.0F, 0.2F, false);

		arm1b3_r4 = new ModelRenderer(this);
		arm1b3_r4.setRotationPoint(0.0F, -20.0F, 5.0F);
		arm1b3.addChild(arm1b3_r4);
		setRotationAngle(arm1b3_r4, -1.0472F, 0.0F, -0.2618F);
		arm1b3_r4.setTextureOffset(45, 59).addBox(-3.15F, 8.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);

		arm1b3_r5 = new ModelRenderer(this);
		arm1b3_r5.setRotationPoint(0.0F, -20.0F, 0.0F);
		arm1b3.addChild(arm1b3_r5);
		setRotationAngle(arm1b3_r5, -0.48F, 0.0F, -0.4363F);
		arm1b3_r5.setTextureOffset(49, 59).addBox(-6.075F, 13.25F, 5.55F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b3_r5.setTextureOffset(53, 59).addBox(-6.075F, 11.25F, 5.55F, 1.0F, 2.0F, 1.0F, 0.2F, false);

		arm1b3_r6 = new ModelRenderer(this);
		arm1b3_r6.setRotationPoint(0.0F, -20.0F, 0.0F);
		arm1b3.addChild(arm1b3_r6);
		setRotationAngle(arm1b3_r6, -0.48F, 0.0F, -0.1745F);
		arm1b3_r6.setTextureOffset(52, 0).addBox(-2.65F, 8.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.2F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(1.5F, -1.0F, -21.0F);
		body.addChild(arm2);

		arm2_r1 = new ModelRenderer(this);
		arm2_r1.setRotationPoint(5.0F, 1.0F, -4.0F);
		arm2.addChild(arm2_r1);
		setRotationAngle(arm2_r1, 0.5236F, 0.0436F, -0.1745F);
		arm2_r1.setTextureOffset(126, 56).addBox(-2.5F, -1.0F, 0.25F, 4.0F, 8.0F, 5.0F, 0.0F, false);

		arm1a2 = new ModelRenderer(this);
		arm1a2.setRotationPoint(5.0F, 6.0F, 2.0F);
		arm2.addChild(arm1a2);

		arm1a2_r1 = new ModelRenderer(this);
		arm1a2_r1.setRotationPoint(0.0F, -5.0F, -6.0F);
		arm1a2.addChild(arm1a2_r1);
		setRotationAngle(arm1a2_r1, -0.48F, 0.0F, 0.0873F);
		arm1a2_r1.setTextureOffset(0, 0).addBox(-0.75F, 0.0F, 5.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		arm1b2 = new ModelRenderer(this);
		arm1b2.setRotationPoint(-1.5F, -5.5F, -5.5F);
		arm1a2.addChild(arm1b2);
		setRotationAngle(arm1b2, 0.0F, 0.6545F, 0.0F);

		arm1b2_r1 = new ModelRenderer(this);
		arm1b2_r1.setRotationPoint(-12.1F, 0.0F, -8.3F);
		arm1b2.addChild(arm1b2_r1);
		setRotationAngle(arm1b2_r1, 0.0F, 0.0F, 0.48F);
		arm1b2_r1.setTextureOffset(8, 31).addBox(16.025F, 7.8F, 11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b2_r1.setTextureOffset(28, 31).addBox(16.025F, 6.8F, 11.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);

		arm1b2_r2 = new ModelRenderer(this);
		arm1b2_r2.setRotationPoint(-12.1F, 0.0F, -8.3F);
		arm1b2.addChild(arm1b2_r2);
		setRotationAngle(arm1b2_r2, 0.0F, 0.0F, 0.2618F);
		arm1b2_r2.setTextureOffset(32, 29).addBox(14.15F, 7.0F, 11.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);

		arm1b2_r3 = new ModelRenderer(this);
		arm1b2_r3.setRotationPoint(-0.9F, 0.5F, 3.1F);
		arm1b2.addChild(arm1b2_r3);
		setRotationAngle(arm1b2_r3, -1.0472F, 0.3054F, 0.2618F);
		arm1b2_r3.setTextureOffset(12, 31).addBox(4.125F, 9.15F, 6.925F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b2_r3.setTextureOffset(36, 10).addBox(4.125F, 8.15F, 6.925F, 1.0F, 1.0F, 1.0F, 0.2F, false);

		arm1b2_r4 = new ModelRenderer(this);
		arm1b2_r4.setRotationPoint(0.0F, 0.0F, 5.0F);
		arm1b2.addChild(arm1b2_r4);
		setRotationAngle(arm1b2_r4, -1.0472F, 0.0F, 0.2618F);
		arm1b2_r4.setTextureOffset(58, 25).addBox(2.15F, 8.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);

		arm1b2_r5 = new ModelRenderer(this);
		arm1b2_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm1b2.addChild(arm1b2_r5);
		setRotationAngle(arm1b2_r5, -0.48F, 0.0F, 0.4363F);
		arm1b2_r5.setTextureOffset(16, 31).addBox(5.075F, 13.25F, 5.55F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		arm1b2_r5.setTextureOffset(20, 31).addBox(5.075F, 11.25F, 5.55F, 1.0F, 2.0F, 1.0F, 0.2F, false);

		arm1b2_r6 = new ModelRenderer(this);
		arm1b2_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm1b2.addChild(arm1b2_r6);
		setRotationAngle(arm1b2_r6, -0.48F, 0.0F, 0.1745F);
		arm1b2_r6.setTextureOffset(36, 0).addBox(1.65F, 8.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.2F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 5.0F, -27.0F);
		body.addChild(neck);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-3.0F, -15.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, 0.2094F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(109, 125).addBox(0.0F, -12.425F, -12.8F, 6.0F, 7.0F, 6.0F, 0.0F, false);

		neck_r2 = new ModelRenderer(this);
		neck_r2.setRotationPoint(-2.975F, -15.0F, 0.0F);
		neck.addChild(neck_r2);
		setRotationAngle(neck_r2, -0.3491F, 0.0F, 0.0F);
		neck_r2.setTextureOffset(68, 46).addBox(-0.05F, -6.975F, -12.3F, 6.0F, 7.0F, 4.0F, 0.0F, false);
		neck_r2.setTextureOffset(96, 17).addBox(0.075F, -0.125F, -14.75F, 5.0F, 5.0F, 10.0F, 0.0F, false);

		neck_r3 = new ModelRenderer(this);
		neck_r3.setRotationPoint(-3.0F, -15.0F, 0.0F);
		neck.addChild(neck_r3);
		setRotationAngle(neck_r3, -0.6981F, 0.0F, 0.0F);
		neck_r3.setTextureOffset(131, 42).addBox(0.0F, -3.775F, -10.1F, 6.0F, 7.0F, 3.0F, 0.0F, false);

		neck_r4 = new ModelRenderer(this);
		neck_r4.setRotationPoint(-3.05F, -15.0F, 0.0F);
		neck.addChild(neck_r4);
		setRotationAngle(neck_r4, -0.9163F, 0.0F, 0.0F);
		neck_r4.setTextureOffset(30, 103).addBox(0.1F, 3.875F, -7.75F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		neck_r4.setTextureOffset(88, 46).addBox(0.0F, -2.125F, -7.75F, 6.0F, 7.0F, 10.0F, 0.0F, false);

		neck_r5 = new ModelRenderer(this);
		neck_r5.setRotationPoint(-2.9F, -15.0F, 0.0F);
		neck.addChild(neck_r5);
		setRotationAngle(neck_r5, -0.5672F, 0.0F, 0.0F);
		neck_r5.setTextureOffset(48, 123).addBox(-0.2F, 4.15F, -0.6F, 6.0F, 4.0F, 7.0F, 0.0F, false);

		neck_r6 = new ModelRenderer(this);
		neck_r6.setRotationPoint(-2.5F, -15.0F, 0.0F);
		neck.addChild(neck_r6);
		setRotationAngle(neck_r6, -0.3927F, 0.0F, 0.0F);
		neck_r6.setTextureOffset(125, 28).addBox(-1.0F, -2.6F, -0.5F, 7.0F, 8.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -20.0F, -13.0F);
		neck.addChild(head);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(4.0F, -4.0F, -5.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.5672F, 0.0F, 0.5672F);
		head_r1.setTextureOffset(0, 59).addBox(-1.25F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-4.0F, -4.0F, -5.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.5672F, 0.0F, -0.5672F);
		head_r2.setTextureOffset(0, 73).addBox(0.25F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(2.0F, -2.0F, -9.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.6981F, 0.1309F, 0.4363F);
		head_r3.setTextureOffset(52, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-2.0F, -2.0F, -9.0F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.6981F, -0.1309F, -0.4363F);
		head_r4.setTextureOffset(62, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-0.25F, -4.0F, -3.0F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.4363F, 0.0F, 0.0F);
		head_r5.setTextureOffset(110, 45).addBox(-2.5F, -1.05F, -12.5F, 5.0F, 2.0F, 9.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-0.55F, -4.0F, -3.0F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.2182F, 0.0F, 0.0F);
		head_r6.setTextureOffset(29, 66).addBox(-1.9F, 0.45F, -17.8F, 4.0F, 2.0F, 15.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-0.55F, -4.0F, -3.0F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.5236F, 0.0F, 0.0F);
		head_r7.setTextureOffset(33, 59).addBox(-1.9F, -4.95F, -21.175F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(-0.5F, -4.0F, -3.0F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.2618F, 0.0F, 0.0F);
		head_r8.setTextureOffset(24, 25).addBox(-2.0F, 4.7F, -21.775F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		head_r8.setTextureOffset(0, 27).addBox(3.0F, 4.7F, -21.775F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		head_r8.setTextureOffset(44, 25).addBox(-2.0F, 0.7F, -21.775F, 5.0F, 4.0F, 4.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(0.25F, -4.0F, -3.0F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, 0.1745F, 0.0F, 0.0F);
		head_r9.setTextureOffset(0, 23).addBox(2.5F, 6.275F, -17.625F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		head_r9.setTextureOffset(12, 23).addBox(-3.0F, 6.275F, -17.625F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		head_r9.setTextureOffset(36, 0).addBox(-3.0F, 2.275F, -17.625F, 5.0F, 4.0F, 6.0F, 0.0F, false);
		head_r9.setTextureOffset(81, 101).addBox(-3.75F, -0.35F, -3.5F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(0.0F, -4.0F, -3.0F);
		head.addChild(head_r10);
		setRotationAngle(head_r10, 0.3054F, 0.0F, 0.0F);
		head_r10.setTextureOffset(0, 18).addBox(3.0F, 4.65F, -12.5F, 0.0F, 2.0F, 9.0F, 0.0F, false);
		head_r10.setTextureOffset(18, 18).addBox(-3.0F, 4.65F, -12.5F, 0.0F, 2.0F, 9.0F, 0.0F, false);
		head_r10.setTextureOffset(104, 32).addBox(-3.0F, 0.65F, -12.5F, 6.0F, 4.0F, 9.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(-0.5F, 2.0F, -4.0F);
		head.addChild(jaw);

		jaw_r1 = new ModelRenderer(this);
		jaw_r1.setRotationPoint(-0.05F, -6.0F, 1.0F);
		jaw.addChild(jaw_r1);
		setRotationAngle(jaw_r1, 0.0873F, 0.0F, 0.0F);
		jaw_r1.setTextureOffset(30, 27).addBox(-1.9F, 7.65F, -8.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		jaw_r1.setTextureOffset(117, 96).addBox(-1.85F, 5.95F, -20.25F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		jaw_r2 = new ModelRenderer(this);
		jaw_r2.setRotationPoint(0.0F, -6.0F, 1.0F);
		jaw.addChild(jaw_r2);
		setRotationAngle(jaw_r2, 0.1745F, 0.0F, 0.0F);
		jaw_r2.setTextureOffset(89, 120).addBox(-2.0F, 4.9F, -11.5F, 5.0F, 3.0F, 8.0F, 0.0F, false);

		fin = new ModelRenderer(this);
		fin.setRotationPoint(0.0F, -7.0F, -4.0F);
		body.addChild(fin);
		fin.setTextureOffset(0, 0).addBox(0.0F, -27.0F, -21.0F, 0.0F, 25.0F, 34.0F, 0.0F, false);
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