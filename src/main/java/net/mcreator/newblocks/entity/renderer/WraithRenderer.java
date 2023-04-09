
package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.newblocks.entity.WraithEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WraithRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WraithEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwraith(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/wraith.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/entities/wraith_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwraith extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer robe;
		private final ModelRenderer rightRobe;
		private final ModelRenderer rightRobe_r1;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer leftRobe;
		private final ModelRenderer leftRobe_r1;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftArm_r1;
		private final ModelRenderer head;
		private final ModelRenderer hood;

		public Modelwraith() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 1.75F);
			body.setTextureOffset(44, 32).addBox(-0.5F, -18.0F, -2.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 3).addBox(-3.0F, -16.05F, -5.5F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(42, 3).addBox(-3.0F, -14.05F, -5.5F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			robe = new ModelRenderer(this);
			robe.setRotationPoint(0.0F, 0.0F, -2.0F);
			body.addChild(robe);
			robe.setTextureOffset(20, 16).addBox(-4.0F, -19.05F, -1.0F, 8.0F, 19.0F, 4.0F, 0.0F, false);
			rightRobe = new ModelRenderer(this);
			rightRobe.setRotationPoint(-6.0F, -15.0F, -1.0F);
			body.addChild(rightRobe);
			rightRobe_r1 = new ModelRenderer(this);
			rightRobe_r1.setRotationPoint(12.0F, -3.0F, 0.0F);
			rightRobe.addChild(rightRobe_r1);
			setRotationAngle(rightRobe_r1, -0.0873F, 0.0F, 0.0F);
			rightRobe_r1.setTextureOffset(4, 16).addBox(-14.05F, -0.05F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-6.0F, -15.0F, -1.0F);
			body.addChild(rightArm);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(12.0F, -3.0F, 0.0F);
			rightArm.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, -0.1309F, 0.0F, 0.0F);
			rightArm_r1.setTextureOffset(44, 32).addBox(-12.5F, 1.5F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			leftRobe = new ModelRenderer(this);
			leftRobe.setRotationPoint(6.0F, -15.0F, -1.0F);
			body.addChild(leftRobe);
			leftRobe_r1 = new ModelRenderer(this);
			leftRobe_r1.setRotationPoint(-12.0F, -3.0F, 0.0F);
			leftRobe.addChild(leftRobe_r1);
			setRotationAngle(leftRobe_r1, -0.0873F, 0.0F, 0.0F);
			leftRobe_r1.setTextureOffset(44, 16).addBox(10.05F, -0.05F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(6.0F, -15.0F, -1.0F);
			body.addChild(leftArm);
			leftArm_r1 = new ModelRenderer(this);
			leftArm_r1.setRotationPoint(-12.0F, -3.0F, 0.0F);
			leftArm.addChild(leftArm_r1);
			setRotationAngle(leftArm_r1, -0.1309F, 0.0F, 0.0F);
			leftArm_r1.setTextureOffset(44, 32).addBox(11.5F, 1.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -18.0F, -2.0F);
			body.addChild(head);
			head.setTextureOffset(26, 8).addBox(-3.025F, -7.55F, -2.75F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(2, 2).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			hood = new ModelRenderer(this);
			hood.setRotationPoint(0.0F, -18.0F, -2.0F);
			body.addChild(hood);
			hood.setTextureOffset(12, 40).addBox(-4.025F, -7.8F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
