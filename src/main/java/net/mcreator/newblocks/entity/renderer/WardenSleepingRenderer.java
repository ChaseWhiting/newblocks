
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

import net.mcreator.newblocks.entity.WardenSleepingEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WardenSleepingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WardenSleepingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwarden_sleeping_1(), 1.4f) {

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
	public static class Modelwarden_sleeping_1 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer left_ear;
		private final ModelRenderer right_ear;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r1;

		public Modelwarden_sleeping_1() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.5275F, 18.7144F, 5.791F);
			setRotationAngle(head, -1.7017F, 0.6981F, 0.0F);
			head.setTextureOffset(0, 32).addBox(-3.9498F, -21.543F, -7.83F, 16.0F, 16.0F, 10.0F, 0.0F, false);
			left_ear = new ModelRenderer(this);
			left_ear.setRotationPoint(9.7521F, -34.8584F, 10.3769F);
			head.addChild(left_ear);
			left_ear.setTextureOffset(58, 6).addBox(2.2981F, 10.3154F, -12.2069F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(-6.2479F, -34.8584F, 10.3769F);
			head.addChild(right_ear);
			right_ear.setTextureOffset(58, 38).addBox(-7.7019F, 10.3154F, -12.2069F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -10.0F, 0.0F);
			setRotationAngle(body, 1.0036F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 10.2008F, -13.9186F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -2.6997F, 0.4366F, -0.7295F);
			body_r1.setTextureOffset(0, 0).addBox(-6.9732F, -10.8182F, 6.2842F, 18.0F, 21.0F, 11.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-10.3853F, 18.8181F, 9.6494F);
			setRotationAngle(right_arm, -1.6581F, 0.0F, 0.0F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 1.7017F);
			right_arm_r1.setTextureOffset(44, 50).addBox(-4.3916F, -13.9743F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5F, -4.25F, 1.75F);
			setRotationAngle(left_arm, -1.6581F, 0.0F, 0.0F);
			left_arm.setTextureOffset(0, 58).addBox(0.0F, 0.1321F, 19.3591F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.75F, 11.0F, -8.0F);
			setRotationAngle(left_leg, 0.5236F, 0.0F, 0.0F);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(0.0F, 6.0631F, -12.0288F);
			left_leg.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, -1.972F, 0.2013F, -0.0846F);
			left_leg_r1.setTextureOffset(76, 76).addBox(-11.0711F, -7.1493F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-18.6444F, 21.5101F, -2.6501F);
			setRotationAngle(right_leg, 0.5236F, 0.0F, 0.0F);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(6.8944F, -2.2139F, -5.3447F);
			right_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -2.1962F, 0.8584F, -0.5002F);
			right_leg_r1.setTextureOffset(76, 48).addBox(-6.2793F, -8.9575F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
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
