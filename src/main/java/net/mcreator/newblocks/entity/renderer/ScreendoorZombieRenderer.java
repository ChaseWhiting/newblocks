
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

import net.mcreator.newblocks.entity.ScreendoorZombieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ScreendoorZombieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ScreendoorZombieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelscreendoor_zombie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/screendoor_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelscreendoor_zombie extends EntityModel<Entity> {
		private final ModelRenderer waist;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightItem;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer bone;

		public Modelscreendoor_zombie() {
			textureWidth = 64;
			textureHeight = 64;
			waist = new ModelRenderer(this);
			waist.setRotationPoint(0.0F, 12.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -12.0F, 0.0F);
			waist.addChild(body);
			body.setTextureOffset(32, 19).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(1.0F, 20.0F, 6.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, -0.0436F);
			body_r1.setTextureOffset(0, 0).addBox(-8.3F, -24.0F, -10.0F, 16.0F, 21.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 24.0F, 5.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0436F, -0.0008F, 0.0174F);
			head_r1.setTextureOffset(0, 23).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			body.addChild(rightArm);
			setRotationAngle(rightArm, -0.8727F, 0.0F, 0.0F);
			rightArm.setTextureOffset(0, 39).addBox(9.0F, -5.8302F, 1.2139F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			body.addChild(leftArm);
			setRotationAngle(leftArm, -0.8727F, 0.0F, 0.0F);
			leftArm.setTextureOffset(0, 39).addBox(-13.0F, -5.8302F, 1.2139F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(28, 35).addBox(1.8F, 0.0F, 3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(36, 0).addBox(-5.8F, 0.0F, 3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, -8.4F);
			leftLeg.addChild(bone);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			waist.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
