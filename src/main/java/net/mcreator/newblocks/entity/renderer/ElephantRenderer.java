
package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.newblocks.entity.ElephantEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ElephantRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ElephantEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelelephant(), 1f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/elephant.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelelephant extends EntityModel<Entity> {
		private final ModelRenderer jaw;
		private final ModelRenderer body;
		private final ModelRenderer rotation;
		private final ModelRenderer body_normal;
		private final ModelRenderer tail;
		private final ModelRenderer body2;
		private final ModelRenderer front_right;
		private final ModelRenderer front_left;
		private final ModelRenderer body_sub_5;
		private final ModelRenderer back_right;
		private final ModelRenderer back_left;
		private final ModelRenderer body_sub_8;
		private final ModelRenderer head2;
		private final ModelRenderer horn_mirror;
		private final ModelRenderer body_sub_13;
		private final ModelRenderer trunk;
		private final ModelRenderer trunk_lower;
		private final ModelRenderer right_ear;
		private final ModelRenderer left_ear;
		private final ModelRenderer body_sub_14;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;
		private final ModelRenderer neck;
		private final ModelRenderer head;

		public Modelelephant() {
			textureWidth = 256;
			textureHeight = 256;
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, 8.0F, -8.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 1.0F, 3.5F);
			rotation = new ModelRenderer(this);
			rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(rotation);
			setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
			body_normal = new ModelRenderer(this);
			body_normal.setRotationPoint(0.0F, 23.0F, -3.5F);
			rotation.addChild(body_normal);
			body_normal.setTextureOffset(124, 48).addBox(-14.0F, -52.5F, -1.5F, 28.0F, 48.0F, 32.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 30.5F, 17.5F);
			rotation.addChild(tail);
			setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
			tail.setTextureOffset(43, 170).addBox(-3.0F, -11.5911F, -23.8942F, 6.0F, 0.0F, 27.0F, 0.0F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 0.0F, 0.0F);
			rotation.addChild(body2);
			setRotationAngle(body2, -1.5708F, 0.0F, 0.0F);
			front_right = new ModelRenderer(this);
			front_right.setRotationPoint(-12.5F, -11.5F, -18.5F);
			body2.addChild(front_right);
			front_right.setTextureOffset(70, 124).addBox(-5.5F, -0.5F, -5.5F, 11.0F, 35.0F, 11.0F, 0.0F, false);
			front_left = new ModelRenderer(this);
			front_left.setRotationPoint(12.5F, -6.5F, -6.5F);
			body2.addChild(front_left);
			body_sub_5 = new ModelRenderer(this);
			body_sub_5.setRotationPoint(0.0F, -5.0F, -12.0F);
			front_left.addChild(body_sub_5);
			body_sub_5.setTextureOffset(70, 124).addBox(-5.5F, -0.5F, -5.5F, 11.0F, 35.0F, 11.0F, 0.0F, true);
			back_right = new ModelRenderer(this);
			back_right.setRotationPoint(-12.5F, -8.5F, 12.0F);
			body2.addChild(back_right);
			back_right.setTextureOffset(26, 123).addBox(-5.5F, -1.5F, -5.5F, 11.0F, 33.0F, 11.0F, 0.0F, false);
			back_left = new ModelRenderer(this);
			back_left.setRotationPoint(12.5F, -4.5F, 24.0F);
			body2.addChild(back_left);
			body_sub_8 = new ModelRenderer(this);
			body_sub_8.setRotationPoint(0.0F, -4.0F, -12.0F);
			back_left.addChild(body_sub_8);
			body_sub_8.setTextureOffset(26, 123).addBox(-5.5F, -1.5F, -5.5F, 11.0F, 33.0F, 11.0F, 0.0F, true);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(0.0F, -16.0F, -17.5F);
			body2.addChild(head2);
			head2.setTextureOffset(0, 80).addBox(-10.0F, -12.0F, -27.0F, 20.0F, 23.0F, 20.0F, 0.0F, false);
			head2.setTextureOffset(0, 80).addBox(5.0F, 4.0F, -29.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			horn_mirror = new ModelRenderer(this);
			horn_mirror.setRotationPoint(0.0F, 39.0F, 14.0F);
			head2.addChild(horn_mirror);
			body_sub_13 = new ModelRenderer(this);
			body_sub_13.setRotationPoint(0.0F, 0.0F, 0.0F);
			horn_mirror.addChild(body_sub_13);
			body_sub_13.setTextureOffset(0, 80).addBox(-7.0F, -35.0F, -43.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			trunk = new ModelRenderer(this);
			trunk.setRotationPoint(0.0F, -5.0F, -12.0F);
			head2.addChild(trunk);
			setRotationAngle(trunk, -0.2618F, 0.0F, 0.0F);
			trunk.setTextureOffset(144, 0).addBox(-5.0F, 3.1058F, -21.5911F, 10.0F, 16.0F, 10.0F, 0.01F, false);
			trunk_lower = new ModelRenderer(this);
			trunk_lower.setRotationPoint(0.0F, 16.0F, -10.0F);
			trunk.addChild(trunk_lower);
			setRotationAngle(trunk_lower, 0.4363F, 0.0F, 0.0F);
			trunk_lower.setTextureOffset(104, 0).addBox(-5.0F, -2.0838F, -11.8177F, 10.0F, 16.0F, 10.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(-4.0F, -4.5F, -6.5F);
			head2.addChild(right_ear);
			setRotationAngle(right_ear, 0.0F, 0.2182F, 0.0F);
			right_ear.setTextureOffset(104, 26).addBox(-13.4027F, -9.5F, -12.2156F, 16.0F, 19.0F, 1.0F, 0.0F, false);
			left_ear = new ModelRenderer(this);
			left_ear.setRotationPoint(4.0F, -4.5F, -6.5F);
			head2.addChild(left_ear);
			setRotationAngle(left_ear, 0.0F, -0.2182F, 0.0F);
			body_sub_14 = new ModelRenderer(this);
			body_sub_14.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_ear.addChild(body_sub_14);
			body_sub_14.setTextureOffset(104, 26).addBox(-2.5973F, -9.5F, -12.2156F, 16.0F, 19.0F, 1.0F, 0.0F, true);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(8.0F, -13.0F, 21.0F);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-8.0F, -13.0F, 21.0F);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(8.0F, -13.0F, -3.5F);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-8.0F, -13.0F, -3.5F);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.0F, -6.0F, 8.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			jaw.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			leg4.render(matrixStack, buffer, packedLight, packedOverlay);
			neck.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.back_left.rotateAngleX = MathHelper.cos(f * 0.6F) * 0.5F * f1;
			this.back_right.rotateAngleX = MathHelper.cos(f * 0.6F) * -0.5F * f1;
			this.front_right.rotateAngleX = MathHelper.cos(f * 0.6F) * 0.5F * f1;
			this.front_left.rotateAngleX = MathHelper.cos(f * 0.6F) * -0.5F * f1;
			this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
