package com.lastrum.lastrumprivatemod.Util.codeshortcuts;

import com.lastrum.lastrumprivatemod.Util.CC;
import com.lastrum.lastrumprivatemod.Util.ChatColor;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Chat {
    //public static final String PRFX = ChatColor.COLOR_CHAR + "8["
    //        + ChatColor.COLOR_CHAR + "3L"
    //        + ChatColor.COLOR_CHAR + "8] ";
    //
    //private static final String debugPRFX = ChatColor.COLOR_CHAR + "8["
    //        + ChatColor.COLOR_CHAR + "cD"
    //        + ChatColor.COLOR_CHAR + "8] ";

    public static void send(String message) {
        m.c.field_71439_g.func_71165_d(message);
    }

    public static void breakline() {
        if (l.c.betterBreak.get()) {
            m.c.field_71439_g.func_145747_a(CC.of("----------------------------------------------")
                    .setColor(EnumChatFormatting.BLUE)
                    .setStrikethrough(true)
                    .build());
        }
        else {
            m.c.field_71439_g.func_145747_a(CC.of("----------------------------------------------")
                    .setColor(EnumChatFormatting.BLUE)
                    .setStrikethrough(false)
                    .build());
        }
    }


    public static void put(final String chat) {
        m.c.field_71439_g.func_145747_a(new ChatComponentText(chat));
    }
    public static void prefix(final String msg) {
        m.c.field_71439_g.func_145747_a(new ChatComponentText(msg));
    }
    public static void error(final String msg) {
        m.c.field_71439_g.func_145747_a(new ChatComponentText(EnumChatFormatting.RED + msg));
    }


    public static String stripRank(String player) {
        String s = player
                .replace("[MVP+] ","")
                .replace("[MVP] ","")
                .replace("[VIP+] ","")
                .replace("[VIP] ","")
                .replace("[MVP++] ","")
                .replace("[HELPER] ","")
                .replace("[YOUTUBE] ","")
                .replace("[ADMIN] ","")
                .replace("[OWNER] ","")
                .replace("[MOD] ","")
                .replace("[MOJANG] ","");

        return ChatColor.stripColor(s);
    }
}
