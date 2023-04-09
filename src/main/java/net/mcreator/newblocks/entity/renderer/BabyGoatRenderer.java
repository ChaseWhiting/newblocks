
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

import net.mcreator.newblocks.entity.BabyGoatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BabyGoatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BabyGoatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgoat_baby(), 0.4f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/goat2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgoat_baby extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer mirror;
		private final ModelRenderer nose;
		private final ModelRenderer left_horn;
		private final ModelRenderer right_horn;
		private final ModelRenderer body;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;

		public Modelgoat_baby() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, 15.375F, -3.5F);
			head.setTextureOffset(23, 55).addBox(1.0F, 1.375F, -4.25F, 0.0F, 6.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(2, 61).addBox(-2.5F, -1.375F, -1.75F, 3.0F, 2.0F, 1.0F, -0.3F, false);
			mirror = new ModelRenderer(this);
			mirror.setRotationPoint(1.0F, 15.625F, 7.5F);
			head.addChild(mirror);
			mirror.setTextureOffset(2, 61).addBox(0.5F, -17.0F, -9.25F, 3.0F, 2.0F, 1.0F, -0.3F, true);
			nose = new ModelRenderer(this);
			nose.setRotationPoint(0.5F, -2.375F, -0.5F);
			head.addChild(nose);
			setRotationAngle(nose, 0.9599F, 0.0F, 0.0F);
			nose.setTextureOffset(34, 46).addBox(-2.0F, -3.4264F, -8.8192F, 5.0F, 7.0F, 10.0F, -1.5F, false);
			left_horn = new ModelRenderer(this);
			left_horn.setRotationPoint(0.5F, 5.625F, 7.5F);
			head.addChild(left_horn);
			left_horn.setTextureOffset(12, 55).addBox(-0.01F, -11.0F, -10.0F, 2.0F, 5.0F, 2.0F, -0.6F, false);
			right_horn = new ModelRenderer(this);
			right_horn.setRotationPoint(0.5F, 5.625F, 7.5F);
			head.addChild(right_horn);
			right_horn.setTextureOffset(12, 55).addBox(-0.99F, -11.0F, -10.0F, 2.0F, 5.0F, 2.0F, -0.6F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.5F, 29.0F, 0.0F);
			body.setTextureOffset(1, 1).addBox(-5.0F, -16.0F, -7.0F, 9.0F, 11.0F, 16.0F, -3.0F, false);
			body.setTextureOffset(0, 28).addBox(-6.0F, -17.0F, -7.5F, 11.0F, 14.0F, 11.0F, -3.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-0.75F, 21.0F, 5.0F);
			leg1.setTextureOffset(49, 29).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, -1.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(0.75F, 21.0F, 5.0F);
			leg2.setTextureOffset(36, 29).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, -1.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(-1.75F, 18.0F, -3.5F);
			leg3.setTextureOffset(49, 2).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 10.0F, 3.0F, -1.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(1.75F, 18.0F, -3.5F);
			leg4.setTextureOffset(35, 2).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 10.0F, 3.0F, -1.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
