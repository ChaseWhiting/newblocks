
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

import net.mcreator.newblocks.entity.SCP0584Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SCP0584Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SCP0584Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelscp058_4(), 0.43f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/scp058.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelscp058_4 extends EntityModel<Entity> {
		private final ModelRenderer all;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;

		public Modelscp058_4() {
			textureWidth = 64;
			textureHeight = 64;
			all = new ModelRenderer(this);
			all.setRotationPoint(0.0F, 21.5F, 19.0F);
			setRotationAngle(all, 1.5708F, 0.0F, -1.5708F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -14.0F, 0.0F);
			all.addChild(body);
			setRotationAngle(body, -0.6981F, 0.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-2.5F, 4.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 1.1345F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(-3.0F, -10.5F, 18.5F, 6.0F, 8.0F, 6.0F, -0.6F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.6109F, 0.0F, 0.0F);
			body_r2.setTextureOffset(0, 0).addBox(-3.0F, -16.5F, 13.5F, 6.0F, 8.0F, 6.0F, -0.3F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.2182F, 0.0F, 0.0F);
			body_r3.setTextureOffset(0, 0).addBox(-3.0F, -17.5F, 8.5F, 6.0F, 8.0F, 6.0F, -0.1F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, -1.4404F, -0.0308F, 0.0309F);
			body_r4.setTextureOffset(0, 0).addBox(-3.0F, -7.5F, -7.5F, 6.0F, 8.0F, 6.0F, -0.9F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, -0.7854F, 0.0F, 0.0F);
			body_r5.setTextureOffset(0, 0).addBox(-3.0F, -13.5F, -4.25F, 6.0F, 8.0F, 6.0F, -0.4F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(0.0F, 11.5F, -9.0F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, -0.3054F, 0.0F, 0.0F);
			body_r6.setTextureOffset(0, 0).addBox(-3.0F, -15.5F, 1.75F, 6.0F, 8.0F, 6.0F, -0.2F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			all.render(matrixStack, buffer, packedLight, packedOverlay);
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
