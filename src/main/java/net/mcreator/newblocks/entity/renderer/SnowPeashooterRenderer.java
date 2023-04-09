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

import net.mcreator.newblocks.entity.SnowPeashooterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnowPeashooterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnowPeashooterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnow_peashooter(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/snow_peashooter.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsnow_peashooter extends EntityModel<Entity> {
		private final ModelRenderer snow_peashooter;
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
		private final ModelRenderer stem2;
		private final ModelRenderer stem2_r1;
		private final ModelRenderer head;
		private final ModelRenderer snout;
		private final ModelRenderer ice;
		private final ModelRenderer ice_r1;
		private final ModelRenderer ice_r2;
		private final ModelRenderer ice_r3;
		private final ModelRenderer ice_r4;
		private final ModelRenderer ice_r5;
		private final ModelRenderer base;

		public Modelsnow_peashooter() {
			textureWidth = 64;
			textureHeight = 64;
			snow_peashooter = new ModelRenderer(this);
			snow_peashooter.setRotationPoint(0.0F, 24.0F, 0.0F);
			leaves = new ModelRenderer(this);
			leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
			snow_peashooter.addChild(leaves);
			leaf1 = new ModelRenderer(this);
			leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf1);
			leaf1_r1 = new ModelRenderer(this);
			leaf1_r1.setRotationPoint(3.0F, -3.0F, 0.0F);
			leaf1.addChild(leaf1_r1);
			setRotationAngle(leaf1_r1, 0.0F, 0.0F, 0.7854F);
			leaf1_r1.setTextureOffset(21, 49).addBox(0.4019F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 0.0F, false);
			leaf1_r2 = new ModelRenderer(this);
			leaf1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf1.addChild(leaf1_r2);
			setRotationAngle(leaf1_r2, 0.0F, 0.0F, -0.5236F);
			leaf1_r2.setTextureOffset(12, 59).addBox(0.0F, -0.7F, -1.05F, 4.0F, 0.0F, 2.0F, 0.0F, false);
			leaf2 = new ModelRenderer(this);
			leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf2);
			leaf2_r1 = new ModelRenderer(this);
			leaf2_r1.setRotationPoint(0.0F, -1.0F, 4.0F);
			leaf2.addChild(leaf2_r1);
			setRotationAngle(leaf2_r1, -0.4363F, 0.0F, 0.0F);
			leaf2_r1.setTextureOffset(26, 50).addBox(-0.8F, -0.4F, -0.2F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			leaf2_r2 = new ModelRenderer(this);
			leaf2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf2.addChild(leaf2_r2);
			setRotationAngle(leaf2_r2, 0.1745F, 0.0F, 0.0F);
			leaf2_r2.setTextureOffset(24, 57).addBox(-1.05F, -0.7F, 0.0F, 2.0F, 0.0F, 4.0F, 0.0F, false);
			leaf3 = new ModelRenderer(this);
			leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf3);
			leaf3_r1 = new ModelRenderer(this);
			leaf3_r1.setRotationPoint(-4.0F, -1.0F, 0.0F);
			leaf3.addChild(leaf3_r1);
			setRotationAngle(leaf3_r1, 0.0F, 0.0F, -0.5236F);
			leaf3_r1.setTextureOffset(27, 54).addBox(-1.4F, -0.5F, -0.8F, 2.0F, 0.0F, 1.0F, 0.0F, false);
			leaf3_r2 = new ModelRenderer(this);
			leaf3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf3.addChild(leaf3_r2);
			setRotationAngle(leaf3_r2, 0.0F, 0.0F, 0.2618F);
			leaf3_r2.setTextureOffset(13, 59).addBox(-4.2F, -0.7F, -1.05F, 4.0F, 0.0F, 2.0F, 0.0F, false);
			leaf4 = new ModelRenderer(this);
			leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf4);
			leaf4_r1 = new ModelRenderer(this);
			leaf4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf4.addChild(leaf4_r1);
			setRotationAngle(leaf4_r1, -0.4363F, 0.0F, 0.0F);
			leaf4_r1.setTextureOffset(24, 55).addBox(-1.05F, -0.7F, -4.2F, 2.0F, 0.0F, 4.0F, 0.0F, false);
			leaf4_r2 = new ModelRenderer(this);
			leaf4_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
			leaf4.addChild(leaf4_r2);
			setRotationAngle(leaf4_r2, 0.0873F, 0.0F, 0.0F);
			leaf4_r2.setTextureOffset(33, 49).addBox(-0.8F, -0.3F, -2.6358F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			stem = new ModelRenderer(this);
			stem.setRotationPoint(0.0F, 0.0F, 0.0F);
			snow_peashooter.addChild(stem);
			stem1 = new ModelRenderer(this);
			stem1.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem.addChild(stem1);
			stem1_r1 = new ModelRenderer(this);
			stem1_r1.setRotationPoint(0.0F, -5.0F, 1.0F);
			stem1.addChild(stem1_r1);
			setRotationAngle(stem1_r1, 0.2618F, 0.0F, 0.0F);
			stem1_r1.setTextureOffset(0, 19).addBox(-0.7F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			stem2 = new ModelRenderer(this);
			stem2.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem.addChild(stem2);
			stem2_r1 = new ModelRenderer(this);
			stem2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem2.addChild(stem2_r1);
			setRotationAngle(stem2_r1, -0.192F, 0.0F, 0.0F);
			stem2_r1.setTextureOffset(0, 0).addBox(-0.7F, -5.2F, -0.7F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.0F, 0.0F);
			stem.addChild(head);
			setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
			snout = new ModelRenderer(this);
			snout.setRotationPoint(0.0F, 7.0114F, 0.2615F);
			head.addChild(snout);
			snout.setTextureOffset(13, 28).addBox(-2.1F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			snout.setTextureOffset(0, 28).addBox(1.2F, -12.4F, -7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			snout.setTextureOffset(29, 2).addBox(-2.0F, -12.8F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			snout.setTextureOffset(29, 0).addBox(-2.0F, -9.1F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			snout.setTextureOffset(0, 14).addBox(-1.8F, -12.4F, -6.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			snout.setTextureOffset(26, 33).addBox(-1.51F, -11.8F, -6.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			ice = new ModelRenderer(this);
			ice.setRotationPoint(0.0F, 6.0114F, 3.2615F);
			head.addChild(ice);
			setRotationAngle(ice, 0.1745F, 0.0F, 0.0F);
			ice_r1 = new ModelRenderer(this);
			ice_r1.setRotationPoint(-2.0F, -11.0735F, 5.0377F);
			ice.addChild(ice_r1);
			setRotationAngle(ice_r1, 0.3491F, -0.0873F, -0.5236F);
			ice_r1.setTextureOffset(14, 33).addBox(-1.8171F, -1.3751F, -1.1226F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			ice_r2 = new ModelRenderer(this);
			ice_r2.setRotationPoint(-2.0F, -8.8134F, 9.6085F);
			ice.addChild(ice_r2);
			setRotationAngle(ice_r2, -0.0873F, 0.0873F, 0.0F);
			ice_r2.setTextureOffset(0, 38).addBox(1.5893F, 0.4895F, -5.5397F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			ice_r3 = new ModelRenderer(this);
			ice_r3.setRotationPoint(-2.0F, -8.8134F, 9.6085F);
			ice.addChild(ice_r3);
			setRotationAngle(ice_r3, -0.0873F, -0.1745F, 0.4363F);
			ice_r3.setTextureOffset(20, 0).addBox(-1.6365F, -0.1305F, -6.2713F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			ice_r4 = new ModelRenderer(this);
			ice_r4.setRotationPoint(3.0F, -10.5558F, 6.9695F);
			ice.addChild(ice_r4);
			setRotationAngle(ice_r4, 0.3491F, 0.1745F, 0.0F);
			ice_r4.setTextureOffset(0, 28).addBox(-3.4512F, -2.631F, -3.0597F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			ice_r5 = new ModelRenderer(this);
			ice_r5.setRotationPoint(3.0F, -10.5558F, 6.9695F);
			ice.addChild(ice_r5);
			setRotationAngle(ice_r5, 0.3491F, 0.1745F, 1.0472F);
			ice_r5.setTextureOffset(32, 33).addBox(-0.3F, -0.892F, -3.2937F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 7.0114F, 0.2615F);
			head.addChild(base);
			base.setTextureOffset(7, 52).addBox(-1.4F, -7.7F, -1.4F, 2.0F, 0.0F, 2.0F, 0.0F, false);
			base.setTextureOffset(21, 7).addBox(-2.8F, -14.3F, -2.8F, 5.0F, 6.0F, 7.0F, 0.0F, false);
			base.setTextureOffset(0, 14).addBox(-2.8F, -13.8F, -3.8F, 5.0F, 5.0F, 9.0F, 0.0F, false);
			base.setTextureOffset(0, 0).addBox(-3.4F, -13.9F, -3.2F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			base.setTextureOffset(22, 22).addBox(-3.9F, -13.7F, -2.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			snow_peashooter.render(matrixStack, buffer, packedLight, packedOverlay);
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
