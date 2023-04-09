// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIndoraptor extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer claw;
	private final ModelRenderer claw_r1;
	private final ModelRenderer claw_r2;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer claw2;
	private final ModelRenderer claw2_r1;
	private final ModelRenderer claw2_r2;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer bone9;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone24;
	private final ModelRenderer bone24_r1;
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
	private final ModelRenderer jaw;
	private final ModelRenderer jaw_r1;
	private final ModelRenderer tail1;
	private final ModelRenderer tail1_r1;
	private final ModelRenderer bone19;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone20;
	private final ModelRenderer bone20_r1;
	private final ModelRenderer bone21;
	private final ModelRenderer bone21_r1;
	private final ModelRenderer bone22;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone23;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer arm1;
	private final ModelRenderer arm1_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone7_r2;
	private final ModelRenderer hand;
	private final ModelRenderer fingers;
	private final ModelRenderer fingers_r1;
	private final ModelRenderer fingers_r2;
	private final ModelRenderer fingers_r3;
	private final ModelRenderer arm2;
	private final ModelRenderer arm2_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone8_r2;
	private final ModelRenderer hand2;
	private final ModelRenderer fingers2;
	private final ModelRenderer fingers2_r1;
	private final ModelRenderer fingers2_r2;
	private final ModelRenderer fingers2_r3;

	public ModelIndoraptor() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(6.5F, 0.2F, 12.5F);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(-13.0F, 9.8F, -5.5F);
		leg1.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.2182F, 0.0F, 0.0F);
		leg1_r1.setTextureOffset(24, 60).addBox(-1.5F, -13.8F, -0.05F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-13.0F, 11.0F, -13.2F);
		leg1.addChild(bone);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 2.8F, 16.7F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.7854F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(62, 82).addBox(-1.0F, -9.15F, -3.75F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone.addChild(bone2);

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(0.0F, 14.5F, 7.7F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, -0.0873F, 0.0F, 0.0F);
		bone2_r1.setTextureOffset(0, 26).addBox(-0.5F, -8.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone2.addChild(bone3);
		bone3.setTextureOffset(85, 33).addBox(-1.0F, 7.2F, 2.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		claw = new ModelRenderer(this);
		claw.setRotationPoint(0.0F, 9.2F, -1.0F);
		bone3.addChild(claw);

		claw_r1 = new ModelRenderer(this);
		claw_r1.setRotationPoint(4.0F, -1.0F, 6.0F);
		claw.addChild(claw_r1);
		setRotationAngle(claw_r1, 1.2217F, 0.0F, 0.0F);
		claw_r1.setTextureOffset(23, 53).addBox(-1.55F, -5.375F, 2.325F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		claw_r2 = new ModelRenderer(this);
		claw_r2.setRotationPoint(4.0F, -1.0F, 6.0F);
		claw.addChild(claw_r2);
		setRotationAngle(claw_r2, 0.5236F, 0.0F, 0.0F);
		claw_r2.setTextureOffset(29, 53).addBox(-1.6F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		claw_r2.setTextureOffset(17, 71).addBox(-1.6F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.1F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-6.5F, 0.2F, 13.5F);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(13.0F, 9.8F, -6.5F);
		leg2.addChild(leg2_r1);
		setRotationAngle(leg2_r1, -0.2182F, 0.0F, 0.0F);
		leg2_r1.setTextureOffset(59, 59).addBox(-3.5F, -13.8F, -0.05F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(13.0F, 11.0F, -14.2F);
		leg2.addChild(bone4);

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(0.0F, 2.8F, 16.7F);
		bone4.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.7854F, 0.0F, 0.0F);
		bone4_r1.setTextureOffset(23, 82).addBox(-3.0F, -9.15F, -3.75F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -3.7F, 9.0F);
		bone4.addChild(bone5);

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(0.0F, 14.5F, 7.7F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, -0.0873F, 0.0F, 0.0F);
		bone5_r1.setTextureOffset(0, 0).addBox(-2.5F, -8.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 7.3F, -0.3F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(0, 85).addBox(-3.0F, 7.2F, 2.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		claw2 = new ModelRenderer(this);
		claw2.setRotationPoint(0.0F, 9.2F, -1.0F);
		bone6.addChild(claw2);

		claw2_r1 = new ModelRenderer(this);
		claw2_r1.setRotationPoint(-4.0F, -1.0F, 6.0F);
		claw2.addChild(claw2_r1);
		setRotationAngle(claw2_r1, 1.2217F, 0.0F, 0.0F);
		claw2_r1.setTextureOffset(32, 0).addBox(0.45F, -5.375F, 2.325F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		claw2_r2 = new ModelRenderer(this);
		claw2_r2.setRotationPoint(-4.0F, -1.0F, 6.0F);
		claw2.addChild(claw2_r2);
		setRotationAngle(claw2_r2, 0.5236F, 0.0F, 0.0F);
		claw2_r2.setTextureOffset(5, 50).addBox(0.4F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		claw2_r2.setTextureOffset(47, 0).addBox(0.4F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.1F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 3.0F, 4.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(4.0F, 5.0F, 5.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.0436F, 0.0F, 0.1309F);
		body_r1.setTextureOffset(42, 48).addBox(-3.0F, -16.4F, -3.0F, 0.0F, 4.0F, 12.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-4.0F, 5.0F, 5.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.0436F, 0.0F, -0.1309F);
		body_r2.setTextureOffset(0, 55).addBox(3.0F, -16.4F, -3.0F, 0.0F, 4.0F, 12.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-4.0F, 5.0F, 5.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.0436F, 0.0F, 0.0F);
		body_r3.setTextureOffset(0, 0).addBox(-1.0F, -13.0F, -3.0F, 10.0F, 14.0F, 12.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-4.5F, -5.0F, -7.0F);
		body.addChild(bone9);

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.0F, 10.0F, 12.0F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.3491F, 0.0F, 0.0F);
		bone9_r1.setTextureOffset(0, 26).addBox(0.0F, -12.75F, -10.0F, 9.0F, 12.0F, 12.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.25F, 5.0F, -8.0F);
		bone9.addChild(bone24);

		bone24_r1 = new ModelRenderer(this);
		bone24_r1.setRotationPoint(-0.5F, 5.0F, 20.0F);
		bone24.addChild(bone24_r1);
		setRotationAngle(bone24_r1, 0.0873F, 0.0F, 0.0F);
		bone24_r1.setTextureOffset(33, 15).addBox(0.5F, -9.75F, -19.5F, 8.0F, 11.0F, 11.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(4.25F, 3.0F, -9.0F);
		bone24.addChild(neck);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-4.5F, -5.0F, 9.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.3927F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(23, 45).addBox(4.5F, -0.05F, -12.225F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		neck_r1.setTextureOffset(58, 40).addBox(1.975F, 2.95F, -12.225F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		neck_r2 = new ModelRenderer(this);
		neck_r2.setRotationPoint(-1.5F, -5.0F, 9.0F);
		neck.addChild(neck_r2);
		setRotationAngle(neck_r2, -0.1745F, 0.0F, 0.0F);
		neck_r2.setTextureOffset(92, 51).addBox(-1.0F, 0.975F, -9.975F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		neck_r3 = new ModelRenderer(this);
		neck_r3.setRotationPoint(-1.45F, -5.0F, 9.0F);
		neck.addChild(neck_r3);
		setRotationAngle(neck_r3, 0.0436F, 0.0F, 0.0F);
		neck_r3.setTextureOffset(93, 73).addBox(-1.1F, -0.45F, -7.4F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		neck_r4 = new ModelRenderer(this);
		neck_r4.setRotationPoint(-2.0F, -5.0F, 9.0F);
		neck.addChild(neck_r4);
		setRotationAngle(neck_r4, -0.3054F, 0.0F, 0.0F);
		neck_r4.setTextureOffset(85, 65).addBox(0.0F, 8.325F, -13.7F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		neck_r5 = new ModelRenderer(this);
		neck_r5.setRotationPoint(-1.95F, -5.0F, 9.0F);
		neck.addChild(neck_r5);
		setRotationAngle(neck_r5, -0.0873F, 0.0F, 0.0F);
		neck_r5.setTextureOffset(91, 11).addBox(-0.1F, 5.35F, -9.25F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		neck_r5.setTextureOffset(77, 55).addBox(-0.05F, 5.25F, -4.75F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		neck_r6 = new ModelRenderer(this);
		neck_r6.setRotationPoint(-1.4F, -5.0F, 9.0F);
		neck.addChild(neck_r6);
		setRotationAngle(neck_r6, 0.1309F, 0.0F, 0.0F);
		neck_r6.setTextureOffset(80, 0).addBox(-1.2F, -0.75F, -4.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, -13.0F);
		neck.addChild(head);
		head.setTextureOffset(75, 19).addBox(-3.0F, -3.0F, 2.5F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(42, 31).addBox(-2.5F, 2.5F, -5.5F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(42, 29).addBox(2.5F, 2.5F, -5.5F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(75, 31).addBox(-2.5F, -1.0F, -5.5F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(60, 24).addBox(-2.5F, 2.5F, -5.5F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.3491F, 0.3927F, 0.0F);
		head_r1.setTextureOffset(23, 53).addBox(4.9264F, -2.9953F, -6.4461F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.3491F, -0.3927F, 0.0F);
		head_r2.setTextureOffset(0, 71).addBox(-5.9264F, -2.9953F, -6.4461F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.5236F, -0.3927F, 0.0F);
		head_r3.setTextureOffset(67, 55).addBox(0.9169F, 1.3647F, -6.3948F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.5236F, 0.3927F, 0.0F);
		head_r4.setTextureOffset(75, 55).addBox(-1.9169F, 1.3647F, -6.3948F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.48F, 0.0F, 0.0F);
		head_r5.setTextureOffset(65, 0).addBox(-2.45F, -6.947F, -15.548F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.3491F, 0.2182F, 0.0F);
		head_r6.setTextureOffset(65, 4).addBox(4.9527F, -4.4199F, -15.1078F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.3491F, -0.2182F, 0.0F);
		head_r7.setTextureOffset(50, 66).addBox(-5.9527F, -4.4199F, -15.1078F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(0.0F, -2.0F, 11.5F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.1309F, 0.0F, 0.0F);
		head_r8.setTextureOffset(20, 98).addBox(2.15F, -1.8971F, -13.4158F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head_r8.setTextureOffset(32, 98).addBox(-3.15F, -1.8971F, -13.4158F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head_r8.setTextureOffset(0, 94).addBox(-2.475F, -2.2221F, -14.1658F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 3.0F, -0.5F);
		head.addChild(jaw);
		jaw.setTextureOffset(77, 77).addBox(-2.3F, -0.5F, -4.9F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		jaw.setTextureOffset(30, 37).addBox(-2.3F, -1.5F, -4.9F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		jaw.setTextureOffset(42, 57).addBox(-2.3F, -1.5F, -4.9F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		jaw.setTextureOffset(42, 56).addBox(2.3F, -1.5F, -4.9F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		jaw.setTextureOffset(85, 42).addBox(-2.75F, -0.5F, 3.25F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		jaw_r1 = new ModelRenderer(this);
		jaw_r1.setRotationPoint(0.0F, -5.0F, 12.0F);
		jaw.addChild(jaw_r1);
		setRotationAngle(jaw_r1, -0.0698F, 0.0F, 0.0F);
		jaw_r1.setTextureOffset(32, 3).addBox(-2.25F, 2.079F, -7.6403F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		jaw_r1.setTextureOffset(60, 13).addBox(2.25F, 2.079F, -7.6403F, 0.0F, 3.0F, 6.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -8.0F, 6.0F);
		body.addChild(tail1);

		tail1_r1 = new ModelRenderer(this);
		tail1_r1.setRotationPoint(-3.0F, 5.0F, 8.0F);
		tail1.addChild(tail1_r1);
		setRotationAngle(tail1_r1, -0.0873F, 0.0F, 0.0F);
		tail1_r1.setTextureOffset(33, 41).addBox(-1.0F, -4.5F, 0.0F, 8.0F, 10.0F, 9.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(4.0F, 5.0F, 7.0F);
		tail1.addChild(bone19);

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(-6.5F, 0.0F, 1.0F);
		bone19.addChild(bone19_r1);
		setRotationAngle(bone19_r1, -0.1309F, 0.0F, 0.0F);
		bone19_r1.setTextureOffset(0, 50).addBox(-1.0F, -4.75F, 8.8F, 7.0F, 8.0F, 9.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-6.5F, 6.0F, 11.0F);
		bone19.addChild(bone20);

		bone20_r1 = new ModelRenderer(this);
		bone20_r1.setRotationPoint(0.5F, -6.0F, -10.0F);
		bone20.addChild(bone20_r1);
		setRotationAngle(bone20_r1, -0.0611F, 0.0F, 0.0F);
		bone20_r1.setTextureOffset(44, 0).addBox(-1.0F, -3.45F, 17.3F, 6.0F, 6.0F, 9.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.5F, -6.0F, 9.0F);
		bone20.addChild(bone21);

		bone21_r1 = new ModelRenderer(this);
		bone21_r1.setRotationPoint(1.0F, 0.0F, -19.0F);
		bone21.addChild(bone21_r1);
		setRotationAngle(bone21_r1, 0.0436F, 0.0F, 0.0F);
		bone21_r1.setTextureOffset(67, 40).addBox(-1.0F, -0.55F, 26.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(1.0F, 0.0F, 8.0F);
		bone21.addChild(bone22);

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(0.5F, 0.0F, -27.0F);
		bone22.addChild(bone22_r1);
		setRotationAngle(bone22_r1, 0.096F, 0.0F, 0.0F);
		bone22_r1.setTextureOffset(63, 4).addBox(-1.0F, 1.4F, 35.75F, 3.0F, 4.0F, 11.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.5F, 0.0F, 12.0F);
		bone22.addChild(bone23);

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(0.5F, 0.0F, -39.0F);
		bone23.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.1396F, 0.0F, 0.0F);
		bone23_r1.setTextureOffset(58, 24).addBox(-1.0F, 3.55F, 46.55F, 2.0F, 3.0F, 13.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(4.25F, 8.75F, -7.0F);

		arm1_r1 = new ModelRenderer(this);
		arm1_r1.setRotationPoint(-9.0F, 4.0F, 2.0F);
		arm1.addChild(arm1_r1);
		setRotationAngle(arm1_r1, 0.48F, 0.0F, 0.1745F);
		arm1_r1.setTextureOffset(80, 87).addBox(-1.25F, -5.0F, -3.0F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-9.0F, 6.0F, -6.0F);
		arm1.addChild(bone7);

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(0.0F, -2.0F, 8.0F);
		bone7.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.829F, 0.0F, -0.1309F);
		bone7_r1.setTextureOffset(0, 54).addBox(0.25F, 1.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone7_r2 = new ModelRenderer(this);
		bone7_r2.setRotationPoint(0.0F, -2.0F, 8.0F);
		bone7.addChild(bone7_r2);
		setRotationAngle(bone7_r2, 0.829F, 0.0F, 0.0F);
		bone7_r2.setTextureOffset(39, 71).addBox(-1.25F, 0.0F, -11.0F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		hand = new ModelRenderer(this);
		hand.setRotationPoint(0.0F, 7.0F, -7.5F);
		bone7.addChild(hand);
		hand.setTextureOffset(95, 0).addBox(-1.35F, -0.8F, 7.325F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		fingers = new ModelRenderer(this);
		fingers.setRotationPoint(0.0F, 5.0F, -3.5F);
		hand.addChild(fingers);

		fingers_r1 = new ModelRenderer(this);
		fingers_r1.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers.addChild(fingers_r1);
		setRotationAngle(fingers_r1, 0.1745F, -0.48F, 0.0F);
		fingers_r1.setTextureOffset(96, 83).addBox(-2.25F, 8.05F, -13.175F, 1.0F, 1.0F, 5.0F, 0.2F, false);

		fingers_r2 = new ModelRenderer(this);
		fingers_r2.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers.addChild(fingers_r2);
		setRotationAngle(fingers_r2, 0.1745F, 0.48F, 0.0F);
		fingers_r2.setTextureOffset(96, 26).addBox(1.75F, 8.05F, -13.175F, 1.0F, 1.0F, 5.0F, 0.2F, false);

		fingers_r3 = new ModelRenderer(this);
		fingers_r3.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers.addChild(fingers_r3);
		setRotationAngle(fingers_r3, 0.1745F, 0.0F, 0.0F);
		fingers_r3.setTextureOffset(89, 93).addBox(-0.25F, 8.05F, -15.175F, 1.0F, 1.0F, 7.0F, 0.2F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-4.25F, 8.75F, -6.0F);

		arm2_r1 = new ModelRenderer(this);
		arm2_r1.setRotationPoint(9.0F, 4.0F, 1.0F);
		arm2.addChild(arm2_r1);
		setRotationAngle(arm2_r1, 0.48F, 0.0F, -0.1745F);
		arm2_r1.setTextureOffset(41, 85).addBox(-2.25F, -5.0F, -3.0F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(9.0F, 6.0F, -7.0F);
		arm2.addChild(bone8);

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.0F, -2.0F, 8.0F);
		bone8.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.829F, 0.0F, 0.1309F);
		bone8_r1.setTextureOffset(0, 50).addBox(-1.25F, 1.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone8_r2 = new ModelRenderer(this);
		bone8_r2.setRotationPoint(0.0F, -2.0F, 8.0F);
		bone8.addChild(bone8_r2);
		setRotationAngle(bone8_r2, 0.829F, 0.0F, 0.0F);
		bone8_r2.setTextureOffset(0, 71).addBox(-1.75F, 0.0F, -11.0F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		hand2 = new ModelRenderer(this);
		hand2.setRotationPoint(0.0F, 7.0F, -7.5F);
		bone8.addChild(hand2);
		hand2.setTextureOffset(69, 19).addBox(-1.85F, -0.8F, 7.325F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		fingers2 = new ModelRenderer(this);
		fingers2.setRotationPoint(0.0F, 5.0F, -3.5F);
		hand2.addChild(fingers2);

		fingers2_r1 = new ModelRenderer(this);
		fingers2_r1.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers2.addChild(fingers2_r1);
		setRotationAngle(fingers2_r1, 0.1745F, 0.48F, 0.0F);
		fingers2_r1.setTextureOffset(94, 19).addBox(1.25F, 8.05F, -13.175F, 1.0F, 1.0F, 5.0F, 0.2F, false);

		fingers2_r2 = new ModelRenderer(this);
		fingers2_r2.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers2.addChild(fingers2_r2);
		setRotationAngle(fingers2_r2, 0.1745F, -0.48F, 0.0F);
		fingers2_r2.setTextureOffset(13, 96).addBox(-2.75F, 8.05F, -13.175F, 1.0F, 1.0F, 5.0F, 0.2F, false);

		fingers2_r3 = new ModelRenderer(this);
		fingers2_r3.setRotationPoint(0.0F, -14.0F, 19.0F);
		fingers2.addChild(fingers2_r3);
		setRotationAngle(fingers2_r3, 0.1745F, 0.0F, 0.0F);
		fingers2_r3.setTextureOffset(50, 91).addBox(-0.75F, 8.05F, -15.175F, 1.0F, 1.0F, 7.0F, 0.2F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.arm1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arm2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}