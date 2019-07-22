package com.lastrum.lastrumprivatemod.Chat.Prefixs;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CustomCoopChat {
    @SubscribeEvent
    public void onCoopMessage(ClientChatReceivedEvent e) {
        String msg = e.message.func_150260_c();

        if (msg.toLowerCase().contains("co-op ") && msg.contains("> ") && msg.contains(":")) {
            String[] parts = msg.split(" ");
            String[] splitChatMsg = msg.split(">", 2);
            String chatMsg = splitChatMsg[1];

            if (parts[0].toLowerCase().contains("co-op")) {
                e.setCanceled(true);
                Chat.put(l.c.customCoopMessage.get().replace("&","\u00a7") + "\u00a7f" + chatMsg.replace("&","\u00a7"));
            }
        }
    }
}