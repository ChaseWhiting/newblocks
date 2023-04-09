package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.newblocks.entity.MelonPultEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MelonPultRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MelonPultEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmelon_pult(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/melon_pult.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmelon_pult extends EntityModel<Entity> {
		private final ModelRenderer melon_pult;
		private final ModelRenderer melon;
		private final ModelRenderer pult;
		private final ModelRenderer basket;
		private final ModelRenderer basket_r1;
		private final ModelRenderer basket_r2;
		private final ModelRenderer stem;
		private final ModelRenderer stem_r1;
		private final ModelRenderer stem_r2;
		private final ModelRenderer stem_r3;
		private final ModelRenderer stem_r4;
		private final ModelRenderer stem_r5;
		private final ModelRenderer stem_r6;
		private final ModelRenderer stem_r7;
		private final ModelRenderer stem_r8;
		private final ModelRenderer stem_r9;
		private final ModelRenderer stem_r10;
		private final ModelRenderer stem_r11;
		private final ModelRenderer leaves;
		private final ModelRenderer leaf1;
		private final ModelRenderer leaf1_r1;
		private final ModelRenderer leaf2;
		private final ModelRenderer leaf2_r1;
		private final ModelRenderer leaf3;
		private final ModelRenderer leaf3_r1;
		private final ModelRenderer leaf4;
		private final ModelRenderer leaf4_r1;
		private final ModelRenderer leaf5;
		private final ModelRenderer leaf5_r1;
		private final ModelRenderer leaf6;
		private final ModelRenderer leaf6_r1;
		private final ModelRenderer leaf7;
		private final ModelRenderer leaf7_r1;
		private final ModelRenderer leaf8;
		private final ModelRenderer leaf8_r1;

		public Modelmelon_pult() {
			textureWidth = 128;
			textureHeight = 128;
			melon_pult = new ModelRenderer(this);
			melon_pult.setRotationPoint(0.0F, 24.0F, 0.0F);
			melon = new ModelRenderer(this);
			melon.setRotationPoint(0.0F, 0.0F, 0.0F);
			melon_pult.addChild(melon);
			melon.setTextureOffset(34, 21).addBox(-5.0F, -8.0F, -3.0F, 10.0F, 8.0F, 8.0F, 0.0F, false);
			melon.setTextureOffset(0, 14).addBox(-6.5F, -7.5F, -3.2F, 13.0F, 7.0F, 8.0F, 0.0F, false);
			melon.setTextureOffset(0, 0).addBox(-7.0F, -7.3F, -3.0F, 14.0F, 6.0F, 8.0F, 0.0F, false);
			melon.setTextureOffset(0, 29).addBox(-5.0F, -7.0F, -3.7F, 10.0F, 6.0F, 9.0F, 0.0F, false);
			pult = new ModelRenderer(this);
			pult.setRotationPoint(0.0F, -8.0F, 5.0F);
			melon.addChild(pult);
			basket = new ModelRenderer(this);
			basket.setRotationPoint(0.0F, 8.0F, -5.0F);
			pult.addChild(basket);
			basket.setTextureOffset(36, 6).addBox(-6.0F, -11.5F, 10.5F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			basket.setTextureOffset(20, 56).addBox(-6.0F, -12.5F, 10.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			basket.setTextureOffset(37, 55).addBox(-6.5F, -12.5F, 10.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			basket.setTextureOffset(54, 47).addBox(1.0F, -12.5F, 10.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			basket.setTextureOffset(54, 42).addBox(-6.0F, -12.5F, 17.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			basket_r1 = new ModelRenderer(this);
			basket_r1.setRotationPoint(-2.0F, -12.0F, 14.0F);
			basket.addChild(basket_r1);
			setRotationAngle(basket_r1, 0.2618F, 0.0F, 0.0F);
			basket_r1.setTextureOffset(32, 38).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			basket_r2 = new ModelRenderer(this);
			basket_r2.setRotationPoint(-2.0F, -11.0F, 14.0F);
			basket.addChild(basket_r2);
			setRotationAngle(basket_r2, 0.2618F, 0.0F, 0.0F);
			basket_r2.setTextureOffset(0, 52).addBox(-3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			stem = new ModelRenderer(this);
			stem.setRotationPoint(0.0F, 8.0F, -5.0F);
			pult.addChild(stem);
			stem_r1 = new ModelRenderer(this);
			stem_r1.setRotationPoint(-2.6025F, -8.6619F, 6.165F);
			stem.addChild(stem_r1);
			setRotationAngle(stem_r1, -1.5708F, -0.7854F, 1.8326F);
			stem_r1.setTextureOffset(0, 4).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r2 = new ModelRenderer(this);
			stem_r2.setRotationPoint(-0.7238F, -11.047F, 11.0476F);
			stem.addChild(stem_r2);
			setRotationAngle(stem_r2, -2.7925F, -1.9199F, 2.3562F);
			stem_r2.setTextureOffset(29, 29).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			stem_r3 = new ModelRenderer(this);
			stem_r3.setRotationPoint(-1.9772F, -9.7936F, 8.9674F);
			stem.addChild(stem_r3);
			setRotationAngle(stem_r3, -2.7925F, -2.4435F, 2.3562F);
			stem_r3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r4 = new ModelRenderer(this);
			stem_r4.setRotationPoint(-2.6593F, -8.8432F, 7.536F);
			stem.addChild(stem_r4);
			setRotationAngle(stem_r4, -2.1817F, -2.0071F, 1.9199F);
			stem_r4.setTextureOffset(0, 2).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r5 = new ModelRenderer(this);
			stem_r5.setRotationPoint(-2.1715F, -10.3293F, 5.4553F);
			stem.addChild(stem_r5);
			setRotationAngle(stem_r5, -1.7453F, -0.1745F, 1.8326F);
			stem_r5.setTextureOffset(0, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r6 = new ModelRenderer(this);
			stem_r6.setRotationPoint(-2.2087F, -11.1812F, 7.1239F);
			stem.addChild(stem_r6);
			setRotationAngle(stem_r6, 2.5307F, 0.6109F, 2.7053F);
			stem_r6.setTextureOffset(0, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r7 = new ModelRenderer(this);
			stem_r7.setRotationPoint(-0.4213F, -11.2403F, 6.6885F);
			stem.addChild(stem_r7);
			setRotationAngle(stem_r7, -0.7854F, 0.6109F, -2.618F);
			stem_r7.setTextureOffset(0, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r8 = new ModelRenderer(this);
			stem_r8.setRotationPoint(0.2626F, -10.9128F, 6.8595F);
			stem.addChild(stem_r8);
			setRotationAngle(stem_r8, -0.6981F, -0.1745F, -2.5307F);
			stem_r8.setTextureOffset(0, 18).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r9 = new ModelRenderer(this);
			stem_r9.setRotationPoint(0.9047F, -10.3686F, 6.2558F);
			stem.addChild(stem_r9);
			setRotationAngle(stem_r9, -0.7854F, -0.6981F, -1.7453F);
			stem_r9.setTextureOffset(0, 20).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r10 = new ModelRenderer(this);
			stem_r10.setRotationPoint(1.4594F, -8.9358F, 5.2886F);
			stem.addChild(stem_r10);
			setRotationAngle(stem_r10, 0.0F, -1.0472F, -0.7854F);
			stem_r10.setTextureOffset(0, 29).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			stem_r11 = new ModelRenderer(this);
			stem_r11.setRotationPoint(0.0F, -8.0F, 4.0F);
			stem.addChild(stem_r11);
			setRotationAngle(stem_r11, 0.0F, -0.4363F, -0.4363F);
			stem_r11.setTextureOffset(0, 31).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leaves = new ModelRenderer(this);
			leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
			melon_pult.addChild(leaves);
			leaf1 = new ModelRenderer(this);
			leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf1);
			leaf1_r1 = new ModelRenderer(this);
			leaf1_r1.setRotationPoint(4.0F, 0.0F, -2.0F);
			leaf1.addChild(leaf1_r1);
			setRotationAngle(leaf1_r1, 0.0F, 0.8727F, -0.2618F);
			leaf1_r1.setTextureOffset(54, 37).addBox(-1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			leaf2 = new ModelRenderer(this);
			leaf2.setRotationPoint(0.0F, 0.0F, 1.0F);
			leaves.addChild(leaf2);
			setRotationAngle(leaf2, 0.0F, 1.7453F, 0.0F);
			leaf2_r1 = new ModelRenderer(this);
			leaf2_r1.setRotationPoint(4.0F, 0.0F, -2.0F);
			leaf2.addChild(leaf2_r1);
			setRotationAngle(leaf2_r1, 0.0F, 0.8727F, -0.2618F);
			leaf2_r1.setTextureOffset(52, 1).addBox(-1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			leaf3 = new ModelRenderer(this);
			leaf3.setRotationPoint(-3.0F, 0.0F, 4.0F);
			leaves.addChild(leaf3);
			setRotationAngle(leaf3, 0.0F, -2.9671F, 0.0F);
			leaf3_r1 = new ModelRenderer(this);
			leaf3_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf3.addChild(leaf3_r1);
			setRotationAngle(leaf3_r1, 0.0F, 0.8727F, -0.2618F);
			leaf3_r1.setTextureOffset(50, 16).addBox(-1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			leaf4 = new ModelRenderer(this);
			leaf4.setRotationPoint(5.0F, 0.0F, 2.0F);
			leaves.addChild(leaf4);
			setRotationAngle(leaf4, 0.0F, -1.9199F, 0.0F);
			leaf4_r1 = new ModelRenderer(this);
			leaf4_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf4.addChild(leaf4_r1);
			setRotationAngle(leaf4_r1, 0.0F, 0.8727F, -0.2618F);
			leaf4_r1.setTextureOffset(36, 0).addBox(-1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			leaf5 = new ModelRenderer(this);
			leaf5.setRotationPoint(6.0F, 0.0F, 0.0F);
			leaves.addChild(leaf5);
			setRotationAngle(leaf5, 0.0F, -1.2217F, 0.0F);
			leaf5_r1 = new ModelRenderer(this);
			leaf5_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf5.addChild(leaf5_r1);
			setRotationAngle(leaf5_r1, 0.0F, 0.8727F, -0.2618F);
			leaf5_r1.setTextureOffset(34, 15).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			leaf6 = new ModelRenderer(this);
			leaf6.setRotationPoint(-6.0F, -1.0F, 0.0F);
			leaves.addChild(leaf6);
			setRotationAngle(leaf6, 0.0F, 2.5307F, 0.0F);
			leaf6_r1 = new ModelRenderer(this);
			leaf6_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf6.addChild(leaf6_r1);
			setRotationAngle(leaf6_r1, 0.0F, 0.8727F, -0.2618F);
			leaf6_r1.setTextureOffset(19, 48).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			leaf7 = new ModelRenderer(this);
			leaf7.setRotationPoint(0.0F, -1.0F, 4.0F);
			leaves.addChild(leaf7);
			setRotationAngle(leaf7, 0.0F, -2.5307F, 0.0F);
			leaf7_r1 = new ModelRenderer(this);
			leaf7_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf7.addChild(leaf7_r1);
			setRotationAngle(leaf7_r1, -0.1309F, 0.8727F, -0.2618F);
			leaf7_r1.setTextureOffset(0, 44).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			leaf8 = new ModelRenderer(this);
			leaf8.setRotationPoint(1.0F, 0.0F, -3.0F);
			leaves.addChild(leaf8);
			setRotationAngle(leaf8, 0.0F, 0.9599F, 0.0F);
			leaf8_r1 = new ModelRenderer(this);
			leaf8_r1.setRotationPoint(0.6983F, 0.0F, -0.5513F);
			leaf8.addChild(leaf8_r1);
			setRotationAngle(leaf8_r1, 0.0F, 0.8727F, -0.2618F);
			leaf8_r1.setTextureOffset(38, 48).addBox(-1.0F, -1.0F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			melon_pult.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
