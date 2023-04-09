// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrab_new extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer eye;
	private final ModelRenderer eyeL;
	private final ModelRenderer eyeR;
	private final ModelRenderer patte_L;
	private final ModelRenderer patte_L_1;
	private final ModelRenderer av_jb;
	private final ModelRenderer ap_jb;
	private final ModelRenderer patte_L_2;
	private final ModelRenderer av_jb2;
	private final ModelRenderer ap_jb2;
	private final ModelRenderer patte_L_3;
	private final ModelRenderer av_jb3;
	private final ModelRenderer ap_jb3;
	private final ModelRenderer patte_L_4;
	private final ModelRenderer av_jb4;
	private final ModelRenderer ap_jb4;
	private final ModelRenderer patte_R;
	private final ModelRenderer patte_R_1;
	private final ModelRenderer av_jb5;
	private final ModelRenderer ap_jb5;
	private final ModelRenderer patte_R_2;
	private final ModelRenderer av_jb6;
	private final ModelRenderer ap_jb6;
	private final ModelRenderer patte_R_3;
	private final ModelRenderer av_jb7;
	private final ModelRenderer ap_jb7;
	private final ModelRenderer patte_R_4;
	private final ModelRenderer av_jb8;
	private final ModelRenderer ap_jb8;
	private final ModelRenderer pince_L;
	private final ModelRenderer AV_b;
	private final ModelRenderer AP_b;
	private final ModelRenderer pince;
	private final ModelRenderer pince_L2;
	private final ModelRenderer AV_b2;
	private final ModelRenderer AP_b2;
	private final ModelRenderer pince2;
	private final ModelRenderer shell;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public Modelcrab_new() {
		textureWidth = 48;
		textureHeight = 48;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 26.0F, -3.0F);

		eye = new ModelRenderer(this);
		eye.setRotationPoint(0.0F, 1.0F, 0.0F);
		all.addChild(eye);

		eyeL = new ModelRenderer(this);
		eyeL.setRotationPoint(0.0F, -3.0F, 0.0F);
		eye.addChild(eyeL);
		setRotationAngle(eyeL, 0.3007F, 0.0106F, -0.1795F);
		eyeL.setTextureOffset(6, 33).addBox(-1.2857F, -5.9569F, 1.1728F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		eyeR = new ModelRenderer(this);
		eyeR.setRotationPoint(0.0F, -3.0F, 0.0F);
		eye.addChild(eyeR);
		setRotationAngle(eyeR, 0.305F, -0.0106F, 0.1797F);
		eyeR.setTextureOffset(10, 33).addBox(0.285F, -5.9516F, 1.1891F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		patte_L = new ModelRenderer(this);
		patte_L.setRotationPoint(-3.0F, -1.0F, 1.0F);
		all.addChild(patte_L);

		patte_L_1 = new ModelRenderer(this);
		patte_L_1.setRotationPoint(0.0F, -3.0F, 0.0F);
		patte_L.addChild(patte_L_1);
		setRotationAngle(patte_L_1, 0.0F, -0.2618F, 0.0F);

		av_jb = new ModelRenderer(this);
		av_jb.setRotationPoint(0.0F, 1.0F, 0.5F);
		patte_L_1.addChild(av_jb);
		setRotationAngle(av_jb, 0.0F, 0.0F, 0.3054F);
		av_jb.setTextureOffset(0, 33).addBox(-2.5F, -1.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb = new ModelRenderer(this);
		ap_jb.setRotationPoint(1.0F, 3.0F, 0.0F);
		patte_L_1.addChild(ap_jb);
		setRotationAngle(ap_jb, 0.0F, 0.0F, 0.1745F);
		ap_jb.setTextureOffset(6, 29).addBox(-4.0F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_L_2 = new ModelRenderer(this);
		patte_L_2.setRotationPoint(0.0F, -3.0F, 1.5F);
		patte_L.addChild(patte_L_2);
		setRotationAngle(patte_L_2, 0.0F, -0.1309F, 0.0F);

		av_jb2 = new ModelRenderer(this);
		av_jb2.setRotationPoint(1.0F, 1.0F, -2.0F);
		patte_L_2.addChild(av_jb2);
		setRotationAngle(av_jb2, 0.0F, 0.0F, 0.3054F);
		av_jb2.setTextureOffset(0, 33).addBox(-3.4537F, -1.3F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb2 = new ModelRenderer(this);
		ap_jb2.setRotationPoint(2.0F, 3.0F, -2.5F);
		patte_L_2.addChild(ap_jb2);
		setRotationAngle(ap_jb2, 0.0F, 0.0F, 0.1745F);
		ap_jb2.setTextureOffset(6, 29).addBox(-4.9848F, -3.3F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_L_3 = new ModelRenderer(this);
		patte_L_3.setRotationPoint(0.0F, -3.0F, 3.0F);
		patte_L.addChild(patte_L_3);
		setRotationAngle(patte_L_3, -0.0193F, 0.2173F, -0.0894F);

		av_jb3 = new ModelRenderer(this);
		av_jb3.setRotationPoint(1.0F, 1.0F, -4.5F);
		patte_L_3.addChild(av_jb3);
		setRotationAngle(av_jb3, 0.0F, 0.0F, 0.3054F);
		av_jb3.setTextureOffset(0, 33).addBox(-3.4537F, -1.5F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb3 = new ModelRenderer(this);
		ap_jb3.setRotationPoint(2.0F, 3.0F, -5.0F);
		patte_L_3.addChild(ap_jb3);
		setRotationAngle(ap_jb3, 0.0F, 0.0F, 0.1745F);
		ap_jb3.setTextureOffset(6, 29).addBox(-4.9848F, -3.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_L_4 = new ModelRenderer(this);
		patte_L_4.setRotationPoint(0.0F, -3.0F, 4.0F);
		patte_L.addChild(patte_L_4);
		setRotationAngle(patte_L_4, -0.0568F, 0.9151F, -0.0716F);

		av_jb4 = new ModelRenderer(this);
		av_jb4.setRotationPoint(1.0F, 1.0F, -5.5F);
		patte_L_4.addChild(av_jb4);
		setRotationAngle(av_jb4, 0.0F, 0.0F, 0.3054F);
		av_jb4.setTextureOffset(0, 33).addBox(-3.4537F, -1.5F, 5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb4 = new ModelRenderer(this);
		ap_jb4.setRotationPoint(2.0F, 5.0F, -6.0F);
		patte_L_4.addChild(ap_jb4);
		setRotationAngle(ap_jb4, 0.0F, 0.0F, 0.1745F);
		ap_jb4.setTextureOffset(6, 29).addBox(-5.2F, -5.5F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_R = new ModelRenderer(this);
		patte_R.setRotationPoint(0.0F, 0.0F, 6.0F);
		all.addChild(patte_R);
		setRotationAngle(patte_R, -3.1416F, -0.0873F, 3.1416F);

		patte_R_1 = new ModelRenderer(this);
		patte_R_1.setRotationPoint(-3.0F, -4.0F, 5.0F);
		patte_R.addChild(patte_R_1);
		setRotationAngle(patte_R_1, 0.0F, 0.2618F, 0.0F);

		av_jb5 = new ModelRenderer(this);
		av_jb5.setRotationPoint(0.0F, 1.0F, -0.5F);
		patte_R_1.addChild(av_jb5);
		setRotationAngle(av_jb5, 0.0F, 0.0F, 0.3054F);
		av_jb5.setTextureOffset(0, 25).addBox(-2.5F, -1.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb5 = new ModelRenderer(this);
		ap_jb5.setRotationPoint(1.0F, 3.0F, 0.0F);
		patte_R_1.addChild(ap_jb5);
		setRotationAngle(ap_jb5, 0.0F, 0.0F, 0.1745F);
		ap_jb5.setTextureOffset(6, 25).addBox(-4.0F, -3.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_R_2 = new ModelRenderer(this);
		patte_R_2.setRotationPoint(-3.0F, -4.0F, 3.5F);
		patte_R.addChild(patte_R_2);
		setRotationAngle(patte_R_2, 0.0F, 0.1309F, 0.0F);

		av_jb6 = new ModelRenderer(this);
		av_jb6.setRotationPoint(1.0F, 1.0F, 2.0F);
		patte_R_2.addChild(av_jb6);
		setRotationAngle(av_jb6, 0.0F, 0.0F, 0.3054F);
		av_jb6.setTextureOffset(0, 25).addBox(-3.4537F, -1.3F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb6 = new ModelRenderer(this);
		ap_jb6.setRotationPoint(2.0F, 3.0F, 2.5F);
		patte_R_2.addChild(ap_jb6);
		setRotationAngle(ap_jb6, 0.0F, 0.0F, 0.1745F);
		ap_jb6.setTextureOffset(6, 25).addBox(-4.9848F, -3.3F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_R_3 = new ModelRenderer(this);
		patte_R_3.setRotationPoint(-3.0F, -4.0F, 2.0F);
		patte_R.addChild(patte_R_3);
		setRotationAngle(patte_R_3, 0.0193F, -0.2173F, -0.0894F);

		av_jb7 = new ModelRenderer(this);
		av_jb7.setRotationPoint(1.0F, 1.0F, 4.5F);
		patte_R_3.addChild(av_jb7);
		setRotationAngle(av_jb7, 0.0F, 0.0F, 0.3054F);
		av_jb7.setTextureOffset(0, 25).addBox(-3.4537F, -1.5F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb7 = new ModelRenderer(this);
		ap_jb7.setRotationPoint(2.0F, 3.0F, 5.0F);
		patte_R_3.addChild(ap_jb7);
		setRotationAngle(ap_jb7, 0.0F, 0.0F, 0.1745F);
		ap_jb7.setTextureOffset(6, 25).addBox(-4.9848F, -3.5F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		patte_R_4 = new ModelRenderer(this);
		patte_R_4.setRotationPoint(-3.0F, -4.0F, 1.0F);
		patte_R.addChild(patte_R_4);
		setRotationAngle(patte_R_4, 0.0568F, -0.9151F, -0.0716F);

		av_jb8 = new ModelRenderer(this);
		av_jb8.setRotationPoint(1.0F, 1.0F, 5.5F);
		patte_R_4.addChild(av_jb8);
		setRotationAngle(av_jb8, 0.0F, 0.0F, 0.3054F);
		av_jb8.setTextureOffset(0, 25).addBox(-3.4537F, -1.5F, -6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ap_jb8 = new ModelRenderer(this);
		ap_jb8.setRotationPoint(2.0F, 5.0F, 6.0F);
		patte_R_4.addChild(ap_jb8);
		setRotationAngle(ap_jb8, 0.0F, 0.0F, 0.1745F);
		ap_jb8.setTextureOffset(6, 25).addBox(-5.2F, -5.5F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		pince_L = new ModelRenderer(this);
		pince_L.setRotationPoint(-3.0F, -5.0F, 0.0F);
		all.addChild(pince_L);
		setRotationAngle(pince_L, 0.0F, 0.6545F, 0.0F);

		AV_b = new ModelRenderer(this);
		AV_b.setRotationPoint(0.1152F, 0.8509F, -0.265F);
		pince_L.addChild(AV_b);
		setRotationAngle(AV_b, 0.3054F, 0.2179F, -0.0965F);
		AV_b.setTextureOffset(6, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		AP_b = new ModelRenderer(this);
		AP_b.setRotationPoint(0.4536F, 1.2035F, -1.4615F);
		pince_L.addChild(AP_b);
		setRotationAngle(AP_b, 0.2071F, -0.6462F, -0.0538F);
		AP_b.setTextureOffset(0, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		pince = new ModelRenderer(this);
		pince.setRotationPoint(2.5F, 1.5F, -2.0F);
		pince_L.addChild(pince);
		setRotationAngle(pince, 0.0067F, 0.3367F, 0.2778F);
		pince.setTextureOffset(20, 16).addBox(-1.5F, -0.36F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		pince_L2 = new ModelRenderer(this);
		pince_L2.setRotationPoint(3.0F, -5.0F, 0.0F);
		all.addChild(pince_L2);
		setRotationAngle(pince_L2, 0.0F, -0.6545F, 0.0F);

		AV_b2 = new ModelRenderer(this);
		AV_b2.setRotationPoint(-0.1152F, 0.8509F, -0.265F);
		pince_L2.addChild(AV_b2);
		setRotationAngle(AV_b2, 0.3054F, -0.2179F, 0.0965F);
		AV_b2.setTextureOffset(6, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		AP_b2 = new ModelRenderer(this);
		AP_b2.setRotationPoint(-0.4536F, 1.2035F, -1.4615F);
		pince_L2.addChild(AP_b2);
		setRotationAngle(AP_b2, 0.2071F, 0.6462F, 0.0538F);
		AP_b2.setTextureOffset(0, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		pince2 = new ModelRenderer(this);
		pince2.setRotationPoint(-2.5F, 1.5F, -2.0F);
		pince_L2.addChild(pince2);
		setRotationAngle(pince2, 0.0067F, -0.3367F, -0.2778F);
		pince2.setTextureOffset(20, 16).addBox(-1.5F, -0.36F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(shell);
		setRotationAngle(shell, -0.0436F, 0.0F, 0.0F);
		shell.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, 0.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		shell.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.2618F);
		bone.setTextureOffset(0, 8).addBox(-2.0353F, -6.8637F, 0.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		shell.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2618F);
		bone2.setTextureOffset(22, 0).addBox(-1.9647F, -6.8637F, 0.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
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
		this.patte_L_1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.patte_L_4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.patte_L_3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.patte_L_2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.patte_R_3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.patte_R_2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.patte_R_1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.patte_R_4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}