package com.lastrum.lastrumprivatemod.Discord;

import com.jagrosh.discordipc.entities.RichPresence;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class UpdateRP {
    private boolean richPresence = l.c.richPresence.get();
    private boolean badlionRichPresence = l.c.badlionRichPresence.get();

    private String currentDetails = l.c.richPresenceDetails.get();
    private String currentState = l.c.richPresenceState.get();
    private String currentImage = l.c.richPresenceImage.get();
    private RichPresence.Builder builder = new RichPresence.Builder();

    @SubscribeEvent
    public void onRichPresenceSettingsChanged(TickEvent.ClientTickEvent e) {
        if (richPresence != l.c.richPresence.get()) {
            if (l.c.richPresence.get()) {
                DiscordPresence.setup();
                richPresence = l.c.richPresence.get();
            } else {
                DiscordPresence.getIpcClient().close();
                richPresence = l.c.richPresence.get();
            }
        }

        if (badlionRichPresence != l.c.badlionRichPresence.get()) {
            DiscordPresence.getIpcClient().close();
            DiscordPresence.setup();
            badlionRichPresence = l.c.badlionRichPresence.get();
        }

        if (l.c.badlionRichPresence.get()) return;

        if (!currentDetails.equals(l.c.richPresenceDetails.get())) {
            //DiscordPresence.getIpcClient().sendRichPresence(builder);
            DiscordPresence.getIpcClient().close();
            DiscordPresence.setup();
            currentDetails = l.c.richPresenceDetails.get();
        }

        if (!currentState.equals(l.c.richPresenceState.get())) {
            DiscordPresence.getIpcClient().close();
            DiscordPresence.setup();
            currentState = l.c.richPresenceState.get();
        }

        if (!currentImage.equals(l.c.richPresenceImage.get())) {
            DiscordPresence.getIpcClient().close();
            DiscordPresence.setup();
            currentImage = l.c.richPresenceImage.get();
        }
    }
}