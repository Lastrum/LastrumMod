package com.lastrum.lastrumprivatemod.Chat.Announcements;


import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Level {

    @SubscribeEvent
    public void onLevelUp(ClientChatReceivedEvent e) {
        String msg = e.message.func_150260_c();
        if (l.c.broadcastLevels.get().equals(true)) {
            if (msg.contains("You are now Hypixel Level ")) {
                String[] splitMsg = msg.split("now");
                Chat.send("/gc >> I just leveled up. I am" + splitMsg[1]);
            }
        }
    }
}
