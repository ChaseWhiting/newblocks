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

import net.mcreator.newblocks.entity.DarkMagicWizardEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EvokerRenderer;
import net.minecraft.client.renderer.entity.model.IllagerModel;

@OnlyIn(Dist.CLIENT)
public class DarkMagicWizardRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkMagicWizardEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new IllagerModel<>(0.0F, 0.0F, 64, 64), 0.5F) {
				

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/dark_magic_wizard.png");
					}
				};
			});
		}
	}
}

