// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelthe_hovering_inferno extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer Cuerpo;
	private final ModelRenderer bone;
	private final ModelRenderer Escudos;
	private final ModelRenderer Escudo1;
	private final ModelRenderer Cuernos;
	private final ModelRenderer Bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone12;
	private final ModelRenderer Bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer bone13;
	private final ModelRenderer Bone6;
	private final ModelRenderer bone20;
	private final ModelRenderer bone7;
	private final ModelRenderer bone11;
	private final ModelRenderer Bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer Bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer Bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer Bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer Bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer Escudo2;
	private final ModelRenderer Cuernos2;
	private final ModelRenderer Bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer Bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer Bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer Bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer Bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer Bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer Bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer Bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer Escudo3;
	private final ModelRenderer Cuernos3;
	private final ModelRenderer Bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer Bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer Bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer Bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer Bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer Bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer Bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer Bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer Escudo4;
	private final ModelRenderer Cuernos4;
	private final ModelRenderer Bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer Bone80;
	private final ModelRenderer bone81;
	private final ModelRenderer bone82;
	private final ModelRenderer Bone83;
	private final ModelRenderer bone84;
	private final ModelRenderer bone85;
	private final ModelRenderer bone86;
	private final ModelRenderer Bone87;
	private final ModelRenderer bone88;
	private final ModelRenderer bone89;
	private final ModelRenderer Bone90;
	private final ModelRenderer bone91;
	private final ModelRenderer bone92;
	private final ModelRenderer Bone93;
	private final ModelRenderer bone94;
	private final ModelRenderer bone95;
	private final ModelRenderer Bone96;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer Bone99;
	private final ModelRenderer bone100;
	private final ModelRenderer bone101;

	public Modelthe_hovering_inferno() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -4.75F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 46).addBox(-4.0F, -6.75F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);

		Cuerpo = new ModelRenderer(this);
		Cuerpo.setRotationPoint(3.0F, 8.0F, -10.0F);
		head.addChild(Cuerpo);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.0F, 0.0F, 10.0F);
		Cuerpo.addChild(bone);
		bone.setTextureOffset(32, 21).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 21.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(48, 21).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 21.0F, 4.0F, 0.5F, false);

		Escudos = new ModelRenderer(this);
		Escudos.setRotationPoint(0.0F, 0.0F, 0.0F);

		Escudo1 = new ModelRenderer(this);
		Escudo1.setRotationPoint(0.0F, 5.0F, 0.0F);
		Escudos.addChild(Escudo1);
		setRotationAngle(Escudo1, -0.2618F, 0.0F, 0.0F);
		Escudo1.setTextureOffset(36, 0).addBox(-6.0F, -0.2421F, -10.2623F, 12.0F, 19.0F, 2.0F, 0.0F, false);

		Cuernos = new ModelRenderer(this);
		Cuernos.setRotationPoint(-5.0F, 1.4824F, -8.0681F);
		Escudo1.addChild(Cuernos);

		Bone4 = new ModelRenderer(this);
		Bone4.setRotationPoint(10.25F, 0.0F, -2.0F);
		Cuernos.addChild(Bone4);
		setRotationAngle(Bone4, 0.0F, 0.0F, 0.7854F);
		Bone4.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone4.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.3491F);
		bone3.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.1745F);
		bone12.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone5 = new ModelRenderer(this);
		Bone5.setRotationPoint(-0.25F, 0.0F, 0.0F);
		Cuernos.addChild(Bone5);
		setRotationAngle(Bone5, 0.0F, 3.1416F, -0.7854F);
		Bone5.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, 0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone5.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.3491F);
		bone2.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.1745F);
		bone13.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone6 = new ModelRenderer(this);
		Bone6.setRotationPoint(5.0F, -1.0F, -2.0F);
		Cuernos.addChild(Bone6);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone6.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, 0.7854F);
		bone20.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(bone7);
		setRotationAngle(bone7, 0.0436F, 0.0F, -0.2618F);
		bone7.setTextureOffset(25, 4).addBox(-0.3622F, -2.6353F, 0.3334F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone11);
		setRotationAngle(bone11, -0.1309F, 0.0F, -0.0436F);
		bone11.setTextureOffset(30, 4).addBox(-0.3342F, -4.6231F, 0.05F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone8 = new ModelRenderer(this);
		Bone8.setRotationPoint(0.0F, 0.0F, 2.0F);
		Bone6.addChild(Bone8);
		setRotationAngle(Bone8, 0.0F, 3.1416F, -0.7854F);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0436F, 0.0F, -0.2618F);
		bone9.setTextureOffset(25, 4).addBox(-0.3622F, -2.6183F, 0.7213F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(bone10);
		setRotationAngle(bone10, 0.1309F, 0.0F, -0.0436F);
		bone10.setTextureOffset(30, 4).addBox(-0.3349F, -4.5992F, 1.0021F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone21 = new ModelRenderer(this);
		Bone21.setRotationPoint(12.0F, 12.0F, -2.0F);
		Cuernos.addChild(Bone21);
		setRotationAngle(Bone21, 0.0F, 0.0F, 2.5744F);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.3491F);
		bone22.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, -0.1745F);
		bone23.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone17 = new ModelRenderer(this);
		Bone17.setRotationPoint(12.0F, 8.0F, -2.0F);
		Cuernos.addChild(Bone17);
		setRotationAngle(Bone17, 0.0F, 0.0F, 2.5744F);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.3491F);
		bone18.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -0.1745F);
		bone19.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone24 = new ModelRenderer(this);
		Bone24.setRotationPoint(-2.0F, -2.0F, 2.0F);
		Cuernos.addChild(Bone24);
		setRotationAngle(Bone24, 0.0F, 3.1416F, -2.5744F);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone24.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -0.3491F);
		bone25.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.1745F);
		bone26.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone14 = new ModelRenderer(this);
		Bone14.setRotationPoint(-2.0F, -6.0F, 2.0F);
		Cuernos.addChild(Bone14);
		setRotationAngle(Bone14, 0.0F, 3.1416F, -2.5744F);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone14.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.3491F);
		bone15.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.1745F);
		bone16.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Escudo2 = new ModelRenderer(this);
		Escudo2.setRotationPoint(0.0F, 5.0F, 0.0F);
		Escudos.addChild(Escudo2);
		setRotationAngle(Escudo2, -0.2618F, -1.5708F, 0.0F);
		Escudo2.setTextureOffset(36, 0).addBox(-6.0F, -0.2421F, -10.2623F, 12.0F, 19.0F, 2.0F, 0.0F, false);

		Cuernos2 = new ModelRenderer(this);
		Cuernos2.setRotationPoint(-5.0F, 1.4824F, -8.0681F);
		Escudo2.addChild(Cuernos2);

		Bone27 = new ModelRenderer(this);
		Bone27.setRotationPoint(10.25F, 0.0F, -2.0F);
		Cuernos2.addChild(Bone27);
		setRotationAngle(Bone27, 0.0F, 0.0F, 0.7854F);
		Bone27.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone27.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -0.3491F);
		bone28.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.1745F);
		bone29.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone30 = new ModelRenderer(this);
		Bone30.setRotationPoint(-0.25F, 0.0F, 0.0F);
		Cuernos2.addChild(Bone30);
		setRotationAngle(Bone30, 0.0F, 3.1416F, -0.7854F);
		Bone30.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, 0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone30.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -0.3491F);
		bone31.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -0.1745F);
		bone32.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone33 = new ModelRenderer(this);
		Bone33.setRotationPoint(5.0F, -1.0F, -2.0F);
		Cuernos2.addChild(Bone33);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone33.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.7854F);
		bone34.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(bone35);
		setRotationAngle(bone35, 0.0436F, 0.0F, -0.2618F);
		bone35.setTextureOffset(25, 4).addBox(-0.3622F, -2.6353F, 0.3334F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(bone36);
		setRotationAngle(bone36, -0.1309F, 0.0F, -0.0436F);
		bone36.setTextureOffset(30, 4).addBox(-0.3342F, -4.6231F, 0.05F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone37 = new ModelRenderer(this);
		Bone37.setRotationPoint(0.0F, 0.0F, 2.0F);
		Bone33.addChild(Bone37);
		setRotationAngle(Bone37, 0.0F, 3.1416F, -0.7854F);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone37.addChild(bone38);
		setRotationAngle(bone38, 0.0436F, 0.0F, -0.2618F);
		bone38.setTextureOffset(25, 4).addBox(-0.3622F, -2.6183F, 0.7213F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(bone39);
		setRotationAngle(bone39, 0.1309F, 0.0F, -0.0436F);
		bone39.setTextureOffset(30, 4).addBox(-0.3349F, -4.5992F, 1.0021F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone40 = new ModelRenderer(this);
		Bone40.setRotationPoint(12.0F, 12.0F, -2.0F);
		Cuernos2.addChild(Bone40);
		setRotationAngle(Bone40, 0.0F, 0.0F, 2.5744F);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone40.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, -0.3491F);
		bone41.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, -0.1745F);
		bone42.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone43 = new ModelRenderer(this);
		Bone43.setRotationPoint(12.0F, 8.0F, -2.0F);
		Cuernos2.addChild(Bone43);
		setRotationAngle(Bone43, 0.0F, 0.0F, 2.5744F);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone43.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, -0.3491F);
		bone44.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, -0.1745F);
		bone45.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone46 = new ModelRenderer(this);
		Bone46.setRotationPoint(-2.0F, -2.0F, 2.0F);
		Cuernos2.addChild(Bone46);
		setRotationAngle(Bone46, 0.0F, 3.1416F, -2.5744F);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone46.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, -0.3491F);
		bone47.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -0.1745F);
		bone48.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone49 = new ModelRenderer(this);
		Bone49.setRotationPoint(-2.0F, -6.0F, 2.0F);
		Cuernos2.addChild(Bone49);
		setRotationAngle(Bone49, 0.0F, 3.1416F, -2.5744F);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone49.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, -0.3491F);
		bone50.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone50.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, -0.1745F);
		bone51.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Escudo3 = new ModelRenderer(this);
		Escudo3.setRotationPoint(0.0F, 5.0F, 0.0F);
		Escudos.addChild(Escudo3);
		setRotationAngle(Escudo3, -0.2618F, 3.1416F, 0.0F);
		Escudo3.setTextureOffset(36, 0).addBox(-6.0F, -0.2421F, -10.2623F, 12.0F, 19.0F, 2.0F, 0.0F, false);

		Cuernos3 = new ModelRenderer(this);
		Cuernos3.setRotationPoint(-5.0F, 1.4824F, -8.0681F);
		Escudo3.addChild(Cuernos3);

		Bone52 = new ModelRenderer(this);
		Bone52.setRotationPoint(10.25F, 0.0F, -2.0F);
		Cuernos3.addChild(Bone52);
		setRotationAngle(Bone52, 0.0F, 0.0F, 0.7854F);
		Bone52.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone52.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.0F, -0.3491F);
		bone53.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone53.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 0.0F, -0.1745F);
		bone54.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone55 = new ModelRenderer(this);
		Bone55.setRotationPoint(-0.25F, 0.0F, 0.0F);
		Cuernos3.addChild(Bone55);
		setRotationAngle(Bone55, 0.0F, 3.1416F, -0.7854F);
		Bone55.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, 0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone55.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 0.0F, -0.3491F);
		bone56.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(bone57);
		setRotationAngle(bone57, 0.0F, 0.0F, -0.1745F);
		bone57.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone58 = new ModelRenderer(this);
		Bone58.setRotationPoint(5.0F, -1.0F, -2.0F);
		Cuernos3.addChild(Bone58);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone58.addChild(bone59);
		setRotationAngle(bone59, 0.0F, 0.0F, 0.7854F);
		bone59.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone59.addChild(bone60);
		setRotationAngle(bone60, 0.0436F, 0.0F, -0.2618F);
		bone60.setTextureOffset(25, 4).addBox(-0.3622F, -2.6353F, 0.3334F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(bone61);
		setRotationAngle(bone61, -0.1309F, 0.0F, -0.0436F);
		bone61.setTextureOffset(30, 4).addBox(-0.3342F, -4.6231F, 0.05F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone62 = new ModelRenderer(this);
		Bone62.setRotationPoint(0.0F, 0.0F, 2.0F);
		Bone58.addChild(Bone62);
		setRotationAngle(Bone62, 0.0F, 3.1416F, -0.7854F);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone62.addChild(bone63);
		setRotationAngle(bone63, 0.0436F, 0.0F, -0.2618F);
		bone63.setTextureOffset(25, 4).addBox(-0.3622F, -2.6183F, 0.7213F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(bone64);
		setRotationAngle(bone64, 0.1309F, 0.0F, -0.0436F);
		bone64.setTextureOffset(30, 4).addBox(-0.3349F, -4.5992F, 1.0021F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone65 = new ModelRenderer(this);
		Bone65.setRotationPoint(12.0F, 12.0F, -2.0F);
		Cuernos3.addChild(Bone65);
		setRotationAngle(Bone65, 0.0F, 0.0F, 2.5744F);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone65.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, -0.3491F);
		bone66.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone66.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -0.1745F);
		bone67.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone68 = new ModelRenderer(this);
		Bone68.setRotationPoint(12.0F, 8.0F, -2.0F);
		Cuernos3.addChild(Bone68);
		setRotationAngle(Bone68, 0.0F, 0.0F, 2.5744F);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone68.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, -0.3491F);
		bone69.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone69.addChild(bone70);
		setRotationAngle(bone70, 0.0F, 0.0F, -0.1745F);
		bone70.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone71 = new ModelRenderer(this);
		Bone71.setRotationPoint(-2.0F, -2.0F, 2.0F);
		Cuernos3.addChild(Bone71);
		setRotationAngle(Bone71, 0.0F, 3.1416F, -2.5744F);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone71.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, -0.3491F);
		bone72.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(bone73);
		setRotationAngle(bone73, 0.0F, 0.0F, -0.1745F);
		bone73.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone74 = new ModelRenderer(this);
		Bone74.setRotationPoint(-2.0F, -6.0F, 2.0F);
		Cuernos3.addChild(Bone74);
		setRotationAngle(Bone74, 0.0F, 3.1416F, -2.5744F);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone74.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, -0.3491F);
		bone75.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone75.addChild(bone76);
		setRotationAngle(bone76, 0.0F, 0.0F, -0.1745F);
		bone76.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Escudo4 = new ModelRenderer(this);
		Escudo4.setRotationPoint(0.0F, 5.0F, 0.0F);
		Escudos.addChild(Escudo4);
		setRotationAngle(Escudo4, -0.2618F, 1.5708F, 0.0F);
		Escudo4.setTextureOffset(36, 0).addBox(-6.0F, -0.2421F, -10.2623F, 12.0F, 19.0F, 2.0F, 0.0F, false);

		Cuernos4 = new ModelRenderer(this);
		Cuernos4.setRotationPoint(-5.0F, 1.4824F, -8.0681F);
		Escudo4.addChild(Cuernos4);

		Bone77 = new ModelRenderer(this);
		Bone77.setRotationPoint(10.25F, 0.0F, -2.0F);
		Cuernos4.addChild(Bone77);
		setRotationAngle(Bone77, 0.0F, 0.0F, 0.7854F);
		Bone77.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone77.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 0.0F, -0.3491F);
		bone78.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone78.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 0.0F, -0.1745F);
		bone79.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone80 = new ModelRenderer(this);
		Bone80.setRotationPoint(-0.25F, 0.0F, 0.0F);
		Cuernos4.addChild(Bone80);
		setRotationAngle(Bone80, 0.0F, 3.1416F, -0.7854F);
		Bone80.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, 0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone80.addChild(bone81);
		setRotationAngle(bone81, 0.0F, 0.0F, -0.3491F);
		bone81.setTextureOffset(25, 4).addBox(-0.3062F, -2.6566F, 0.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone81.addChild(bone82);
		setRotationAngle(bone82, 0.0F, 0.0F, -0.1745F);
		bone82.setTextureOffset(30, 4).addBox(0.3125F, -4.6998F, 0.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone83 = new ModelRenderer(this);
		Bone83.setRotationPoint(5.0F, -1.0F, -2.0F);
		Cuernos4.addChild(Bone83);

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone83.addChild(bone84);
		setRotationAngle(bone84, 0.0F, 0.0F, 0.7854F);
		bone84.setTextureOffset(25, 0).addBox(-1.5123F, -1.5123F, -0.1941F, 2.0F, 2.0F, 2.0F, 0.2F, false);

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone84.addChild(bone85);
		setRotationAngle(bone85, 0.0436F, 0.0F, -0.2618F);
		bone85.setTextureOffset(25, 4).addBox(-0.3622F, -2.6353F, 0.3334F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone85.addChild(bone86);
		setRotationAngle(bone86, -0.1309F, 0.0F, -0.0436F);
		bone86.setTextureOffset(30, 4).addBox(-0.3342F, -4.6231F, 0.05F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone87 = new ModelRenderer(this);
		Bone87.setRotationPoint(0.0F, 0.0F, 2.0F);
		Bone83.addChild(Bone87);
		setRotationAngle(Bone87, 0.0F, 3.1416F, -0.7854F);

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone87.addChild(bone88);
		setRotationAngle(bone88, 0.0436F, 0.0F, -0.2618F);
		bone88.setTextureOffset(25, 4).addBox(-0.3622F, -2.6183F, 0.7213F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone88.addChild(bone89);
		setRotationAngle(bone89, 0.1309F, 0.0F, -0.0436F);
		bone89.setTextureOffset(30, 4).addBox(-0.3349F, -4.5992F, 1.0021F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone90 = new ModelRenderer(this);
		Bone90.setRotationPoint(12.0F, 12.0F, -2.0F);
		Cuernos4.addChild(Bone90);
		setRotationAngle(Bone90, 0.0F, 0.0F, 2.5744F);

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone90.addChild(bone91);
		setRotationAngle(bone91, 0.0F, 0.0F, -0.3491F);
		bone91.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone91.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, -0.1745F);
		bone92.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone93 = new ModelRenderer(this);
		Bone93.setRotationPoint(12.0F, 8.0F, -2.0F);
		Cuernos4.addChild(Bone93);
		setRotationAngle(Bone93, 0.0F, 0.0F, 2.5744F);

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone93.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, -0.3491F);
		bone94.setTextureOffset(25, 4).addBox(2.0918F, -1.416F, 0.3059F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone94.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -0.1745F);
		bone95.setTextureOffset(30, 4).addBox(2.4587F, -3.0616F, 0.3059F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone96 = new ModelRenderer(this);
		Bone96.setRotationPoint(-2.0F, -2.0F, 2.0F);
		Cuernos4.addChild(Bone96);
		setRotationAngle(Bone96, 0.0F, 3.1416F, -2.5744F);

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone96.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.3491F);
		bone97.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone97.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, -0.1745F);
		bone98.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Bone99 = new ModelRenderer(this);
		Bone99.setRotationPoint(-2.0F, -6.0F, 2.0F);
		Cuernos4.addChild(Bone99);
		setRotationAngle(Bone99, 0.0F, 3.1416F, -2.5744F);

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bone99.addChild(bone100);
		setRotationAngle(bone100, 0.0F, 0.0F, -0.3491F);
		bone100.setTextureOffset(25, 4).addBox(13.1988F, -9.9387F, 2.6941F, 1.0F, 1.0F, 1.0F, 0.4F, false);

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone100.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, -0.1745F);
		bone101.setTextureOffset(30, 4).addBox(14.8768F, -9.5261F, 2.6941F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		Escudos.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}