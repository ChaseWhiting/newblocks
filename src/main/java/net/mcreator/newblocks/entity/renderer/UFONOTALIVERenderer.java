
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

import net.mcreator.newblocks.entity.UFONOTALIVEEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class UFONOTALIVERenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(UFONOTALIVEEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelufo(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/ufo.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/entities/ufo_light.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelufo extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head2;
		private final ModelRenderer head;
		private final ModelRenderer left_wing;
		private final ModelRenderer left_wing_tip;
		private final ModelRenderer right_wing;
		private final ModelRenderer right_wing_sub_0;
		private final ModelRenderer right_wing_tip;
		private final ModelRenderer right_wing_tip_sub_0;
		private final ModelRenderer tail;
		private final ModelRenderer tail2;

		public Modelufo() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 3.0F, 0.0F);
			body.setTextureOffset(0, 8).addBox(-3.5F, 18.0F, -10.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 18.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 16.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 14.0F, -10.0F, 8.0F, 2.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 12.0F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-2.5F, 12.0F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-2.5F, 12.0F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.5F, 12.0F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.5F, 12.0F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.5F, 14.0F, -9.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 14.0F, -9.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(6.5F, 14.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(8.5F, 14.0F, -6.0F, 1.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(9.5F, 14.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(10.5F, 14.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-10.5F, 14.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-9.5F, 14.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-8.5F, 14.0F, -6.0F, 1.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, 14.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, 18.0F, -19.0F, 4.0F, 2.0F, 38.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 18.0F, -19.0F, 4.0F, 2.0F, 38.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 16.0F, -17.0F, 3.0F, 2.0F, 34.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.5F, 16.0F, -17.0F, 3.0F, 2.0F, 34.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-8.5F, 16.0F, -16.0F, 2.0F, 2.0F, 32.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(7.5F, 16.0F, -16.0F, 2.0F, 2.0F, 32.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(9.5F, 16.0F, -15.0F, 2.0F, 2.0F, 30.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-10.5F, 16.0F, -15.0F, 2.0F, 2.0F, 30.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-11.5F, 16.0F, -14.0F, 1.0F, 2.0F, 28.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-12.5F, 16.0F, -13.0F, 1.0F, 2.0F, 26.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-13.5F, 16.0F, -12.0F, 1.0F, 2.0F, 24.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-14.5F, 16.0F, -10.0F, 1.0F, 2.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-15.5F, 16.0F, -8.0F, 1.0F, 2.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-16.5F, 16.0F, -5.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(16.5F, 16.0F, -5.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(15.5F, 16.0F, -8.0F, 1.0F, 2.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(14.5F, 16.0F, -10.0F, 1.0F, 2.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(11.5F, 16.0F, -14.0F, 1.0F, 2.0F, 28.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(12.5F, 16.0F, -13.0F, 1.0F, 2.0F, 26.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(13.5F, 16.0F, -12.0F, 1.0F, 2.0F, 24.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(8.5F, 18.0F, -18.0F, 2.0F, 2.0F, 36.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(11.5F, 18.0F, -16.0F, 2.0F, 2.0F, 32.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(14.5F, 18.0F, -14.0F, 1.0F, 2.0F, 28.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-15.5F, 18.0F, -13.0F, 1.0F, 2.0F, 26.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(15.5F, 18.0F, -13.0F, 1.0F, 2.0F, 26.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-16.5F, 18.0F, -12.0F, 1.0F, 2.0F, 24.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(16.5F, 18.0F, -12.0F, 1.0F, 2.0F, 24.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(17.5F, 18.0F, -11.0F, 1.0F, 2.0F, 21.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-17.5F, 18.0F, -11.0F, 1.0F, 2.0F, 21.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-18.5F, 18.0F, -9.0F, 1.0F, 2.0F, 17.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(18.5F, 18.0F, -9.0F, 1.0F, 2.0F, 17.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(19.5F, 18.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-19.5F, 18.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-12.5F, 18.0F, -16.0F, 2.0F, 2.0F, 32.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-13.5F, 18.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-14.5F, 18.0F, -14.0F, 1.0F, 2.0F, 28.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(13.5F, 18.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-9.5F, 18.0F, -18.0F, 2.0F, 2.0F, 36.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-10.5F, 18.0F, -17.0F, 1.0F, 2.0F, 34.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(10.5F, 18.0F, -17.0F, 1.0F, 2.0F, 34.0F, 0.0F, false);
			body.setTextureOffset(0, 55).addBox(-3.5F, 21.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.5F, 20.0F, -4.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 20.0F, -4.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 20.0F, -6.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.5F, 20.0F, 4.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.5F, 20.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 20.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.5F, 20.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.5F, 20.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-9.5F, 20.0F, -10.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-2.5F, 20.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-2.5F, 20.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-7.5F, 20.0F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-10.5F, 20.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(2.5F, 20.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(7.5F, 20.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(10.5F, 20.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(2.5F, 20.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(7.5F, 20.0F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(10.5F, 20.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(11.5F, 20.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-11.5F, 20.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-10.5F, 20.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-7.5F, 20.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(11.5F, 20.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 62).addBox(-11.5F, 20.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(-0.5F, -3.8F, -7.5F);
			body.addChild(head2);
			setRotationAngle(head2, 0.1745F, 0.0F, 0.0F);
			head2.setTextureOffset(0, 0).addBox(-4.0F, 19.3489F, -7.4426F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.0F, -7.0F);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(-2.0F, -2.0F, -8.0F);
			left_wing.setTextureOffset(23, 12).addBox(3.5F, 20.0F, -2.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			left_wing_tip = new ModelRenderer(this);
			left_wing_tip.setRotationPoint(-8.0F, -2.0F, -8.0F);
			left_wing_tip.setTextureOffset(16, 24).addBox(10.5F, 20.0F, -2.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			right_wing = new ModelRenderer(this);
			right_wing.setRotationPoint(3.0F, -2.0F, -8.0F);
			right_wing_sub_0 = new ModelRenderer(this);
			right_wing_sub_0.setRotationPoint(-3.0F, 26.0F, 8.0F);
			right_wing.addChild(right_wing_sub_0);
			right_wing_sub_0.setTextureOffset(23, 12).addBox(-4.5F, -6.0F, -10.0F, 1.0F, 2.0F, 9.0F, 0.0F, true);
			right_wing_tip = new ModelRenderer(this);
			right_wing_tip.setRotationPoint(9.0F, -2.0F, -8.0F);
			right_wing_tip_sub_0 = new ModelRenderer(this);
			right_wing_tip_sub_0.setRotationPoint(-9.0F, 26.0F, 8.0F);
			right_wing_tip.addChild(right_wing_tip_sub_0);
			right_wing_tip_sub_0.setTextureOffset(16, 24).addBox(-5.5F, -6.0F, -10.0F, 1.0F, 1.0F, 9.0F, 0.0F, true);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, -2.0F, 1.0F);
			tail.setTextureOffset(3, 20).addBox(-2.5F, 20.0F, -2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, -1.5F, 7.0F);
			tail2.setTextureOffset(4, 29).addBox(-1.5F, 20.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
			left_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
			right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
			right_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			tail2.render(matrixStack, buffer, packedLight, packedOverlay);
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
