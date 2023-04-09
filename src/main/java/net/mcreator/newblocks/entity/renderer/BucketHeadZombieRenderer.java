
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

import net.mcreator.newblocks.entity.BucketHeadZombieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BucketHeadZombieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BucketHeadZombieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbuckethead_zombie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/buckethead_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbuckethead_zombie extends EntityModel<Entity> {
		private final ModelRenderer waist;
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer hat;
		private final ModelRenderer hat_r1;
		private final ModelRenderer hat_r2;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer rightItem;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftArm_r1;

		public Modelbuckethead_zombie() {
			textureWidth = 64;
			textureHeight = 64;
			waist = new ModelRenderer(this);
			waist.setRotationPoint(0.0F, 12.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -12.0F, 0.0F);
			waist.addChild(body);
			body.setTextureOffset(0, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			hat = new ModelRenderer(this);
			hat.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.addChild(hat);
			hat.setTextureOffset(0, 16).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.5F, false);
			hat.setTextureOffset(25, 9).addBox(-3.5F, -11.0F, -3.5F, 7.0F, 4.0F, 7.0F, 0.5F, false);
			hat.setTextureOffset(26, 22).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.5F, false);
			hat_r1 = new ModelRenderer(this);
			hat_r1.setRotationPoint(0.0436F, 9.7679F, 10.3136F);
			hat.addChild(hat_r1);
			setRotationAngle(hat_r1, 0.8727F, 0.0F, 0.0F);
			hat_r1.setTextureOffset(29, 29).addBox(4.5F, -18.5F, -2.0F, 0.0F, 0.0F, 7.0F, 0.5F, false);
			hat_r1.setTextureOffset(26, 29).addBox(-4.5F, -18.5F, -2.0F, 0.0F, 0.0F, 7.0F, 0.5F, false);
			hat_r2 = new ModelRenderer(this);
			hat_r2.setRotationPoint(-9.0F, 10.0F, 11.0F);
			hat.addChild(hat_r2);
			setRotationAngle(hat_r2, 0.8727F, 0.0F, 0.0F);
			hat_r2.setTextureOffset(8, 26).addBox(4.5436F, -19.175F, -2.2634F, 9.0F, 0.0F, 0.0F, 0.5F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			body.addChild(rightLeg);
			rightLeg.setTextureOffset(40, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			body.addChild(leftLeg);
			leftLeg.setTextureOffset(24, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
			rightArm.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, -1.309F, 0.0F, 0.0F);
			rightArm_r1.setTextureOffset(46, 0).addBox(-8.0F, -6.75F, -24.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm_r1 = new ModelRenderer(this);
			leftArm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
			leftArm.addChild(leftArm_r1);
			setRotationAngle(leftArm_r1, -1.309F, 0.0F, 0.0F);
			leftArm_r1.setTextureOffset(0, 44).addBox(4.0F, -7.0F, -24.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			waist.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
