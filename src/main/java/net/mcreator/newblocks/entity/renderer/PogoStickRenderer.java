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

import net.mcreator.newblocks.entity.PogoStickEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PogoStickRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PogoStickEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpogo_stick(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/pogo_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelpogo_stick extends EntityModel<Entity> {
		private final ModelRenderer rightItem;

		public Modelpogo_stick() {
			textureWidth = 64;
			textureHeight = 64;
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(0.0F, 0.0F, 6.0F);
			rightItem.setTextureOffset(20, 16).addBox(-7.0F, 4.0F, -9.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(24, 20).addBox(-2.4F, 3.8F, -9.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(40, 28).addBox(-2.0F, 2.7F, -10.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			rightItem.setTextureOffset(44, 34).addBox(-1.7F, 5.7F, -9.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			rightItem.setTextureOffset(24, 45).addBox(-1.0F, 6.7F, -9.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(0, 0).addBox(-0.7F, 17.7F, -8.8F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(2, 6).addBox(-0.7F, 22.7F, -8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(20, 17).addBox(-4.7F, 19.2F, -9.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);
			rightItem.setTextureOffset(0, 4).addBox(-0.4F, 20.7F, -8.6F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			rightItem.render(matrixStack, buffer, packedLight, packedOverlay);
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
