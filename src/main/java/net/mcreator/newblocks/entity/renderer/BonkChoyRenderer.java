
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

import net.mcreator.newblocks.entity.BonkChoyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BonkChoyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BonkChoyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbonk_choy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/bonk_choy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbonk_choy extends EntityModel<Entity> {
		private final ModelRenderer bonkchoy;
		private final ModelRenderer base;
		private final ModelRenderer head;
		private final ModelRenderer face;
		private final ModelRenderer bone;
		private final ModelRenderer leaves;
		private final ModelRenderer leaves_r1;
		private final ModelRenderer leaves_r2;
		private final ModelRenderer leaves_r3;
		private final ModelRenderer leaves_r4;
		private final ModelRenderer leaves_r5;
		private final ModelRenderer leaves_r6;
		private final ModelRenderer leaves_r7;
		private final ModelRenderer leaves_r8;
		private final ModelRenderer leaves_r9;
		private final ModelRenderer leaves_r10;
		private final ModelRenderer leaves_r11;
		private final ModelRenderer leaves_r12;
		private final ModelRenderer arms;
		private final ModelRenderer arm1;
		private final ModelRenderer arm1_r1;
		private final ModelRenderer sub;
		private final ModelRenderer sub_r1;
		private final ModelRenderer sub_r2;
		private final ModelRenderer sub_r3;
		private final ModelRenderer sub_r4;
		private final ModelRenderer sub_r5;
		private final ModelRenderer sub_r6;
		private final ModelRenderer sub_r7;
		private final ModelRenderer sub_r8;
		private final ModelRenderer sub_r9;
		private final ModelRenderer sub_r10;
		private final ModelRenderer arm2;
		private final ModelRenderer arm2_r1;
		private final ModelRenderer sub2;
		private final ModelRenderer sub2_r1;
		private final ModelRenderer sub2_r2;
		private final ModelRenderer sub2_r3;
		private final ModelRenderer sub2_r4;
		private final ModelRenderer sub2_r5;
		private final ModelRenderer sub2_r6;
		private final ModelRenderer sub2_r7;
		private final ModelRenderer sub2_r8;
		private final ModelRenderer sub2_r9;
		private final ModelRenderer sub2_r10;

		public Modelbonk_choy() {
			textureWidth = 64;
			textureHeight = 64;
			bonkchoy = new ModelRenderer(this);
			bonkchoy.setRotationPoint(0.0F, 24.0F, 0.0F);
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 0.0F, 0.0F);
			bonkchoy.addChild(base);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(head);
			head.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-2.5F, -12.0F, -3.5F, 7.0F, 4.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(21, 15).addBox(-2.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			face = new ModelRenderer(this);
			face.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(face);
			face.setTextureOffset(21, 15).addBox(2.0F, -3.5F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			face.setTextureOffset(0, 18).addBox(-2.0F, -6.5F, -4.1F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			face.setTextureOffset(0, 15).addBox(1.5F, -7.5F, -4.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			face.addChild(bone);
			leaves = new ModelRenderer(this);
			leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(leaves);
			leaves_r1 = new ModelRenderer(this);
			leaves_r1.setRotationPoint(-2.0F, -12.0F, 3.0F);
			leaves.addChild(leaves_r1);
			setRotationAngle(leaves_r1, -0.0873F, 0.0F, -0.2618F);
			leaves_r1.setTextureOffset(0, 26).addBox(-1.5F, -7.5F, -1.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
			leaves_r2 = new ModelRenderer(this);
			leaves_r2.setRotationPoint(-1.0F, -12.0F, 1.0F);
			leaves.addChild(leaves_r2);
			setRotationAngle(leaves_r2, -0.0873F, 0.0F, -0.2618F);
			leaves_r2.setTextureOffset(0, 36).addBox(-1.0F, -5.5F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			leaves_r3 = new ModelRenderer(this);
			leaves_r3.setRotationPoint(-2.0F, -12.0F, -1.0F);
			leaves.addChild(leaves_r3);
			setRotationAngle(leaves_r3, -0.0873F, 0.0F, -0.2618F);
			leaves_r3.setTextureOffset(22, 26).addBox(-1.0F, -6.5F, -1.0F, 4.0F, 7.0F, 2.0F, 0.0F, false);
			leaves_r4 = new ModelRenderer(this);
			leaves_r4.setRotationPoint(2.0F, -12.0F, 3.0F);
			leaves.addChild(leaves_r4);
			setRotationAngle(leaves_r4, 0.0873F, 0.0F, 0.2618F);
			leaves_r4.setTextureOffset(32, 4).addBox(-0.5F, -8.5F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);
			leaves_r5 = new ModelRenderer(this);
			leaves_r5.setRotationPoint(3.0F, -12.0F, 1.0F);
			leaves.addChild(leaves_r5);
			setRotationAngle(leaves_r5, 0.0873F, 0.0F, 0.2618F);
			leaves_r5.setTextureOffset(40, 13).addBox(-0.5F, -4.5F, -1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			leaves_r6 = new ModelRenderer(this);
			leaves_r6.setRotationPoint(4.0F, -12.0F, -1.0F);
			leaves.addChild(leaves_r6);
			setRotationAngle(leaves_r6, 0.0F, 0.0F, 0.2618F);
			leaves_r6.setTextureOffset(12, 38).addBox(-1.0F, -5.5F, -1.0F, 3.0F, 6.0F, 2.0F, 0.0F, false);
			leaves_r7 = new ModelRenderer(this);
			leaves_r7.setRotationPoint(1.0F, -10.0F, 0.0F);
			leaves.addChild(leaves_r7);
			setRotationAngle(leaves_r7, 0.0873F, 0.0F, 0.0F);
			leaves_r7.setTextureOffset(32, 33).addBox(-1.0F, -8.5F, -0.7F, 3.0F, 9.0F, 2.0F, 0.0F, false);
			leaves_r8 = new ModelRenderer(this);
			leaves_r8.setRotationPoint(1.0F, -11.0F, 0.0F);
			leaves.addChild(leaves_r8);
			setRotationAngle(leaves_r8, -0.1745F, 0.0F, 0.0F);
			leaves_r8.setTextureOffset(12, 26).addBox(-1.0F, -9.5F, -0.7F, 3.0F, 10.0F, 2.0F, 0.0F, false);
			leaves_r9 = new ModelRenderer(this);
			leaves_r9.setRotationPoint(1.0F, -11.0F, 2.0F);
			leaves.addChild(leaves_r9);
			setRotationAngle(leaves_r9, -0.2618F, 0.0F, 0.0F);
			leaves_r9.setTextureOffset(22, 35).addBox(-1.0F, -7.5F, -0.7F, 3.0F, 8.0F, 2.0F, 0.0F, false);
			leaves_r10 = new ModelRenderer(this);
			leaves_r10.setRotationPoint(1.0F, -12.0F, -3.0F);
			leaves.addChild(leaves_r10);
			setRotationAngle(leaves_r10, -0.2618F, 0.0F, 0.0F);
			leaves_r10.setTextureOffset(42, 0).addBox(-1.0F, -4.5F, -0.7F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			leaves_r11 = new ModelRenderer(this);
			leaves_r11.setRotationPoint(3.0F, -12.0F, -2.0F);
			leaves.addChild(leaves_r11);
			setRotationAngle(leaves_r11, 0.2618F, 0.0F, 0.2618F);
			leaves_r11.setTextureOffset(42, 29).addBox(-1.0F, -4.5F, -1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			leaves_r12 = new ModelRenderer(this);
			leaves_r12.setRotationPoint(-2.0F, -12.0F, -2.0F);
			leaves.addChild(leaves_r12);
			setRotationAngle(leaves_r12, 0.1745F, 0.0F, -0.2618F);
			leaves_r12.setTextureOffset(42, 36).addBox(-1.0F, -4.5F, -1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			arms = new ModelRenderer(this);
			arms.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(arms);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(-2.0F, -1.0F, -3.0F);
			arms.addChild(arm1);
			arm1_r1 = new ModelRenderer(this);
			arm1_r1.setRotationPoint(-0.2564F, 0.5103F, 0.1628F);
			arm1.addChild(arm1_r1);
			setRotationAngle(arm1_r1, -0.0873F, -0.7854F, 0.2618F);
			arm1_r1.setTextureOffset(22, 4).addBox(-4.0F, -0.6103F, -0.9628F, 4.0F, 0.0F, 2.0F, 0.0F, false);
			sub = new ModelRenderer(this);
			sub.setRotationPoint(-5.0F, -1.0F, -4.0F);
			arm1.addChild(sub);
			setRotationAngle(sub, 0.0F, -0.6981F, 0.0F);
			sub_r1 = new ModelRenderer(this);
			sub_r1.setRotationPoint(-1.6785F, -3.5161F, -0.9633F);
			sub.addChild(sub_r1);
			setRotationAngle(sub_r1, 0.0F, 0.0F, 2.7925F);
			sub_r1.setTextureOffset(5, 45).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r2 = new ModelRenderer(this);
			sub_r2.setRotationPoint(0.7653F, -2.9955F, -0.9633F);
			sub.addChild(sub_r2);
			setRotationAngle(sub_r2, 0.0F, 0.0F, -1.0472F);
			sub_r2.setTextureOffset(19, 45).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r3 = new ModelRenderer(this);
			sub_r3.setRotationPoint(0.5273F, -2.3493F, -0.9633F);
			sub.addChild(sub_r3);
			setRotationAngle(sub_r3, 0.0F, 0.0F, -0.3491F);
			sub_r3.setTextureOffset(34, 45).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r4 = new ModelRenderer(this);
			sub_r4.setRotationPoint(0.3864F, -3.5142F, -0.9633F);
			sub.addChild(sub_r4);
			setRotationAngle(sub_r4, 0.0F, 0.0F, -1.9199F);
			sub_r4.setTextureOffset(10, 46).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r5 = new ModelRenderer(this);
			sub_r5.setRotationPoint(-0.2312F, -3.945F, -0.9633F);
			sub.addChild(sub_r5);
			setRotationAngle(sub_r5, 0.0F, 0.0F, -2.4435F);
			sub_r5.setTextureOffset(24, 46).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r6 = new ModelRenderer(this);
			sub_r6.setRotationPoint(-0.9098F, -3.828F, -0.9633F);
			sub.addChild(sub_r6);
			setRotationAngle(sub_r6, 0.0F, 0.0F, -3.1416F);
			sub_r6.setTextureOffset(46, 24).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r7 = new ModelRenderer(this);
			sub_r7.setRotationPoint(-1.9165F, -2.8699F, -0.9633F);
			sub.addChild(sub_r7);
			setRotationAngle(sub_r7, 0.0F, 0.0F, 2.0944F);
			sub_r7.setTextureOffset(47, 8).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r8 = new ModelRenderer(this);
			sub_r8.setRotationPoint(-1.8495F, -2.1199F, -0.9633F);
			sub.addChild(sub_r8);
			setRotationAngle(sub_r8, 0.0F, 0.0F, 1.5708F);
			sub_r8.setTextureOffset(47, 17).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r9 = new ModelRenderer(this);
			sub_r9.setRotationPoint(-1.4165F, -1.5039F, -0.9633F);
			sub.addChild(sub_r9);
			setRotationAngle(sub_r9, 0.0F, 0.0F, 1.0472F);
			sub_r9.setTextureOffset(39, 47).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub_r10 = new ModelRenderer(this);
			sub_r10.setRotationPoint(-0.7335F, -1.1869F, -0.9633F);
			sub.addChild(sub_r10);
			setRotationAngle(sub_r10, 0.0F, 0.0F, 0.5236F);
			sub_r10.setTextureOffset(28, 22).addBox(-1.0F, -0.5F, -0.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(4.0F, -1.0F, -3.0F);
			arms.addChild(arm2);
			arm2_r1 = new ModelRenderer(this);
			arm2_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
			arm2.addChild(arm2_r1);
			setRotationAngle(arm2_r1, -0.7854F, 0.6981F, -0.8727F);
			arm2_r1.setTextureOffset(34, 26).addBox(-0.6073F, -1.0F, -1.2544F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			sub2 = new ModelRenderer(this);
			sub2.setRotationPoint(2.0F, -2.0F, -3.0F);
			arm2.addChild(sub2);
			setRotationAngle(sub2, 0.0F, 1.0472F, 0.0F);
			sub2_r1 = new ModelRenderer(this);
			sub2_r1.setRotationPoint(2.6697F, -0.2019F, 0.0F);
			sub2.addChild(sub2_r1);
			setRotationAngle(sub2_r1, 0.0F, 0.0F, -0.8727F);
			sub2_r1.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r2 = new ModelRenderer(this);
			sub2_r2.setRotationPoint(4.7199F, -0.3116F, 0.0F);
			sub2.addChild(sub2_r2);
			setRotationAngle(sub2_r2, 0.0F, 0.0F, -1.3963F);
			sub2_r2.setTextureOffset(0, 4).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r3 = new ModelRenderer(this);
			sub2_r3.setRotationPoint(6.4406F, -1.4318F, 0.0F);
			sub2.addChild(sub2_r3);
			setRotationAngle(sub2_r3, 0.0F, 0.0F, -1.9199F);
			sub2_r3.setTextureOffset(34, 29).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r4 = new ModelRenderer(this);
			sub2_r4.setRotationPoint(7.3706F, -3.2622F, 0.0F);
			sub2.addChild(sub2_r4);
			setRotationAngle(sub2_r4, 0.0F, 0.0F, -2.4435F);
			sub2_r4.setTextureOffset(42, 7).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r5 = new ModelRenderer(this);
			sub2_r5.setRotationPoint(7.1255F, -4.8073F, 0.0F);
			sub2.addChild(sub2_r5);
			setRotationAngle(sub2_r5, 0.0F, 0.0F, -2.7925F);
			sub2_r5.setTextureOffset(42, 20).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r6 = new ModelRenderer(this);
			sub2_r6.setRotationPoint(6.1858F, -7.2014F, 0.0F);
			sub2.addChild(sub2_r6);
			setRotationAngle(sub2_r6, 0.0F, 0.0F, 2.7925F);
			sub2_r6.setTextureOffset(39, 43).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r7 = new ModelRenderer(this);
			sub2_r7.setRotationPoint(3.9271F, -8.4314F, 0.0F);
			sub2.addChild(sub2_r7);
			setRotationAngle(sub2_r7, 0.0F, 0.0F, 2.0944F);
			sub2_r7.setTextureOffset(0, 44).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r8 = new ModelRenderer(this);
			sub2_r8.setRotationPoint(1.9271F, -7.9673F, 0.0F);
			sub2.addChild(sub2_r8);
			setRotationAngle(sub2_r8, 0.0F, 0.0F, 1.5708F);
			sub2_r8.setTextureOffset(29, 44).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r9 = new ModelRenderer(this);
			sub2_r9.setRotationPoint(0.4271F, -6.5654F, 0.0F);
			sub2.addChild(sub2_r9);
			setRotationAngle(sub2_r9, 0.0F, 0.0F, 1.0472F);
			sub2_r9.setTextureOffset(44, 44).addBox(3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			sub2_r10 = new ModelRenderer(this);
			sub2_r10.setRotationPoint(2.0F, -1.0F, 0.0F);
			sub2.addChild(sub2_r10);
			setRotationAngle(sub2_r10, 0.0F, 0.0F, -0.5236F);
			sub2_r10.setTextureOffset(24, 0).addBox(-3.0F, -1.0F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bonkchoy.render(matrixStack, buffer, packedLight, packedOverlay);
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
