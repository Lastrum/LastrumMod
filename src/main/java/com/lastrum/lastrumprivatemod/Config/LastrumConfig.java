package com.lastrum.lastrumprivatemod.Config;

import com.lastrum.lastrumprivatemod.Render.Util.TempConfig;
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
            .setDisplayName("Hypixel API Key")
            .setDescription("Your Hypixel API Key.\nRequired for all API related features in the mod.\nDo not share this with anyone.")
            .setShowInHud(true)
            .build();

    // #CHAT
    public Value<Boolean> betterBreak = Value.Builder.create(true)
            .setCategory("Chat")
            .setDisplayName("BetterBreak")
            .setDescription("Changes the breaklines in chat to better, smoother lines.\nEx:\n\u00a7a------\nbecomes vv\n\u00a7a\u00a7m------")
            .setShowInHud(true)
            .build();

    public Value<String> customOfficerMessage = Value.Builder.create("&4O >")
            .setCategory("Chat")
            .setDisplayName("Officer Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a73Officer >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customGuildMessage = Value.Builder.create("&aG >")
            .setCategory("Chat")
            .setDisplayName("Guild Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a72Guild >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customPartyMessage = Value.Builder.create("&9P >")
            .setCategory("Chat")
            .setDisplayName("Party Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a79Party >\u00a7f chat prefix.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customCoopMessage = Value.Builder.create("&6CO >")
            .setCategory("Chat")
            .setDisplayName("Co-op Chat Prefix")
            .setDescription("Custom prefix to replace the \u00a7bCo-op >\u00a7f chat prefix in SkyBlock.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)")
            .setShowInHud(true)
            .build();

    public Value<String> customNpcMessage = Value.Builder.create("&6[NPC] %s")
            .setCategory("Chat")
            .setDisplayName("NPC Chat Prefix \u00a7c[Broken]")
            .setDescription("Custom prefix to replace the \u00a7e[NPC] John\u00a7f chat prefix in Skyblock and lobbies.\nColour codes are supported with & (Ex: \u00a7c&c\u00a7f)\n%s = NPC name.\nThis replaces everything before the ':'")
            .setShowInHud(true)
            .build();

    // #ANNOUNCMENTS
    public Value<Boolean> visibleBroadcasts = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("Guild Announcements")
            .setDescription("If this is off you will not see any guild announcements")
            .setShowInHud(true)
            .build();

    public Value<Boolean> autoWelcomeNewPlayers = Value.Builder.create(false)
            .setCategory("Guild Announcements")
            .setDisplayName("Auto-Welcome New Players")
            .setDescription("Sends a welcome message in guild chat when a player joins the guild.")
            .setShowInHud(true)
            .build();

    public Value<String> welcomeMessage = Value.Builder.create("Welcome to {Guild Name} %s")
            .setCategory("Guild Announcements")
            .setDisplayName("Welcome Message")
            .setDescription("If enabled, then message sent when a player joins the guild.\n%s = Player")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastAchievements = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("Announce Achievements")
            .setDescription("Announces in guild chat when you get an achievement.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastLevels = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("Announce Level Ups")
            .setDescription("Announces in guild chat when you level up.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastBoosters = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("Announce Boosters")
            .setDescription("Announces in guild chat when you queue a booster.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> broadcastWeeklyQuests = Value.Builder.create(true)
            .setCategory("Guild Announcements")
            .setDisplayName("Announce Weekly Quests")
            .setDescription("Sends a message in guild chat when you complete a weekly quest")
            .setShowInHud(true)
            .build();


    // #RENDER
    public Value<String> hudText = Value.Builder.create("&rLastrum&f &8%s")
            .setCategory("Render")
            .setDisplayName("HUD Text")
            .setDescription("What the text in the top corner says.\nSupports colour codes.\nIf enabled, use &r for rainbow.\n%s = Current Mod Version")
            .setShowInHud(true)
            .build();

    public Value<Boolean> chromaHud = Value.Builder.create(true)
            .setCategory("Render")
            .setDisplayName("Rainbow HUD")
            .setDescription("Enables rainbow text in the HUD and Main Menu.")
            .setShowInHud(true)
            .build();

    public Value<Boolean> colouredGuildTag = Value.Builder.create(true)
            .setCategory("Render")
            .setDisplayName("Coloured Guild Tag")
            .setDescription("Makes Knights's guild tag to whatever colour you want (set below) instead of ugly yellow.")
            .setShowInHud(true)
            .build();

    public Value<String> guildTagColour = Value.Builder.create("4")
            .setCategory("Render")
            .setDisplayName("Guild Tag Colour")
            .setDescription("Colour code for the guild tag (one character only)")
            .setShowInHud(true)
            .build();

    // #MISC
    public Value<Double> watermarkX = Value.Builder.create(TempConfig.X_1)
            .setCategory("x")
            .setDisplayName("wmx")
            .setDescription("")
            .setShowInHud(false)
            .build();

    public Value<Double> watermarkY = Value.Builder.create(TempConfig.Y_1)
            .setCategory("x")
            .setDisplayName("wmy")
            .setDescription("")
            .setShowInHud(false)
            .build();

    // #SYSTEM
    public Value<Boolean> framesPlusCompatbility = Value.Builder.create(false)
            .setCategory("System")
            .setDisplayName("Frames+ Compatibility")
            .setDescription("Frames+ 2.0 conflicts with the Bloodlust Guild Mod. Please enable this feature if you are using Frames+.\nYou can ignore this if you are not :)")
            .setShowInHud(false)
            .build();
}
