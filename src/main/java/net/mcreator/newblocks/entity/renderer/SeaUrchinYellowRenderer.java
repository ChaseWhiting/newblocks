
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

import net.mcreator.newblocks.entity.SeaUrchinYellowEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SeaUrchinYellowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SeaUrchinYellowEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsea_urchin(), 0.3f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/sea_urchin_yellow.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsea_urchin extends EntityModel<Entity> {
		private final ModelRenderer spikes;
		private final ModelRenderer spikes_r1;
		private final ModelRenderer spikes_r2;
		private final ModelRenderer spikes_r3;
		private final ModelRenderer body;
		private final ModelRenderer body_sides_r1;
		private final ModelRenderer body_sides_r2;
		private final ModelRenderer body_sides_r3;
		private final ModelRenderer body_sides_r4;
		private final ModelRenderer body_sides_r5;
		private final ModelRenderer body_sides_r6;
		private final ModelRenderer body_sides_r7;
		private final ModelRenderer body_sides_r8;
		private final ModelRenderer body_sides_in;
		private final ModelRenderer body_sides_r9;
		private final ModelRenderer body_sides_r10;
		private final ModelRenderer body_sides_in2;
		private final ModelRenderer body_sides_r11;
		private final ModelRenderer body_sides_r12;
		private final ModelRenderer body_sides_in3;
		private final ModelRenderer body_sides_r13;
		private final ModelRenderer body_sides_r14;
		private final ModelRenderer body_sides_in4;
		private final ModelRenderer body_sides_r15;
		private final ModelRenderer body_sides_r16;
		private final ModelRenderer spikes2;
		private final ModelRenderer spikes_r4;
		private final ModelRenderer spikes_r5;
		private final ModelRenderer spikes_r6;
		private final ModelRenderer spikes3;
		private final ModelRenderer spikes_r7;
		private final ModelRenderer spikes_r8;
		private final ModelRenderer spikes_r9;
		private final ModelRenderer spikes_r10;
		private final ModelRenderer spikes_r11;
		private final ModelRenderer spikes_r12;
		private final ModelRenderer mouth;
		private final ModelRenderer mouth_r1;

		public Modelsea_urchin() {
			textureWidth = 64;
			textureHeight = 64;
			spikes = new ModelRenderer(this);
			spikes.setRotationPoint(0.0F, 24.0F, 0.0F);
			spikes_r1 = new ModelRenderer(this);
			spikes_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes.addChild(spikes_r1);
			setRotationAngle(spikes_r1, 0.0F, -0.3054F, -0.3491F);
			spikes_r1.setTextureOffset(8, 46).addBox(-3.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r1.setTextureOffset(35, 46).addBox(-2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r1.setTextureOffset(47, 5).addBox(-2.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r1.setTextureOffset(12, 47).addBox(-1.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r1.setTextureOffset(20, 32).addBox(0.25F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r1.setTextureOffset(16, 47).addBox(-0.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r2 = new ModelRenderer(this);
			spikes_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes.addChild(spikes_r2);
			setRotationAngle(spikes_r2, 0.0F, 0.0F, -0.3491F);
			spikes_r2.setTextureOffset(45, 45).addBox(-3.5F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r2.setTextureOffset(0, 46).addBox(-2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r2.setTextureOffset(47, 10).addBox(-1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r2.setTextureOffset(16, 32).addBox(0.25F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r2.setTextureOffset(20, 47).addBox(-0.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3 = new ModelRenderer(this);
			spikes_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes.addChild(spikes_r3);
			setRotationAngle(spikes_r3, 0.0F, 0.3054F, -0.3491F);
			spikes_r3.setTextureOffset(46, 0).addBox(-3.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3.setTextureOffset(46, 40).addBox(-2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3.setTextureOffset(41, 46).addBox(-2.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3.setTextureOffset(47, 15).addBox(-1.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3.setTextureOffset(12, 32).addBox(0.25F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r3.setTextureOffset(47, 20).addBox(-0.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(18, 24).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(18, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body.setTextureOffset(9, 17).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r1 = new ModelRenderer(this);
			body_sides_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_sides_r1);
			setRotationAngle(body_sides_r1, 0.7854F, 0.0F, 0.0F);
			body_sides_r1.setTextureOffset(0, 16).addBox(-1.5F, -4.0F, -1.25F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r1.setTextureOffset(0, 4).addBox(-1.5F, -4.0F, -1.25F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r2 = new ModelRenderer(this);
			body_sides_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_sides_r2);
			setRotationAngle(body_sides_r2, -0.7854F, 0.0F, 0.0F);
			body_sides_r2.setTextureOffset(9, 13).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r2.setTextureOffset(0, 8).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r3 = new ModelRenderer(this);
			body_sides_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_sides_r3);
			setRotationAngle(body_sides_r3, 0.0F, -1.5708F, -0.7854F);
			body_sides_r3.setTextureOffset(0, 12).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r3.setTextureOffset(9, 1).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r4 = new ModelRenderer(this);
			body_sides_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
			body.addChild(body_sides_r4);
			setRotationAngle(body_sides_r4, 0.0F, 1.5708F, 0.7854F);
			body_sides_r4.setTextureOffset(9, 9).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r4.setTextureOffset(9, 5).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r5 = new ModelRenderer(this);
			body_sides_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_r5);
			setRotationAngle(body_sides_r5, 0.0F, 1.5708F, 0.7854F);
			body_sides_r5.setTextureOffset(18, 16).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r5.setTextureOffset(0, 20).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r6 = new ModelRenderer(this);
			body_sides_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_r6);
			setRotationAngle(body_sides_r6, 0.0F, -1.5708F, -0.7854F);
			body_sides_r6.setTextureOffset(18, 12).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r6.setTextureOffset(18, 20).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r7 = new ModelRenderer(this);
			body_sides_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_r7);
			setRotationAngle(body_sides_r7, -0.7854F, 0.0F, 0.0F);
			body_sides_r7.setTextureOffset(18, 8).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r7.setTextureOffset(9, 21).addBox(-1.5F, -4.0F, -1.75F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r8 = new ModelRenderer(this);
			body_sides_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_r8);
			setRotationAngle(body_sides_r8, 0.7854F, 0.0F, 0.0F);
			body_sides_r8.setTextureOffset(18, 4).addBox(-1.5F, -4.0F, -1.25F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_r8.setTextureOffset(0, 24).addBox(-1.5F, -4.0F, -1.25F, 3.0F, 1.0F, 3.0F, -0.01F, false);
			body_sides_in = new ModelRenderer(this);
			body_sides_in.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_in);
			body_sides_r9 = new ModelRenderer(this);
			body_sides_r9.setRotationPoint(0.0F, 1.0F, 0.0F);
			body_sides_in.addChild(body_sides_r9);
			setRotationAngle(body_sides_r9, 1.9866F, -0.7471F, -3.0369F);
			body_sides_r9.setTextureOffset(27, 25).addBox(-0.25F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r9.setTextureOffset(50, 13).addBox(0.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r9.setTextureOffset(50, 8).addBox(-1.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r9.setTextureOffset(46, 32).addBox(-1.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r9.setTextureOffset(19, 28).addBox(0.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r9.setTextureOffset(9, 25).addBox(-0.25F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r10 = new ModelRenderer(this);
			body_sides_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_sides_in.addChild(body_sides_r10);
			setRotationAngle(body_sides_r10, 1.9866F, -0.7471F, -3.0369F);
			body_sides_r10.setTextureOffset(50, 31).addBox(-1.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r10.setTextureOffset(50, 18).addBox(0.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r10.setTextureOffset(0, 28).addBox(-0.25F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_r10.setTextureOffset(16, 52).addBox(-1.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r10.setTextureOffset(26, 52).addBox(0.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r10.setTextureOffset(32, 4).addBox(-0.25F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_in2 = new ModelRenderer(this);
			body_sides_in2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_in2);
			body_sides_r11 = new ModelRenderer(this);
			body_sides_r11.setRotationPoint(0.0F, 1.0F, 0.0F);
			body_sides_in2.addChild(body_sides_r11);
			setRotationAngle(body_sides_r11, 1.9866F, 0.7471F, 3.0369F);
			body_sides_r11.setTextureOffset(27, 21).addBox(-0.75F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r11.setTextureOffset(50, 3).addBox(-1.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r11.setTextureOffset(50, 0).addBox(0.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r11.setTextureOffset(47, 35).addBox(0.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r11.setTextureOffset(47, 25).addBox(-1.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r11.setTextureOffset(27, 1).addBox(-0.75F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r12 = new ModelRenderer(this);
			body_sides_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_sides_in2.addChild(body_sides_r12);
			setRotationAngle(body_sides_r12, 1.9866F, 0.7471F, 3.0369F);
			body_sides_r12.setTextureOffset(6, 51).addBox(0.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r12.setTextureOffset(43, 50).addBox(-1.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r12.setTextureOffset(14, 28).addBox(-0.75F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_r12.setTextureOffset(0, 52).addBox(0.0F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r12.setTextureOffset(10, 52).addBox(-1.5F, -3.75F, -1.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r12.setTextureOffset(32, 0).addBox(-0.75F, -3.75F, -2.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_in3 = new ModelRenderer(this);
			body_sides_in3.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_in3);
			body_sides_r13 = new ModelRenderer(this);
			body_sides_r13.setRotationPoint(0.0F, 1.0F, 0.0F);
			body_sides_in3.addChild(body_sides_r13);
			setRotationAngle(body_sides_r13, -1.9866F, -0.7471F, 3.0369F);
			body_sides_r13.setTextureOffset(27, 17).addBox(-0.75F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r13.setTextureOffset(49, 38).addBox(-1.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r13.setTextureOffset(37, 49).addBox(0.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r13.setTextureOffset(48, 28).addBox(0.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r13.setTextureOffset(24, 48).addBox(-1.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r13.setTextureOffset(27, 5).addBox(-0.75F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r14 = new ModelRenderer(this);
			body_sides_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_sides_in3.addChild(body_sides_r14);
			setRotationAngle(body_sides_r14, -1.9866F, -0.7471F, 3.0369F);
			body_sides_r14.setTextureOffset(22, 51).addBox(0.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r14.setTextureOffset(51, 21).addBox(-1.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r14.setTextureOffset(22, 28).addBox(-0.75F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_r14.setTextureOffset(47, 51).addBox(0.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r14.setTextureOffset(51, 49).addBox(-1.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r14.setTextureOffset(0, 32).addBox(-0.75F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_in4 = new ModelRenderer(this);
			body_sides_in4.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_sides_in4);
			body_sides_r15 = new ModelRenderer(this);
			body_sides_r15.setRotationPoint(0.0F, 1.0F, 0.0F);
			body_sides_in4.addChild(body_sides_r15);
			setRotationAngle(body_sides_r15, -1.9866F, 0.7471F, -3.0369F);
			body_sides_r15.setTextureOffset(27, 13).addBox(-0.25F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r15.setTextureOffset(28, 49).addBox(0.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r15.setTextureOffset(2, 49).addBox(-1.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r15.setTextureOffset(47, 48).addBox(-1.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r15.setTextureOffset(48, 43).addBox(0.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			body_sides_r15.setTextureOffset(27, 9).addBox(-0.25F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			body_sides_r16 = new ModelRenderer(this);
			body_sides_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_sides_in4.addChild(body_sides_r16);
			setRotationAngle(body_sides_r16, -1.9866F, 0.7471F, -3.0369F);
			body_sides_r16.setTextureOffset(32, 51).addBox(-1.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r16.setTextureOffset(51, 24).addBox(0.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r16.setTextureOffset(5, 29).addBox(-0.25F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			body_sides_r16.setTextureOffset(51, 34).addBox(-1.0F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r16.setTextureOffset(51, 46).addBox(0.5F, -3.75F, -0.5F, 1.0F, 1.0F, 2.0F, -0.084F, false);
			body_sides_r16.setTextureOffset(27, 29).addBox(-0.25F, -3.75F, -0.5F, 1.0F, 1.0F, 3.0F, -0.075F, false);
			spikes2 = new ModelRenderer(this);
			spikes2.setRotationPoint(0.0F, 24.0F, 0.0F);
			spikes_r4 = new ModelRenderer(this);
			spikes_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes2.addChild(spikes_r4);
			setRotationAngle(spikes_r4, 0.0F, 0.3054F, 0.3491F);
			spikes_r4.setTextureOffset(19, 42).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r4.setTextureOffset(23, 42).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r4.setTextureOffset(38, 42).addBox(1.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r4.setTextureOffset(42, 41).addBox(0.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r4.setTextureOffset(24, 32).addBox(-1.25F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r4.setTextureOffset(43, 4).addBox(-0.25F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r5 = new ModelRenderer(this);
			spikes_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes2.addChild(spikes_r5);
			setRotationAngle(spikes_r5, 0.0F, 0.0F, 0.3491F);
			spikes_r5.setTextureOffset(43, 9).addBox(2.5F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r5.setTextureOffset(43, 14).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r5.setTextureOffset(43, 19).addBox(0.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r5.setTextureOffset(28, 33).addBox(-1.25F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r5.setTextureOffset(43, 24).addBox(-0.25F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6 = new ModelRenderer(this);
			spikes_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes2.addChild(spikes_r6);
			setRotationAngle(spikes_r6, 0.0F, -0.3054F, 0.3491F);
			spikes_r6.setTextureOffset(27, 43).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6.setTextureOffset(31, 43).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6.setTextureOffset(43, 36).addBox(1.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6.setTextureOffset(4, 44).addBox(0.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6.setTextureOffset(8, 33).addBox(-1.25F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r6.setTextureOffset(44, 29).addBox(-0.25F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes3 = new ModelRenderer(this);
			spikes3.setRotationPoint(0.0F, 24.0F, 0.0F);
			spikes_r7 = new ModelRenderer(this);
			spikes_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r7);
			setRotationAngle(spikes_r7, -0.8121F, -1.0806F, 0.7654F);
			spikes_r7.setTextureOffset(27, 38).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r7.setTextureOffset(23, 37).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r7.setTextureOffset(19, 37).addBox(1.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r7.setTextureOffset(15, 37).addBox(0.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r7.setTextureOffset(11, 37).addBox(-0.25F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r8 = new ModelRenderer(this);
			spikes_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r8);
			setRotationAngle(spikes_r8, -1.4438F, -1.2191F, 1.4515F);
			spikes_r8.setTextureOffset(36, 33).addBox(2.5F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r8.setTextureOffset(4, 36).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r8.setTextureOffset(0, 36).addBox(0.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r8.setTextureOffset(35, 28).addBox(-0.25F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r9 = new ModelRenderer(this);
			spikes_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r9);
			setRotationAngle(spikes_r9, -2.1845F, -1.1396F, 2.2462F);
			spikes_r9.setTextureOffset(35, 23).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r9.setTextureOffset(35, 18).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r9.setTextureOffset(35, 13).addBox(1.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r9.setTextureOffset(35, 8).addBox(0.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r9.setTextureOffset(32, 33).addBox(-0.25F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r10 = new ModelRenderer(this);
			spikes_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r10);
			setRotationAngle(spikes_r10, 0.8121F, 1.0806F, 0.7654F);
			spikes_r10.setTextureOffset(31, 38).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r10.setTextureOffset(35, 38).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r10.setTextureOffset(39, 7).addBox(1.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r10.setTextureOffset(39, 12).addBox(0.75F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r10.setTextureOffset(39, 17).addBox(-0.25F, -6.0F, 0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r11 = new ModelRenderer(this);
			spikes_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r11);
			setRotationAngle(spikes_r11, 1.4438F, 1.2191F, 1.4515F);
			spikes_r11.setTextureOffset(39, 22).addBox(2.5F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r11.setTextureOffset(39, 27).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r11.setTextureOffset(39, 37).addBox(0.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r11.setTextureOffset(40, 0).addBox(-0.25F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r12 = new ModelRenderer(this);
			spikes_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			spikes3.addChild(spikes_r12);
			setRotationAngle(spikes_r12, 2.1845F, 1.1396F, 2.2462F);
			spikes_r12.setTextureOffset(7, 40).addBox(2.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r12.setTextureOffset(40, 32).addBox(1.75F, -6.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r12.setTextureOffset(0, 41).addBox(1.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r12.setTextureOffset(11, 42).addBox(0.75F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			spikes_r12.setTextureOffset(15, 42).addBox(-0.25F, -6.0F, -1.5F, 1.0F, 4.0F, 1.0F, -0.3F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 24.0F, 0.0F);
			mouth.setTextureOffset(53, 60).addBox(0.5F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(53, 60).addBox(-2.5F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth_r1 = new ModelRenderer(this);
			mouth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			mouth.addChild(mouth_r1);
			setRotationAngle(mouth_r1, 0.0F, 1.5708F, 0.0F);
			mouth_r1.setTextureOffset(53, 60).addBox(0.5F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth_r1.setTextureOffset(53, 60).addBox(-2.5F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			spikes.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			spikes2.render(matrixStack, buffer, packedLight, packedOverlay);
			spikes3.render(matrixStack, buffer, packedLight, packedOverlay);
			mouth.render(matrixStack, buffer, packedLight, packedOverlay);
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
