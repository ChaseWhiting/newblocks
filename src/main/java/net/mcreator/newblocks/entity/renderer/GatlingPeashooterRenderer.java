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

import net.mcreator.newblocks.entity.GatlingPeashooterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GatlingPeashooterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GatlingPeashooterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgatling_peashooter(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/gatling_peashooter.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgatling_peashooter extends EntityModel<Entity> {
		private final ModelRenderer gatlingpeashooter;
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
		private final ModelRenderer helmet;
		private final ModelRenderer helmet_r1;
		private final ModelRenderer helmet_r2;
		private final ModelRenderer helmet_r3;
		private final ModelRenderer helmet_r4;
		private final ModelRenderer helmet_r5;
		private final ModelRenderer helmet_r6;
		private final ModelRenderer helmet_r7;
		private final ModelRenderer helmet_r8;
		private final ModelRenderer helmet_r9;
		private final ModelRenderer base;
		private final ModelRenderer base_r1;
		private final ModelRenderer base_r2;
		private final ModelRenderer base_r3;
		private final ModelRenderer base_r4;
		private final ModelRenderer base_r5;
		private final ModelRenderer snout;
		private final ModelRenderer snout_r1;
		private final ModelRenderer snout_r2;
		private final ModelRenderer snout_r3;
		private final ModelRenderer snout_r4;
		private final ModelRenderer snout_r5;
		private final ModelRenderer snout_r6;
		private final ModelRenderer snout_r7;
		private final ModelRenderer snout_r8;

		public Modelgatling_peashooter() {
			textureWidth = 96;
			textureHeight = 96;
			gatlingpeashooter = new ModelRenderer(this);
			gatlingpeashooter.setRotationPoint(0.0F, 24.0F, 0.0F);
			leaves = new ModelRenderer(this);
			leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
			gatlingpeashooter.addChild(leaves);
			setRotationAngle(leaves, 0.0F, 0.829F, 0.0F);
			leaf1 = new ModelRenderer(this);
			leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf1);
			leaf1_r1 = new ModelRenderer(this);
			leaf1_r1.setRotationPoint(3.0F, -3.0F, 0.0F);
			leaf1.addChild(leaf1_r1);
			setRotationAngle(leaf1_r1, 0.0F, 0.0F, 0.7854F);
			leaf1_r1.setTextureOffset(49, 84).addBox(0.4019F, 0.0F, -1.8F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			leaf1_r2 = new ModelRenderer(this);
			leaf1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf1.addChild(leaf1_r2);
			setRotationAngle(leaf1_r2, 0.0F, 0.0F, -0.5236F);
			leaf1_r2.setTextureOffset(46, 84).addBox(0.0F, -0.7F, -2.05F, 4.0F, 0.0F, 4.0F, 0.0F, false);
			leaf2 = new ModelRenderer(this);
			leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf2);
			leaf2_r1 = new ModelRenderer(this);
			leaf2_r1.setRotationPoint(0.0F, -1.0F, 4.0F);
			leaf2.addChild(leaf2_r1);
			setRotationAngle(leaf2_r1, -0.4363F, 0.0F, 0.0F);
			leaf2_r1.setTextureOffset(48, 84).addBox(-1.8F, -0.4F, -0.2F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			leaf2_r2 = new ModelRenderer(this);
			leaf2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf2.addChild(leaf2_r2);
			setRotationAngle(leaf2_r2, 0.1745F, 0.0F, 0.0F);
			leaf2_r2.setTextureOffset(46, 83).addBox(-2.05F, -0.7F, 0.0F, 4.0F, 0.0F, 4.0F, 0.0F, false);
			leaf3 = new ModelRenderer(this);
			leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf3);
			leaf3_r1 = new ModelRenderer(this);
			leaf3_r1.setRotationPoint(-4.0F, -1.0F, 0.0F);
			leaf3.addChild(leaf3_r1);
			setRotationAngle(leaf3_r1, 0.0F, 0.0F, -0.5236F);
			leaf3_r1.setTextureOffset(48, 83).addBox(-2.4F, -0.5F, -1.8F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			leaf3_r2 = new ModelRenderer(this);
			leaf3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf3.addChild(leaf3_r2);
			setRotationAngle(leaf3_r2, 0.0F, 0.0F, 0.2618F);
			leaf3_r2.setTextureOffset(46, 83).addBox(-4.2F, -0.7F, -2.05F, 4.0F, 0.0F, 4.0F, 0.0F, false);
			leaf4 = new ModelRenderer(this);
			leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaves.addChild(leaf4);
			leaf4_r1 = new ModelRenderer(this);
			leaf4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			leaf4.addChild(leaf4_r1);
			setRotationAngle(leaf4_r1, -0.4363F, 0.0F, 0.0F);
			leaf4_r1.setTextureOffset(46, 83).addBox(-2.05F, -0.7F, -4.2F, 4.0F, 0.0F, 4.0F, 0.0F, false);
			leaf4_r2 = new ModelRenderer(this);
			leaf4_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
			leaf4.addChild(leaf4_r2);
			setRotationAngle(leaf4_r2, 0.0873F, 0.0F, 0.0F);
			leaf4_r2.setTextureOffset(48, 84).addBox(-1.8F, -0.3F, -3.6358F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			stem = new ModelRenderer(this);
			stem.setRotationPoint(0.0F, 0.0F, 0.0F);
			gatlingpeashooter.addChild(stem);
			stem1 = new ModelRenderer(this);
			stem1.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem.addChild(stem1);
			stem1_r1 = new ModelRenderer(this);
			stem1_r1.setRotationPoint(0.0F, -7.0427F, 1.3072F);
			stem1.addChild(stem1_r1);
			setRotationAngle(stem1_r1, 0.2618F, 0.0F, 0.0F);
			stem1_r1.setTextureOffset(41, 66).addBox(-1.4F, -4.7F, -1.7F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			stem2 = new ModelRenderer(this);
			stem2.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem.addChild(stem2);
			stem2_r1 = new ModelRenderer(this);
			stem2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			stem2.addChild(stem2_r1);
			setRotationAngle(stem2_r1, -0.192F, 0.0F, 0.0F);
			stem2_r1.setTextureOffset(33, 66).addBox(-1.4F, -7.2F, -1.7F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			gatlingpeashooter.addChild(head);
			helmet = new ModelRenderer(this);
			helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(helmet);
			helmet_r1 = new ModelRenderer(this);
			helmet_r1.setRotationPoint(5.0F, 0.0F, 0.0F);
			helmet.addChild(helmet_r1);
			setRotationAngle(helmet_r1, -0.4363F, 0.0F, 0.48F);
			helmet_r1.setTextureOffset(18, 51).addBox(-6.2F, -7.0F, -3.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			helmet_r2 = new ModelRenderer(this);
			helmet_r2.setRotationPoint(8.0F, -5.0F, 3.0F);
			helmet.addChild(helmet_r2);
			setRotationAngle(helmet_r2, -0.4363F, 0.0F, 0.4363F);
			helmet_r2.setTextureOffset(54, 48).addBox(-6.2F, -6.0F, -3.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			helmet_r3 = new ModelRenderer(this);
			helmet_r3.setRotationPoint(2.0F, -10.0F, 4.0F);
			helmet.addChild(helmet_r3);
			setRotationAngle(helmet_r3, -0.4363F, 0.0F, -0.48F);
			helmet_r3.setTextureOffset(49, 66).addBox(-6.2F, -6.0F, -3.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			helmet_r4 = new ModelRenderer(this);
			helmet_r4.setRotationPoint(-1.0F, -8.0F, -1.0F);
			helmet.addChild(helmet_r4);
			setRotationAngle(helmet_r4, -0.9599F, -1.4835F, -0.4363F);
			helmet_r4.setTextureOffset(0, 39).addBox(0.0091F, -2.8F, 0.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			helmet_r5 = new ModelRenderer(this);
			helmet_r5.setRotationPoint(-4.0F, -8.0F, 0.0F);
			helmet.addChild(helmet_r5);
			setRotationAngle(helmet_r5, -0.9599F, -0.2618F, -0.2618F);
			helmet_r5.setTextureOffset(28, 51).addBox(0.0091F, -2.8F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			helmet_r6 = new ModelRenderer(this);
			helmet_r6.setRotationPoint(0.0F, -13.0F, 9.0F);
			helmet.addChild(helmet_r6);
			setRotationAngle(helmet_r6, 0.1745F, 0.0F, 0.0F);
			helmet_r6.setTextureOffset(29, 0).addBox(-6.2F, -6.0F, -6.0F, 12.0F, 6.0F, 7.0F, 0.0F, false);
			helmet_r7 = new ModelRenderer(this);
			helmet_r7.setRotationPoint(0.0F, -24.0F, -4.0F);
			helmet.addChild(helmet_r7);
			setRotationAngle(helmet_r7, -0.0873F, 0.0F, 0.0F);
			helmet_r7.setTextureOffset(0, 41).addBox(-5.2F, -1.0F, -1.0F, 10.0F, 3.0F, 7.0F, 0.0F, false);
			helmet_r8 = new ModelRenderer(this);
			helmet_r8.setRotationPoint(0.0F, -20.0F, 4.0F);
			helmet.addChild(helmet_r8);
			setRotationAngle(helmet_r8, -0.0873F, 0.0F, 0.0F);
			helmet_r8.setTextureOffset(32, 32).addBox(-5.7F, -4.0F, -5.5F, 11.0F, 6.0F, 10.0F, 0.0F, false);
			helmet_r8.setTextureOffset(0, 21).addBox(-5.2F, -5.0F, -6.0F, 10.0F, 7.0F, 11.0F, 0.0F, false);
			helmet_r9 = new ModelRenderer(this);
			helmet_r9.setRotationPoint(0.0F, -21.0F, 4.0F);
			helmet.addChild(helmet_r9);
			setRotationAngle(helmet_r9, -0.0873F, 0.0F, 0.0F);
			helmet_r9.setTextureOffset(55, 13).addBox(-4.2F, -5.0F, -3.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(base);
			base_r1 = new ModelRenderer(this);
			base_r1.setRotationPoint(-7.0F, -13.0F, 0.0F);
			base.addChild(base_r1);
			setRotationAngle(base_r1, -0.0436F, 0.0F, 0.0F);
			base_r1.setTextureOffset(22, 48).addBox(2.5F, -6.5F, -6.0F, 1.0F, 6.0F, 12.0F, 0.0F, false);
			base_r1.setTextureOffset(48, 48).addBox(10.5F, -6.5F, -6.0F, 1.0F, 6.0F, 12.0F, 0.0F, false);
			base_r1.setTextureOffset(0, 0).addBox(2.8F, -8.0F, -6.0F, 8.0F, 8.0F, 13.0F, 0.0F, false);
			base_r2 = new ModelRenderer(this);
			base_r2.setRotationPoint(0.0F, -13.0F, 2.0F);
			base.addChild(base_r2);
			setRotationAngle(base_r2, -0.0436F, 0.0F, 0.0F);
			base_r2.setTextureOffset(36, 48).addBox(-3.7F, -7.0F, 4.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
			base_r3 = new ModelRenderer(this);
			base_r3.setRotationPoint(0.0F, -13.0F, -11.0F);
			base.addChild(base_r3);
			setRotationAngle(base_r3, -0.0436F, 0.0F, 0.0F);
			base_r3.setTextureOffset(0, 51).addBox(-4.2F, -7.5F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			base_r4 = new ModelRenderer(this);
			base_r4.setRotationPoint(0.0F, -12.0F, 0.0F);
			base.addChild(base_r4);
			setRotationAngle(base_r4, -0.0436F, 0.0F, 0.0F);
			base_r4.setTextureOffset(31, 13).addBox(-3.2F, -0.5F, -6.0F, 6.0F, 1.0F, 12.0F, 0.0F, false);
			base_r5 = new ModelRenderer(this);
			base_r5.setRotationPoint(0.0F, -11.0F, 0.0F);
			base.addChild(base_r5);
			setRotationAngle(base_r5, -0.0436F, 0.0F, 0.0F);
			base_r5.setTextureOffset(31, 26).addBox(-2.2F, -1.0F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			snout = new ModelRenderer(this);
			snout.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(snout);
			snout_r1 = new ModelRenderer(this);
			snout_r1.setRotationPoint(6.0F, -16.0F, -12.0F);
			snout.addChild(snout_r1);
			setRotationAngle(snout_r1, -0.0436F, 0.0F, 0.0F);
			snout_r1.setTextureOffset(0, 21).addBox(-4.0F, -3.5F, -0.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			snout_r1.setTextureOffset(25, 66).addBox(-10.0F, -3.5F, -0.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			snout_r2 = new ModelRenderer(this);
			snout_r2.setRotationPoint(0.0F, -10.0F, -12.0F);
			snout.addChild(snout_r2);
			setRotationAngle(snout_r2, -0.0436F, 0.0F, 0.0F);
			snout_r2.setTextureOffset(44, 26).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			snout_r3 = new ModelRenderer(this);
			snout_r3.setRotationPoint(1.0F, -11.0F, -11.0F);
			snout.addChild(snout_r3);
			setRotationAngle(snout_r3, -0.0436F, 0.0F, 0.0F);
			snout_r3.setTextureOffset(62, 25).addBox(-2.2F, -3.5F, -4.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			snout_r4 = new ModelRenderer(this);
			snout_r4.setRotationPoint(3.0F, -13.0F, -11.0F);
			snout.addChild(snout_r4);
			setRotationAngle(snout_r4, -0.0436F, 0.0F, 0.0F);
			snout_r4.setTextureOffset(11, 63).addBox(-2.2F, -3.5F, -4.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			snout_r4.setTextureOffset(64, 32).addBox(-6.2F, -3.5F, -4.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			snout_r5 = new ModelRenderer(this);
			snout_r5.setRotationPoint(1.0F, -15.0F, -11.0F);
			snout.addChild(snout_r5);
			setRotationAngle(snout_r5, -0.0436F, 0.0F, 0.0F);
			snout_r5.setTextureOffset(18, 51).addBox(-2.2F, -3.5F, -4.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			snout_r6 = new ModelRenderer(this);
			snout_r6.setRotationPoint(0.0F, -17.0F, -12.0F);
			snout.addChild(snout_r6);
			setRotationAngle(snout_r6, -0.0436F, 0.0F, 0.0F);
			snout_r6.setTextureOffset(60, 0).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			snout_r7 = new ModelRenderer(this);
			snout_r7.setRotationPoint(0.0F, -16.0F, -11.0F);
			snout.addChild(snout_r7);
			setRotationAngle(snout_r7, -0.0436F, 0.0F, 0.0F);
			snout_r7.setTextureOffset(0, 60).addBox(-3.5F, -3.5F, 0.5F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			snout_r8 = new ModelRenderer(this);
			snout_r8.setRotationPoint(0.0F, -16.0F, -8.0F);
			snout.addChild(snout_r8);
			setRotationAngle(snout_r8, -0.0436F, 0.0F, 0.0F);
			snout_r8.setTextureOffset(62, 48).addBox(-2.5F, -2.5F, -1.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			gatlingpeashooter.render(matrixStack, buffer, packedLight, packedOverlay);
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
