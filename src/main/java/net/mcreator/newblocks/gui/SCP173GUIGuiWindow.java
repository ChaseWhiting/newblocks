
package net.mcreator.newblocks.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SCP173GUIGuiWindow extends ContainerScreen<SCP173GUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SCP173GUIGui.guistate;

	public SCP173GUIGuiWindow(SCP173GUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("new_blocks:textures/screens/scp_173_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "It is constructed from concrete", 7, 14, -12829636);
		this.font.drawString(ms, "and rebar with traces of", 26, 31, -12829636);
		this.font.drawString(ms, "Krylon brand spray paint.", 22, 43, -12829636);
		this.font.drawString(ms, "SCP-173 is animate and", 32, 57, -12829636);
		this.font.drawString(ms, "extremely hostile. The ", 31, 69, -12829636);
		this.font.drawString(ms, "object cannot move while", 27, 83, -12829636);
		this.font.drawString(ms, "within a direct line", 9, 94, -12829636);
		this.font.drawString(ms, "of sight.", 117, 94, -12829636);
		this.font.drawString(ms, "Line of sight must not", 38, 106, -12829636);
		this.font.drawString(ms, "broken at any time", 50, 118, -12829636);
		this.font.drawString(ms, "Object is reported to attack by", 7, 127, -12829636);
		this.font.drawString(ms, "snapping the neck", 3, 139, -12829636);
		this.font.drawString(ms, "at the base of", 96, 139, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 104, this.guiTop + 150, 72, 20, new StringTextComponent("Next Page"), e -> {
			if (true) {
				NewBlocksMod.PACKET_HANDLER.sendToServer(new SCP173GUIGui.ButtonPressedMessage(0, x, y, z));
				SCP173GUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
