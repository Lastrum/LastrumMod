package com.lastrum.lastrumprivatemod.Chat.Announcements;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class WeeklyQuests {
    // \n&r&aWeekly Quest: TNT Run Completed!&r\n&r&7 &8+&36,000&7 &7Hypixel Experience&r\n&r&7 &8+&65,000&7 &7The TNT Games Coins&r\n&r
    @SubscribeEvent
    public void onWeeklyQuest(ClientChatReceivedEvent e) {
        String msg = e.message.func_150260_c();
        if (msg.contains("Weekly Quest:") && msg.contains("Completed!")) {
            String[] splitMsg = msg.split("Completed!",2);
            if (l.c.broadcastWeeklyQuests.get()) {
                Chat.send("/gc >> I completed " + splitMsg[0].replace("aW","W") + " <<");
            }
        } else if (msg.contains("Weekly:") && msg.contains("Completed!")) {
            String[] splitMsg = msg.split("Completed!",2);
            if (l.c.broadcastWeeklyQuests.get()) {
                Chat.send("/gc >> I completed " + splitMsg[0].replace("Weekly:","Weekly Quest:").replace("aW","W") + " <<");
            }
        }
    }
}
