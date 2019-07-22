package com.lastrum.lastrumprivatemod.Chat.Announcements;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.m;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Achievements {
    @SubscribeEvent
    public void onAchGet(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if(msg.contains(">>") && msg.toLowerCase().contains("achievement unlocked:") && msg.contains("<<") && l.c.broadcastAchievements.get()) {

            String[] parts = msg.split(":");

            String ach = parts[1]
                    .replace("<<", "")
                    .replaceAll("6", "")
                    .replace("a ", "")
                    .replace("ka", "")
                    .replace("  ", " ");

            StringBuilder sb = new StringBuilder(ach);
            sb.replace(ach.lastIndexOf("e"), ach.lastIndexOf("e") + 1, "");
            ach = sb.toString();

            if (ach.contains("jack of")) {
                ach = ach.replace("jack","j\u2B4D\u2B4Da\u2B4Dc\u2B4Dk\u2B4D");
            }
            m.c.thePlayer.sendChatMessage("/gc >> I unlocked the" + ach + "achievement! <<");
        }
    }
}
