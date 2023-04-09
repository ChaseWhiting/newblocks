
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

import net.mcreator.newblocks.entity.SealLandEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SealLandRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SealLandEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelseal(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/seal.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelseal extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer tail;
		private final ModelRenderer tail_fin;
		private final ModelRenderer right_fin;
		private final ModelRenderer left_fin;
		private final ModelRenderer back_fin;

		public Modelseal() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 21.0F, -3.0F);
			head.setTextureOffset(44, 22).addBox(-3.0F, -2.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(33, 17).addBox(2.0F, 0.0F, -5.0F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(53, 15).addBox(-5.0F, 0.0F, -5.0F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, -3.0F);
			body.setTextureOffset(0, 14).addBox(-4.0F, -6.0F, 0.0F, 7.0F, 6.0F, 9.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 21.5F, 3.0F);
			tail.setTextureOffset(0, 0).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			tail_fin = new ModelRenderer(this);
			tail_fin.setRotationPoint(0.0F, 0.0F, 3.0F);
			tail.addChild(tail_fin);
			tail_fin.setTextureOffset(18, 0).addBox(-4.0F, -0.5F, 3.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			right_fin = new ModelRenderer(this);
			right_fin.setRotationPoint(4.5F, 24.0F, -2.0F);
			right_fin.setTextureOffset(48, 0).addBox(-9.5F, -5.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			left_fin = new ModelRenderer(this);
			left_fin.setRotationPoint(-4.5F, 24.0F, -2.0F);
			left_fin.setTextureOffset(48, 0).addBox(7.5F, -5.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			back_fin = new ModelRenderer(this);
			back_fin.setRotationPoint(0.0F, 13.0F, -5.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
			left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
			back_fin.render(matrixStack, buffer, packedLight, packedOverlay);
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
