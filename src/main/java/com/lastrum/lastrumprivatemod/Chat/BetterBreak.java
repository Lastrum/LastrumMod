package com.lastrum.lastrumprivatemod.Chat;


import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BetterBreak {
    @SubscribeEvent
    public void onBreakline(ClientChatReceivedEvent event) {
        if (!l.c.betterBreak.get()) {
            return;
        }
        String msg = event.message.getUnformattedText();
        if (msg.startsWith("----") && msg.endsWith("-") && !msg.contains(" ")) {
            event.setCanceled(true);
            Chat.breakline();
        }
        if (msg.startsWith("\u25ac\u25ac\u25ac\u25ac") && !msg.contains(" ")) {
            event.setCanceled(true);
            Chat.breakline();
        }
    }
}



