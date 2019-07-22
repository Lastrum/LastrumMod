package com.lastrum.lastrumprivatemod.Chat.Prefixs;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CustomNPCChat {
    @SubscribeEvent
    public void onNpcChat(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();
        if (msg.startsWith("[NPC] ")) {
            String[] splitMsg = msg.split(" ");
            if (splitMsg[1].contains(":")) {
                String npcName = splitMsg[1].replace(":", "");
                String npcTextMsg = msg.replace("[NPC] ", "").replace(npcName, "");
                e.setCanceled(true);
                Chat.put(l.c.customNpcMessage.get().replace("&", "\u00a7").replace("%s", npcName) + "\u00a7f:" + npcTextMsg);
            }
        }
    }
}
