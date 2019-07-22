package com.lastrum.lastrumprivatemod.Render;

import com.lastrum.lastrumprivatemod.Reference;
import com.lastrum.lastrumprivatemod.Render.Util.Chroma;
import com.lastrum.lastrumprivatemod.Render.Util.HudProperty.IRenderer;
import com.lastrum.lastrumprivatemod.Render.Util.HudProperty.ScreenPosition;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.m;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.awt.*;

public class HudRenderer implements IRenderer {
    public HudRenderer() {
        FontRenderer fontRenderer = Minecraft.getMinecraft().fontRendererObj;
    }

    @Override
    public void save(ScreenPosition position) {
        //TempConfig.X_1 = position.getRelativeX();
        //TempConfig.Y_1 = position.getRelativeY();
        l.c.watermarkX.setValue(position.getRelativeX());
        l.c.watermarkY.setValue(position.getRelativeY());

    }

    @Override
    public ScreenPosition load() {
        return ScreenPosition.fromRelativePosition(l.c.watermarkX.get(), l.c.watermarkY.get());
    }

    @Override
    public void render(ScreenPosition position) {
        //Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(p.c.hudText.get() + ChatColor.COLOR_CHAR + "f" + p.c.hud_text2.get(), position.getAbsoluteX(), position.getAbsoluteY(), Chroma.effect(i * 3500000L, brightness, 250).getRGB());
        testRender(position);
    }

    @Override
    public int getHeight() {
        return m.c.fontRendererObj.FONT_HEIGHT;
    }

    @Override
    public int getWidth() {
        return m.c.fontRendererObj.getStringWidth(l.c.hudText.get().replace("&",""));
    }

    @Override
    public void renderDummy(ScreenPosition position) {
        //Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(p.c.hudText.get() + ChatColor.COLOR_CHAR + "f" + p.c.hud_text2.get(), position.getAbsoluteX(), position.getAbsoluteY(), chroma.getRGB());
        testRender(position);
    }

    @SubscribeEvent
    public void onTickRender(TickEvent.ClientTickEvent event) {

    }

    private void testRender(ScreenPosition position) {
        if (l.c.chromaHud.get().equals(true)) {
            for (int i = 0; i < "a".length(); i++) {
                if (!l.c.framesPlusCompatbility.get()) {
                    m.c.fontRendererObj.drawStringWithShadow(l.c.hudText.get().replace("&", "\u00a7").replace("%s", Reference.MODVERSION), position.getAbsoluteX(), position.getAbsoluteY(), Chroma.effect(i * 3500000L, (float) 0.99, 250).getRGB());
                } else {
                    m.c.fontRendererObj.drawString(l.c.hudText.get().replace("&", "\u00a7").replace("%s",Reference.MODVERSION), position.getAbsoluteX(), position.getAbsoluteY(), Chroma.effect(i * 3500000L, (float) 0.99, 250).getRGB());
                }
            }
        } else {
            if (!l.c.framesPlusCompatbility.get()) {
                m.c.fontRendererObj.drawStringWithShadow(l.c.hudText.get().replace("&", "\u00a7").replace("%s",Reference.MODVERSION), position.getAbsoluteX(), position.getAbsoluteY(), Color.WHITE.getRGB());
            } else {
                m.c.fontRendererObj.drawString(l.c.hudText.get().replace("&", "\u00a7").replace("%s", Reference.MODVERSION), position.getAbsoluteX(), position.getAbsoluteY(), Color.WHITE.getRGB());
            }
        }
    }

}

