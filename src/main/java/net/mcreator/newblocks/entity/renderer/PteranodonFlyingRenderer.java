
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

import net.mcreator.newblocks.entity.PteranodonFlyingEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PteranodonFlyingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PteranodonFlyingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpteranodon_flying(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/entities/pteranodon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelpteranodon_flying extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer Tail1;
		private final ModelRenderer Tail2;
		private final ModelRenderer Tail3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer neck;
		private final ModelRenderer Neck1;
		private final ModelRenderer Neck2;
		private final ModelRenderer Neck3;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer bone3;
		private final ModelRenderer bone3_r1;
		private final ModelRenderer leg1;
		private final ModelRenderer leg1_r1;
		private final ModelRenderer leg_a1;
		private final ModelRenderer leg_b1;
		private final ModelRenderer leg_c1;
		private final ModelRenderer Body1;
		private final ModelRenderer Body2;
		private final ModelRenderer RightArm1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg2_r1;
		private final ModelRenderer leg_a2;
		private final ModelRenderer leg_b2;
		private final ModelRenderer leg_c2;
		private final ModelRenderer wing1;
		private final ModelRenderer wing1_r1;
		private final ModelRenderer wing1b;
		private final ModelRenderer wing1b_r1;
		private final ModelRenderer wing1c;
		private final ModelRenderer wing1c_r1;
		private final ModelRenderer wing1d;
		private final ModelRenderer wing1d_r1;
		private final ModelRenderer wing1d_r2;
		private final ModelRenderer hand1;
		private final ModelRenderer hand1_r1;
		private final ModelRenderer hand1_r2;
		private final ModelRenderer wing2;
		private final ModelRenderer wing2_r1;
		private final ModelRenderer wing1b2;
		private final ModelRenderer wing1b2_r1;
		private final ModelRenderer wing1c2;
		private final ModelRenderer wing1c2_r1;
		private final ModelRenderer wing1d2;
		private final ModelRenderer wing1d2_r1;
		private final ModelRenderer wing1d2_r2;
		private final ModelRenderer hand2;
		private final ModelRenderer hand2_r1;
		private final ModelRenderer hand2_r2;

		public Modelpteranodon_flying() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 11.0F, 6.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(3.0F, 24.0F, -5.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.4712F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 33).addBox(-6.0F, -18.05F, -9.3F, 6.0F, 7.0F, 9.0F, 0.0F, false);
			Tail1 = new ModelRenderer(this);
			Tail1.setRotationPoint(0.0F, -0.4932F, -0.0422F);
			body.addChild(Tail1);
			setRotationAngle(Tail1, -0.5236F, 0.0F, 0.0F);
			Tail1.setTextureOffset(45, 0).addBox(-2.5F, 7.0263F, 6.366F, 5.0F, 4.0F, 2.0F, 0.0F, false);
			Tail2 = new ModelRenderer(this);
			Tail2.setRotationPoint(0.0F, 0.4F, 1.5F);
			Tail1.addChild(Tail2);
			setRotationAngle(Tail2, -0.0873F, 0.0F, 0.0F);
			Tail2.setTextureOffset(18, 73).addBox(-1.5F, 6.4371F, 7.1285F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			Tail3 = new ModelRenderer(this);
			Tail3.setRotationPoint(0.0F, -0.5F, 1.0F);
			Tail2.addChild(Tail3);
			setRotationAngle(Tail3, -0.0873F, 0.0F, 0.0F);
			Tail3.setTextureOffset(28, 73).addBox(-1.0F, 6.7837F, 7.8367F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 13.0F, -6.0F);
			body.addChild(bone);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(4.0F, 4.0F, -9.0F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, -0.3142F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(0, 15).addBox(-8.0F, -15.8F, -2.3F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.0F, -19.3433F, -7.1421F);
			bone.addChild(neck);
			setRotationAngle(neck, -0.2705F, 0.0F, 0.0F);
			neck.setTextureOffset(36, 65).addBox(-3.0F, 7.3327F, -0.0967F, 6.0F, 6.0F, 3.0F, 0.0F, false);
			Neck1 = new ModelRenderer(this);
			Neck1.setRotationPoint(0.0F, -0.8F, -3.0F);
			neck.addChild(Neck1);
			Neck1.setTextureOffset(64, 50).addBox(-2.0F, 8.8327F, -0.0967F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Neck2 = new ModelRenderer(this);
			Neck2.setRotationPoint(0.0F, 0.1F, -3.2F);
			Neck1.addChild(Neck2);
			setRotationAngle(Neck2, -0.2731F, 0.0F, 0.0F);
			Neck2.setTextureOffset(70, 58).addBox(-2.05F, 7.2967F, 4.5459F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			Neck3 = new ModelRenderer(this);
			Neck3.setRotationPoint(0.0F, -0.5F, -1.5F);
			Neck2.addChild(Neck3);
			setRotationAngle(Neck3, -0.2269F, 0.0F, 0.0F);
			Neck3.setTextureOffset(0, 68).addBox(-2.0F, 6.1962F, 3.6795F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.2999F, -3.4535F);
			Neck3.addChild(head);
			setRotationAngle(head, 0.8727F, 0.0F, 0.0F);
			head.setTextureOffset(57, 41).addBox(-2.5F, 8.5847F, -3.1646F, 5.0F, 5.0F, 4.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.0F, 2.5401F, -4.0382F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.3927F, 0.0F, 0.0F);
			head_r1.setTextureOffset(71, 37).addBox(1.0F, 5.4806F, 4.3816F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-1.95F, 2.5401F, -4.0382F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5236F, 0.0F, 0.0F);
			head_r2.setTextureOffset(70, 14).addBox(0.9F, 6.0017F, -0.3818F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			head_r2.setTextureOffset(39, 33).addBox(0.8F, 6.0017F, -5.3818F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.0F, 2.5401F, -4.0382F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.3578F, 0.0F, 0.0F);
			head_r3.setTextureOffset(21, 33).addBox(1.0F, 6.2009F, -6.5863F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.75F, 2.5401F, -4.0382F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.1833F, 0.0F, 0.0F);
			head_r4.setTextureOffset(46, 30).addBox(0.5F, 7.0367F, -10.137F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-1.5F, 2.5401F, -4.0382F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0873F, 0.0F, 0.0F);
			head_r5.setTextureOffset(0, 0).addBox(0.0F, 7.9916F, -13.0885F, 3.0F, 1.0F, 14.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-2.0F, 1.1498F, -2.8905F);
			head.addChild(bone3);
			bone3.setTextureOffset(40, 17).addBox(1.0F, 10.7349F, -11.2741F, 2.0F, 1.0F, 12.0F, 0.0F, false);
			bone3_r1 = new ModelRenderer(this);
			bone3_r1.setRotationPoint(0.05F, 1.3903F, -1.1477F);
			bone3.addChild(bone3_r1);
			setRotationAngle(bone3_r1, 0.0436F, 0.0F, 0.0F);
			bone3_r1.setTextureOffset(18, 18).addBox(0.9F, 8.9286F, -12.608F, 2.0F, 1.0F, 14.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-3.5F, 10.0F, 2.0F);
			setRotationAngle(leg1, 0.829F, 0.0F, 0.0F);
			leg1_r1 = new ModelRenderer(this);
			leg1_r1.setRotationPoint(3.5F, 14.0F, -2.0F);
			leg1.addChild(leg1_r1);
			setRotationAngle(leg1_r1, -0.0785F, 0.0F, 0.0F);
			leg1_r1.setTextureOffset(20, 0).addBox(-5.5F, -7.7731F, -5.2706F, 4.0F, 7.0F, 3.0F, 0.0F, false);
			leg_a1 = new ModelRenderer(this);
			leg_a1.setRotationPoint(0.0F, 4.8336F, 0.2908F);
			leg1.addChild(leg_a1);
			setRotationAngle(leg_a1, 1.2392F, 0.0F, 0.0F);
			leg_a1.setTextureOffset(51, 72).addBox(-1.5F, -4.3821F, -10.1151F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			leg_b1 = new ModelRenderer(this);
			leg_b1.setRotationPoint(0.0F, 6.2846F, 1.9303F);
			leg_a1.addChild(leg_b1);
			setRotationAngle(leg_b1, -0.9948F, 0.0F, 0.0F);
			leg_b1.setTextureOffset(24, 15).addBox(-1.0F, 6.1276F, -10.1898F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			leg_c1 = new ModelRenderer(this);
			leg_c1.setRotationPoint(0.0F, 5.8284F, 0.2464F);
			leg_b1.addChild(leg_c1);
			setRotationAngle(leg_c1, 0.3665F, 0.0F, 0.0F);
			leg_c1.setTextureOffset(67, 0).addBox(-1.5F, 1.9272F, -13.7754F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			Body1 = new ModelRenderer(this);
			Body1.setRotationPoint(0.0F, 10.0F, 2.0F);
			setRotationAngle(Body1, -0.4712F, 0.0F, 0.0F);
			Body2 = new ModelRenderer(this);
			Body2.setRotationPoint(0.0F, -1.6433F, -2.8921F);
			Body1.addChild(Body2);
			setRotationAngle(Body2, 0.1745F, 0.0F, 0.0F);
			RightArm1 = new ModelRenderer(this);
			RightArm1.setRotationPoint(32.5F, -1.9423F, -8.0905F);
			Body2.addChild(RightArm1);
			setRotationAngle(RightArm1, 0.4857F, 0.1467F, 0.5045F);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(3.5F, 10.0F, 2.0F);
			setRotationAngle(leg2, 0.829F, 0.0F, 0.0F);
			leg2_r1 = new ModelRenderer(this);
			leg2_r1.setRotationPoint(-3.5F, 14.0F, -2.0F);
			leg2.addChild(leg2_r1);
			setRotationAngle(leg2_r1, -0.0785F, 0.0F, 0.0F);
			leg2_r1.setTextureOffset(0, 0).addBox(1.5F, -7.7731F, -5.2706F, 4.0F, 7.0F, 3.0F, 0.0F, false);
			leg_a2 = new ModelRenderer(this);
			leg_a2.setRotationPoint(0.0F, 4.8336F, 0.2908F);
			leg2.addChild(leg_a2);
			setRotationAngle(leg_a2, 1.2392F, 0.0F, 0.0F);
			leg_a2.setTextureOffset(56, 18).addBox(-1.5F, -4.3821F, -10.1151F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			leg_b2 = new ModelRenderer(this);
			leg_b2.setRotationPoint(0.0F, 6.2846F, 1.9303F);
			leg_a2.addChild(leg_b2);
			setRotationAngle(leg_b2, -0.9948F, 0.0F, 0.0F);
			leg_b2.setTextureOffset(0, 15).addBox(-1.0F, 6.1276F, -10.1898F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			leg_c2 = new ModelRenderer(this);
			leg_c2.setRotationPoint(0.0F, 5.8284F, 0.2464F);
			leg_b2.addChild(leg_c2);
			setRotationAngle(leg_c2, 0.3665F, 0.0F, 0.0F);
			leg_c2.setTextureOffset(11, 49).addBox(-1.5F, 1.9272F, -13.7754F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			wing1 = new ModelRenderer(this);
			wing1.setRotationPoint(-3.1F, 6.0F, -5.0F);
			setRotationAngle(wing1, 0.0F, 0.0F, 1.2217F);
			wing1_r1 = new ModelRenderer(this);
			wing1_r1.setRotationPoint(-1.0F, -3.0F, 2.0F);
			wing1.addChild(wing1_r1);
			setRotationAngle(wing1_r1, 0.6283F, -0.2269F, 0.2094F);
			wing1_r1.setTextureOffset(61, 23).addBox(8.8387F, -0.629F, -8.094F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			wing1b = new ModelRenderer(this);
			wing1b.setRotationPoint(-1.0F, -3.0F, 2.0F);
			wing1.addChild(wing1b);
			wing1b_r1 = new ModelRenderer(this);
			wing1b_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
			wing1b.addChild(wing1b_r1);
			setRotationAngle(wing1b_r1, -0.6894F, -0.2094F, 0.2793F);
			wing1b_r1.setTextureOffset(56, 0).addBox(9.9413F, 2.5211F, -1.2176F, 2.0F, 11.0F, 7.0F, 0.0F, false);
			wing1c = new ModelRenderer(this);
			wing1c.setRotationPoint(-4.1F, 9.0F, -8.6F);
			wing1b.addChild(wing1c);
			wing1c_r1 = new ModelRenderer(this);
			wing1c_r1.setRotationPoint(7.0F, 13.75F, 12.1F);
			wing1c.addChild(wing1c_r1);
			setRotationAngle(wing1c_r1, 0.0F, -0.2182F, 0.1309F);
			wing1c_r1.setTextureOffset(0, 49).addBox(1.6011F, -10.6192F, -11.3481F, 2.0F, 12.0F, 7.0F, 0.0F, false);
			wing1d = new ModelRenderer(this);
			wing1d.setRotationPoint(-1.6F, 8.0086F, -0.9312F);
			wing1c.addChild(wing1d);
			setRotationAngle(wing1d, -2.0508F, -0.1745F, 0.0F);
			wing1d_r1 = new ModelRenderer(this);
			wing1d_r1.setRotationPoint(0.0F, -13.1586F, 14.1812F);
			wing1d.addChild(wing1d_r1);
			setRotationAngle(wing1d_r1, -1.1345F, -0.096F, -0.1396F);
			wing1d_r1.setTextureOffset(32, 15).addBox(10.6219F, -14.1682F, 3.9264F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			wing1d_r1.setTextureOffset(69, 72).addBox(10.5719F, -17.7682F, 4.9264F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			wing1d_r1.setTextureOffset(48, 30).addBox(10.6219F, -12.1682F, 1.9264F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			wing1d_r1.setTextureOffset(36, 0).addBox(10.5719F, -8.7682F, -0.2736F, 1.0F, 22.0F, 7.0F, 0.0F, false);
			wing1d_r2 = new ModelRenderer(this);
			wing1d_r2.setRotationPoint(0.0F, -13.1586F, 14.1812F);
			wing1d.addChild(wing1d_r2);
			setRotationAngle(wing1d_r2, -1.6581F, -0.096F, -0.1396F);
			wing1d_r2.setTextureOffset(63, 72).addBox(10.5969F, -17.8945F, -4.5799F, 1.0F, 10.0F, 2.0F, 0.0F, false);
			hand1 = new ModelRenderer(this);
			hand1.setRotationPoint(9.6F, 12.0F, 11.0F);
			wing1c.addChild(hand1);
			hand1.setTextureOffset(20, 10).addBox(0.8366F, 2.6622F, -10.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			hand1.setTextureOffset(21, 36).addBox(1.8366F, 2.7622F, -12.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			hand1_r1 = new ModelRenderer(this);
			hand1_r1.setRotationPoint(-6.0F, 0.0F, -10.0F);
			hand1.addChild(hand1_r1);
			setRotationAngle(hand1_r1, 0.0F, -0.3491F, 0.0F);
			hand1_r1.setTextureOffset(21, 33).addBox(8.5553F, 2.7622F, -4.5956F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			hand1_r2 = new ModelRenderer(this);
			hand1_r2.setRotationPoint(-8.0F, 0.0F, -11.0F);
			hand1.addChild(hand1_r2);
			setRotationAngle(hand1_r2, 0.0F, 0.3491F, 0.0F);
			hand1_r2.setTextureOffset(31, 33).addBox(7.8712F, 2.7622F, 2.475F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			wing2 = new ModelRenderer(this);
			wing2.setRotationPoint(3.1F, 6.0F, -5.0F);
			setRotationAngle(wing2, 0.0F, 0.0F, -1.2217F);
			wing2_r1 = new ModelRenderer(this);
			wing2_r1.setRotationPoint(1.0F, -3.0F, 2.0F);
			wing2.addChild(wing2_r1);
			setRotationAngle(wing2_r1, 0.6283F, 0.2269F, -0.2094F);
			wing2_r1.setTextureOffset(57, 58).addBox(-11.8387F, -0.629F, -8.094F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			wing1b2 = new ModelRenderer(this);
			wing1b2.setRotationPoint(1.0F, -3.0F, 2.0F);
			wing2.addChild(wing1b2);
			wing1b2_r1 = new ModelRenderer(this);
			wing1b2_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
			wing1b2.addChild(wing1b2_r1);
			setRotationAngle(wing1b2_r1, -0.6894F, 0.2094F, -0.2793F);
			wing1b2_r1.setTextureOffset(18, 55).addBox(-11.9413F, 2.5211F, -1.2176F, 2.0F, 11.0F, 7.0F, 0.0F, false);
			wing1c2 = new ModelRenderer(this);
			wing1c2.setRotationPoint(4.1F, 9.0F, -8.6F);
			wing1b2.addChild(wing1c2);
			wing1c2_r1 = new ModelRenderer(this);
			wing1c2_r1.setRotationPoint(-7.0F, 13.75F, 12.1F);
			wing1c2.addChild(wing1c2_r1);
			setRotationAngle(wing1c2_r1, 0.0F, 0.2182F, -0.1309F);
			wing1c2_r1.setTextureOffset(46, 46).addBox(-3.6011F, -10.6192F, -11.3481F, 2.0F, 12.0F, 7.0F, 0.0F, false);
			wing1d2 = new ModelRenderer(this);
			wing1d2.setRotationPoint(1.6F, 8.0086F, -0.9312F);
			wing1c2.addChild(wing1d2);
			setRotationAngle(wing1d2, -2.0508F, 0.1745F, 0.0F);
			wing1d2_r1 = new ModelRenderer(this);
			wing1d2_r1.setRotationPoint(0.0F, -13.1586F, 14.1812F);
			wing1d2.addChild(wing1d2_r1);
			setRotationAngle(wing1d2_r1, -1.1345F, 0.096F, 0.1396F);
			wing1d2_r1.setTextureOffset(32, 10).addBox(-11.6219F, -14.1682F, 3.9264F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			wing1d2_r1.setTextureOffset(0, 31).addBox(-11.6719F, -17.7682F, 4.9264F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			wing1d2_r1.setTextureOffset(34, 0).addBox(-11.6219F, -12.1682F, 1.9264F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			wing1d2_r1.setTextureOffset(30, 33).addBox(-11.6719F, -8.7682F, -0.2736F, 1.0F, 22.0F, 7.0F, 0.0F, false);
			wing1d2_r2 = new ModelRenderer(this);
			wing1d2_r2.setRotationPoint(0.0F, -13.1586F, 14.1812F);
			wing1d2.addChild(wing1d2_r2);
			setRotationAngle(wing1d2_r2, -1.6581F, 0.096F, 0.1396F);
			wing1d2_r2.setTextureOffset(46, 41).addBox(-11.6469F, -17.8945F, -4.5799F, 1.0F, 10.0F, 2.0F, 0.0F, false);
			hand2 = new ModelRenderer(this);
			hand2.setRotationPoint(-9.6F, 12.0F, 11.0F);
			wing1c2.addChild(hand2);
			hand2.setTextureOffset(0, 10).addBox(-3.8366F, 2.6622F, -10.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			hand2.setTextureOffset(31, 0).addBox(-2.8366F, 2.7622F, -12.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			hand2_r1 = new ModelRenderer(this);
			hand2_r1.setRotationPoint(6.0F, 0.0F, -10.0F);
			hand2.addChild(hand2_r1);
			setRotationAngle(hand2_r1, 0.0F, 0.3491F, 0.0F);
			hand2_r1.setTextureOffset(8, 11).addBox(-9.5553F, 2.7622F, -4.5956F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			hand2_r2 = new ModelRenderer(this);
			hand2_r2.setRotationPoint(8.0F, 0.0F, -11.0F);
			hand2.addChild(hand2_r2);
			setRotationAngle(hand2_r2, 0.0F, -0.3491F, 0.0F);
			hand2_r2.setTextureOffset(28, 11).addBox(-8.8712F, 2.7622F, 2.475F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			Body1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			wing1.render(matrixStack, buffer, packedLight, packedOverlay);
			wing2.render(matrixStack, buffer, packedLight, packedOverlay);
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
