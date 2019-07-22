package com.lastrum.lastrumprivatemod.Chat.Prefixs;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CustomOfficerChat {
    @SubscribeEvent
    public void onOfficerMessage(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if (msg.toLowerCase().contains("officer ") && msg.toLowerCase().contains("> ") && msg.toLowerCase().contains(":")) {
            String[] parts = msg.split(" ");
            String[] splitChatMsg = msg.split(">", 2);
            String chatMsg = splitChatMsg[1];

            if (parts[0].toLowerCase().contains("officer")) {
                e.setCanceled(true);
                Chat.put(l.c.customOfficerMessage.get().replace("&","\u00a7") + "\u00a7f" + chatMsg.replace("&","\u00a7"));
            }
        }
    }
}
