package com.lastrum.lastrumprivatemod.Discord;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.RichPresence;
import com.lastrum.lastrumprivatemod.LastrumCore;
import com.lastrum.lastrumprivatemod.Reference;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.l;


import java.time.OffsetDateTime;

public class DiscordPresence {
    private static IPCClient ipcClient;

    public static void setup() {
        String image = l.c.richPresenceImage.get().toLowerCase();
        if (!l.c.richPresence.get()) {
            return;
        }
        if (l.c.badlionRichPresence.get()) {
            setBadlionRP();
            return;
        }
        if (!image.equals("blood") && !image.equals("sk1er") && !image.equals("turtlesong") && !image.equals("vector")) {
            setDefaultDiscordRP();
            return;
        }
        switch (image) {
            case "blood": {
                setDefaultDiscordRP();
                return;
            }
            case "sk1er": {
                setSk1erDiscordRP();
                return;
            }
            case "turtlesong":
                setTurtleSongDiscordRP();
                return;
            case "vector":
                setVectorDiscordRP();
                return;
            case "foundation":
                setFoundationDiscordRP();
                return;
            case "lastrum":
                setLastrumDiscordRP();
            default:
                setDefaultDiscordRP();
        }

    }

    private static void setDefaultDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setStartTimestamp(OffsetDateTime.now())
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setLargeImage("blood", "Bloodlust Guild Mod " + Reference.MODVERSION);
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setSk1erDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setStartTimestamp(OffsetDateTime.now())
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setSmallImage("blood","Bloodlust Guild Mod " + Reference.MODVERSION)
                        .setLargeImage("sk1er");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setTurtleSongDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setStartTimestamp(OffsetDateTime.now())
                        .setSmallImage("blood","Bloodlust Guild Mod " + Reference.MODVERSION)
                        .setLargeImage("turtlesong");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setVectorDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setStartTimestamp(OffsetDateTime.now())
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setSmallImage("blood","Bloodlust Guild Mod " + Reference.MODVERSION)
                        .setLargeImage("vector");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setFoundationDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setStartTimestamp(OffsetDateTime.now())
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setSmallImage("blood","Bloodlust Guild Mod " + Reference.MODVERSION)
                        .setLargeImage("foundation");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setLastrumDiscordRP() {
        (ipcClient = new IPCClient(546211670796795925L)).setListener(new IPCListener() {
            @Override
            public void onReady(IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setStartTimestamp(OffsetDateTime.now())
                        .setDetails(l.c.richPresenceDetails.get().replace("{player}", LastrumCore.startingAccountName))
                        .setState(l.c.richPresenceState.get().replace("{player}", LastrumCore.startingAccountName))
                        .setSmallImage("blood","Bloodlust Guild Mod " + Reference.MODVERSION)
                        .setLargeImage("lastrum");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        } catch (Throwable t) {
            t.getStackTrace();
        }
    }

    private static void setBadlionRP() {
        (ipcClient = new IPCClient(429296510363238400L)).setListener(new IPCListener() {
            @Override
            public void onReady(final IPCClient client) {
                final RichPresence.Builder builder = new RichPresence.Builder()
                        .setDetails("Playing Minecraft 1.8.9")
                        .setStartTimestamp(OffsetDateTime.now())
                        .setLargeImage("blc", "Using Badlion Client Minecraft Launcher");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            ipcClient.connect();
        }
        catch (Throwable t) {
            t.getStackTrace();
        }
    }

    static IPCClient getIpcClient() {
        return ipcClient;
    }
}