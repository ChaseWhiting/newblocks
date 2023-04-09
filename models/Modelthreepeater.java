// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelthreepeater extends EntityModel<Entity> {
	private final ModelRenderer threepeater;
	private final ModelRenderer leaves;
	private final ModelRenderer leaf1;
	private final ModelRenderer leaf1_r1;
	private final ModelRenderer leaf1_r2;
	private final ModelRenderer leaf2;
	private final ModelRenderer leaf2_r1;
	private final ModelRenderer leaf2_r2;
	private final ModelRenderer leaf3;
	private final ModelRenderer leaf3_r1;
	private final ModelRenderer leaf3_r2;
	private final ModelRenderer leaf4;
	private final ModelRenderer leaf4_r1;
	private final ModelRenderer leaf4_r2;
	private final ModelRenderer stem;
	private final ModelRenderer stem1;
	private final ModelRenderer stem1_r1;
	private final ModelRenderer stem1_r2;
	private final ModelRenderer stem1_r3;
	private final ModelRenderer stem2;
	private final ModelRenderer stem2_r1;
	private final ModelRenderer stem2_r2;
	private final ModelRenderer stem2_r3;
	private final ModelRenderer stem2_r4;
	private final ModelRenderer stem3;
	private final ModelRenderer stem3_r1;
	private final ModelRenderer stem3_r2;
	private final ModelRenderer stem3_r3;
	private final ModelRenderer stem3_r4;
	private final ModelRenderer stem3_r5;
	private final ModelRenderer head;
	private final ModelRenderer head1;
	private final ModelRenderer snout;
	private final ModelRenderer upleaf;
	private final ModelRenderer upleaf_r1;
	private final ModelRenderer upleaf_r2;
	private final ModelRenderer base;
	private final ModelRenderer head2;
	private final ModelRenderer snout2;
	private final ModelRenderer upleaf2;
	private final ModelRenderer upleaf2_r1;
	private final ModelRenderer upleaf2_r2;
	private final ModelRenderer upleaf4;
	private final ModelRenderer upleaf4_r1;
	private final ModelRenderer upleaf4_r2;
	private final ModelRenderer base2;
	private final ModelRenderer head3;
	private final ModelRenderer snout3;
	private final ModelRenderer upleaf3;
	private final ModelRenderer upleaf3_r1;
	private final ModelRenderer upleaf3_r2;
	private final ModelRenderer upleaf5;
	private final ModelRenderer upleaf5_r1;
	private final ModelRenderer upleaf5_r2;
	private final ModelRenderer upleaf6;
	private final ModelRenderer upleaf6_r1;
	private final ModelRenderer upleaf6_r2;
	private final ModelRenderer base3;

	public Modelthreepeater() {
		textureWidth = 80;
		textureHeight = 80;

		threepeater = new ModelRenderer(this);
		threepeater.setRotationPoint(0.0F, 24.0F, 0.0F);

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
		threepeater.addChild(leaves);
		setRotationAngle(leaves, 0.0F, 0.6981F, 0.0F);

		leaf1 = new ModelRenderer(this);
		leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf1);

		leaf1_r1 = new ModelRenderer(this);
		leaf1_r1.setRotationPoint(3.0F, -3.0F, 0.0F);
		leaf1.addChild(leaf1_r1);
		setRotationAngle(leaf1_r1, 0.0F, 0.0F, 0.7854F);
		leaf1_r1.setTextureOffset(64, 69).addBox(0.4019F, 0.0F, -0.8F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		leaf1_r2 = new ModelRenderer(this);
		leaf1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf1.addChild(leaf1_r2);
		setRotationAngle(leaf1_r2, 0.0F, 0.0F, -0.5236F);
		leaf1_r2.setTextureOffset(60, 75).addBox(0.0F, -0.7F, -1.05F, 4.0F, 0.0F, 3.0F, 0.0F, false);

		leaf2 = new ModelRenderer(this);
		leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf2);

		leaf2_r1 = new ModelRenderer(this);
		leaf2_r1.setRotationPoint(0.0F, -1.0F, 4.0F);
		leaf2.addChild(leaf2_r1);
		setRotationAngle(leaf2_r1, -0.4363F, 0.0F, 0.0F);
		leaf2_r1.setTextureOffset(64, 71).addBox(-1.8F, -0.4F, -0.2F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		leaf2_r2 = new ModelRenderer(this);
		leaf2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf2.addChild(leaf2_r2);
		setRotationAngle(leaf2_r2, 0.1745F, 0.0F, 0.0F);
		leaf2_r2.setTextureOffset(61, 75).addBox(-2.05F, -0.7F, 0.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

		leaf3 = new ModelRenderer(this);
		leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf3);

		leaf3_r1 = new ModelRenderer(this);
		leaf3_r1.setRotationPoint(-4.0F, -1.0F, 0.0F);
		leaf3.addChild(leaf3_r1);
		setRotationAngle(leaf3_r1, 0.0F, 0.0F, -0.5236F);
		leaf3_r1.setTextureOffset(70, 76).addBox(-1.4F, -0.5F, -1.8F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		leaf3_r2 = new ModelRenderer(this);
		leaf3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf3.addChild(leaf3_r2);
		setRotationAngle(leaf3_r2, 0.0F, 0.0F, 0.2618F);
		leaf3_r2.setTextureOffset(61, 75).addBox(-4.2F, -0.7F, -2.05F, 4.0F, 0.0F, 3.0F, 0.0F, false);

		leaf4 = new ModelRenderer(this);
		leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaves.addChild(leaf4);

		leaf4_r1 = new ModelRenderer(this);
		leaf4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leaf4.addChild(leaf4_r1);
		setRotationAngle(leaf4_r1, -0.4363F, 0.0F, 0.0F);
		leaf4_r1.setTextureOffset(65, 75).addBox(-1.05F, -0.7F, -4.2F, 3.0F, 0.0F, 4.0F, 0.0F, false);

		leaf4_r2 = new ModelRenderer(this);
		leaf4_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
		leaf4.addChild(leaf4_r2);
		setRotationAngle(leaf4_r2, 0.0873F, 0.0F, 0.0F);
		leaf4_r2.setTextureOffset(57, 76).addBox(-0.8F, -0.3F, -2.6358F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		stem = new ModelRenderer(this);
		stem.setRotationPoint(0.0F, 0.0F, 0.0F);
		threepeater.addChild(stem);

		stem1 = new ModelRenderer(this);
		stem1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(stem1);
		stem1.setTextureOffset(36, 50).addBox(-11.7704F, -7.9839F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		stem1_r1 = new ModelRenderer(this);
		stem1_r1.setRotationPoint(-7.8813F, -4.2161F, 0.0F);
		stem1.addChild(stem1_r1);
		setRotationAngle(stem1_r1, 0.0F, 0.0F, -0.7854F);
		stem1_r1.setTextureOffset(47, 59).addBox(-1.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		stem1_r2 = new ModelRenderer(this);
		stem1_r2.setRotationPoint(-3.8302F, -4.2139F, 0.0F);
		stem1.addChild(stem1_r2);
		setRotationAngle(stem1_r2, 0.0F, 0.0F, -1.4835F);
		stem1_r2.setTextureOffset(4, 59).addBox(-1.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		stem1_r3 = new ModelRenderer(this);
		stem1_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		stem1.addChild(stem1_r3);
		setRotationAngle(stem1_r3, 0.0F, 0.0F, -0.8727F);
		stem1_r3.setTextureOffset(8, 59).addBox(-1.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		stem2 = new ModelRenderer(this);
		stem2.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(stem2);

		stem2_r1 = new ModelRenderer(this);
		stem2_r1.setRotationPoint(0.0F, -11.6926F, 6.8419F);
		stem2.addChild(stem2_r1);
		setRotationAngle(stem2_r1, 0.5236F, 0.0F, 0.0F);
		stem2_r1.setTextureOffset(58, 25).addBox(-1.0F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		stem2_r2 = new ModelRenderer(this);
		stem2_r2.setRotationPoint(0.0F, -6.6356F, 6.6917F);
		stem2.addChild(stem2_r2);
		setRotationAngle(stem2_r2, -0.1745F, 0.0F, 0.0F);
		stem2_r2.setTextureOffset(0, 48).addBox(-1.0F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		stem2_r3 = new ModelRenderer(this);
		stem2_r3.setRotationPoint(0.0F, -4.5856F, 3.1925F);
		stem2.addChild(stem2_r3);
		setRotationAngle(stem2_r3, -1.0472F, 0.0F, 0.0F);
		stem2_r3.setTextureOffset(58, 0).addBox(-1.0F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		stem2_r4 = new ModelRenderer(this);
		stem2_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		stem2.addChild(stem2_r4);
		setRotationAngle(stem2_r4, -0.6981F, 0.0F, 0.0F);
		stem2_r4.setTextureOffset(0, 59).addBox(-1.0F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		stem3 = new ModelRenderer(this);
		stem3.setRotationPoint(0.0F, 0.0F, 0.0F);
		stem.addChild(stem3);

		stem3_r1 = new ModelRenderer(this);
		stem3_r1.setRotationPoint(5.3276F, -4.7871F, 0.7988F);
		stem3.addChild(stem3_r1);
		setRotationAngle(stem3_r1, -0.5236F, 0.0F, 1.2654F);
		stem3_r1.setTextureOffset(12, 59).addBox(0.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		stem3_r2 = new ModelRenderer(this);
		stem3_r2.setRotationPoint(9.4446F, -5.589F, 3.3911F);
		stem3.addChild(stem3_r2);
		setRotationAngle(stem3_r2, 0.1309F, 0.0436F, 0.7418F);
		stem3_r2.setTextureOffset(24, 50).addBox(0.0F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		stem3_r3 = new ModelRenderer(this);
		stem3_r3.setRotationPoint(8.192F, -5.7001F, 2.68F);
		stem3.addChild(stem3_r3);
		setRotationAngle(stem3_r3, -0.1745F, 0.0F, 1.1781F);
		stem3_r3.setTextureOffset(62, 55).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		stem3_r4 = new ModelRenderer(this);
		stem3_r4.setRotationPoint(1.9287F, -3.1661F, -0.0118F);
		stem3.addChild(stem3_r4);
		setRotationAngle(stem3_r4, -0.2182F, 0.0F, 1.1345F);
		stem3_r4.setTextureOffset(43, 59).addBox(0.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		stem3_r5 = new ModelRenderer(this);
		stem3_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
		stem3.addChild(stem3_r5);
		setRotationAngle(stem3_r5, 0.0F, 0.0F, 0.7418F);
		stem3_r5.setTextureOffset(15, 63).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		threepeater.addChild(head);

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(-11.0F, -10.0F, 0.0F);
		head.addChild(head1);
		setRotationAngle(head1, 0.0873F, -0.0873F, 0.0F);

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 10.0F, 0.0F);
		head1.addChild(snout);
		snout.setTextureOffset(62, 25).addBox(-2.1F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(62, 0).addBox(1.2F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(48, 40).addBox(-2.0F, -12.8F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(30, 48).addBox(-2.0F, -9.1F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(57, 11).addBox(-1.8F, -12.4F, -6.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		snout.setTextureOffset(48, 53).addBox(-1.51F, -11.8F, -6.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		upleaf = new ModelRenderer(this);
		upleaf.setRotationPoint(0.0F, 9.0F, 3.0F);
		head1.addChild(upleaf);
		setRotationAngle(upleaf, 0.1745F, 0.0F, 0.0F);
		upleaf.setTextureOffset(16, 76).addBox(-0.65F, -11.2152F, 4.0263F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf_r1 = new ModelRenderer(this);
		upleaf_r1.setRotationPoint(0.0F, -9.6174F, 8.8038F);
		upleaf.addChild(upleaf_r1);
		setRotationAngle(upleaf_r1, -0.9599F, 0.0F, 0.0F);
		upleaf_r1.setTextureOffset(10, 76).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf_r2 = new ModelRenderer(this);
		upleaf_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf.addChild(upleaf_r2);
		setRotationAngle(upleaf_r2, -0.4363F, 0.0F, 0.0F);
		upleaf_r2.setTextureOffset(8, 74).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 10.0F, 0.0F);
		head1.addChild(base);
		base.setTextureOffset(39, 70).addBox(-1.4F, -7.7F, -1.4F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		base.setTextureOffset(19, 52).addBox(-2.8F, -14.3F, -2.8F, 5.0F, 6.0F, 7.0F, 0.0F, false);
		base.setTextureOffset(19, 34).addBox(-2.8F, -13.8F, -3.8F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		base.setTextureOffset(0, 28).addBox(-3.4F, -13.9F, -3.2F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		base.setTextureOffset(0, 48).addBox(-3.9F, -13.7F, -2.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -18.0F, 5.0F);
		head.addChild(head2);
		setRotationAngle(head2, 0.0873F, 0.0F, 0.0F);

		snout2 = new ModelRenderer(this);
		snout2.setRotationPoint(0.0F, 10.0F, 0.0F);
		head2.addChild(snout2);
		snout2.setTextureOffset(61, 40).addBox(-2.1F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout2.setTextureOffset(59, 59).addBox(1.2F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout2.setTextureOffset(20, 48).addBox(-2.0F, -12.8F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout2.setTextureOffset(9, 42).addBox(-2.0F, -9.1F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout2.setTextureOffset(34, 0).addBox(-1.8F, -12.4F, -6.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		snout2.setTextureOffset(36, 53).addBox(-1.51F, -11.8F, -6.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		upleaf2 = new ModelRenderer(this);
		upleaf2.setRotationPoint(0.0F, 9.0F, 3.0F);
		head2.addChild(upleaf2);
		setRotationAngle(upleaf2, 0.1302F, 0.1744F, -0.0077F);
		upleaf2.setTextureOffset(8, 71).addBox(-0.65F, -11.2152F, 4.0264F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf2_r1 = new ModelRenderer(this);
		upleaf2_r1.setRotationPoint(0.0F, -9.6173F, 8.8038F);
		upleaf2.addChild(upleaf2_r1);
		setRotationAngle(upleaf2_r1, -0.9599F, 0.0F, 0.0F);
		upleaf2_r1.setTextureOffset(10, 73).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf2_r2 = new ModelRenderer(this);
		upleaf2_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf2.addChild(upleaf2_r2);
		setRotationAngle(upleaf2_r2, -0.4363F, 0.0F, 0.0F);
		upleaf2_r2.setTextureOffset(2, 76).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		upleaf4 = new ModelRenderer(this);
		upleaf4.setRotationPoint(2.0F, 7.8295F, 1.0948F);
		head2.addChild(upleaf4);
		setRotationAngle(upleaf4, -0.0865F, -0.5989F, 0.111F);
		upleaf4.setTextureOffset(12, 72).addBox(-0.65F, -11.2152F, 4.0263F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf4_r1 = new ModelRenderer(this);
		upleaf4_r1.setRotationPoint(0.0F, -9.6173F, 8.8038F);
		upleaf4.addChild(upleaf4_r1);
		setRotationAngle(upleaf4_r1, -0.9599F, 0.0F, 0.0F);
		upleaf4_r1.setTextureOffset(10, 76).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf4_r2 = new ModelRenderer(this);
		upleaf4_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf4.addChild(upleaf4_r2);
		setRotationAngle(upleaf4_r2, -0.4363F, 0.0F, 0.0F);
		upleaf4_r2.setTextureOffset(14, 76).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		base2 = new ModelRenderer(this);
		base2.setRotationPoint(0.0F, 10.0F, 0.0F);
		head2.addChild(base2);
		base2.setTextureOffset(39, 72).addBox(-1.4F, -7.7F, -1.4F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		base2.setTextureOffset(41, 27).addBox(-2.8F, -14.3F, -2.8F, 5.0F, 6.0F, 7.0F, 0.0F, false);
		base2.setTextureOffset(19, 5).addBox(-2.8F, -13.8F, -3.8F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		base2.setTextureOffset(20, 20).addBox(-3.4F, -13.9F, -3.2F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		base2.setTextureOffset(41, 42).addBox(-3.9F, -13.7F, -2.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(11.0F, -9.0F, 3.0F);
		head.addChild(head3);
		setRotationAngle(head3, 0.0873F, 0.0873F, 0.0F);

		snout3 = new ModelRenderer(this);
		snout3.setRotationPoint(0.0F, 10.0F, 0.0F);
		head3.addChild(snout3);
		snout3.setTextureOffset(55, 59).addBox(-2.1F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout3.setTextureOffset(51, 59).addBox(1.2F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		snout3.setTextureOffset(40, 25).addBox(-2.0F, -12.8F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout3.setTextureOffset(38, 40).addBox(-2.0F, -9.1F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		snout3.setTextureOffset(0, 28).addBox(-1.8F, -12.4F, -6.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		snout3.setTextureOffset(0, 42).addBox(-1.51F, -11.8F, -6.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		upleaf3 = new ModelRenderer(this);
		upleaf3.setRotationPoint(0.4358F, 6.5735F, -1.7877F);
		head3.addChild(upleaf3);
		setRotationAngle(upleaf3, -0.3491F, 0.0F, 0.0F);
		upleaf3.setTextureOffset(2, 76).addBox(-0.65F, -11.2152F, 4.0263F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf3_r1 = new ModelRenderer(this);
		upleaf3_r1.setRotationPoint(0.0F, -9.6174F, 8.8038F);
		upleaf3.addChild(upleaf3_r1);
		setRotationAngle(upleaf3_r1, -0.9599F, 0.0F, 0.0F);
		upleaf3_r1.setTextureOffset(19, 76).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf3_r2 = new ModelRenderer(this);
		upleaf3_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf3.addChild(upleaf3_r2);
		setRotationAngle(upleaf3_r2, -0.4363F, 0.0F, 0.0F);
		upleaf3_r2.setTextureOffset(8, 72).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		upleaf5 = new ModelRenderer(this);
		upleaf5.setRotationPoint(1.1705F, 8.8339F, 1.102F);
		head3.addChild(upleaf5);
		setRotationAngle(upleaf5, 0.0074F, -0.2555F, -0.0579F);
		upleaf5.setTextureOffset(17, 76).addBox(-0.65F, -11.2152F, 4.0263F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf5_r1 = new ModelRenderer(this);
		upleaf5_r1.setRotationPoint(0.0F, -9.6174F, 8.8038F);
		upleaf5.addChild(upleaf5_r1);
		setRotationAngle(upleaf5_r1, -0.9599F, 0.0F, 0.0F);
		upleaf5_r1.setTextureOffset(2, 76).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf5_r2 = new ModelRenderer(this);
		upleaf5_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf5.addChild(upleaf5_r2);
		setRotationAngle(upleaf5_r2, -0.4363F, 0.0F, 0.0F);
		upleaf5_r2.setTextureOffset(8, 74).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		upleaf6 = new ModelRenderer(this);
		upleaf6.setRotationPoint(-1.9052F, 8.898F, 1.8339F);
		head3.addChild(upleaf6);
		setRotationAngle(upleaf6, 0.0065F, 0.618F, -0.0378F);
		upleaf6.setTextureOffset(13, 71).addBox(-0.65F, -11.2152F, 4.0264F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		upleaf6_r1 = new ModelRenderer(this);
		upleaf6_r1.setRotationPoint(0.0F, -9.6174F, 8.8038F);
		upleaf6.addChild(upleaf6_r1);
		setRotationAngle(upleaf6_r1, -0.9599F, 0.0F, 0.0F);
		upleaf6_r1.setTextureOffset(10, 71).addBox(-1.0F, -0.2664F, -0.0137F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		upleaf6_r2 = new ModelRenderer(this);
		upleaf6_r2.setRotationPoint(0.0F, -11.1231F, 6.023F);
		upleaf6.addChild(upleaf6_r2);
		setRotationAngle(upleaf6_r2, -0.4363F, 0.0F, 0.0F);
		upleaf6_r2.setTextureOffset(8, 72).addBox(-1.5F, -0.0769F, -0.023F, 2.0F, 0.0F, 3.0F, 0.0F, false);

		base3 = new ModelRenderer(this);
		base3.setRotationPoint(0.0F, 10.0F, 0.0F);
		head3.addChild(base3);
		base3.setTextureOffset(39, 76).addBox(-1.4F, -7.7F, -1.4F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		base3.setTextureOffset(40, 12).addBox(-2.8F, -14.3F, -2.8F, 5.0F, 6.0F, 7.0F, 0.0F, false);
		base3.setTextureOffset(0, 14).addBox(-2.8F, -13.8F, -3.8F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		base3.setTextureOffset(0, 0).addBox(-3.4F, -13.9F, -3.2F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		base3.setTextureOffset(38, 0).addBox(-3.9F, -13.7F, -2.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		threepeater.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}