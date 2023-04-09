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

import net.mcreator.newblocks.entity.RedSnapperEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RedSnapperRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RedSnapperEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelred_snapper(), 0.3f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/red_snapper.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelred_snapper extends EntityModel<Entity> {
		private final ModelRenderer body_front;
		private final ModelRenderer right_fin;
		private final ModelRenderer left_fin;
		private final ModelRenderer body_back;
		private final ModelRenderer head;
		private final ModelRenderer fin_back_1;
		private final ModelRenderer fin_back_2;
		private final ModelRenderer tail;
		private final ModelRenderer fin_left;
		private final ModelRenderer fin_right;

		public Modelred_snapper() {
			textureWidth = 32;
			textureHeight = 32;
			body_front = new ModelRenderer(this);
			body_front.setRotationPoint(0.0F, 18.0F, -4.0F);
			body_front.setTextureOffset(0, 0).addBox(-1.5F, 1.0F, -2.25F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			right_fin = new ModelRenderer(this);
			right_fin.setRotationPoint(-1.25F, 5.0F, -1.0F);
			body_front.addChild(right_fin);
			setRotationAngle(right_fin, -1.5708F, 0.0F, -0.7854F);
			right_fin.setTextureOffset(0, 0).addBox(-2.1768F, -0.75F, -0.1768F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			left_fin = new ModelRenderer(this);
			left_fin.setRotationPoint(1.25F, 5.0F, -1.0F);
			body_front.addChild(left_fin);
			setRotationAngle(left_fin, -1.5708F, 0.0F, 0.7854F);
			left_fin.setTextureOffset(4, 0).addBox(0.1768F, -0.75F, -0.1768F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			body_back = new ModelRenderer(this);
			body_back.setRotationPoint(0.0F, 18.0F, 4.0F);
			body_back.setTextureOffset(3, 16).addBox(-1.5F, 1.0F, -2.25F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 18.0F, -4.0F);
			head.setTextureOffset(22, 0).addBox(-1.0F, 1.5F, -5.25F, 2.0F, 4.0F, 3.0F, 0.0F, false);
			fin_back_1 = new ModelRenderer(this);
			fin_back_1.setRotationPoint(0.0F, 13.5F, 1.0F);
			fin_back_1.setTextureOffset(4, 2).addBox(0.0F, 3.5F, -1.25F, 0.0F, 2.0F, 2.0F, 0.0F, false);
			fin_back_2 = new ModelRenderer(this);
			fin_back_2.setRotationPoint(0.0F, 13.5F, 3.0F);
			fin_back_2.setTextureOffset(0, 2).addBox(0.0F, 3.5F, -2.25F, 0.0F, 2.0F, 4.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 21.5F, 6.75F);
			tail.setTextureOffset(20, 10).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);
			fin_left = new ModelRenderer(this);
			fin_left.setRotationPoint(0.0F, 24.0F, 0.0F);
			fin_right = new ModelRenderer(this);
			fin_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body_front.render(matrixStack, buffer, packedLight, packedOverlay);
			body_back.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_back_1.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_back_2.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_left.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_right.render(matrixStack, buffer, packedLight, packedOverlay);
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
