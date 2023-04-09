// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelloot_chest extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer lid;
	private final ModelRenderer knob;
	private final ModelRenderer attach;
	private final ModelRenderer rotation;
	private final ModelRenderer rotation2;
	private final ModelRenderer rotation3;
	private final ModelRenderer rotation4;
	private final ModelRenderer rotation5;
	private final ModelRenderer rotation6;
	private final ModelRenderer rotation7;
	private final ModelRenderer rotation8;
	private final ModelRenderer rotation9;
	private final ModelRenderer rotation10;
	private final ModelRenderer rotation11;
	private final ModelRenderer rotation12;
	private final ModelRenderer rotation13;
	private final ModelRenderer rotation14;
	private final ModelRenderer attached;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Modelloot_chest() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this);
		base.setRotationPoint(8.0F, 24.0F, 8.0F);
		setRotationAngle(base, 3.1416F, 0.0F, 0.0F);
		base.setTextureOffset(0, 19).addBox(-15.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);

		lid = new ModelRenderer(this);
		lid.setRotationPoint(8.0F, 15.0F, 7.0F);
		setRotationAngle(lid, 3.1416F, 0.0F, 0.0F);
		lid.setTextureOffset(0, 0).addBox(-15.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F, false);

		knob = new ModelRenderer(this);
		knob.setRotationPoint(8.0F, 16.0F, 8.0F);
		setRotationAngle(knob, 3.1416F, 0.0F, 0.0F);
		knob.setTextureOffset(0, 0).addBox(-9.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		attach = new ModelRenderer(this);
		attach.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(attach, 0.0F, 1.5708F, 0.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, -14.5F, 0.0F);
		attach.addChild(rotation);
		rotation.setTextureOffset(5, 50).addBox(-6.5F, -16.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(6.5F, -15.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-19.5F, -15.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-6.5F, -15.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(6.5F, -14.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(6.5F, -14.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-19.5F, -14.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-19.5F, -14.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-19.5F, -13.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-32.5F, -13.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-32.5F, -13.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-32.5F, -12.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-19.5F, -13.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(6.5F, -13.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(19.5F, -13.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(19.5F, -13.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(6.5F, -13.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-6.5F, -14.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-32.5F, -14.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-6.5F, -14.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(19.5F, -12.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(19.5F, -12.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-32.5F, -12.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(19.5F, -14.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation.setTextureOffset(5, 50).addBox(-6.5F, -15.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation2 = new ModelRenderer(this);
		rotation2.setRotationPoint(0.0F, 14.5F, 0.0F);
		rotation.addChild(rotation2);
		rotation2.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation2.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation2.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation2.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation2.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation3 = new ModelRenderer(this);
		rotation3.setRotationPoint(0.0F, 14.5F, 78.0F);
		rotation.addChild(rotation3);
		rotation3.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation3.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation3.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation3.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation3.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation4 = new ModelRenderer(this);
		rotation4.setRotationPoint(0.0F, 15.5F, 91.0F);
		rotation.addChild(rotation4);
		rotation4.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation4.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation4.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation4.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation4.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation5 = new ModelRenderer(this);
		rotation5.setRotationPoint(0.0F, 16.5F, 104.0F);
		rotation.addChild(rotation5);
		rotation5.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation5.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation5.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation5.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation5.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation6 = new ModelRenderer(this);
		rotation6.setRotationPoint(0.0F, 15.5F, -13.0F);
		rotation.addChild(rotation6);
		rotation6.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation6.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation6.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation6.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation6.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation7 = new ModelRenderer(this);
		rotation7.setRotationPoint(0.0F, 16.5F, -26.0F);
		rotation.addChild(rotation7);
		rotation7.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation7.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation7.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation7.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation7.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation8 = new ModelRenderer(this);
		rotation8.setRotationPoint(0.0F, -14.5F, 0.0F);
		attach.addChild(rotation8);
		rotation8.setTextureOffset(5, 50).addBox(-6.5F, -16.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(6.5F, -15.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-19.5F, -15.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-6.5F, -15.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(6.5F, -14.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(6.5F, -14.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-19.5F, -14.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-19.5F, -14.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-19.5F, -13.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-32.5F, -13.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-32.5F, -13.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-32.5F, -12.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-19.5F, -13.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(6.5F, -13.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(19.5F, -13.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(19.5F, -13.5F, 6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(6.5F, -13.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-6.5F, -14.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-32.5F, -14.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-6.5F, -14.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(19.5F, -12.5F, -32.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(19.5F, -12.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-32.5F, -12.5F, 19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(19.5F, -14.5F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation8.setTextureOffset(5, 50).addBox(-6.5F, -15.5F, -19.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation9 = new ModelRenderer(this);
		rotation9.setRotationPoint(0.0F, 14.5F, 0.0F);
		rotation8.addChild(rotation9);
		rotation9.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation9.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation9.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation9.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation9.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation10 = new ModelRenderer(this);
		rotation10.setRotationPoint(0.0F, 14.5F, 78.0F);
		rotation8.addChild(rotation10);
		rotation10.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation10.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation10.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation10.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation10.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation11 = new ModelRenderer(this);
		rotation11.setRotationPoint(0.0F, 15.5F, 91.0F);
		rotation8.addChild(rotation11);
		rotation11.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation11.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation11.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation11.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation11.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation12 = new ModelRenderer(this);
		rotation12.setRotationPoint(0.0F, 16.5F, 104.0F);
		rotation8.addChild(rotation12);
		rotation12.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation12.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation12.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation12.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation12.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation13 = new ModelRenderer(this);
		rotation13.setRotationPoint(0.0F, 15.5F, -13.0F);
		rotation8.addChild(rotation13);
		rotation13.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation13.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation13.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation13.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation13.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		rotation14 = new ModelRenderer(this);
		rotation14.setRotationPoint(0.0F, 16.5F, -26.0F);
		rotation8.addChild(rotation14);
		rotation14.setTextureOffset(5, 50).addBox(6.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation14.setTextureOffset(5, 50).addBox(19.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation14.setTextureOffset(5, 50).addBox(-6.5F, -28.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation14.setTextureOffset(5, 50).addBox(-19.5F, -27.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		rotation14.setTextureOffset(5, 50).addBox(-32.5F, -26.0F, -45.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		attached = new ModelRenderer(this);
		attached.setRotationPoint(0.0F, 24.0F, 0.0F);
		attached.setTextureOffset(14, 44).addBox(-0.5F, -30.0F, -0.5F, 1.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		attached.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(14, 44).addBox(-0.5F, -25.75F, 7.5F, 1.0F, 16.0F, 1.0F, -0.1F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		attached.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
		cube_r2.setTextureOffset(14, 44).addBox(-8.75F, -26.0F, -0.5F, 1.0F, 16.0F, 1.0F, -0.1F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		attached.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(14, 44).addBox(-0.5F, -25.75F, -8.5F, 1.0F, 16.0F, 1.0F, -0.1F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		attached.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3054F);
		cube_r4.setTextureOffset(14, 44).addBox(7.75F, -26.0F, -0.5F, 1.0F, 16.0F, 1.0F, -0.1F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		lid.render(matrixStack, buffer, packedLight, packedOverlay);
		knob.render(matrixStack, buffer, packedLight, packedOverlay);
		attach.render(matrixStack, buffer, packedLight, packedOverlay);
		attached.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}