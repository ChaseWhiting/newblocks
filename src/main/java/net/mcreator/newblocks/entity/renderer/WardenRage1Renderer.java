
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

import net.mcreator.newblocks.entity.WardenRage1Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WardenRage1Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WardenRage1Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwarden_rage_1(), 1.4f) {

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
	public static class Modelwarden_rage_1 extends EntityModel<Entity> {
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
		private final ModelRenderer right_leg;

		public Modelwarden_rage_1() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -3.0F, 3.0F);
			setRotationAngle(head, -0.3927F, 0.0F, 0.0F);
			head.setTextureOffset(0, 32).addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);
			left_ear = new ModelRenderer(this);
			left_ear.setRotationPoint(8.0F, -12.5F, 1.0F);
			head.addChild(left_ear);
			left_ear.setTextureOffset(58, 6).addBox(0.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(-8.0F, -12.5F, 1.0F);
			head.addChild(right_ear);
			right_ear.setTextureOffset(58, 38).addBox(-10.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 2.0F, -15.0F);
			setRotationAngle(body, 0.9599F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 34.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -1.3526F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(-9.0F, -21.0F, -22.0F, 18.0F, 21.0F, 11.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-11.0F, -6.0F, 0.0F);
			setRotationAngle(right_arm, 1.92F, -0.4971F, -0.1719F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-2.0F, -2.4409F, -10.4373F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 2.286F, -0.1996F, -0.1706F);
			right_arm_r1.setTextureOffset(44, 50).addBox(-4.0F, -2.8055F, -7.4137F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(11.0F, -6.0F, 0.0F);
			setRotationAngle(left_arm, 1.92F, 0.4971F, 0.1719F);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(2.0F, -2.722F, -9.1694F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 2.286F, 0.1996F, 0.1706F);
			left_arm_r1.setTextureOffset(0, 58).addBox(-3.0F, -2.5244F, -8.4315F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(6.0F, 11.0F, -1.0F);
			left_leg.setTextureOffset(76, 76).addBox(-3.25F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-6.0F, 11.0F, -1.0F);
			right_leg.setTextureOffset(76, 48).addBox(-2.75F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
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
