package com.lastrum.lastrumprivatemod.Chat.Prefixs;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CustomGuildChat {
    @SubscribeEvent
    public void onGuildMessage(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if (msg.toLowerCase().contains("guild ") && msg.toLowerCase().contains("> ") && msg.toLowerCase().contains(":")) {
            String[] parts = msg.split(" ");
            String[] splitChatMsg = msg.split(">", 2);
            String chatMsg = splitChatMsg[1];

            if (parts[0].toLowerCase().contains("guild")) {
                e.setCanceled(true);
                Chat.put(l.c.customGuildMessage.get().replace("&","\u00a7") + "\u00a7f" + chatMsg.replace("&","\u00a7"));
            }
        }
    }
}
