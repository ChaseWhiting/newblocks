// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp058_3_2 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer tentacle;
	private final ModelRenderer tentacle2;
	private final ModelRenderer tentacle3;
	private final ModelRenderer tentacle4;
	private final ModelRenderer tentacle5;
	private final ModelRenderer tentacle6;
	private final ModelRenderer tentacle7;
	private final ModelRenderer tentacle8;
	private final ModelRenderer tentacle9;
	private final ModelRenderer tentacle10;
	private final ModelRenderer tentacle11;
	private final ModelRenderer tentacle11_r1;
	private final ModelRenderer tentacle12;
	private final ModelRenderer tentacle13;
	private final ModelRenderer tentacle14;
	private final ModelRenderer tentacle15;
	private final ModelRenderer tentacle16;
	private final ModelRenderer tentacle17;
	private final ModelRenderer tentacle18;
	private final ModelRenderer tentacle19;
	private final ModelRenderer tentacle20;
	private final ModelRenderer tentacle21;
	private final ModelRenderer tentacle22;
	private final ModelRenderer tentacle22_r1;
	private final ModelRenderer tentacle23;
	private final ModelRenderer tentacle24;
	private final ModelRenderer tentacle25;
	private final ModelRenderer tentacle26;
	private final ModelRenderer tentacle27;
	private final ModelRenderer tentacle28;
	private final ModelRenderer tentacle29;
	private final ModelRenderer tentacle30;
	private final ModelRenderer tentacle31;
	private final ModelRenderer tentacle32;
	private final ModelRenderer tentacle33;
	private final ModelRenderer tentacle22_r2;
	private final ModelRenderer stinger;
	private final ModelRenderer stinger2;
	private final ModelRenderer stinger3;
	private final ModelRenderer stinger4;
	private final ModelRenderer stinger5;
	private final ModelRenderer stinger6;
	private final ModelRenderer stinger7;
	private final ModelRenderer stinger8;
	private final ModelRenderer stinger8_r1;
	private final ModelRenderer stinger8_r2;
	private final ModelRenderer stinger8_r3;

	public Modelscp058_3_2() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 26.5F, 9.0F);
		setRotationAngle(all, 0.6545F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -14.0F, 0.0F);
		all.addChild(body);
		setRotationAngle(body, -0.6981F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-2.5F, 4.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 1.1345F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-3.0F, -10.5F, 18.5F, 6.0F, 8.0F, 6.0F, -0.6F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.6109F, 0.0F, 0.0F);
		body_r2.setTextureOffset(0, 0).addBox(-3.0F, -16.5F, 13.5F, 6.0F, 8.0F, 6.0F, -0.3F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 11.5F, -9.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.2182F, 0.0F, 0.0F);
		body_r3.setTextureOffset(0, 0).addBox(-3.0F, -17.5F, 8.5F, 6.0F, 8.0F, 6.0F, -0.1F, false);

		tentacle = new ModelRenderer(this);
		tentacle.setRotationPoint(0.0622F, 2.955F, 2.5438F);
		body.addChild(tentacle);
		setRotationAngle(tentacle, -1.5505F, 0.1509F, -1.566F);
		tentacle.setTextureOffset(16, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(6.9597F, -0.8907F, 0.6406F);
		tentacle.addChild(tentacle2);
		setRotationAngle(tentacle2, 0.0F, 0.0F, -0.1745F);
		tentacle2.setTextureOffset(8, 41).addBox(-7.9218F, -2.3238F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle2.addChild(tentacle3);
		setRotationAngle(tentacle3, 0.0F, 0.0F, -0.3491F);
		tentacle3.setTextureOffset(0, 41).addBox(-7.2226F, -4.6415F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle3.addChild(tentacle4);
		setRotationAngle(tentacle4, 0.0F, 0.0F, -0.3491F);
		tentacle4.setTextureOffset(32, 37).addBox(-5.7729F, -6.5803F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle5 = new ModelRenderer(this);
		tentacle5.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle4.addChild(tentacle5);
		setRotationAngle(tentacle5, 0.0F, 0.0F, 0.3491F);
		tentacle5.setTextureOffset(24, 37).addBox(-7.2226F, -4.6415F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle6 = new ModelRenderer(this);
		tentacle6.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle5.addChild(tentacle6);
		setRotationAngle(tentacle6, 0.0F, 0.0F, -0.1745F);
		tentacle6.setTextureOffset(16, 37).addBox(-6.5826F, -5.6743F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle7 = new ModelRenderer(this);
		tentacle7.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle6.addChild(tentacle7);
		setRotationAngle(tentacle7, 0.0F, 0.0F, -0.2618F);
		tentacle7.setTextureOffset(8, 37).addBox(-5.312F, -6.9769F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle8 = new ModelRenderer(this);
		tentacle8.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle7.addChild(tentacle8);
		setRotationAngle(tentacle8, 0.0F, 0.0F, -0.2618F);
		tentacle8.setTextureOffset(0, 37).addBox(-3.7475F, -7.9063F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle9 = new ModelRenderer(this);
		tentacle9.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle8.addChild(tentacle9);
		setRotationAngle(tentacle9, 0.0F, 0.0F, 0.2618F);
		tentacle9.setTextureOffset(32, 33).addBox(-5.312F, -6.9769F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle10 = new ModelRenderer(this);
		tentacle10.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle9.addChild(tentacle10);
		setRotationAngle(tentacle10, 0.0F, 0.0F, -0.4363F);
		tentacle10.setTextureOffset(24, 33).addBox(-2.5933F, -8.2861F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle11 = new ModelRenderer(this);
		tentacle11.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle10.addChild(tentacle11);
		setRotationAngle(tentacle11, 0.0F, 0.0F, -0.8727F);
		tentacle11.setTextureOffset(16, 33).addBox(3.1743F, -7.0826F, -1.6406F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle11_r1 = new ModelRenderer(this);
		tentacle11_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle11.addChild(tentacle11_r1);
		setRotationAngle(tentacle11_r1, 0.0F, 0.0F, -0.3491F);
		tentacle11_r1.setTextureOffset(10, 49).addBox(4.2251F, -6.37F, -1.3406F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		tentacle12 = new ModelRenderer(this);
		tentacle12.setRotationPoint(-1.1294F, 3.0104F, -1.9447F);
		body.addChild(tentacle12);
		setRotationAngle(tentacle12, 0.4092F, -0.9571F, -0.2355F);

		tentacle13 = new ModelRenderer(this);
		tentacle13.setRotationPoint(0.2997F, -0.8243F, 1.2108F);
		tentacle12.addChild(tentacle13);
		setRotationAngle(tentacle13, 0.5996F, -0.1245F, -1.5657F);
		tentacle13.setTextureOffset(8, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle14 = new ModelRenderer(this);
		tentacle14.setRotationPoint(6.3954F, 2.1982F, -2.576F);
		tentacle13.addChild(tentacle14);
		setRotationAngle(tentacle14, 0.0F, 0.0F, -0.3491F);
		tentacle14.setTextureOffset(0, 41).addBox(-6.0868F, -6.2229F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle15 = new ModelRenderer(this);
		tentacle15.setRotationPoint(-5.2579F, -6.1924F, 2.576F);
		tentacle14.addChild(tentacle15);
		setRotationAngle(tentacle15, 0.0F, 0.0F, -0.3491F);
		tentacle15.setTextureOffset(32, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle16 = new ModelRenderer(this);
		tentacle16.setRotationPoint(-1.2493F, 0.2891F, -0.6307F);
		tentacle15.addChild(tentacle16);
		setRotationAngle(tentacle16, 0.0F, 0.0F, 0.3491F);
		tentacle16.setTextureOffset(24, 37).addBox(-0.0961F, -2.6689F, -0.3693F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle17 = new ModelRenderer(this);
		tentacle17.setRotationPoint(5.9907F, 2.554F, -1.9453F);
		tentacle16.addChild(tentacle17);
		setRotationAngle(tentacle17, 0.0F, 0.0F, -0.1745F);
		tentacle17.setTextureOffset(16, 37).addBox(-5.1894F, -7.0344F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle18 = new ModelRenderer(this);
		tentacle18.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle17.addChild(tentacle18);
		setRotationAngle(tentacle18, 0.0F, 0.0F, -0.2618F);
		tentacle18.setTextureOffset(8, 37).addBox(-3.6143F, -7.9301F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle19 = new ModelRenderer(this);
		tentacle19.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle18.addChild(tentacle19);
		setRotationAngle(tentacle19, 0.0F, 0.0F, -0.2618F);
		tentacle19.setTextureOffset(0, 37).addBox(-1.8609F, -8.3876F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle20 = new ModelRenderer(this);
		tentacle20.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle19.addChild(tentacle20);
		setRotationAngle(tentacle20, 0.0F, 0.0F, 0.2618F);
		tentacle20.setTextureOffset(32, 33).addBox(-3.6143F, -7.9301F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle21 = new ModelRenderer(this);
		tentacle21.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle20.addChild(tentacle21);
		setRotationAngle(tentacle21, 0.0F, 0.0F, -0.4363F);
		tentacle21.setTextureOffset(24, 33).addBox(-0.6519F, -8.4326F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22 = new ModelRenderer(this);
		tentacle22.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle21.addChild(tentacle22);
		setRotationAngle(tentacle22, 0.0F, 0.0F, -0.8727F);
		tentacle22.setTextureOffset(16, 33).addBox(4.5344F, -5.6894F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22_r1 = new ModelRenderer(this);
		tentacle22_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle22.addChild(tentacle22_r1);
		setRotationAngle(tentacle22_r1, 0.0F, 0.0F, -0.3491F);
		tentacle22_r1.setTextureOffset(10, 49).addBox(5.0267F, -4.5956F, 1.876F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		tentacle23 = new ModelRenderer(this);
		tentacle23.setRotationPoint(2.8706F, 3.0104F, -1.9447F);
		body.addChild(tentacle23);
		setRotationAngle(tentacle23, 0.3862F, -0.9169F, -0.2069F);

		tentacle24 = new ModelRenderer(this);
		tentacle24.setRotationPoint(0.2997F, -0.8243F, 1.2108F);
		tentacle23.addChild(tentacle24);
		setRotationAngle(tentacle24, 0.5996F, -0.1245F, -1.5657F);
		tentacle24.setTextureOffset(8, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle25 = new ModelRenderer(this);
		tentacle25.setRotationPoint(6.3954F, 2.1982F, -2.576F);
		tentacle24.addChild(tentacle25);
		setRotationAngle(tentacle25, 0.0F, 0.0F, -0.3491F);
		tentacle25.setTextureOffset(0, 41).addBox(-6.0868F, -6.2229F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle26 = new ModelRenderer(this);
		tentacle26.setRotationPoint(-5.2579F, -6.1924F, 2.576F);
		tentacle25.addChild(tentacle26);
		setRotationAngle(tentacle26, 0.0F, 0.0F, -0.3491F);
		tentacle26.setTextureOffset(32, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle27 = new ModelRenderer(this);
		tentacle27.setRotationPoint(-1.2493F, 0.2891F, -0.6307F);
		tentacle26.addChild(tentacle27);
		setRotationAngle(tentacle27, 0.0F, 0.0F, 0.3491F);
		tentacle27.setTextureOffset(24, 37).addBox(-0.0961F, -2.6689F, -0.3693F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle28 = new ModelRenderer(this);
		tentacle28.setRotationPoint(5.9907F, 2.554F, -1.9453F);
		tentacle27.addChild(tentacle28);
		setRotationAngle(tentacle28, 0.0F, 0.0F, -0.1745F);
		tentacle28.setTextureOffset(16, 37).addBox(-5.1894F, -7.0344F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle29 = new ModelRenderer(this);
		tentacle29.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle28.addChild(tentacle29);
		setRotationAngle(tentacle29, 0.0F, 0.0F, -0.2618F);
		tentacle29.setTextureOffset(8, 37).addBox(-3.6143F, -7.9301F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle30 = new ModelRenderer(this);
		tentacle30.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle29.addChild(tentacle30);
		setRotationAngle(tentacle30, 0.0F, 0.0F, -0.2618F);
		tentacle30.setTextureOffset(0, 37).addBox(-1.8609F, -8.3876F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle31 = new ModelRenderer(this);
		tentacle31.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle30.addChild(tentacle31);
		setRotationAngle(tentacle31, 0.0F, 0.0F, 0.2618F);
		tentacle31.setTextureOffset(32, 33).addBox(-3.6143F, -7.9301F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle32 = new ModelRenderer(this);
		tentacle32.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle31.addChild(tentacle32);
		setRotationAngle(tentacle32, 0.0F, 0.0F, -0.4363F);
		tentacle32.setTextureOffset(24, 33).addBox(-0.6519F, -8.4326F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle33 = new ModelRenderer(this);
		tentacle33.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle32.addChild(tentacle33);
		setRotationAngle(tentacle33, 0.0F, 0.0F, -0.8727F);
		tentacle33.setTextureOffset(16, 33).addBox(4.5344F, -5.6894F, 1.576F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22_r2 = new ModelRenderer(this);
		tentacle22_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle33.addChild(tentacle22_r2);
		setRotationAngle(tentacle22_r2, 0.0F, 0.0F, -0.3491F);
		tentacle22_r2.setTextureOffset(10, 49).addBox(5.0267F, -4.5956F, 1.876F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, -5.0F, 0.0F);
		body.addChild(stinger);
		setRotationAngle(stinger, 2.4871F, 0.0F, 0.0F);
		stinger.setTextureOffset(8, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger2 = new ModelRenderer(this);
		stinger2.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger.addChild(stinger2);
		setRotationAngle(stinger2, -0.4363F, 0.0F, 0.0F);
		stinger2.setTextureOffset(0, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger3 = new ModelRenderer(this);
		stinger3.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger2.addChild(stinger3);
		setRotationAngle(stinger3, -0.3491F, 0.0F, 0.0F);
		stinger3.setTextureOffset(32, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger4 = new ModelRenderer(this);
		stinger4.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger3.addChild(stinger4);
		setRotationAngle(stinger4, -0.3491F, 0.0F, 0.0F);
		stinger4.setTextureOffset(24, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger5 = new ModelRenderer(this);
		stinger5.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger4.addChild(stinger5);
		setRotationAngle(stinger5, -0.2618F, 0.0F, 0.0F);
		stinger5.setTextureOffset(16, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger6 = new ModelRenderer(this);
		stinger6.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger5.addChild(stinger6);
		setRotationAngle(stinger6, -0.3491F, 0.0F, 0.0F);
		stinger6.setTextureOffset(8, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger7 = new ModelRenderer(this);
		stinger7.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger6.addChild(stinger7);
		setRotationAngle(stinger7, -0.3491F, 0.0F, 0.0F);
		stinger7.setTextureOffset(0, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger8 = new ModelRenderer(this);
		stinger8.setRotationPoint(0.0F, 2.0F, 0.0F);
		stinger7.addChild(stinger8);
		setRotationAngle(stinger8, -0.4363F, 0.0F, 0.0F);
		stinger8.setTextureOffset(32, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		stinger8_r1 = new ModelRenderer(this);
		stinger8_r1.setRotationPoint(0.0F, 3.5834F, -1.6811F);
		stinger8.addChild(stinger8_r1);
		setRotationAngle(stinger8_r1, -1.1345F, 0.0F, 0.0F);
		stinger8_r1.setTextureOffset(16, 22).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, true);

		stinger8_r2 = new ModelRenderer(this);
		stinger8_r2.setRotationPoint(0.0F, 1.9F, -0.5F);
		stinger8.addChild(stinger8_r2);
		setRotationAngle(stinger8_r2, -0.3491F, 0.0F, 0.0F);
		stinger8_r2.setTextureOffset(36, 14).addBox(-1.0F, -0.9736F, -0.9809F, 2.0F, 3.0F, 3.0F, -0.49F, true);

		stinger8_r3 = new ModelRenderer(this);
		stinger8_r3.setRotationPoint(0.0F, 1.9F, -0.5F);
		stinger8.addChild(stinger8_r3);
		setRotationAngle(stinger8_r3, -0.6109F, 0.0F, 0.0F);
		stinger8_r3.setTextureOffset(24, 22).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		all.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.tentacle12.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tentacle23.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}