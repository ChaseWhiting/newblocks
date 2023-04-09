
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

import net.mcreator.newblocks.entity.ZhoemnixBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ZhoemnixBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ZhoemnixBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelphoenix_baby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/zhoemnix_baby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelphoenix_baby extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer saddle;
		private final ModelRenderer bone11;
		private final ModelRenderer bone5;
		private final ModelRenderer bone14;
		private final ModelRenderer lilwing;
		private final ModelRenderer lilwing2;
		private final ModelRenderer tail;
		private final ModelRenderer tail4;
		private final ModelRenderer tail3;
		private final ModelRenderer tail2;
		private final ModelRenderer bone4;
		private final ModelRenderer bone2;
		private final ModelRenderer bone7;
		private final ModelRenderer bone6;
		private final ModelRenderer bone3;
		private final ModelRenderer brow2;
		private final ModelRenderer brow;
		private final ModelRenderer NECK;
		private final ModelRenderer NECK2;
		private final ModelRenderer body_sub_5;
		private final ModelRenderer bone;
		private final ModelRenderer fronhair;
		private final ModelRenderer bone8;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg2;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg2;
		private final ModelRenderer hair_left_top;
		private final ModelRenderer hair_left_top_rotation;
		private final ModelRenderer bristle3;
		private final ModelRenderer hair_left_middle;
		private final ModelRenderer hair_left_middle_rotation;
		private final ModelRenderer hair_left_bottom;
		private final ModelRenderer hair_left_bottom_rotation;
		private final ModelRenderer bristle4;
		private final ModelRenderer hair_right_top;
		private final ModelRenderer hair_right_top_rotation;
		private final ModelRenderer bristle2;
		private final ModelRenderer hair_right_top_sub_2;
		private final ModelRenderer hair_right_middle;
		private final ModelRenderer hair_right_middle_rotation;
		private final ModelRenderer hair_right_bottom;
		private final ModelRenderer hair_right_bottom_rotation;
		private final ModelRenderer bristle1;
		private final ModelRenderer hair_right_bottom_sub_2;

		public Modelphoenix_baby() {
			textureWidth = 256;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.setTextureOffset(128, 117).addBox(-5.5F, -0.25F, -2.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);
			saddle = new ModelRenderer(this);
			saddle.setRotationPoint(0.0F, -5.0F, 3.0F);
			body.addChild(saddle);
			saddle.setTextureOffset(0, 117).addBox(-5.5F, 4.75F, -5.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);
			saddle.setTextureOffset(0, 114).addBox(-5.5F, 3.75F, 2.0F, 11.0F, 1.0F, 2.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(0.0F, 28.0F, -3.0F);
			saddle.addChild(bone11);
			setRotationAngle(bone11, 0.0F, 0.3491F, 0.0F);
			bone11.setTextureOffset(168, 108).addBox(9.5F, -29.25F, -16.0F, 0.0F, 6.0F, 14.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-1.0F, 28.0F, 0.0F);
			saddle.addChild(bone5);
			setRotationAngle(bone5, 0.0F, -0.3491F, 0.0F);
			bone5.setTextureOffset(168, 108).addBox(-9.2F, -29.25F, -18.7F, 0.0F, 6.0F, 14.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(0.0F, 23.0F, 0.0F);
			body.addChild(bone14);
			bone14.setTextureOffset(0, 0).addBox(-8.0F, -20.25F, -8.0F, 16.0F, 10.0F, 16.0F, -0.7F, false);
			lilwing = new ModelRenderer(this);
			lilwing.setRotationPoint(0.0F, 7.0F, 0.0F);
			body.addChild(lilwing);
			setRotationAngle(lilwing, 1.4399F, -1.309F, -1.5708F);
			lilwing.setTextureOffset(72, 88).addBox(-4.5629F, 0.8496F, -7.062F, 11.0F, 9.0F, 0.0F, 0.0F, false);
			lilwing2 = new ModelRenderer(this);
			lilwing2.setRotationPoint(-7.75F, 9.0F, -11.0F);
			body.addChild(lilwing2);
			setRotationAngle(lilwing2, 1.6591F, 1.3017F, 1.8222F);
			lilwing2.setTextureOffset(72, 78).addBox(-15.5194F, 1.474F, 0.6513F, 11.0F, 9.0F, 0.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 7.0F, 6.0F);
			body.addChild(tail);
			setRotationAngle(tail, -0.2182F, 0.0F, 0.0F);
			tail4 = new ModelRenderer(this);
			tail4.setRotationPoint(16.75F, -3.1572F, -1.7161F);
			tail.addChild(tail4);
			setRotationAngle(tail4, -0.1329F, -0.173F, -0.1079F);
			tail4.setTextureOffset(96, 68).addBox(-23.4725F, -0.7454F, 4.4261F, 7.0F, 0.0F, 9.0F, 0.0F, false);
			tail3 = new ModelRenderer(this);
			tail3.setRotationPoint(-1.0F, 0.0276F, 1.0304F);
			tail.addChild(tail3);
			setRotationAngle(tail3, -0.0519F, 0.346F, 0.258F);
			tail3.setTextureOffset(96, 77).addBox(1.2669F, -1.734F, -1.3975F, 7.0F, 0.0F, 9.0F, 0.0F, false);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail2);
			setRotationAngle(tail2, -0.0873F, 0.0F, 0.0F);
			tail2.setTextureOffset(92, 95).addBox(0.0F, -7.5132F, -1.8854F, 0.0F, 9.0F, 18.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(bone4);
			bone4.setTextureOffset(57, 60).addBox(-7.5F, 0.4796F, -3.4604F, 15.0F, 0.0F, 18.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -9.0F, -40.0F);
			body.addChild(bone2);
			bone2.setTextureOffset(64, 0).addBox(-4.0F, 4.05F, 25.8F, 8.0F, 7.0F, 8.0F, -1.1F, false);
			bone2.setTextureOffset(81, 30).addBox(0.0F, 1.05F, 31.8F, 0.0F, 12.0F, 9.0F, -1.0F, false);
			bone2.setTextureOffset(90, 17).addBox(-3.0F, 7.65F, 22.6F, 6.0F, 3.0F, 6.0F, -1.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 16.0F, 9.0F);
			bone2.addChild(bone7);
			setRotationAngle(bone7, 0.0F, -0.2618F, 0.0F);
			bone7.setTextureOffset(81, 43).addBox(3.8327F, -14.9511F, 22.5085F, 0.0F, 8.0F, 9.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 16.0F, 9.0F);
			bone2.addChild(bone6);
			setRotationAngle(bone6, 0.0F, 0.2618F, 0.0F);
			bone6.setTextureOffset(81, 43).addBox(-3.8327F, -14.9511F, 22.5085F, 0.0F, 8.0F, 9.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 13.75F, 11.25F);
			bone2.addChild(bone3);
			setRotationAngle(bone3, 0.1309F, 0.0F, 0.0F);
			bone3.setTextureOffset(64, 15).addBox(-3.2F, -6.1456F, 10.9316F, 6.0F, 4.0F, 7.0F, -1.0F, false);
			bone3.setTextureOffset(58, 4).addBox(-3.2F, -6.0956F, 12.0316F, 6.0F, 3.0F, 1.0F, -1.0F, false);
			brow2 = new ModelRenderer(this);
			brow2.setRotationPoint(0.0F, 16.0F, 9.0F);
			bone2.addChild(brow2);
			setRotationAngle(brow2, 0.0873F, -0.1309F, -0.0873F);
			brow2.setTextureOffset(63, 29).addBox(1.6973F, -13.297F, 21.6128F, 0.0F, 7.0F, 9.0F, 0.0F, false);
			brow = new ModelRenderer(this);
			brow.setRotationPoint(0.0F, 16.0F, 9.0F);
			bone2.addChild(brow);
			setRotationAngle(brow, 0.0873F, 0.1309F, 0.0873F);
			brow.setTextureOffset(63, 29).addBox(-1.6973F, -12.297F, 22.6128F, 0.0F, 7.0F, 9.0F, 0.0F, false);
			NECK = new ModelRenderer(this);
			NECK.setRotationPoint(8.0F, 4.0F, 9.0F);
			bone2.addChild(NECK);
			setRotationAngle(NECK, 0.0F, 0.0F, 1.0908F);
			NECK.setTextureOffset(16, 31).addBox(0.9384F, 7.9563F, 16.6F, 12.0F, 0.0F, 16.0F, 0.0F, false);
			NECK2 = new ModelRenderer(this);
			NECK2.setRotationPoint(-2.0F, 4.0F, 9.0F);
			bone2.addChild(NECK2);
			setRotationAngle(NECK2, 0.0F, 0.0F, -1.0908F);
			body_sub_5 = new ModelRenderer(this);
			body_sub_5.setRotationPoint(0.0F, 0.0F, 0.0F);
			NECK2.addChild(body_sub_5);
			body_sub_5.setTextureOffset(16, 31).addBox(-15.7089F, 2.6342F, 16.6F, 12.0F, 0.0F, 16.0F, 0.0F, true);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 2.0F, 3.25F);
			body.addChild(bone);
			setRotationAngle(bone, 0.5236F, 0.0F, 0.0F);
			bone.setTextureOffset(96, 0).addBox(-3.0F, -9.3902F, -12.7782F, 6.0F, 9.0F, 6.0F, -1.3F, false);
			fronhair = new ModelRenderer(this);
			fronhair.setRotationPoint(-8.0F, 4.0F, 0.0F);
			body.addChild(fronhair);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(8.0F, 4.0F, -10.35F);
			fronhair.addChild(bone8);
			setRotationAngle(bone8, -0.1651F, 0.3077F, 0.0257F);
			bone8.setTextureOffset(58, 102).addBox(-7.79F, -3.6307F, 1.1042F, 7.0F, 9.0F, 0.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(8.0F, 6.75F, 2.0F);
			fronhair.addChild(bone9);
			setRotationAngle(bone9, -0.2065F, -0.2221F, -0.0385F);
			bone9.setTextureOffset(58, 93).addBox(-2.5701F, -3.7126F, -10.7561F, 7.0F, 9.0F, 0.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(8.0F, 1.5F, -10.5F);
			fronhair.addChild(bone10);
			setRotationAngle(bone10, -0.2182F, 0.0F, 0.0F);
			bone10.setTextureOffset(72, 88).addBox(-4.0F, -0.4337F, 3.6276F, 8.0F, 9.0F, 0.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.0F, 7.0F, 0.0F);
			left_leg.setTextureOffset(0, 55).addBox(-8.0F, 9.75F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(-8.0F, -0.25F, 0.0F);
			left_leg.addChild(left_leg2);
			left_leg2.setTextureOffset(0, 32).addBox(-2.0F, 1.75F, -1.0F, 4.0F, 16.0F, 4.0F, -0.5F, false);
			left_leg2.setTextureOffset(16, 45).addBox(-1.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			left_leg2.setTextureOffset(17, 53).addBox(-1.0F, 15.75F, 3.0F, 2.0F, 2.0F, 1.0F, -0.5F, false);
			left_leg2.setTextureOffset(16, 49).addBox(0.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			left_leg2.setTextureOffset(16, 49).addBox(-2.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.0F, 7.0F, 0.0F);
			right_leg.setTextureOffset(0, 32).addBox(6.0F, 11.75F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(8.0F, -0.25F, 0.0F);
			right_leg.addChild(right_leg2);
			right_leg2.setTextureOffset(0, 32).addBox(-2.0F, 1.75F, -1.0F, 4.0F, 16.0F, 4.0F, -0.5F, false);
			right_leg2.setTextureOffset(16, 45).addBox(-1.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			right_leg2.setTextureOffset(17, 53).addBox(-1.0F, 15.75F, 3.0F, 2.0F, 2.0F, 1.0F, -0.5F, false);
			right_leg2.setTextureOffset(16, 49).addBox(0.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			right_leg2.setTextureOffset(16, 49).addBox(-2.0F, 15.75F, -2.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			hair_left_top = new ModelRenderer(this);
			hair_left_top.setRotationPoint(-8.0F, -5.0F, -8.0F);
			hair_left_top_rotation = new ModelRenderer(this);
			hair_left_top_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
			hair_left_top.addChild(hair_left_top_rotation);
			setRotationAngle(hair_left_top_rotation, 0.0F, 0.0F, 1.0472F);
			hair_left_top_rotation.setTextureOffset(4, 33).addBox(11.9797F, 2.875F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
			bristle3 = new ModelRenderer(this);
			bristle3.setRotationPoint(0.0F, 1.0F, 0.0F);
			hair_left_top_rotation.addChild(bristle3);
			bristle3.setTextureOffset(12, 47).addBox(7.7207F, 4.6585F, -8.0F, 14.0F, 0.0F, 20.0F, 0.0F, false);
			hair_left_middle = new ModelRenderer(this);
			hair_left_middle.setRotationPoint(-8.0F, -1.0F, -8.0F);
			hair_left_middle_rotation = new ModelRenderer(this);
			hair_left_middle_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
			hair_left_middle.addChild(hair_left_middle_rotation);
			setRotationAngle(hair_left_middle_rotation, 0.0F, 0.0F, 1.0472F);
			hair_left_middle_rotation.setTextureOffset(4, 49).addBox(4.9797F, 2.875F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
			hair_left_bottom = new ModelRenderer(this);
			hair_left_bottom.setRotationPoint(-8.0F, 4.0F, -8.0F);
			hair_left_bottom_rotation = new ModelRenderer(this);
			hair_left_bottom_rotation.setRotationPoint(16.0F, 0.0F, 8.0F);
			hair_left_bottom.addChild(hair_left_bottom_rotation);
			setRotationAngle(hair_left_bottom_rotation, 0.0F, 0.0F, 1.0472F);
			hair_left_bottom_rotation.setTextureOffset(4, 65).addBox(4.9797F, 2.875F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, false);
			bristle4 = new ModelRenderer(this);
			bristle4.setRotationPoint(0.0F, -4.0F, 3.0F);
			hair_left_bottom_rotation.addChild(bristle4);
			bristle4.setTextureOffset(9, 67).addBox(2.9797F, 5.3391F, -7.0F, 16.0F, 0.0F, 23.0F, 0.0F, false);
			hair_right_top = new ModelRenderer(this);
			hair_right_top.setRotationPoint(8.0F, -4.0F, -8.0F);
			hair_right_top_rotation = new ModelRenderer(this);
			hair_right_top_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
			hair_right_top.addChild(hair_right_top_rotation);
			setRotationAngle(hair_right_top_rotation, 0.0F, 0.0F, -1.0472F);
			hair_right_top_rotation.setTextureOffset(4, 33).addBox(-11.9797F, 2.875F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);
			bristle2 = new ModelRenderer(this);
			bristle2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hair_right_top_rotation.addChild(bristle2);
			hair_right_top_sub_2 = new ModelRenderer(this);
			hair_right_top_sub_2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bristle2.addChild(hair_right_top_sub_2);
			hair_right_top_sub_2.setTextureOffset(12, 47).addBox(-20.5957F, 5.808F, -8.0F, 14.0F, 0.0F, 20.0F, 0.0F, true);
			hair_right_middle = new ModelRenderer(this);
			hair_right_middle.setRotationPoint(8.0F, 0.0F, -8.0F);
			hair_right_middle_rotation = new ModelRenderer(this);
			hair_right_middle_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
			hair_right_middle.addChild(hair_right_middle_rotation);
			setRotationAngle(hair_right_middle_rotation, 0.0F, 0.0F, -1.0472F);
			hair_right_middle_rotation.setTextureOffset(4, 49).addBox(-4.9797F, 2.875F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);
			hair_right_bottom = new ModelRenderer(this);
			hair_right_bottom.setRotationPoint(8.0F, 5.0F, -8.0F);
			hair_right_bottom_rotation = new ModelRenderer(this);
			hair_right_bottom_rotation.setRotationPoint(-16.0F, 0.0F, 8.0F);
			hair_right_bottom.addChild(hair_right_bottom_rotation);
			setRotationAngle(hair_right_bottom_rotation, 0.0F, 0.0F, -1.0472F);
			hair_right_bottom_rotation.setTextureOffset(4, 65).addBox(-10.9797F, 2.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);
			bristle1 = new ModelRenderer(this);
			bristle1.setRotationPoint(0.0F, -5.0F, 0.0F);
			hair_right_bottom_rotation.addChild(bristle1);
			hair_right_bottom_sub_2 = new ModelRenderer(this);
			hair_right_bottom_sub_2.setRotationPoint(0.0F, 0.0F, 4.0F);
			bristle1.addChild(hair_right_bottom_sub_2);
			hair_right_bottom_sub_2.setTextureOffset(9, 67).addBox(-18.4797F, 6.2051F, -8.0F, 16.0F, 0.0F, 23.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_left_top.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_left_middle.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_left_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_right_top.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_right_middle.render(matrixStack, buffer, packedLight, packedOverlay);
			hair_right_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
