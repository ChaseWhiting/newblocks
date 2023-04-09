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

import net.mcreator.newblocks.entity.YetiEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class YetiRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(YetiEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelyeti(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/yeti.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelyeti extends EntityModel<Entity> {
		private final ModelRenderer all;
		private final ModelRenderer yeti;
		private final ModelRenderer head;
		private final ModelRenderer seeth5;
		private final ModelRenderer seeth5_r1;
		private final ModelRenderer seeth6;
		private final ModelRenderer seeth6_r1;
		private final ModelRenderer eyeslocked;
		private final ModelRenderer eyeslocked2;
		private final ModelRenderer horns;
		private final ModelRenderer horns2;
		private final ModelRenderer horns3;
		private final ModelRenderer horns4;
		private final ModelRenderer horns5;
		private final ModelRenderer horns6;
		private final ModelRenderer horns7;
		private final ModelRenderer horns8;
		private final ModelRenderer horns9;
		private final ModelRenderer horns10;
		private final ModelRenderer bone;
		private final ModelRenderer mouth2;
		private final ModelRenderer mouth2_r1;
		private final ModelRenderer bone12;
		private final ModelRenderer bone12_r1;
		private final ModelRenderer mouth3;
		private final ModelRenderer mouth3_r1;
		private final ModelRenderer seeth2;
		private final ModelRenderer seeth2_r1;
		private final ModelRenderer seeth4;
		private final ModelRenderer seeth4_r1;
		private final ModelRenderer seeth3;
		private final ModelRenderer leftleg5;
		private final ModelRenderer leftleg5_r1;
		private final ModelRenderer leftleg6;
		private final ModelRenderer leftleg6_r1;
		private final ModelRenderer leftleg7;
		private final ModelRenderer leftleg7_r1;
		private final ModelRenderer leftleg8;
		private final ModelRenderer leftleg8_r1;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightleg_r1;
		private final ModelRenderer rightleg3;
		private final ModelRenderer rightleg3_r1;
		private final ModelRenderer rightleg4;
		private final ModelRenderer rightleg4_r1;
		private final ModelRenderer rightleg9;
		private final ModelRenderer rightleg9_r1;
		private final ModelRenderer body;
		private final ModelRenderer body2;
		private final ModelRenderer leftarm;
		private final ModelRenderer leftarm2;
		private final ModelRenderer leftarm3;
		private final ModelRenderer horns11;
		private final ModelRenderer horns12;
		private final ModelRenderer horns13;
		private final ModelRenderer horns14;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer bone4;
		private final ModelRenderer bone4_r1;
		private final ModelRenderer bone6;
		private final ModelRenderer bone6_r1;
		private final ModelRenderer bone3;
		private final ModelRenderer bone3_r1;
		private final ModelRenderer bone5;
		private final ModelRenderer bone5_r1;
		private final ModelRenderer leftarm4;
		private final ModelRenderer dedo2;
		private final ModelRenderer dedo2_r1;
		private final ModelRenderer dedo;
		private final ModelRenderer dedos;
		private final ModelRenderer dedos2;
		private final ModelRenderer dedos3;
		private final ModelRenderer rightarm5;
		private final ModelRenderer rightarm6;
		private final ModelRenderer rightarm7;
		private final ModelRenderer horns15;
		private final ModelRenderer horns16;
		private final ModelRenderer horns17;
		private final ModelRenderer horns18;
		private final ModelRenderer bone7;
		private final ModelRenderer bone7_r1;
		private final ModelRenderer bone8;
		private final ModelRenderer bone8_r1;
		private final ModelRenderer bone9;
		private final ModelRenderer bone9_r1;
		private final ModelRenderer bone10;
		private final ModelRenderer bone10_r1;
		private final ModelRenderer bone11;
		private final ModelRenderer bone11_r1;
		private final ModelRenderer rightarm8;
		private final ModelRenderer dedo3;
		private final ModelRenderer dedo3_r1;
		private final ModelRenderer dedo4;
		private final ModelRenderer dedos4;
		private final ModelRenderer dedos5;
		private final ModelRenderer dedos6;

		public Modelyeti() {
			textureWidth = 300;
			textureHeight = 300;
			all = new ModelRenderer(this);
			all.setRotationPoint(0.0F, 21.0F, 2.0F);
			setRotationAngle(all, 0.5672F, 0.0F, 0.0F);
			yeti = new ModelRenderer(this);
			yeti.setRotationPoint(0.0F, -54.9899F, 3.0188F);
			all.addChild(yeti);
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, -12.4479F, 3.1709F);
			yeti.addChild(head);
			setRotationAngle(head, -0.5672F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-11.0F, -11.7979F, -14.986F, 20.0F, 15.0F, 17.0F, 0.0F, false);
			seeth5 = new ModelRenderer(this);
			seeth5.setRotationPoint(1.9104F, 5.2201F, -5.5111F);
			head.addChild(seeth5);
			setRotationAngle(seeth5, 0.0436F, 0.1745F, -2.4435F);
			seeth5_r1 = new ModelRenderer(this);
			seeth5_r1.setRotationPoint(0.4853F, 0.1458F, 0.0892F);
			seeth5.addChild(seeth5_r1);
			setRotationAngle(seeth5_r1, 0.0F, -0.1745F, -0.6981F);
			seeth5_r1.setTextureOffset(235, 134).addBox(-5.9853F, -3.1458F, -7.5892F, 11.0F, 6.0F, 13.0F, 0.0F, true);
			seeth6 = new ModelRenderer(this);
			seeth6.setRotationPoint(-3.9104F, 5.2201F, -5.5111F);
			head.addChild(seeth6);
			setRotationAngle(seeth6, 0.0436F, -0.1745F, 2.4435F);
			seeth6_r1 = new ModelRenderer(this);
			seeth6_r1.setRotationPoint(-0.4853F, 0.1458F, 0.0892F);
			seeth6.addChild(seeth6_r1);
			setRotationAngle(seeth6_r1, 0.0F, 0.1745F, 0.6981F);
			seeth6_r1.setTextureOffset(235, 134).addBox(-5.0147F, -3.1458F, -7.5892F, 11.0F, 6.0F, 13.0F, 0.0F, false);
			eyeslocked = new ModelRenderer(this);
			eyeslocked.setRotationPoint(-1.0F, -4.2979F, -12.486F);
			head.addChild(eyeslocked);
			eyeslocked.setTextureOffset(0, 46).addBox(0.02F, -3.55F, -2.67F, 9.0F, 7.0F, 4.0F, -1.0F, false);
			eyeslocked2 = new ModelRenderer(this);
			eyeslocked2.setRotationPoint(-1.0F, -4.2979F, -12.486F);
			head.addChild(eyeslocked2);
			eyeslocked2.setTextureOffset(0, 46).addBox(-9.16F, -3.55F, -2.67F, 9.0F, 7.0F, 4.0F, -1.0F, true);
			horns = new ModelRenderer(this);
			horns.setRotationPoint(7.0F, -8.7979F, -9.986F);
			head.addChild(horns);
			setRotationAngle(horns, -0.2782F, 0.9484F, 0.4535F);
			horns.setTextureOffset(62, 38).addBox(-6.8191F, -11.0306F, -4.6786F, 10.0F, 15.0F, 10.0F, -1.0F, false);
			horns2 = new ModelRenderer(this);
			horns2.setRotationPoint(-1.8191F, -9.0306F, -1.6786F);
			horns.addChild(horns2);
			setRotationAngle(horns2, -0.1375F, 0.0334F, -0.3914F);
			horns2.setTextureOffset(108, 43).addBox(-4.44F, -10.4557F, -2.44F, 8.0F, 12.0F, 8.0F, -1.0F, false);
			horns3 = new ModelRenderer(this);
			horns3.setRotationPoint(0.4002F, -8.5747F, 2.2493F);
			horns2.addChild(horns3);
			setRotationAngle(horns3, -0.2764F, 0.0603F, -0.4765F);
			horns3.setTextureOffset(90, 22).addBox(-4.6832F, -7.3283F, -4.0748F, 8.0F, 9.0F, 7.0F, -1.0F, false);
			horns4 = new ModelRenderer(this);
			horns4.setRotationPoint(0.0F, -5.0F, 0.0F);
			horns3.addChild(horns4);
			setRotationAngle(horns4, 0.5824F, 0.1198F, -0.2914F);
			horns4.setTextureOffset(126, 12).addBox(-2.9919F, -7.2309F, -3.3776F, 6.0F, 9.0F, 6.0F, -1.0F, false);
			horns5 = new ModelRenderer(this);
			horns5.setRotationPoint(0.0F, -6.0F, 0.0F);
			horns4.addChild(horns5);
			setRotationAngle(horns5, 0.5672F, 0.0F, 0.3927F);
			horns5.setTextureOffset(80, 0).addBox(-2.7624F, -8.2298F, -2.1978F, 5.0F, 10.0F, 4.0F, -1.0F, false);
			horns6 = new ModelRenderer(this);
			horns6.setRotationPoint(-9.0F, -8.7979F, -9.986F);
			head.addChild(horns6);
			setRotationAngle(horns6, -0.2782F, -0.9484F, -0.4535F);
			horns6.setTextureOffset(62, 38).addBox(-3.1809F, -11.0306F, -4.6786F, 10.0F, 15.0F, 10.0F, -1.0F, true);
			horns7 = new ModelRenderer(this);
			horns7.setRotationPoint(1.8191F, -9.0306F, -1.6786F);
			horns6.addChild(horns7);
			setRotationAngle(horns7, -0.1375F, -0.0334F, 0.3914F);
			horns7.setTextureOffset(108, 43).addBox(-4.44F, -10.4557F, -2.44F, 8.0F, 12.0F, 8.0F, -1.0F, true);
			horns8 = new ModelRenderer(this);
			horns8.setRotationPoint(-0.4002F, -8.5747F, 2.2493F);
			horns7.addChild(horns8);
			setRotationAngle(horns8, -0.2764F, -0.0603F, 0.4765F);
			horns8.setTextureOffset(90, 22).addBox(-3.6832F, -7.3283F, -4.0748F, 8.0F, 9.0F, 7.0F, -1.0F, true);
			horns9 = new ModelRenderer(this);
			horns9.setRotationPoint(0.0F, -5.0F, 0.0F);
			horns8.addChild(horns9);
			setRotationAngle(horns9, 0.5824F, -0.1198F, 0.2914F);
			horns9.setTextureOffset(126, 12).addBox(-3.3745F, -7.2309F, -3.3776F, 6.0F, 9.0F, 6.0F, -1.0F, true);
			horns10 = new ModelRenderer(this);
			horns10.setRotationPoint(0.0F, -6.0F, 0.0F);
			horns9.addChild(horns10);
			setRotationAngle(horns10, 0.5672F, 0.0F, -0.3927F);
			horns10.setTextureOffset(80, 0).addBox(-2.604F, -8.2298F, -2.1978F, 5.0F, 10.0F, 4.0F, -1.0F, true);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 3.2021F, 1.014F);
			head.addChild(bone);
			mouth2 = new ModelRenderer(this);
			mouth2.setRotationPoint(1.25F, -4.0F, 1.0F);
			bone.addChild(mouth2);
			setRotationAngle(mouth2, 0.3927F, -0.0436F, -0.1309F);
			mouth2_r1 = new ModelRenderer(this);
			mouth2_r1.setRotationPoint(3.1413F, -1.2444F, -11.8736F);
			mouth2.addChild(mouth2_r1);
			setRotationAngle(mouth2_r1, 0.0F, 0.0F, 0.2618F);
			mouth2_r1.setTextureOffset(156, 7).addBox(-7.2635F, -2.6861F, -9.0108F, 12.0F, 7.0F, 17.0F, 0.0F, true);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(-2.9515F, 3.2455F, -19.378F);
			mouth2.addChild(bone12);
			setRotationAngle(bone12, 0.5236F, 0.2182F, -0.0873F);
			bone12_r1 = new ModelRenderer(this);
			bone12_r1.setRotationPoint(-0.7377F, -3.3444F, -0.4917F);
			bone12.addChild(bone12_r1);
			setRotationAngle(bone12_r1, 0.0873F, 0.0F, 0.2618F);
			bone12_r1.setTextureOffset(244, 69).addBox(-5.3978F, -4.4184F, -1.3165F, 10.0F, 6.0F, 5.0F, 0.0F, true);
			mouth3 = new ModelRenderer(this);
			mouth3.setRotationPoint(-1.25F, -4.0F, 1.0F);
			bone.addChild(mouth3);
			setRotationAngle(mouth3, 0.3927F, 0.0436F, 0.1309F);
			mouth3_r1 = new ModelRenderer(this);
			mouth3_r1.setRotationPoint(-1.4648F, -0.6271F, -11.9925F);
			mouth3.addChild(mouth3_r1);
			setRotationAngle(mouth3_r1, 0.0F, 0.0F, -0.2618F);
			mouth3_r1.setTextureOffset(222, 6).addBox(-8.5F, -4.0F, -9.0F, 13.0F, 8.0F, 18.0F, 0.0F, false);
			seeth2 = new ModelRenderer(this);
			seeth2.setRotationPoint(7.6604F, -4.5811F, -18.3212F);
			mouth3.addChild(seeth2);
			setRotationAngle(seeth2, 0.0436F, 0.1745F, 0.4363F);
			seeth2_r1 = new ModelRenderer(this);
			seeth2_r1.setRotationPoint(-12.0147F, 4.7449F, 5.8853F);
			seeth2.addChild(seeth2_r1);
			setRotationAngle(seeth2_r1, 0.0F, -0.1745F, -0.6981F);
			seeth2_r1.setTextureOffset(229, 133).addBox(-5.9853F, -3.1458F, -7.5892F, 11.0F, 6.0F, 15.0F, 0.0F, true);
			seeth4 = new ModelRenderer(this);
			seeth4.setRotationPoint(-4.1889F, -4.8932F, -18.0515F);
			mouth3.addChild(seeth4);
			setRotationAngle(seeth4, 0.0436F, -0.1745F, -0.4363F);
			seeth4_r1 = new ModelRenderer(this);
			seeth4_r1.setRotationPoint(3.3369F, 3.8239F, 0.5143F);
			seeth4.addChild(seeth4_r1);
			setRotationAngle(seeth4_r1, 0.0F, 0.0873F, 0.3927F);
			seeth4_r1.setTextureOffset(229, 133).addBox(0.3648F, -6.6921F, -1.4091F, 11.0F, 6.0F, 15.0F, 0.0F, false);
			seeth3 = new ModelRenderer(this);
			seeth3.setRotationPoint(-5.049F, -3.871F, -18.5155F);
			mouth3.addChild(seeth3);
			setRotationAngle(seeth3, 0.0436F, 0.0F, -0.6981F);
			leftleg5 = new ModelRenderer(this);
			leftleg5.setRotationPoint(11.0F, 32.8389F, 21.3966F);
			yeti.addChild(leftleg5);
			setRotationAngle(leftleg5, -2.2341F, -0.2527F, 0.0692F);
			leftleg5_r1 = new ModelRenderer(this);
			leftleg5_r1.setRotationPoint(-2.3646F, 15.361F, 9.3204F);
			leftleg5.addChild(leftleg5_r1);
			setRotationAngle(leftleg5_r1, -0.6981F, 0.0F, 0.0F);
			leftleg5_r1.setTextureOffset(47, 191).addBox(-8.0F, -12.7284F, -22.6481F, 16.0F, 17.0F, 26.0F, 0.0F, true);
			leftleg6 = new ModelRenderer(this);
			leftleg6.setRotationPoint(-2.8983F, 15.7897F, 9.0305F);
			leftleg5.addChild(leftleg6);
			setRotationAngle(leftleg6, -1.8762F, 0.0F, 0.0F);
			leftleg6_r1 = new ModelRenderer(this);
			leftleg6_r1.setRotationPoint(4.0F, 8.1209F, -4.9755F);
			leftleg6.addChild(leftleg6_r1);
			setRotationAngle(leftleg6_r1, -0.6981F, 0.0F, 0.0F);
			leftleg6_r1.setTextureOffset(44, 147).addBox(-9.0F, -12.7284F, -22.6481F, 11.0F, 16.0F, 23.0F, 0.0F, true);
			leftleg7 = new ModelRenderer(this);
			leftleg7.setRotationPoint(-0.3705F, -4.1153F, -23.4641F);
			leftleg6.addChild(leftleg7);
			setRotationAngle(leftleg7, 0.5236F, 0.0F, 0.0F);
			leftleg7_r1 = new ModelRenderer(this);
			leftleg7_r1.setRotationPoint(0.5F, -4.3899F, 9.1643F);
			leftleg7.addChild(leftleg7_r1);
			setRotationAngle(leftleg7_r1, -0.6981F, 0.0F, 0.0F);
			leftleg7_r1.setTextureOffset(19, 106).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 16.0F, 11.0F, 0.0F, true);
			leftleg8 = new ModelRenderer(this);
			leftleg8.setRotationPoint(0.2853F, -10.2471F, 9.2948F);
			leftleg7.addChild(leftleg8);
			setRotationAngle(leftleg8, -0.9163F, 0.0F, -0.0436F);
			leftleg8_r1 = new ModelRenderer(this);
			leftleg8_r1.setRotationPoint(0.0F, -6.4013F, 6.993F);
			leftleg8.addChild(leftleg8_r1);
			setRotationAngle(leftleg8_r1, -0.6981F, 0.0F, 0.0F);
			leftleg8_r1.setTextureOffset(202, 38).addBox(-5.5F, -10.0F, -3.5F, 11.0F, 20.0F, 7.0F, 0.0F, true);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-11.0F, 32.8389F, 21.3966F);
			yeti.addChild(rightleg);
			setRotationAngle(rightleg, -2.2341F, 0.2527F, -0.0692F);
			rightleg_r1 = new ModelRenderer(this);
			rightleg_r1.setRotationPoint(2.3646F, 15.361F, 9.3204F);
			rightleg.addChild(rightleg_r1);
			setRotationAngle(rightleg_r1, -0.6981F, 0.0F, 0.0F);
			rightleg_r1.setTextureOffset(47, 191).addBox(-8.0F, -12.7284F, -22.6481F, 16.0F, 17.0F, 26.0F, 0.0F, false);
			rightleg3 = new ModelRenderer(this);
			rightleg3.setRotationPoint(2.8983F, 15.7897F, 9.0305F);
			rightleg.addChild(rightleg3);
			setRotationAngle(rightleg3, -1.8762F, 0.0F, 0.0F);
			rightleg3_r1 = new ModelRenderer(this);
			rightleg3_r1.setRotationPoint(-4.0F, 8.1209F, -4.9755F);
			rightleg3.addChild(rightleg3_r1);
			setRotationAngle(rightleg3_r1, -0.6981F, 0.0F, 0.0F);
			rightleg3_r1.setTextureOffset(44, 147).addBox(-2.0F, -12.7284F, -22.6481F, 11.0F, 16.0F, 23.0F, 0.0F, false);
			rightleg4 = new ModelRenderer(this);
			rightleg4.setRotationPoint(0.3705F, -4.1153F, -23.4641F);
			rightleg3.addChild(rightleg4);
			setRotationAngle(rightleg4, 0.5672F, 0.0F, 0.0F);
			rightleg4_r1 = new ModelRenderer(this);
			rightleg4_r1.setRotationPoint(-0.5F, -4.3899F, 9.1643F);
			rightleg4.addChild(rightleg4_r1);
			setRotationAngle(rightleg4_r1, -0.6981F, 0.0F, 0.0F);
			rightleg4_r1.setTextureOffset(19, 106).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 16.0F, 11.0F, 0.0F, false);
			rightleg9 = new ModelRenderer(this);
			rightleg9.setRotationPoint(-0.2853F, -10.2471F, 9.2948F);
			rightleg4.addChild(rightleg9);
			setRotationAngle(rightleg9, -0.9163F, 0.0F, 0.0436F);
			rightleg9_r1 = new ModelRenderer(this);
			rightleg9_r1.setRotationPoint(0.0F, -6.4013F, 6.993F);
			rightleg9.addChild(rightleg9_r1);
			setRotationAngle(rightleg9_r1, -0.6981F, 0.0F, 0.0F);
			rightleg9_r1.setTextureOffset(202, 38).addBox(-5.5F, -10.0F, -3.5F, 11.0F, 20.0F, 7.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-1.5F, 34.5F, 20.5F);
			yeti.addChild(body);
			setRotationAngle(body, 0.3491F, 0.0F, 0.0F);
			body.setTextureOffset(70, 68).addBox(-21.5F, -55.4903F, -3.5277F, 47.0F, 31.0F, 35.0F, 0.0F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(1.0F, -18.8285F, 8.2689F);
			body.addChild(body2);
			setRotationAngle(body2, -0.6109F, 0.0F, 0.0F);
			body2.setTextureOffset(116, 141).addBox(-12.5F, -17.0F, -9.0F, 26.0F, 36.0F, 20.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(20.5F, -4.9418F, 15.2579F);
			yeti.addChild(leftarm);
			setRotationAngle(leftarm, 1.535F, 0.025F, 0.6104F);
			leftarm.setTextureOffset(219, 160).addBox(-3.5F, -8.5F, -9.5F, 23.0F, 17.0F, 18.0F, 0.0F, false);
			leftarm2 = new ModelRenderer(this);
			leftarm2.setRotationPoint(15.0F, 0.0F, 1.0F);
			leftarm.addChild(leftarm2);
			setRotationAngle(leftarm2, 0.0F, 0.3927F, 0.0F);
			leftarm2.setTextureOffset(202, 214).addBox(-0.5F, -6.5F, -8.5F, 29.0F, 13.0F, 14.0F, 0.0F, false);
			leftarm3 = new ModelRenderer(this);
			leftarm3.setRotationPoint(21.0839F, -0.7321F, -1.5622F);
			leftarm2.addChild(leftarm3);
			setRotationAngle(leftarm3, -0.3492F, 0.374F, -1.1043F);
			leftarm3.setTextureOffset(9, 253).addBox(-5.5F, -10.5F, -13.0F, 39.0F, 22.0F, 23.0F, 0.0F, false);
			horns11 = new ModelRenderer(this);
			horns11.setRotationPoint(-1.273F, -2.0992F, 5.9692F);
			leftarm3.addChild(horns11);
			setRotationAngle(horns11, -0.9548F, -0.6122F, -0.8424F);
			horns11.setTextureOffset(63, 45).addBox(-4.44F, -10.4557F, -2.44F, 8.0F, 12.0F, 8.0F, -1.0F, false);
			horns12 = new ModelRenderer(this);
			horns12.setRotationPoint(0.4002F, -8.5747F, 2.2493F);
			horns11.addChild(horns12);
			setRotationAngle(horns12, -0.2764F, 0.0603F, -0.4765F);
			horns12.setTextureOffset(90, 22).addBox(-4.6832F, -7.3283F, -4.0748F, 8.0F, 9.0F, 7.0F, -1.0F, false);
			horns13 = new ModelRenderer(this);
			horns13.setRotationPoint(0.0F, -5.0F, 0.0F);
			horns12.addChild(horns13);
			setRotationAngle(horns13, 0.5824F, 0.1198F, -0.2914F);
			horns13.setTextureOffset(126, 12).addBox(-2.9919F, -7.2309F, -3.3776F, 6.0F, 9.0F, 6.0F, -1.0F, false);
			horns14 = new ModelRenderer(this);
			horns14.setRotationPoint(0.0F, -6.0F, 0.0F);
			horns13.addChild(horns14);
			setRotationAngle(horns14, 0.5672F, 0.0F, 0.3927F);
			horns14.setTextureOffset(80, 0).addBox(-2.7624F, -8.2298F, -2.1978F, 5.0F, 10.0F, 4.0F, -1.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(11.0656F, 0.5F, 4.1795F);
			leftarm3.addChild(bone2);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(13.5899F, 7.701F, 5.4109F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, 0.0F, 0.3491F, 0.0F);
			bone2_r1.setTextureOffset(14, 266).addBox(-27.0899F, -16.701F, -10.9109F, 27.0F, 18.0F, 11.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(11.0656F, 0.5F, 4.1795F);
			leftarm3.addChild(bone4);
			bone4_r1 = new ModelRenderer(this);
			bone4_r1.setRotationPoint(13.5899F, 7.701F, 5.4109F);
			bone4.addChild(bone4_r1);
			setRotationAngle(bone4_r1, 1.309F, 0.2182F, 0.6981F);
			bone4_r1.setTextureOffset(15, 270).addBox(-29.7629F, -18.9046F, -5.1664F, 27.0F, 16.0F, 11.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(7.3696F, 1.6426F, 5.9245F);
			leftarm3.addChild(bone6);
			bone6_r1 = new ModelRenderer(this);
			bone6_r1.setRotationPoint(13.5899F, -7.701F, 5.4109F);
			bone6.addChild(bone6_r1);
			setRotationAngle(bone6_r1, -1.309F, 0.2182F, -0.6981F);
			bone6_r1.setTextureOffset(18, 271).addBox(-29.7629F, 2.9046F, -5.1664F, 27.0F, 16.0F, 11.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(31.9723F, -10.0689F, 0.6444F);
			leftarm3.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.0F, 0.0873F);
			bone3_r1 = new ModelRenderer(this);
			bone3_r1.setRotationPoint(1.0492F, -0.3541F, -0.1238F);
			bone3.addChild(bone3_r1);
			setRotationAngle(bone3_r1, 1.5708F, 0.0F, 0.1309F);
			bone3_r1.setTextureOffset(18, 266).addBox(-26.8977F, -11.029F, -10.8314F, 27.0F, 19.0F, 11.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(26.2974F, 11.7277F, -0.749F);
			leftarm3.addChild(bone5);
			setRotationAngle(bone5, 0.0F, 0.0F, -0.0873F);
			bone5_r1 = new ModelRenderer(this);
			bone5_r1.setRotationPoint(1.0492F, 0.3541F, -0.1238F);
			bone5.addChild(bone5_r1);
			setRotationAngle(bone5_r1, -1.5708F, 0.0F, -0.1309F);
			bone5_r1.setTextureOffset(18, 267).addBox(-26.8977F, -7.971F, -10.8314F, 27.0F, 19.0F, 11.0F, 0.0F, false);
			leftarm4 = new ModelRenderer(this);
			leftarm4.setRotationPoint(34.5F, -7.5F, 0.5F);
			leftarm3.addChild(leftarm4);
			setRotationAngle(leftarm4, 0.0F, 0.0F, 0.5672F);
			leftarm4.setTextureOffset(123, 228).addBox(-3.0F, -1.0F, -12.5F, 16.0F, 10.0F, 21.0F, 0.0F, false);
			dedo2 = new ModelRenderer(this);
			dedo2.setRotationPoint(8.175F, 10.9247F, -12.9082F);
			leftarm4.addChild(dedo2);
			dedo2_r1 = new ModelRenderer(this);
			dedo2_r1.setRotationPoint(-4.5489F, -0.8097F, -2.9386F);
			dedo2.addChild(dedo2_r1);
			setRotationAngle(dedo2_r1, 0.0F, 0.48F, 0.0F);
			dedo2_r1.setTextureOffset(13, 193).addBox(-5.4511F, -3.1903F, -0.5614F, 5.0F, 8.0F, 7.0F, 0.0F, false);
			dedo = new ModelRenderer(this);
			dedo.setRotationPoint(0.0F, 0.0F, 0.0F);
			dedo2.addChild(dedo);
			dedo.setTextureOffset(10, 148).addBox(-5.0F, -4.0F, -3.5F, 10.0F, 8.0F, 7.0F, 0.0F, false);
			dedos = new ModelRenderer(this);
			dedos.setRotationPoint(8.5F, 3.5F, 4.5F);
			leftarm4.addChild(dedos);
			dedos.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			dedos2 = new ModelRenderer(this);
			dedos2.setRotationPoint(8.5153F, 3.2696F, -2.5673F);
			leftarm4.addChild(dedos2);
			dedos2.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			dedos3 = new ModelRenderer(this);
			dedos3.setRotationPoint(8.5306F, 3.0391F, -9.6346F);
			leftarm4.addChild(dedos3);
			dedos3.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			rightarm5 = new ModelRenderer(this);
			rightarm5.setRotationPoint(-20.5F, -4.9418F, 15.2579F);
			yeti.addChild(rightarm5);
			setRotationAngle(rightarm5, 1.535F, -0.025F, -0.6104F);
			rightarm5.setTextureOffset(219, 160).addBox(-19.5F, -8.5F, -9.5F, 23.0F, 17.0F, 18.0F, 0.0F, true);
			rightarm6 = new ModelRenderer(this);
			rightarm6.setRotationPoint(-15.0F, 0.0F, 1.0F);
			rightarm5.addChild(rightarm6);
			setRotationAngle(rightarm6, 0.0F, -0.3927F, 0.0F);
			rightarm6.setTextureOffset(202, 214).addBox(-28.5F, -6.5F, -8.5F, 29.0F, 13.0F, 14.0F, 0.0F, true);
			rightarm7 = new ModelRenderer(this);
			rightarm7.setRotationPoint(-21.0839F, -0.7321F, -1.5622F);
			rightarm6.addChild(rightarm7);
			setRotationAngle(rightarm7, -0.3492F, -0.374F, 1.1043F);
			rightarm7.setTextureOffset(9, 253).addBox(-33.5F, -10.5F, -13.0F, 39.0F, 22.0F, 23.0F, 0.0F, true);
			horns15 = new ModelRenderer(this);
			horns15.setRotationPoint(1.273F, -2.0992F, 5.9692F);
			rightarm7.addChild(horns15);
			setRotationAngle(horns15, -0.9548F, 0.6122F, 0.8424F);
			horns15.setTextureOffset(63, 45).addBox(-4.44F, -10.4557F, -2.44F, 8.0F, 12.0F, 8.0F, -1.0F, true);
			horns16 = new ModelRenderer(this);
			horns16.setRotationPoint(-0.4002F, -8.5747F, 2.2493F);
			horns15.addChild(horns16);
			setRotationAngle(horns16, -0.2764F, -0.0603F, 0.4765F);
			horns16.setTextureOffset(90, 22).addBox(-3.6832F, -7.3283F, -4.0748F, 8.0F, 9.0F, 7.0F, -1.0F, true);
			horns17 = new ModelRenderer(this);
			horns17.setRotationPoint(0.0F, -5.0F, 0.0F);
			horns16.addChild(horns17);
			setRotationAngle(horns17, 0.5824F, -0.1198F, 0.2914F);
			horns17.setTextureOffset(126, 12).addBox(-3.3745F, -7.2309F, -3.3776F, 6.0F, 9.0F, 6.0F, -1.0F, true);
			horns18 = new ModelRenderer(this);
			horns18.setRotationPoint(0.0F, -6.0F, 0.0F);
			horns17.addChild(horns18);
			setRotationAngle(horns18, 0.5672F, 0.0F, -0.3927F);
			horns18.setTextureOffset(80, 0).addBox(-2.604F, -8.2298F, -2.1978F, 5.0F, 10.0F, 4.0F, -1.0F, true);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-11.0656F, 0.5F, 4.1795F);
			rightarm7.addChild(bone7);
			bone7_r1 = new ModelRenderer(this);
			bone7_r1.setRotationPoint(-13.5899F, 7.701F, 5.4109F);
			bone7.addChild(bone7_r1);
			setRotationAngle(bone7_r1, 0.0F, -0.3491F, 0.0F);
			bone7_r1.setTextureOffset(19, 268).addBox(0.0899F, -16.701F, -10.9109F, 27.0F, 18.0F, 11.0F, 0.0F, true);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(-11.0656F, 0.5F, 4.1795F);
			rightarm7.addChild(bone8);
			bone8_r1 = new ModelRenderer(this);
			bone8_r1.setRotationPoint(-13.5899F, 7.701F, 5.4109F);
			bone8.addChild(bone8_r1);
			setRotationAngle(bone8_r1, 1.309F, -0.2182F, -0.6981F);
			bone8_r1.setTextureOffset(19, 270).addBox(2.7629F, -18.9046F, -5.1664F, 27.0F, 16.0F, 11.0F, 0.0F, true);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(-7.3696F, 1.6426F, 5.9245F);
			rightarm7.addChild(bone9);
			bone9_r1 = new ModelRenderer(this);
			bone9_r1.setRotationPoint(-13.5899F, -7.701F, 5.4109F);
			bone9.addChild(bone9_r1);
			setRotationAngle(bone9_r1, -1.309F, -0.2182F, 0.6981F);
			bone9_r1.setTextureOffset(15, 270).addBox(2.7629F, 2.9046F, -5.1664F, 27.0F, 16.0F, 11.0F, 0.0F, true);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(-31.9723F, -10.0689F, 0.6444F);
			rightarm7.addChild(bone10);
			setRotationAngle(bone10, 0.0F, 0.0F, -0.0873F);
			bone10_r1 = new ModelRenderer(this);
			bone10_r1.setRotationPoint(-1.0492F, -0.3541F, -0.1238F);
			bone10.addChild(bone10_r1);
			setRotationAngle(bone10_r1, 1.5708F, 0.0F, -0.1309F);
			bone10_r1.setTextureOffset(26, 267).addBox(-0.1023F, -11.029F, -10.8314F, 27.0F, 19.0F, 11.0F, 0.0F, true);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(-26.2974F, 11.7277F, -0.749F);
			rightarm7.addChild(bone11);
			setRotationAngle(bone11, 0.0F, 0.0F, 0.0873F);
			bone11_r1 = new ModelRenderer(this);
			bone11_r1.setRotationPoint(-1.0492F, 0.3541F, -0.1238F);
			bone11.addChild(bone11_r1);
			setRotationAngle(bone11_r1, -1.5708F, 0.0F, 0.1309F);
			bone11_r1.setTextureOffset(16, 267).addBox(-0.1023F, -7.971F, -10.8314F, 27.0F, 19.0F, 11.0F, 0.0F, true);
			rightarm8 = new ModelRenderer(this);
			rightarm8.setRotationPoint(-34.5F, -7.5F, 0.5F);
			rightarm7.addChild(rightarm8);
			setRotationAngle(rightarm8, 0.0F, 0.0F, -0.5672F);
			rightarm8.setTextureOffset(123, 228).addBox(-13.0F, -1.0F, -12.5F, 16.0F, 10.0F, 21.0F, 0.0F, true);
			dedo3 = new ModelRenderer(this);
			dedo3.setRotationPoint(-8.175F, 10.9247F, -12.9082F);
			rightarm8.addChild(dedo3);
			dedo3_r1 = new ModelRenderer(this);
			dedo3_r1.setRotationPoint(4.5489F, -0.8097F, -2.9386F);
			dedo3.addChild(dedo3_r1);
			setRotationAngle(dedo3_r1, 0.0F, -0.48F, 0.0F);
			dedo3_r1.setTextureOffset(13, 193).addBox(0.4511F, -3.1903F, -0.5614F, 5.0F, 8.0F, 7.0F, 0.0F, true);
			dedo4 = new ModelRenderer(this);
			dedo4.setRotationPoint(0.0F, 0.0F, 0.0F);
			dedo3.addChild(dedo4);
			dedo4.setTextureOffset(10, 148).addBox(-5.0F, -4.0F, -3.5F, 10.0F, 8.0F, 7.0F, 0.0F, true);
			dedos4 = new ModelRenderer(this);
			dedos4.setRotationPoint(-8.5F, 3.5F, 4.5F);
			rightarm8.addChild(dedos4);
			dedos4.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, true);
			dedos5 = new ModelRenderer(this);
			dedos5.setRotationPoint(-8.5153F, 3.2696F, -2.5673F);
			rightarm8.addChild(dedos5);
			dedos5.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, true);
			dedos6 = new ModelRenderer(this);
			dedos6.setRotationPoint(-8.5306F, 3.0391F, -9.6346F);
			rightarm8.addChild(dedos6);
			dedos6.setTextureOffset(12, 169).addBox(-4.41F, -0.37F, -2.92F, 8.0F, 12.0F, 6.0F, 0.0F, true);
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
			this.seeth6_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth6_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns10.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns10.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftleg8.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftleg7.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightarm8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.rightarm7.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone6_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.rightarm6.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.mouth3_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.mouth3_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.mouth2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.mouth2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftleg6.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.horns15.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftleg5.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.horns16.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns17.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns18.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns11.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns12.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns13.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.mouth3.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.mouth3.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns14.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns9.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns9.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns8.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns8.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns3.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns3.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns5.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns5.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone3_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns4.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns4.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns7.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns7.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.horns6.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns6.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftleg7_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.bone10_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone8_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.dedo2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.dedo3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.dedo4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.dedo2_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.seeth4_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth4_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone5.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone4.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone4.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone5_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone10.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone7.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone6.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone6.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone9.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone8.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone11.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone12.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone12.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftleg5_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightleg3_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone12_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone12_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightleg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightleg9.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.dedos2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.dedos6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.dedos5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.eyeslocked2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.eyeslocked2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.dedos4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg8_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.dedos3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone2_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.dedos.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.seeth2_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth2_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone7_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.mouth2_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.mouth2_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightleg9_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.horns.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.horns.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.eyeslocked.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.eyeslocked.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone4_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftleg6_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg4_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone11_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone11_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.dedo.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bone9_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.seeth3.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth3.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.seeth4.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth4.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.seeth5.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth5.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.seeth6.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth6.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.dedo3_r1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.seeth2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.seeth5_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.seeth5_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
