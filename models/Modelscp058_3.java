// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscp058_3 extends EntityModel<Entity> {
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
	private final ModelRenderer tentacle45;
	private final ModelRenderer tentacle46;
	private final ModelRenderer tentacle47;
	private final ModelRenderer tentacle48;
	private final ModelRenderer tentacle49;
	private final ModelRenderer tentacle50;
	private final ModelRenderer tentacle51;
	private final ModelRenderer tentacle52;
	private final ModelRenderer tentacle53;
	private final ModelRenderer tentacle54;
	private final ModelRenderer tentacle55;
	private final ModelRenderer tentacle22_r2;
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
	private final ModelRenderer tentacle33_r1;
	private final ModelRenderer tentacle34;
	private final ModelRenderer tentacle35;
	private final ModelRenderer tentacle36;
	private final ModelRenderer tentacle37;
	private final ModelRenderer tentacle38;
	private final ModelRenderer tentacle39;
	private final ModelRenderer tentacle40;
	private final ModelRenderer tentacle41;
	private final ModelRenderer tentacle42;
	private final ModelRenderer tentacle43;
	private final ModelRenderer tentacle44;
	private final ModelRenderer tentacle33_r2;
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

	public Modelscp058_3() {
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
		tentacle12.setRotationPoint(-0.1294F, 2.5104F, -0.6947F);
		body.addChild(tentacle12);
		setRotationAngle(tentacle12, 0.0233F, 0.2608F, -0.1715F);
		tentacle12.setTextureOffset(16, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle13 = new ModelRenderer(this);
		tentacle13.setRotationPoint(1.81F, -7.255F, -0.3053F);
		tentacle12.addChild(tentacle13);
		setRotationAngle(tentacle13, 0.5996F, -0.1245F, -1.5657F);
		tentacle13.setTextureOffset(8, 41).addBox(-7.674F, -2.3208F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle14 = new ModelRenderer(this);
		tentacle14.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle13.addChild(tentacle14);
		setRotationAngle(tentacle14, 0.0F, 0.0F, -0.3491F);
		tentacle14.setTextureOffset(0, 41).addBox(-6.9907F, -4.554F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle15 = new ModelRenderer(this);
		tentacle15.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle14.addChild(tentacle15);
		setRotationAngle(tentacle15, 0.0F, 0.0F, -0.3491F);
		tentacle15.setTextureOffset(32, 37).addBox(-5.5849F, -6.4187F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle16 = new ModelRenderer(this);
		tentacle16.setRotationPoint(-4.4139F, -6.3886F, 1.9453F);
		tentacle15.addChild(tentacle16);
		setRotationAngle(tentacle16, 0.0F, 0.0F, 0.3491F);
		tentacle16.setTextureOffset(24, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle17 = new ModelRenderer(this);
		tentacle17.setRotationPoint(5.9907F, 2.554F, -1.9453F);
		tentacle16.addChild(tentacle17);
		setRotationAngle(tentacle17, 0.0F, 0.0F, -0.1745F);
		tentacle17.setTextureOffset(16, 37).addBox(-6.3694F, -5.5478F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle18 = new ModelRenderer(this);
		tentacle18.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle17.addChild(tentacle18);
		setRotationAngle(tentacle18, 0.0F, 0.0F, -0.2618F);
		tentacle18.setTextureOffset(8, 37).addBox(-5.1388F, -6.7996F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle19 = new ModelRenderer(this);
		tentacle19.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle18.addChild(tentacle19);
		setRotationAngle(tentacle19, 0.0F, 0.0F, -0.2618F);
		tentacle19.setTextureOffset(0, 37).addBox(-3.6261F, -7.6902F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle20 = new ModelRenderer(this);
		tentacle20.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle19.addChild(tentacle20);
		setRotationAngle(tentacle20, 0.0F, 0.0F, 0.2618F);
		tentacle20.setTextureOffset(32, 33).addBox(-5.1388F, -6.7996F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle21 = new ModelRenderer(this);
		tentacle21.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle20.addChild(tentacle21);
		setRotationAngle(tentacle21, 0.0F, 0.0F, -0.4363F);
		tentacle21.setTextureOffset(24, 33).addBox(-2.5113F, -8.0522F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22 = new ModelRenderer(this);
		tentacle22.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle21.addChild(tentacle22);
		setRotationAngle(tentacle22, 0.0F, 0.0F, -0.8727F);
		tentacle22.setTextureOffset(16, 33).addBox(3.0478F, -6.8694F, 0.9453F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22_r1 = new ModelRenderer(this);
		tentacle22_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle22.addChild(tentacle22_r1);
		setRotationAngle(tentacle22_r1, 0.0F, 0.0F, -0.3491F);
		tentacle22_r1.setTextureOffset(10, 49).addBox(4.0334F, -6.2129F, 1.2453F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		tentacle45 = new ModelRenderer(this);
		tentacle45.setRotationPoint(-0.1294F, 2.5104F, -0.6947F);
		body.addChild(tentacle45);
		setRotationAngle(tentacle45, 0.0233F, 0.2608F, -0.1715F);
		tentacle45.setTextureOffset(16, 41).addBox(-1.743F, -1.1263F, 1.9038F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle46 = new ModelRenderer(this);
		tentacle46.setRotationPoint(1.81F, -7.255F, -0.3053F);
		tentacle45.addChild(tentacle46);
		setRotationAngle(tentacle46, 0.5996F, -0.1245F, -1.5657F);
		tentacle46.setTextureOffset(8, 41).addBox(-7.1918F, -1.3174F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle47 = new ModelRenderer(this);
		tentacle47.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle46.addChild(tentacle47);
		setRotationAngle(tentacle47, 0.0F, 0.0F, -0.3491F);
		tentacle47.setTextureOffset(0, 41).addBox(-6.8809F, -3.4462F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle48 = new ModelRenderer(this);
		tentacle48.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle47.addChild(tentacle48);
		setRotationAngle(tentacle48, 0.0F, 0.0F, -0.3491F);
		tentacle48.setTextureOffset(32, 37).addBox(-5.8606F, -5.3401F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle49 = new ModelRenderer(this);
		tentacle49.setRotationPoint(-4.6896F, -5.31F, 4.7311F);
		tentacle48.addChild(tentacle49);
		setRotationAngle(tentacle49, 0.0F, 0.0F, 0.3491F);
		tentacle49.setTextureOffset(24, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle50 = new ModelRenderer(this);
		tentacle50.setRotationPoint(5.8809F, 1.4462F, -4.7311F);
		tentacle49.addChild(tentacle50);
		setRotationAngle(tentacle50, 0.0F, 0.0F, -0.1745F);
		tentacle50.setTextureOffset(16, 37).addBox(-6.4536F, -4.4377F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle51 = new ModelRenderer(this);
		tentacle51.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle50.addChild(tentacle51);
		setRotationAngle(tentacle51, 0.0F, 0.0F, -0.2618F);
		tentacle51.setTextureOffset(8, 37).addBox(-5.5074F, -5.7491F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle52 = new ModelRenderer(this);
		tentacle52.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle51.addChild(tentacle52);
		setRotationAngle(tentacle52, 0.0F, 0.0F, -0.2618F);
		tentacle52.setTextureOffset(0, 37).addBox(-4.254F, -6.7709F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle53 = new ModelRenderer(this);
		tentacle53.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle52.addChild(tentacle53);
		setRotationAngle(tentacle53, 0.0F, 0.0F, 0.2618F);
		tentacle53.setTextureOffset(32, 33).addBox(-5.5074F, -5.7491F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle54 = new ModelRenderer(this);
		tentacle54.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle53.addChild(tentacle54);
		setRotationAngle(tentacle54, 0.0F, 0.0F, -0.4363F);
		tentacle54.setTextureOffset(24, 33).addBox(-3.2893F, -7.2559F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle55 = new ModelRenderer(this);
		tentacle55.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle54.addChild(tentacle55);
		setRotationAngle(tentacle55, 0.0F, 0.0F, -0.8727F);
		tentacle55.setTextureOffset(16, 33).addBox(1.9377F, -6.9536F, 3.7311F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle22_r2 = new ModelRenderer(this);
		tentacle22_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle55.addChild(tentacle22_r2);
		setRotationAngle(tentacle22_r2, 0.0F, 0.0F, -0.3491F);
		tentacle22_r2.setTextureOffset(10, 49).addBox(3.0191F, -6.6717F, 4.0311F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		tentacle23 = new ModelRenderer(this);
		tentacle23.setRotationPoint(0.2436F, 2.4952F, -0.6947F);
		body.addChild(tentacle23);
		setRotationAngle(tentacle23, 3.1416F, -0.3491F, -3.0543F);
		tentacle23.setTextureOffset(16, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle24 = new ModelRenderer(this);
		tentacle24.setRotationPoint(0.3241F, -7.4667F, 0.5997F);
		tentacle23.addChild(tentacle24);
		setRotationAngle(tentacle24, 0.0F, 0.0F, -1.5708F);
		tentacle24.setTextureOffset(8, 41).addBox(-7.9667F, -1.8241F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle25 = new ModelRenderer(this);
		tentacle25.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle24.addChild(tentacle25);
		setRotationAngle(tentacle25, 0.0F, 0.0F, -0.3491F);
		tentacle25.setTextureOffset(0, 41).addBox(-7.4357F, -4.1874F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle26 = new ModelRenderer(this);
		tentacle26.setRotationPoint(-6.6069F, -4.1569F, -0.5997F);
		tentacle25.addChild(tentacle26);
		setRotationAngle(tentacle26, 0.0F, 0.0F, -0.3491F);
		tentacle26.setTextureOffset(32, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle27 = new ModelRenderer(this);
		tentacle27.setRotationPoint(0.171F, -0.9699F, 0.0F);
		tentacle26.addChild(tentacle27);
		setRotationAngle(tentacle27, 0.0F, 0.0F, 0.3491F);
		tentacle27.setTextureOffset(24, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle28 = new ModelRenderer(this);
		tentacle28.setRotationPoint(6.4357F, 2.1874F, 0.5997F);
		tentacle27.addChild(tentacle28);
		setRotationAngle(tentacle28, 0.0F, 0.0F, -0.1745F);
		tentacle28.setTextureOffset(16, 37).addBox(-6.8713F, -5.2641F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle29 = new ModelRenderer(this);
		tentacle29.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle28.addChild(tentacle29);
		setRotationAngle(tentacle29, 0.0F, 0.0F, -0.2618F);
		tentacle29.setTextureOffset(8, 37).addBox(-5.697F, -6.6554F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle30 = new ModelRenderer(this);
		tentacle30.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle29.addChild(tentacle30);
		setRotationAngle(tentacle30, 0.0F, 0.0F, -0.2618F);
		tentacle30.setTextureOffset(0, 37).addBox(-4.2026F, -7.6954F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle31 = new ModelRenderer(this);
		tentacle31.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle30.addChild(tentacle31);
		setRotationAngle(tentacle31, 0.0F, 0.0F, 0.2618F);
		tentacle31.setTextureOffset(32, 33).addBox(-5.697F, -6.6554F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle32 = new ModelRenderer(this);
		tentacle32.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle31.addChild(tentacle32);
		setRotationAngle(tentacle32, 0.0F, 0.0F, -0.4363F);
		tentacle32.setTextureOffset(24, 33).addBox(-3.0782F, -8.1574F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle33 = new ModelRenderer(this);
		tentacle33.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle32.addChild(tentacle33);
		setRotationAngle(tentacle33, 0.0F, 0.0F, -0.8727F);
		tentacle33.setTextureOffset(16, 33).addBox(2.7641F, -7.3713F, -1.5997F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle33_r1 = new ModelRenderer(this);
		tentacle33_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle33.addChild(tentacle33_r1);
		setRotationAngle(tentacle33_r1, 0.0F, 0.0F, -0.3491F);
		tentacle33_r1.setTextureOffset(10, 49).addBox(3.9384F, -6.7816F, -1.2997F, 1.0F, 2.0F, 1.0F, -0.5F, false);

		tentacle34 = new ModelRenderer(this);
		tentacle34.setRotationPoint(0.2436F, 2.4952F, -0.6947F);
		body.addChild(tentacle34);
		setRotationAngle(tentacle34, 3.1416F, -0.3491F, -3.0543F);
		tentacle34.setTextureOffset(16, 41).addBox(0.0359F, -1.1303F, -3.8125F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle35 = new ModelRenderer(this);
		tentacle35.setRotationPoint(0.3241F, -7.4667F, 0.5997F);
		tentacle34.addChild(tentacle35);
		setRotationAngle(tentacle35, 0.0F, 0.0F, -1.5708F);
		tentacle35.setTextureOffset(8, 41).addBox(-7.8364F, -0.7882F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle36 = new ModelRenderer(this);
		tentacle36.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle35.addChild(tentacle36);
		setRotationAngle(tentacle36, 0.0F, 0.0F, -0.3491F);
		tentacle36.setTextureOffset(0, 41).addBox(-7.6676F, -3.1695F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle37 = new ModelRenderer(this);
		tentacle37.setRotationPoint(-6.6069F, -4.1569F, -0.5997F);
		tentacle36.addChild(tentacle37);
		setRotationAngle(tentacle37, 0.0F, 0.0F, -0.3491F);
		tentacle37.setTextureOffset(32, 37).addBox(-1.5661F, -0.1228F, -3.8125F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle38 = new ModelRenderer(this);
		tentacle38.setRotationPoint(-0.3951F, -0.0927F, -2.8125F);
		tentacle37.addChild(tentacle38);
		setRotationAngle(tentacle38, 0.0F, 0.0F, 0.3491F);
		tentacle38.setTextureOffset(24, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle39 = new ModelRenderer(this);
		tentacle39.setRotationPoint(6.6676F, 1.1695F, 3.4122F);
		tentacle38.addChild(tentacle39);
		setRotationAngle(tentacle39, 0.0F, 0.0F, -0.1745F);
		tentacle39.setTextureOffset(16, 37).addBox(-7.2764F, -4.3019F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle40 = new ModelRenderer(this);
		tentacle40.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle39.addChild(tentacle40);
		setRotationAngle(tentacle40, 0.0F, 0.0F, -0.2618F);
		tentacle40.setTextureOffset(8, 37).addBox(-6.3374F, -5.8308F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle41 = new ModelRenderer(this);
		tentacle41.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle40.addChild(tentacle41);
		setRotationAngle(tentacle41, 0.0F, 0.0F, -0.2618F);
		tentacle41.setTextureOffset(0, 37).addBox(-5.0346F, -7.0647F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle42 = new ModelRenderer(this);
		tentacle42.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle41.addChild(tentacle42);
		setRotationAngle(tentacle42, 0.0F, 0.0F, 0.2618F);
		tentacle42.setTextureOffset(32, 33).addBox(-6.3374F, -5.8308F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle43 = new ModelRenderer(this);
		tentacle43.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle42.addChild(tentacle43);
		setRotationAngle(tentacle43, 0.0F, 0.0F, -0.4363F);
		tentacle43.setTextureOffset(24, 33).addBox(-4.007F, -7.6807F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle44 = new ModelRenderer(this);
		tentacle44.setRotationPoint(0.0F, -1.0F, 0.0F);
		tentacle43.addChild(tentacle44);
		setRotationAngle(tentacle44, 0.0F, 0.0F, -0.8727F);
		tentacle44.setTextureOffset(16, 33).addBox(1.8019F, -7.7764F, -4.4122F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		tentacle33_r2 = new ModelRenderer(this);
		tentacle33_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		tentacle44.addChild(tentacle33_r2);
		setRotationAngle(tentacle33_r2, 0.0F, 0.0F, -0.3491F);
		tentacle33_r2.setTextureOffset(10, 49).addBox(3.1728F, -7.4914F, -4.1122F, 1.0F, 2.0F, 1.0F, -0.5F, false);

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
		this.tentacle45.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tentacle12.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tentacle23.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.tentacle34.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}