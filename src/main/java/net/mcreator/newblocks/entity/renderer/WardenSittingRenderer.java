
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

import net.mcreator.newblocks.entity.WardenSittingEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WardenSittingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WardenSittingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwarden_sitting(), 1.4f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/warden_in_ground.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwarden_sitting extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer left_ear;
		private final ModelRenderer right_ear;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r1;

		public Modelwarden_sitting() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 6.0305F, 12.0534F);
			setRotationAngle(head, 0.5236F, 0.0F, 0.0F);
			head.setTextureOffset(0, 32).addBox(-8.0F, -23.4922F, -17.9764F, 16.0F, 16.0F, 10.0F, 0.0F, false);
			left_ear = new ModelRenderer(this);
			left_ear.setRotationPoint(8.0F, -38.7194F, -0.0212F);
			head.addChild(left_ear);
			left_ear.setTextureOffset(58, 6).addBox(0.0F, 12.2273F, -11.9552F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(-8.0F, -38.7194F, -0.0212F);
			head.addChild(right_ear);
			right_ear.setTextureOffset(58, 38).addBox(-10.0F, 12.2273F, -11.9552F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -10.0F, 0.0F);
			setRotationAngle(body, 1.0036F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 10.2008F, -13.9186F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.829F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(-9.0F, -3.6064F, -6.7158F, 18.0F, 21.0F, 11.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-9.0F, -6.0F, 5.0F);
			setRotationAngle(right_arm, -1.6581F, 0.0F, 0.0F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(1.0F, -4.4404F, 27.8935F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.6545F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(44, 50).addBox(-9.0F, -3.6125F, -17.6861F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(9.0F, -6.0F, 5.0F);
			setRotationAngle(left_arm, -1.6581F, 0.0F, 0.0F);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-1.0F, -4.4404F, 27.8935F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.6545F, 0.0F, 0.0F);
			left_arm_r1.setTextureOffset(0, 58).addBox(1.0F, -3.6125F, -17.6861F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(5.75F, 11.0F, -1.0F);
			setRotationAngle(left_leg, 0.5236F, 0.0F, 0.0F);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(0.0F, 22.7487F, 7.0F);
			left_leg.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, -1.9635F, 0.0F, 0.0F);
			left_leg_r1.setTextureOffset(76, 76).addBox(-3.0F, 17.4657F, -11.1335F, 6.0F, 13.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-6.0F, 11.0F, -1.0F);
			setRotationAngle(right_leg, 0.5236F, 0.0F, 0.0F);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(0.25F, 22.7487F, 7.0F);
			right_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -1.9635F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(76, 48).addBox(-3.0F, 17.4657F, -11.1335F, 6.0F, 13.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
