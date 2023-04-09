// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltyrannosaurus_rex extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer arm1;
	private final ModelRenderer arm1_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone8_r2;
	private final ModelRenderer bone8_r3;
	private final ModelRenderer arm2;
	private final ModelRenderer arm2_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone10;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone10_r2;
	private final ModelRenderer bone10_r3;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer neck_r2;
	private final ModelRenderer neck_r3;
	private final ModelRenderer neck_r4;
	private final ModelRenderer neck_r5;
	private final ModelRenderer neck_r6;
	private final ModelRenderer Head;
	private final ModelRenderer UpperJaw;
	private final ModelRenderer HeadUPPER1;
	private final ModelRenderer HeadUPPER2;
	private final ModelRenderer HeadUPPER3;
	private final ModelRenderer EyeCrestRIGHT1;
	private final ModelRenderer EyeCrestRIGHT2;
	private final ModelRenderer EyeCrestRIGHT3;
	private final ModelRenderer EyeCrestLeft1;
	private final ModelRenderer EyeCrestLeft2;
	private final ModelRenderer EyeCrestLeft3;
	private final ModelRenderer Teeth;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone14;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone15;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone16;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone17;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone6;

	public Modeltyrannosaurus_rex() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 6.0F);
		setRotationAngle(body, 0.0436F, 0.0F, 0.0F);
		body.setTextureOffset(57, 60).addBox(-4.0F, -11.2F, -21.0F, 8.0F, 12.0F, 7.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 4.0F, -7.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.2618F, 0.0F, 0.0F);
		body_r1.setTextureOffset(87, 68).addBox(-3.95F, -1.5F, -14.3F, 7.0F, 2.0F, 7.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 4.0F, -7.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.0524F, 0.0F, 0.0F);
		body_r2.setTextureOffset(87, 59).addBox(-4.0F, -1.9F, 2.0F, 8.0F, 2.0F, 7.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.5F, 4.0F, -7.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.1745F, 0.0F, 0.0F);
		body_r3.setTextureOffset(44, 0).addBox(-5.0F, -2.1F, -7.0F, 9.0F, 2.0F, 9.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, -3.0F, -7.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -0.0873F, 0.0F, 0.0F);
		body_r4.setTextureOffset(34, 37).addBox(-5.0F, -7.8F, -8.0F, 10.0F, 13.0F, 10.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.0F, -3.0F, -7.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -0.1745F, 0.0F, 0.0F);
		body_r5.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, 1.0F, 12.0F, 14.0F, 10.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(0.0F, 1.0F, -20.0F);
		body.addChild(arm1);
		setRotationAngle(arm1, 0.48F, 0.0F, 0.0F);

		arm1_r1 = new ModelRenderer(this);
		arm1_r1.setRotationPoint(-4.0F, -1.0F, 3.0F);
		arm1.addChild(arm1_r1);
		setRotationAngle(arm1_r1, 0.0873F, 0.0436F, 0.1745F);
		arm1_r1.setTextureOffset(60, 17).addBox(-0.55F, -1.0F, -3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.5F, 21.0F, 13.0F);
		arm1.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.2182F, 0.0F);

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-3.0F, -18.0F, -12.0F);
		bone7.addChild(bone7_r1);
		setRotationAngle(bone7_r1, -0.8727F, 0.0F, 0.0F);
		bone7_r1.setTextureOffset(64, 42).addBox(-2.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-4.0F, -16.0F, -16.0F);
		bone8.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, -0.0873F);
		bone8_r1.setTextureOffset(0, 50).addBox(0.1F, -0.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone8_r2 = new ModelRenderer(this);
		bone8_r2.setRotationPoint(-4.0F, -16.0F, -16.0F);
		bone8.addChild(bone8_r2);
		setRotationAngle(bone8_r2, 0.0F, 0.0F, 0.0873F);
		bone8_r2.setTextureOffset(28, 50).addBox(-1.1F, -0.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone8_r3 = new ModelRenderer(this);
		bone8_r3.setRotationPoint(0.0F, -15.0F, -14.0F);
		bone8.addChild(bone8_r3);
		setRotationAngle(bone8_r3, -0.7854F, 0.0F, 0.0F);
		bone8_r3.setTextureOffset(0, 47).addBox(-5.0F, -2.1F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(0.0F, 1.0F, -20.0F);
		body.addChild(arm2);
		setRotationAngle(arm2, 0.48F, 0.0F, 0.0F);

		arm2_r1 = new ModelRenderer(this);
		arm2_r1.setRotationPoint(4.0F, -1.0F, 3.0F);
		arm2.addChild(arm2_r1);
		setRotationAngle(arm2_r1, 0.0873F, -0.0436F, -0.1745F);
		arm2_r1.setTextureOffset(0, 0).addBox(-1.55F, -1.0F, -3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.5F, 21.0F, 13.0F);
		arm2.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.2182F, 0.0F);

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(3.0F, -18.0F, -12.0F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -0.8727F, 0.0F, 0.0F);
		bone9_r1.setTextureOffset(64, 37).addBox(0.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(bone10);

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(4.0F, -16.0F, -16.0F);
		bone10.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.0873F);
		bone10_r1.setTextureOffset(28, 47).addBox(-1.1F, -0.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(4.0F, -16.0F, -16.0F);
		bone10.addChild(bone10_r2);
		setRotationAngle(bone10_r2, 0.0F, 0.0F, -0.0873F);
		bone10_r2.setTextureOffset(49, 0).addBox(0.1F, -0.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone10_r3 = new ModelRenderer(this);
		bone10_r3.setRotationPoint(0.0F, -15.0F, -14.0F);
		bone10.addChild(bone10_r3);
		setRotationAngle(bone10_r3, -0.7854F, 0.0F, 0.0F);
		bone10_r3.setTextureOffset(0, 6).addBox(3.0F, -2.1F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -2.0F, -22.0F);
		body.addChild(neck);
		setRotationAngle(neck, -0.1309F, 0.0F, 0.0F);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-0.075F, -8.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, 0.2618F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(97, 16).addBox(-2.95F, -7.8F, -10.4F, 6.0F, 7.0F, 3.0F, 0.0F, false);

		neck_r2 = new ModelRenderer(this);
		neck_r2.setRotationPoint(0.0F, -8.0F, 0.0F);
		neck.addChild(neck_r2);
		setRotationAngle(neck_r2, -0.0873F, 0.0F, 0.0F);
		neck_r2.setTextureOffset(34, 0).addBox(-3.0F, -4.8F, -9.6F, 6.0F, 5.0F, 3.0F, 0.0F, false);

		neck_r3 = new ModelRenderer(this);
		neck_r3.setRotationPoint(0.0F, -8.0F, 0.0F);
		neck.addChild(neck_r3);
		setRotationAngle(neck_r3, -0.5236F, 0.0F, 0.0F);
		neck_r3.setTextureOffset(100, 44).addBox(-3.05F, -1.7F, -7.8F, 6.0F, 8.0F, 2.0F, 0.0F, false);
		neck_r3.setTextureOffset(48, 60).addBox(-2.55F, 5.3F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		neck_r4 = new ModelRenderer(this);
		neck_r4.setRotationPoint(0.015F, -8.0F, 0.0F);
		neck.addChild(neck_r4);
		setRotationAngle(neck_r4, -0.6981F, 0.0F, 0.0F);
		neck_r4.setTextureOffset(92, 32).addBox(-3.03F, -0.7F, -6.0F, 6.0F, 8.0F, 4.0F, 0.0F, false);

		neck_r5 = new ModelRenderer(this);
		neck_r5.setRotationPoint(0.025F, -8.0F, 0.0F);
		neck.addChild(neck_r5);
		setRotationAngle(neck_r5, -0.1745F, 0.0F, 0.0F);
		neck_r5.setTextureOffset(97, 77).addBox(-2.55F, 2.5F, -12.1F, 5.0F, 3.0F, 5.0F, 0.0F, false);

		neck_r6 = new ModelRenderer(this);
		neck_r6.setRotationPoint(0.0F, -8.0F, 0.0F);
		neck.addChild(neck_r6);
		setRotationAngle(neck_r6, -0.4363F, 0.0F, 0.0F);
		neck_r6.setTextureOffset(52, 80).addBox(-2.5F, 6.0F, -4.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		neck_r6.setTextureOffset(72, 3).addBox(-3.03F, -1.75F, -4.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -10.8143F, -10.7767F);
		neck.addChild(Head);
		setRotationAngle(Head, 0.2201F, 0.0F, 0.0F);
		Head.setTextureOffset(75, 89).addBox(-3.5F, -2.2357F, -3.8891F, 7.0F, 8.0F, 5.0F, 0.0F, false);

		UpperJaw = new ModelRenderer(this);
		UpperJaw.setRotationPoint(0.0F, 15.23F, -8.858F);
		Head.addChild(UpperJaw);
		UpperJaw.setTextureOffset(76, 19).addBox(-3.0F, -15.5957F, -3.5311F, 6.0F, 4.0F, 9.0F, 0.0F, false);
		UpperJaw.setTextureOffset(44, 3).addBox(-2.8F, -11.5957F, -3.5311F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		UpperJaw.setTextureOffset(32, 25).addBox(2.8F, -11.5957F, -3.5311F, 0.0F, 2.0F, 8.0F, 0.0F, false);

		HeadUPPER1 = new ModelRenderer(this);
		HeadUPPER1.setRotationPoint(0.0F, -0.17F, -8.0F);
		UpperJaw.addChild(HeadUPPER1);
		setRotationAngle(HeadUPPER1, 0.7285F, 0.0F, 0.0F);
		HeadUPPER1.setTextureOffset(60, 11).addBox(-2.75F, -8.5127F, 13.5843F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		HeadUPPER2 = new ModelRenderer(this);
		HeadUPPER2.setRotationPoint(0.0F, 0.0F, 1.0F);
		HeadUPPER1.addChild(HeadUPPER2);
		setRotationAngle(HeadUPPER2, -0.3187F, 0.0F, 0.0F);
		HeadUPPER2.setTextureOffset(60, 14).addBox(-2.8F, -12.3404F, 10.233F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		HeadUPPER3 = new ModelRenderer(this);
		HeadUPPER3.setRotationPoint(0.0F, 0.0F, 1.0F);
		HeadUPPER2.addChild(HeadUPPER3);
		setRotationAngle(HeadUPPER3, -0.2943F, 0.0F, 0.0F);
		HeadUPPER3.setTextureOffset(92, 0).addBox(-2.75F, -14.7779F, 6.214F, 5.0F, 2.0F, 7.0F, 0.0F, false);

		EyeCrestRIGHT1 = new ModelRenderer(this);
		EyeCrestRIGHT1.setRotationPoint(2.35F, 14.16F, -7.558F);
		Head.addChild(EyeCrestRIGHT1);
		setRotationAngle(EyeCrestRIGHT1, -1.0472F, 0.0F, 0.3889F);
		EyeCrestRIGHT1.setTextureOffset(4, 7).addBox(-5.887F, -12.7933F, -11.1032F, 1.0F, 1.0F, 2.0F, 0.1F, false);

		EyeCrestRIGHT2 = new ModelRenderer(this);
		EyeCrestRIGHT2.setRotationPoint(0.0F, -1.9F, -0.5F);
		EyeCrestRIGHT1.addChild(EyeCrestRIGHT2);
		setRotationAngle(EyeCrestRIGHT2, -1.6846F, 0.0F, 0.0F);
		EyeCrestRIGHT2.setTextureOffset(38, 8).addBox(-5.837F, 10.7862F, -10.775F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		EyeCrestRIGHT3 = new ModelRenderer(this);
		EyeCrestRIGHT3.setRotationPoint(0.0F, -1.3F, -0.38F);
		EyeCrestRIGHT2.addChild(EyeCrestRIGHT3);
		setRotationAngle(EyeCrestRIGHT3, 3.0049F, 0.0F, 0.0F);
		EyeCrestRIGHT3.setTextureOffset(50, 33).addBox(-5.837F, -13.5127F, 7.6463F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		EyeCrestLeft1 = new ModelRenderer(this);
		EyeCrestLeft1.setRotationPoint(-2.35F, 14.16F, -7.558F);
		Head.addChild(EyeCrestLeft1);
		setRotationAngle(EyeCrestLeft1, -1.0472F, 0.0F, -0.3889F);
		EyeCrestLeft1.setTextureOffset(46, 33).addBox(4.787F, -12.7933F, -11.1032F, 1.0F, 1.0F, 2.0F, 0.1F, false);

		EyeCrestLeft2 = new ModelRenderer(this);
		EyeCrestLeft2.setRotationPoint(0.0F, -1.9F, -0.5F);
		EyeCrestLeft1.addChild(EyeCrestLeft2);
		setRotationAngle(EyeCrestLeft2, -1.6846F, 0.0F, 0.0F);
		EyeCrestLeft2.setTextureOffset(6, 0).addBox(4.837F, 10.7862F, -10.775F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		EyeCrestLeft3 = new ModelRenderer(this);
		EyeCrestLeft3.setRotationPoint(0.0F, -1.3F, -0.38F);
		EyeCrestLeft2.addChild(EyeCrestLeft3);
		setRotationAngle(EyeCrestLeft3, 3.0049F, 0.0F, 0.0F);
		EyeCrestLeft3.setTextureOffset(34, 8).addBox(4.837F, -13.5127F, 7.6463F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		Teeth = new ModelRenderer(this);
		Teeth.setRotationPoint(0.0F, 3.23F, -2.858F);
		Head.addChild(Teeth);
		Teeth.setTextureOffset(78, 78).addBox(-2.75F, 0.4043F, -9.0311F, 5.0F, 2.0F, 9.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.0F, 2.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.0436F, 0.0F, 0.0F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, -0.0873F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(0, 47).addBox(-5.5F, -7.0F, -2.0F, 11.0F, 13.0F, 6.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 5.0F);
		tail.addChild(bone12);
		bone12.setTextureOffset(0, 24).addBox(-5.0F, -6.5F, -1.0F, 10.0F, 11.0F, 12.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -6.0F, 12.0F);
		bone12.addChild(bone13);

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, 6.0F, -14.0F);
		bone13.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -0.0524F, 0.0F, 0.0F);
		bone13_r1.setTextureOffset(34, 14).addBox(-4.0F, -6.8F, 12.7F, 8.0F, 9.0F, 10.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 10.0F, 6.0F);
		bone13.addChild(bone14);

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(0.0F, -4.0F, -20.0F);
		bone14.addChild(bone14_r1);
		setRotationAngle(bone14_r1, -0.0524F, 0.0F, 0.0F);
		bone14_r1.setTextureOffset(25, 60).addBox(-3.5F, -6.6F, 22.7F, 7.0F, 8.0F, 9.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -4.0F, -20.0F);
		bone14.addChild(bone15);

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone15_r1);
		setRotationAngle(bone15_r1, -0.0873F, 0.0F, 0.0F);
		bone15_r1.setTextureOffset(0, 91).addBox(-2.5F, -7.6F, 31.5F, 5.0F, 6.0F, 7.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -6.0F, 36.0F);
		bone15.addChild(bone16);

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(0.0F, 6.0F, -36.0F);
		bone16.addChild(bone16_r1);
		setRotationAngle(bone16_r1, -0.1396F, 0.0F, 0.0F);
		bone16_r1.setTextureOffset(26, 77).addBox(-2.0F, -9.4F, 37.5F, 4.0F, 5.0F, 9.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 4.0F, 15.0F);
		bone16.addChild(bone17);

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(0.0F, 2.0F, -51.0F);
		bone17.addChild(bone17_r1);
		setRotationAngle(bone17_r1, -0.1745F, 0.0F, 0.0F);
		bone17_r1.setTextureOffset(57, 20).addBox(-1.5F, -10.8F, 45.5F, 3.0F, 4.0F, 13.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(7.0F, 0.2F, 6.5F);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(-10.0F, 10.8F, -6.5F);
		leg1.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.2182F, 0.0F, 0.0F);
		leg1_r1.setTextureOffset(74, 37).addBox(-5.0F, -14.6F, -0.7F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-6.0F, 11.0F, -7.2F);
		leg1.addChild(bone);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-7.0F, 2.8F, 7.7F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.6981F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(42, 91).addBox(-1.5F, -7.7F, -3.4F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone.addChild(bone2);

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-5.0F, 13.5F, -2.3F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, -0.2618F, 0.0F, 0.0F);
		bone2_r1.setTextureOffset(79, 102).addBox(-3.0F, -7.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone2.addChild(bone3);
		bone3.setTextureOffset(92, 95).addBox(-8.5F, 7.2F, -7.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-7.0F, 0.2F, 5.5F);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(15.0F, 10.8F, -5.5F);
		leg2.addChild(leg2_r1);
		setRotationAngle(leg2_r1, -0.2182F, 0.0F, 0.0F);
		leg2_r1.setTextureOffset(0, 69).addBox(-5.0F, -14.6F, -0.7F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(19.0F, 11.0F, -6.2F);
		leg2.addChild(bone4);

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-7.0F, 2.8F, 7.7F);
		bone4.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.6981F, 0.0F, 0.0F);
		bone4_r1.setTextureOffset(24, 91).addBox(-1.5F, -7.7F, -3.4F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone4.addChild(bone5);

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-5.0F, 13.5F, -2.3F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, -0.2618F, 0.0F, 0.0F);
		bone5_r1.setTextureOffset(0, 24).addBox(-3.0F, -7.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(60, 95).addBox(-8.5F, 7.2F, -7.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
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