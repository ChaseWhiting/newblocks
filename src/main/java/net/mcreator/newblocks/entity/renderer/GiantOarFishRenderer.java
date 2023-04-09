
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

import net.mcreator.newblocks.entity.GiantOarFishEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GiantOarFishRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GiantOarFishEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgiant_oarfish(), 0.8f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/giant_oarfish.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgiant_oarfish extends EntityModel<Entity> {
		private final ModelRenderer body_front;
		private final ModelRenderer body_back;
		private final ModelRenderer head;
		private final ModelRenderer fin_back_1;
		private final ModelRenderer body_back_end;
		private final ModelRenderer end;
		private final ModelRenderer face_thing;
		private final ModelRenderer face_thing2;
		private final ModelRenderer bb_main;

		public Modelgiant_oarfish() {
			textureWidth = 32;
			textureHeight = 32;
			body_front = new ModelRenderer(this);
			body_front.setRotationPoint(0.0F, 18.0F, -4.0F);
			body_front.setTextureOffset(0, 0).addBox(-1.5F, 1.0F, -13.25F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			body_back = new ModelRenderer(this);
			body_back.setRotationPoint(0.0F, 18.0F, 4.0F);
			body_back.setTextureOffset(0, 13).addBox(-1.5F, 1.0F, -13.25F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			body_back.setTextureOffset(0, 13).addBox(-1.5F, 1.0F, -5.25F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			body_back.setTextureOffset(0, 13).addBox(-1.5F, 1.0F, 2.75F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			body_back.setTextureOffset(0, 13).addBox(-1.5F, 1.0F, 10.75F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 18.0F, -4.0F);
			head.setTextureOffset(22, 0).addBox(-1.0F, 1.5F, -16.25F, 2.0F, 4.0F, 3.0F, 0.0F, false);
			fin_back_1 = new ModelRenderer(this);
			fin_back_1.setRotationPoint(0.0F, 17.5F, 1.75F);
			setRotationAngle(fin_back_1, -0.1309F, 0.0F, 0.0F);
			fin_back_1.setTextureOffset(22, 16).addBox(0.0F, -5.1084F, -18.2243F, 0.0F, 11.0F, 5.0F, 0.0F, false);
			body_back_end = new ModelRenderer(this);
			body_back_end.setRotationPoint(0.0F, 31.0F, -2.5F);
			setRotationAngle(body_back_end, 0.2618F, 0.0F, 0.0F);
			body_back_end.setTextureOffset(4, 19).addBox(-1.5F, -4.0F, 27.75F, 3.0F, 3.0F, 4.0F, -0.2F, false);
			body_back_end.setTextureOffset(26, 7).addBox(0.0F, -6.25F, 28.5F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			body_back_end.setTextureOffset(3, 17).addBox(-1.5F, -5.0F, 24.0F, 3.0F, 4.0F, 5.0F, -0.1F, false);
			end = new ModelRenderer(this);
			end.setRotationPoint(0.0F, 3.5F, -13.25F);
			body_back_end.addChild(end);
			end.setTextureOffset(8, 21).addBox(-1.5F, -6.5F, 44.0F, 3.0F, 2.0F, 3.0F, -0.4F, false);
			face_thing = new ModelRenderer(this);
			face_thing.setRotationPoint(0.0F, 23.5F, -18.5F);
			setRotationAngle(face_thing, -2.416F, -0.3326F, 0.3527F);
			face_thing.setTextureOffset(26, 7).addBox(0.0F, -6.75F, -4.5F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			face_thing2 = new ModelRenderer(this);
			face_thing2.setRotationPoint(0.0F, 23.5F, -18.5F);
			setRotationAngle(face_thing2, -2.416F, 0.3326F, -0.3527F);
			face_thing2.setTextureOffset(26, 7).addBox(0.0F, -6.75F, -4.5F, 0.0F, 5.0F, 3.0F, 0.0F, true);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, -11.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, -8.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, -5.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, -2.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, 1.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, 4.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.75F, 7.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.5F, 10.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.25F, 13.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -9.0F, 16.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(26, 7).addBox(0.0F, -8.0F, 19.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body_front.render(matrixStack, buffer, packedLight, packedOverlay);
			body_back.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_back_1.render(matrixStack, buffer, packedLight, packedOverlay);
			body_back_end.render(matrixStack, buffer, packedLight, packedOverlay);
			face_thing.render(matrixStack, buffer, packedLight, packedOverlay);
			face_thing2.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
