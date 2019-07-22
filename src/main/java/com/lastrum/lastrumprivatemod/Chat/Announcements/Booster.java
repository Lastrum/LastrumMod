package com.lastrum.lastrumprivatemod.Chat.Announcements;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.m;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class Booster {

    @SubscribeEvent
    public void onBoosterStack(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();
        if (l.c.broadcastBoosters.get()) {
            if (msg.startsWith("Your ") && msg.contains("Network Booster has been")) {
                String[] splitMsg = msg.split(" ");
                if (splitMsg[3].contains("Network")) {
                    m.c.thePlayer.sendChatMessage("/gc >> I just queued a " + splitMsg[1] + " " + splitMsg[2] + " booster <<");
                }
                if (splitMsg[2].contains("Network")) {
                    m.c.thePlayer.sendChatMessage("/gc >> I just queued a " + splitMsg[1] + " booster <<");
                }
            }
        }
    }
}