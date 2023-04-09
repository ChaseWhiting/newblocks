
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

import net.mcreator.newblocks.entity.NormalZombieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NormalZombieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NormalZombieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelregular_zombie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/regular_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelregular_zombie extends EntityModel<Entity> {
		private final ModelRenderer waist;
		private final ModelRenderer body;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightItem;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftLeg;
		private final ModelRenderer rightLeg;
		private final ModelRenderer head;
		private final ModelRenderer hat;

		public Modelregular_zombie() {
			textureWidth = 64;
			textureHeight = 32;
			waist = new ModelRenderer(this);
			waist.setRotationPoint(0.0F, 12.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -12.0F, 0.0F);
			waist.addChild(body);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(rightArm, -1.3526F, 0.0F, 0.0F);
			rightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			setRotationAngle(leftArm, -1.3526F, 0.0F, 0.0F);
			leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			hat = new ModelRenderer(this);
			hat.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(hat);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			waist.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
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
