package com.lastrum.lastrumprivatemod.Chat.Announcements;


import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AutoWelcome {
    @SubscribeEvent
    public void onPlayerJoinGuild(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if(msg.toLowerCase().contains("joined the guild!") && l.c.autoWelcomeNewPlayers.get().equals(true)) {
            String[] parts = msg.split("joined");
            String usernameJoined = parts[0];
            String[] usernameJoined2;
            if (usernameJoined.contains("[")) {
                usernameJoined2 = usernameJoined.split(" ");
                Chat.send("/gchat " + l.c.welcomeMessage.get().replace("%s",usernameJoined2[1]));
                return;
            }
            Chat.send("/gchat " + l.c.welcomeMessage.get().replace("%s",usernameJoined));
        }
    }
}