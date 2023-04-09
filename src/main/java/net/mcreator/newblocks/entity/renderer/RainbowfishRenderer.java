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

import net.mcreator.newblocks.entity.RainbowfishEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RainbowfishRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RainbowfishEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelrainbowfish(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/rainbowfish.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelrainbowfish extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer right_fin;
		private final ModelRenderer left_fin;
		private final ModelRenderer fin_top;
		private final ModelRenderer fin_bottom;
		private final ModelRenderer tail;
		private final ModelRenderer fin_left;
		private final ModelRenderer fin_right;

		public Modelrainbowfish() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 21.0F, 3.0F);
			body.setTextureOffset(0, 20).addBox(-1.0F, -3.0F, -9.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 1).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 5.0F, 0.0F, false);
			right_fin = new ModelRenderer(this);
			right_fin.setRotationPoint(-1.0F, 2.0F, -6.0F);
			body.addChild(right_fin);
			setRotationAngle(right_fin, 0.0F, 0.7854F, 0.0F);
			right_fin.setTextureOffset(2, 16).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			left_fin = new ModelRenderer(this);
			left_fin.setRotationPoint(1.0F, 2.0F, -6.0F);
			body.addChild(left_fin);
			setRotationAngle(left_fin, 0.0F, -0.7854F, 0.0F);
			left_fin.setTextureOffset(2, 12).addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			fin_top = new ModelRenderer(this);
			fin_top.setRotationPoint(0.0F, 18.0F, 0.0F);
			fin_top.setTextureOffset(20, 11).addBox(0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
			fin_bottom = new ModelRenderer(this);
			fin_bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
			fin_bottom.setTextureOffset(20, 21).addBox(0.0F, 0.0F, -6.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 21.0F, 5.0F);
			tail.setTextureOffset(21, 16).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);
			fin_left = new ModelRenderer(this);
			fin_left.setRotationPoint(0.0F, 24.0F, 0.0F);
			fin_right = new ModelRenderer(this);
			fin_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_top.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.left_fin.rotateAngleY = MathHelper.cos(f * 0.4F) * -0.4F * f1;
			this.right_fin.rotateAngleY = MathHelper.cos(f * 0.4F) * 0.4F * f1;
			this.tail.rotateAngleZ = MathHelper.cos(f * 0.4F) * -0.4F * f1;

		}
	}

}
