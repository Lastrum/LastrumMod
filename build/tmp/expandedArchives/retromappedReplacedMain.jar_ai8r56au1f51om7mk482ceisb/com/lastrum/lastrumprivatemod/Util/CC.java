package com.lastrum.lastrumprivatemod.Util;

import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.event.HoverEvent.Action;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

import net.minecraft.event.HoverEvent.Action;
public class CC {

    private final IChatComponent parent;

    private String text;
    private ChatStyle style;

    public CC(String text) {
        this(text, null, Inheritance.SHALLOW);
    }

    private CC(String text, IChatComponent parent, Inheritance inheritance) {
        this.parent = parent;
        this.text = text;

        switch (inheritance) {
            case DEEP:
                this.style = parent != null ? parent.func_150256_b() : new ChatStyle();
                break;
            default:
            case SHALLOW:
                this.style = new ChatStyle();
                break;
            case NONE:
                this.style = new ChatStyle().func_150238_a(null).func_150227_a(false).func_150217_b(false)
                        .func_150225_c(false).func_150228_d(false).func_150237_e(false)
                        .func_150241_a(null).func_150209_a(null).func_179989_a(null);
                break;
        }
    }

    public static CC of(String text) {
        return new CC(text);
    }

    public CC setColor(EnumChatFormatting color) {
        style.func_150238_a(color);
        return this;
    }

    public CC setBold(boolean bold) {
        style.func_150227_a(bold);
        return this;
    }

    public CC setItalic(boolean italic) {
        style.func_150217_b(italic);
        return this;
    }

    public CC setStrikethrough(boolean strikethrough) {
        style.func_150225_c(strikethrough);
        return this;
    }

    public CC setUnderlined(boolean underlined) {
        style.func_150228_d(underlined);
        return this;
    }

    public CC setObfuscated(boolean obfuscated) {
        style.func_150237_e(obfuscated);
        return this;
    }

    public CC setClickEvent(ClickEvent.Action action, String value) {
        style.func_150241_a(new ClickEvent(action, value));
        return this;
    }

    public CC setHoverEvent(String value) {
        return this.setHoverEvent(new ChatComponentText(value));
    }

    public CC setHoverEvent(IChatComponent value) {
        return this.setHoverEvent(Action.SHOW_TEXT, value);
    }

    public CC setHoverEvent(HoverEvent.Action action, IChatComponent value) {
        style.func_150209_a(new HoverEvent(action, value));
        return this;
    }

    public CC setInsertion(String insertion) {
        style.func_179989_a(insertion);
        return this;
    }

    public CC append(String text) {
        return this.append(text, Inheritance.SHALLOW);
    }

    public CC append(String text, Inheritance inheritance) {
        return new CC(text, this.build(), inheritance);
    }

    public IChatComponent build() {
        IChatComponent thisComponent = new ChatComponentText(text).func_150255_a(style);
        return parent != null ? parent.func_150257_a(thisComponent) : thisComponent;
    }

    public enum Inheritance {
        DEEP, SHALLOW, NONE
    }

}
