package com.lastrum.lastrumprivatemod.Render.Util.Font;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FontManager {

    public enum FontType {
        TAHOMA("tahoma_bold"),
        TAHOMA_BOLD("tahoma_bold");

        public String name;

        FontType(String name) {
            this.name = name;
        }
    }

    private static Map<Integer, MinecraftFontRenderer> fontRendererMap = new HashMap<>();

    public static MinecraftFontRenderer getFont(int size, FontType fontType) {
        //		if(fontType == FontType.TAHOMA){
        if (!fontRendererMap.containsKey(size)) {
            MinecraftFontRenderer fr = fontFromTTF(new ResourceLocation("blood/font/"+fontType.name+".ttf"), 0, size);
            fontRendererMap.put(size, fr);
            return fr;
        } else {
            return fontRendererMap.get(size);
        }
    }

    public static MinecraftFontRenderer findFont(float width, float height, String s, FontType fontType) {
        MinecraftFontRenderer renderer = getFont(2, fontType);
        int fontSize = 3;
        for (int i = 0; i < 100; i++) {
            MinecraftFontRenderer testRenderer = getFont(fontSize, fontType);
            if (testRenderer.getStringWidth(s) > width || testRenderer.getStringHeight(s) > height) {
                break;
            }
            renderer = testRenderer;
            fontSize++;
        }
        return renderer;
    }

    public static MinecraftFontRenderer fontFromTTF(ResourceLocation fontLocation, int fontType, float fontSize) {
        Font output = null;
        try {
            output = Font.createFont(fontType,
                    Minecraft.getMinecraft().getResourceManager().getResource(fontLocation).getInputStream());
            output = output.deriveFont(fontSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MinecraftFontRenderer fr = new MinecraftFontRenderer();
        fr.setFont(output, true);
        return fr;
    }

}
