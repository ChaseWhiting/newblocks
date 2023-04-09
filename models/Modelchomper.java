// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelchomper extends EntityModel<Entity> {
	private final ModelRenderer chomper;
	private final ModelRenderer leaves;
	private final ModelRenderer upperleaves;
	private final ModelRenderer leaf1;
	private final ModelRenderer leaf1_r1;
	private final ModelRenderer leaf1_r2;
	private final ModelRenderer leaf2;
	private final ModelRenderer leaf2_r1;
	private final ModelRenderer leaf2_r2;
	private final ModelRenderer leaf2_r3;
	private final ModelRenderer leaf2_r4;
	private final ModelRenderer leaf3;
	private final ModelRenderer leaf3_r1;
	private final ModelRenderer leaf3_r2;
	private final ModelRenderer leaf4;
	private final ModelRenderer leaf4_r1;
	private final ModelRenderer leaf5;
	private final ModelRenderer leaf5_r1;
	private final ModelRenderer stem;
	private final ModelRenderer stem1;
	private final ModelRenderer stem1_r1;
	private final ModelRenderer stem2;
	private final ModelRenderer stem2_r1;
	private final ModelRenderer stem3;
	private final ModelRenderer stem3_r1;
	private final ModelRenderer stem4;
	private final ModelRenderer stem4_r1;
	private final ModelRenderer stem5;
	private final ModelRenderer stem5_r1;
	private final ModelRenderer head;
	private final ModelRenderer skull;
	private final ModelRenderer upper;
	private final ModelRenderer upper_r1;
	private final ModelRenderer upper_r2;
	private final ModelRenderer upper_r3;
	private final ModelRenderer upper_r4;
	private final ModelRenderer upper_r5;
	private final ModelRenderer teeth1;
	private final ModelRenderer teeth1_r1;
	private final ModelRenderer teeth1_r2;
	private final ModelRenderer teeth1_r3;
	private final ModelRenderer teeth1_r4;
	private final ModelRenderer lower;
	private final ModelRenderer lower_r1;
	private final ModelRenderer lower_r2;
	private final ModelRenderer teeth;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer teeth_r2;
	private final ModelRenderer teeth_r3;
	private final ModelRenderer teeth_r4;
	private final ModelRenderer tongue;
	private final ModelRenderer tongue_r1;
	private final ModelRenderer tongue_r2;
	private final ModelRenderer lowerleaves;
	private final ModelRenderer leaf6;
	private final ModelRenderer leaf6_r1;
	private final ModelRenderer leaf7;
	private final ModelRenderer leaf7_r1;
	private final ModelRenderer leaf7_r2;
	private final ModelRenderer leaf7_r3;
	private final ModelRenderer leaf7_r4;
	private final ModelRenderer leaf8;
	private final ModelRenderer leaf8_r1;
	private final ModelRenderer leaf8_r2;
	private final ModelRenderer leaf9;
	private final ModelRenderer leaf9_r1;
	private final ModelRenderer leaf10;
	private final ModelRenderer leaf10_r1;

	public Modelchomper() {
		textureWidth = 64;
		textureHeight = 64;

		chomper = new ModelRenderer(this);
		chomper.setRotationPoint(0.0F, 24.0F, -0.75F);
		setRotationAngle(chomper, 0.0F, 1.5708F, 0.0F);

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(-1.0F, 0.0F, 0.25F);
		chomper.addChild(leaves);

		upperleaves = new ModelRenderer(this);
		upperleaves.setRotationPoint(0.25F, 0.0F, -0.25F);
		leaves.addChild(upperleaves);

		leaf1 = new ModelRenderer(this);
		leaf1.setRotationPoint(-0.25F, 0.0F, 0.0F);
		upperleaves.addChild(leaf1);
		leaf1.setTextureOffset(28, 10).addBox(-1.0F, -1.0F, 1.15F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leaf1.setTextureOffset(28, 0).addBox(-1.0F, -1.0F, -2.05F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		leaf1_r1 = new ModelRenderer(this);
		leaf1_r1.setRotationPoint(0.0F, 0.0F, 1.75F);
		leaf1.addChild(leaf1_r1);
		setRotationAngle(leaf1_r1, 0.0F, -1.5708F, 0.0F);
		leaf1_r1.setTextureOffset(20, 12).addBox(-2.9F, -1.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		leaf1_r2 = new ModelRenderer(this);
		leaf1_r2.setRotationPoint(2.0F, 0.0F, 1.75F);
		leaf1.addChild(leaf1_r2);
		setRotationAngle(leaf1_r2, 0.0F, -1.5708F, 0.0F);
		leaf1_r2.setTextureOffset(0, 23).addBox(-2.9F, -1.0F, 0.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		leaf2 = new ModelRenderer(this);
		leaf2.setRotationPoint(0.75F, 0.0F, -0.25F);
		upperleaves.addChild(leaf2);

		leaf2_r1 = new ModelRenderer(this);
		leaf2_r1.setRotationPoint(-3.0F, -1.0F, -1.0F);
		leaf2.addChild(leaf2_r1);
		setRotationAngle(leaf2_r1, 0.7854F, 1.5708F, -0.2618F);
		leaf2_r1.setTextureOffset(0, 18).addBox(-2.6F, -3.5F, 0.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		leaf2_r2 = new ModelRenderer(this);
		leaf2_r2.setRotationPoint(1.0F, -1.0F, 1.0F);
		leaf2.addChild(leaf2_r2);
		setRotationAngle(leaf2_r2, 0.7854F, -1.5708F, 0.0F);
		leaf2_r2.setTextureOffset(21, 1).addBox(-2.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		leaf2_r3 = new ModelRenderer(this);
		leaf2_r3.setRotationPoint(-2.0F, -1.0F, 2.0F);
		leaf2.addChild(leaf2_r3);
		setRotationAngle(leaf2_r3, 0.7854F, 3.1416F, 0.0F);
		leaf2_r3.setTextureOffset(21, 20).addBox(-2.3F, -3.5F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		leaf2_r4 = new ModelRenderer(this);
		leaf2_r4.setRotationPoint(0.0F, -1.0F, -2.0F);
		leaf2.addChild(leaf2_r4);
		setRotationAngle(leaf2_r4, 0.7854F, 0.0F, 0.0F);
		leaf2_r4.setTextureOffset(25, 30).addBox(-2.3F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		leaf3 = new ModelRenderer(this);
		leaf3.setRotationPoint(0.75F, 0.0F, -0.25F);
		upperleaves.addChild(leaf3);

		leaf3_r1 = new ModelRenderer(this);
		leaf3_r1.setRotationPoint(-2.0F, -3.0F, 3.0F);
		leaf3.addChild(leaf3_r1);
		setRotationAngle(leaf3_r1, 1.0472F, 3.1416F, 0.0F);
		leaf3_r1.setTextureOffset(24, 37).addBox(-2.2F, -2.4F, -0.6F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		leaf3_r2 = new ModelRenderer(this);
		leaf3_r2.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf3.addChild(leaf3_r2);
		setRotationAngle(leaf3_r2, 1.0472F, 0.0F, 0.0F);
		leaf3_r2.setTextureOffset(24, 37).addBox(-2.2F, -2.4F, -0.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		leaf4 = new ModelRenderer(this);
		leaf4.setRotationPoint(-0.25F, -1.0F, -0.25F);
		upperleaves.addChild(leaf4);
		setRotationAngle(leaf4, 0.0F, 1.5708F, -0.2618F);

		leaf4_r1 = new ModelRenderer(this);
		leaf4_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf4.addChild(leaf4_r1);
		setRotationAngle(leaf4_r1, 1.0472F, 0.0F, 0.0F);
		leaf4_r1.setTextureOffset(37, 34).addBox(-1.4F, -2.4F, -0.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		leaf5 = new ModelRenderer(this);
		leaf5.setRotationPoint(1.75F, 1.0F, 0.75F);
		upperleaves.addChild(leaf5);
		setRotationAngle(leaf5, 0.0F, -1.5708F, -0.2618F);

		leaf5_r1 = new ModelRenderer(this);
		leaf5_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf5.addChild(leaf5_r1);
		setRotationAngle(leaf5_r1, 1.2217F, 0.0F, 0.0F);
		leaf5_r1.setTextureOffset(24, 37).addBox(-1.8F, -1.6929F, 0.4F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		stem = new ModelRenderer(this);
		stem.setRotationPoint(0.75F, 0.0F, 0.0F);
		upperleaves.addChild(stem);

		stem1 = new ModelRenderer(this);
		stem1.setRotationPoint(-1.0F, -1.0F, 0.0F);
		stem.addChild(stem1);

		stem1_r1 = new ModelRenderer(this);
		stem1_r1.setRotationPoint(1.0F, 0.0F, -0.25F);
		stem1.addChild(stem1_r1);
		setRotationAngle(stem1_r1, 0.0F, 0.0F, -0.1745F);
		stem1_r1.setTextureOffset(18, 27).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		stem2 = new ModelRenderer(this);
		stem2.setRotationPoint(-0.75F, -2.0F, 0.125F);
		stem1.addChild(stem2);

		stem2_r1 = new ModelRenderer(this);
		stem2_r1.setRotationPoint(0.75F, 0.0F, -0.375F);
		stem2.addChild(stem2_r1);
		setRotationAngle(stem2_r1, 0.0F, 0.0F, -0.8727F);
		stem2_r1.setTextureOffset(10, 26).addBox(-1.5F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		stem3 = new ModelRenderer(this);
		stem3.setRotationPoint(-1.35F, -0.9F, -0.025F);
		stem2.addChild(stem3);

		stem3_r1 = new ModelRenderer(this);
		stem3_r1.setRotationPoint(-0.9F, -1.1F, -0.35F);
		stem3.addChild(stem3_r1);
		setRotationAngle(stem3_r1, 0.0F, 0.0F, -0.8727F);
		stem3_r1.setTextureOffset(0, 0).addBox(-1.0F, -2.8F, -0.8F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		stem4 = new ModelRenderer(this);
		stem4.setRotationPoint(-2.8F, -2.5F, 0.0F);
		stem3.addChild(stem4);

		stem4_r1 = new ModelRenderer(this);
		stem4_r1.setRotationPoint(-0.1F, -0.6F, -0.35F);
		stem4.addChild(stem4_r1);
		setRotationAngle(stem4_r1, 0.0F, 0.0F, 0.1745F);
		stem4_r1.setTextureOffset(13, 31).addBox(-0.6F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		stem5 = new ModelRenderer(this);
		stem5.setRotationPoint(0.3F, -1.2F, 0.0F);
		stem4.addChild(stem5);

		stem5_r1 = new ModelRenderer(this);
		stem5_r1.setRotationPoint(0.6F, -1.4F, -0.35F);
		stem5.addChild(stem5_r1);
		setRotationAngle(stem5_r1, 0.0F, 0.0F, 0.9599F);
		stem5_r1.setTextureOffset(0, 8).addBox(0.0F, -1.2F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.85F, -2.15F, -0.1F);
		stem5.addChild(head);
		setRotationAngle(head, 0.0F, 0.0F, 0.1745F);

		skull = new ModelRenderer(this);
		skull.setRotationPoint(0.4013F, 0.1243F, 0.0F);
		head.addChild(skull);

		upper = new ModelRenderer(this);
		upper.setRotationPoint(1.0F, 0.0F, -0.25F);
		skull.addChild(upper);
		setRotationAngle(upper, 0.0F, 0.0F, -0.0873F);

		upper_r1 = new ModelRenderer(this);
		upper_r1.setRotationPoint(0.2004F, 0.3144F, 0.0F);
		upper.addChild(upper_r1);
		setRotationAngle(upper_r1, 0.0F, 0.0F, -0.2618F);
		upper_r1.setTextureOffset(22, 2).addBox(1.1433F, -2.6375F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);
		upper_r1.setTextureOffset(0, 8).addBox(-1.0F, -4.0F, -3.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		upper_r1.setTextureOffset(0, 18).addBox(1.2F, -1.0F, -3.4F, 7.0F, 1.0F, 7.0F, 0.0F, false);

		upper_r2 = new ModelRenderer(this);
		upper_r2.setRotationPoint(-6.3494F, -17.1813F, 0.0F);
		upper.addChild(upper_r2);
		setRotationAngle(upper_r2, 0.0F, -3.0543F, -2.8798F);
		upper_r2.setTextureOffset(7, 31).addBox(15.0534F, -10.2006F, -0.039F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		upper_r3 = new ModelRenderer(this);
		upper_r3.setRotationPoint(-6.3494F, -17.1813F, 0.0F);
		upper.addChild(upper_r3);
		setRotationAngle(upper_r3, 0.0F, 0.0F, -2.1817F);
		upper_r3.setTextureOffset(0, 26).addBox(-16.7911F, -0.027F, -0.2F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		upper_r4 = new ModelRenderer(this);
		upper_r4.setRotationPoint(-6.3494F, -17.1813F, 0.0F);
		upper.addChild(upper_r4);
		setRotationAngle(upper_r4, 0.0F, 0.0F, -2.2689F);
		upper_r4.setTextureOffset(26, 27).addBox(-15.682F, -5.2432F, -0.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		upper_r5 = new ModelRenderer(this);
		upper_r5.setRotationPoint(-6.3494F, -17.1813F, 0.0F);
		upper.addChild(upper_r5);
		setRotationAngle(upper_r5, 0.0F, 0.0F, -2.3562F);
		upper_r5.setTextureOffset(0, 29).addBox(-16.9107F, -8.2061F, -0.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		teeth1 = new ModelRenderer(this);
		teeth1.setRotationPoint(3.2004F, 9.3144F, 5.0F);
		upper.addChild(teeth1);

		teeth1_r1 = new ModelRenderer(this);
		teeth1_r1.setRotationPoint(0.9962F, -0.0872F, -5.0F);
		teeth1.addChild(teeth1_r1);
		setRotationAngle(teeth1_r1, 0.0F, 0.0F, 0.4363F);
		teeth1_r1.setTextureOffset(24, 35).addBox(-3.4058F, -11.0631F, -2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r1.setTextureOffset(28, 35).addBox(-4.3455F, -10.721F, -2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r1.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -2.8F, 0.0F, 0.0F, 1.0F, 0.0F, false);

		teeth1_r2 = new ModelRenderer(this);
		teeth1_r2.setRotationPoint(4.0719F, 0.6476F, 0.0F);
		teeth1.addChild(teeth1_r2);
		setRotationAngle(teeth1_r2, 0.0F, 0.0F, 0.4363F);
		teeth1_r2.setTextureOffset(0, 0).addBox(-3.0F, -10.8476F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, false);
		teeth1_r2.setTextureOffset(31, 36).addBox(-5.5083F, -10.7218F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r2.setTextureOffset(36, 32).addBox(-5.5083F, -10.7218F, -3.0369F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		teeth1_r3 = new ModelRenderer(this);
		teeth1_r3.setRotationPoint(0.0F, 0.0F, -5.0F);
		teeth1.addChild(teeth1_r3);
		setRotationAngle(teeth1_r3, 0.0F, 0.0F, 0.4363F);
		teeth1_r3.setTextureOffset(36, 29).addBox(-3.0F, -11.0F, -2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r3.setTextureOffset(0, 32).addBox(-4.4058F, -11.0631F, -2.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		teeth1_r3.setTextureOffset(31, 33).addBox(-5.3455F, -10.7211F, -2.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		teeth1_r3.setTextureOffset(18, 34).addBox(-5.3455F, -10.7211F, 2.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		teeth1_r3.setTextureOffset(20, 37).addBox(-3.0F, -11.0F, 2.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r3.setTextureOffset(34, 20).addBox(-4.4058F, -11.0631F, 2.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		teeth1_r4 = new ModelRenderer(this);
		teeth1_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		teeth1.addChild(teeth1_r4);
		setRotationAngle(teeth1_r4, 0.0F, -1.6581F, 0.4363F);
		teeth1_r4.setTextureOffset(35, 36).addBox(-4.4755F, -12.5F, 0.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth1_r4.setTextureOffset(16, 37).addBox(-6.2F, -12.4641F, 1.0373F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(2.0F, 0.0F, -0.25F);
		skull.addChild(lower);

		lower_r1 = new ModelRenderer(this);
		lower_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		lower.addChild(lower_r1);
		setRotationAngle(lower_r1, 0.0F, 0.0F, 0.2618F);
		lower_r1.setTextureOffset(0, 0).addBox(1.2F, -1.0F, -3.4F, 7.0F, 1.0F, 7.0F, 0.0F, false);

		lower_r2 = new ModelRenderer(this);
		lower_r2.setRotationPoint(-1.0F, 1.0F, 0.0F);
		lower.addChild(lower_r2);
		setRotationAngle(lower_r2, 0.0F, 0.0F, 0.2618F);
		lower_r2.setTextureOffset(22, 20).addBox(3.3289F, -1.7F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		lower_r2.setTextureOffset(21, 12).addBox(-1.2F, -2.0F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(2.0F, 9.0F, 0.0F);
		lower.addChild(teeth);

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setRotationPoint(7.8785F, -1.3892F, 0.0F);
		teeth.addChild(teeth_r1);
		setRotationAngle(teeth_r1, -1.8326F, -0.5236F, -1.4835F);
		teeth_r1.setTextureOffset(16, 26).addBox(5.3215F, 2.5162F, -3.9483F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_r1.setTextureOffset(34, 0).addBox(4.3215F, 4.1892F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		teeth_r2 = new ModelRenderer(this);
		teeth_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		teeth.addChild(teeth_r2);
		setRotationAngle(teeth_r2, 0.0F, 0.0F, -0.2618F);
		teeth_r2.setTextureOffset(19, 31).addBox(3.4151F, -8.2F, 2.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		teeth_r2.setTextureOffset(31, 30).addBox(3.4151F, -8.2F, -2.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		teeth_r2.setTextureOffset(34, 27).addBox(2.5061F, -8.6224F, -2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		teeth_r3 = new ModelRenderer(this);
		teeth_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		teeth.addChild(teeth_r3);
		setRotationAngle(teeth_r3, 0.0F, 0.8727F, -0.0873F);
		teeth_r3.setTextureOffset(34, 10).addBox(0.7101F, -8.409F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		teeth_r4 = new ModelRenderer(this);
		teeth_r4.setRotationPoint(9.8481F, -1.7365F, 0.0F);
		teeth.addChild(teeth_r4);
		setRotationAngle(teeth_r4, 0.0F, -0.2618F, -0.2618F);
		teeth_r4.setTextureOffset(34, 23).addBox(-4.6775F, -8.2363F, -1.3378F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		tongue = new ModelRenderer(this);
		tongue.setRotationPoint(4.2346F, 0.2577F, 0.0167F);
		head.addChild(tongue);

		tongue_r1 = new ModelRenderer(this);
		tongue_r1.setRotationPoint(1.1667F, -0.1333F, -0.2667F);
		tongue.addChild(tongue_r1);
		setRotationAngle(tongue_r1, 0.0F, 0.0F, -0.3491F);
		tongue_r1.setTextureOffset(20, 0).addBox(-1.2F, -0.4F, -0.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);

		tongue_r2 = new ModelRenderer(this);
		tongue_r2.setRotationPoint(1.1667F, 0.8667F, -0.2667F);
		tongue.addChild(tongue_r2);
		setRotationAngle(tongue_r2, 0.0F, 0.0F, -0.3491F);
		tongue_r2.setTextureOffset(18, 10).addBox(-1.2F, -1.4F, -0.8F, 4.0F, 0.0F, 2.0F, 0.0F, false);

		lowerleaves = new ModelRenderer(this);
		lowerleaves.setRotationPoint(1.4317F, -0.5284F, -0.25F);
		head.addChild(lowerleaves);
		setRotationAngle(lowerleaves, 0.0F, 0.0F, -1.5708F);

		leaf6 = new ModelRenderer(this);
		leaf6.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleaves.addChild(leaf6);
		leaf6.setTextureOffset(0, 6).addBox(-1.0F, -1.0F, 1.4F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		leaf6.setTextureOffset(3, 1).addBox(-1.0F, -1.0F, -1.8F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		leaf6_r1 = new ModelRenderer(this);
		leaf6_r1.setRotationPoint(1.0F, 0.0F, 2.0F);
		leaf6.addChild(leaf6_r1);
		setRotationAngle(leaf6_r1, 0.0F, -1.5708F, 0.0F);
		leaf6_r1.setTextureOffset(3, 0).addBox(-1.9F, -1.0F, 0.3F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		leaf7 = new ModelRenderer(this);
		leaf7.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleaves.addChild(leaf7);

		leaf7_r1 = new ModelRenderer(this);
		leaf7_r1.setRotationPoint(-3.0F, -1.0F, -1.0F);
		leaf7.addChild(leaf7_r1);
		setRotationAngle(leaf7_r1, 0.7854F, 1.5708F, 0.2618F);
		leaf7_r1.setTextureOffset(0, 35).addBox(-2.1F, -0.9019F, 1.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaf7_r2 = new ModelRenderer(this);
		leaf7_r2.setRotationPoint(1.0F, -1.0F, 1.0F);
		leaf7.addChild(leaf7_r2);
		setRotationAngle(leaf7_r2, 0.7854F, -1.5708F, 0.0F);
		leaf7_r2.setTextureOffset(4, 35).addBox(-1.0F, -2.7929F, 0.7071F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaf7_r3 = new ModelRenderer(this);
		leaf7_r3.setRotationPoint(-2.0F, -1.0F, 2.0F);
		leaf7.addChild(leaf7_r3);
		setRotationAngle(leaf7_r3, 0.7854F, 3.1416F, 0.0F);
		leaf7_r3.setTextureOffset(8, 35).addBox(-2.3F, -2.7929F, 0.2071F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaf7_r4 = new ModelRenderer(this);
		leaf7_r4.setRotationPoint(0.0F, -1.0F, -2.0F);
		leaf7.addChild(leaf7_r4);
		setRotationAngle(leaf7_r4, 0.7854F, 0.0F, 0.0F);
		leaf7_r4.setTextureOffset(12, 35).addBox(-1.3F, -2.7929F, 0.7071F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaf8 = new ModelRenderer(this);
		leaf8.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleaves.addChild(leaf8);

		leaf8_r1 = new ModelRenderer(this);
		leaf8_r1.setRotationPoint(-2.0F, -3.0F, 3.0F);
		leaf8.addChild(leaf8_r1);
		setRotationAngle(leaf8_r1, 1.0472F, 3.1416F, 0.0F);
		leaf8_r1.setTextureOffset(5, 6).addBox(-2.2F, -1.534F, -0.1F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		leaf8_r2 = new ModelRenderer(this);
		leaf8_r2.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf8.addChild(leaf8_r2);
		setRotationAngle(leaf8_r2, 1.0472F, 0.0F, 0.0F);
		leaf8_r2.setTextureOffset(0, 8).addBox(-1.2F, -1.534F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		leaf9 = new ModelRenderer(this);
		leaf9.setRotationPoint(-1.0F, -1.0F, 0.0F);
		lowerleaves.addChild(leaf9);
		setRotationAngle(leaf9, 0.0F, 1.5708F, -0.2618F);

		leaf9_r1 = new ModelRenderer(this);
		leaf9_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf9.addChild(leaf9_r1);
		setRotationAngle(leaf9_r1, 0.8727F, 0.0F, 0.0F);
		leaf9_r1.setTextureOffset(0, 1).addBox(-0.9F, 2.4296F, 0.7941F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		leaf10 = new ModelRenderer(this);
		leaf10.setRotationPoint(1.0F, 1.0F, 1.0F);
		lowerleaves.addChild(leaf10);
		setRotationAngle(leaf10, 0.0F, -1.5708F, -0.2618F);

		leaf10_r1 = new ModelRenderer(this);
		leaf10_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
		leaf10.addChild(leaf10_r1);
		setRotationAngle(leaf10_r1, 1.2217F, 0.0F, 0.0F);
		leaf10_r1.setTextureOffset(0, 0).addBox(-0.8F, -0.8737F, 0.9736F, 1.0F, 1.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		chomper.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}