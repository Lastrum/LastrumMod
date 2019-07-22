package com.lastrum.lastrumprivatemod.Config;

import com.orangemarshall.config.ConfigHolder;
import com.orangemarshall.config.value.Value;

public class LastrumConfig extends ConfigHolder {
    public static final LastrumConfig getConfig = new LastrumConfig();

    private LastrumConfig(){
        if (getConfig != null) {
            throw new IllegalStateException("Error");
        }
    }

    // #API
    public Value<String> userApiKey = Value.Builder.create("")
            .setCategory("API")
            .setDisplayName("\u00a77Hypixel API Key")
            .setDescription("Your Hypixel API Key.\nRequired for all API related features in the mod.\nDo not share this with anyone.")
            .setShowInHud(true)
            .build();

    // #CHAT
    public Value<Boolean> betterBreak = Value.Builder.create(true)
            .setCategory("Chat")
            .setDisplayName("\u00a77BetterBreak")
            .setDescription("Changes the breaklines in chat to better, smoother lines.\nEx:\n\u00a7a------\nbecomes vv\n\u00a7a\u00a7m------")
            .setShowInHud(true)
            .build();

    public Value<String> customOfficerMessage = Value.Builder.create("&4O >")
            .setCategory("Chat")
            .setDisplayName("\u00a77Officer Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a73Officer >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customGuildMessage = Value.Builder.create("&aG >")
            .setCategory("Chat")
            .setDisplayName("\u00a77Guild Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a72Guild >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customPartyMessage = Value.Builder.create("&9P >")
            .setCategory("Chat")
            .setDisplayName("\u00a77Party Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a79Party >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customCoopMessage = Value.Builder.create("&6CO >")
            .setCategory("Chat")
            .setDisplayName("\u00a77Co-op Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a7bCo-op >\u00a7f chat prefix in SkyBlock.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customNpcMessage = Value.Builder.create("&6[NPC] %s")
            .setCategory("Chat")
            .setDisplayName("\u00a77NPC Chat Prefix \u00a7c[Broken]")
            .setDescription("Custom prefix to replace the \u00a7e[NPC] John\u00a7f chat prefix in Skyblock and lobbies.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)\n%s = NPC name.\nThis replaces everything before the ':'")
            .setShowInHud(true)
            .build();

    // #ANNOUNCMENTS
    public Value<Boolean> visibleBroadcasts = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Guild Announcements")
            .setDescription("If this is off you will not see any guild announcements")
            .setShowInHud(true)
            .build();

    public Value<Boolean> autoWelcomeNewPlayers = Value.Builder.create(false)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Auto-Welcome New Players")
            .setDescription("Sends a welcome message in guild chat when a player joins the guild.")
            .setShowInHud(true)
            .build();

    public Value<String> welcomeMessage = Value.Builder.create("Welcome to {Guild Name} %s")
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Welcome Message")
            .setDescription("If enabled, then message sent when a player joins the guild.\n%s = Player")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastAchievements = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Announce Achievements")
            .setDescription("Announces in guild chat when you get an achievement.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastLevels = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Announce Level Ups")
            .setDescription("Announces in guild chat when you level up.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastBoosters = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Announce Boosters")
            .setDescription("Announces in guild chat when you queue a booster.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastWeeklyQuests = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("\u00a77Announce Weekly Quests")
            .setDescription("Sends a message in guild chat when you complete a weekly quest\n[untested]")
            .setShowInHud(true)
            .build();

    // #DISCORD
    public Value<Boolean> richPresence = Value.Builder.create(true)
            .setCategory("Discord")
            .setDisplayName("\u00a77Rich Presence \u00a76[Coming Soon!]")
            .setDescription("Toggles Discord RPC.")
            .setShowInHud(true)
            .build();

}