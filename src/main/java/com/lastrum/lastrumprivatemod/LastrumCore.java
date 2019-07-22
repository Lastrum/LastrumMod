package com.lastrum.lastrumprivatemod;


import com.lastrum.lastrumprivatemod.Chat.Announcements.*;
import com.lastrum.lastrumprivatemod.Chat.Prefixs.CustomCoopChat;
import com.lastrum.lastrumprivatemod.Chat.Prefixs.CustomGuildChat;
import com.lastrum.lastrumprivatemod.Chat.Prefixs.CustomNPCChat;
import com.lastrum.lastrumprivatemod.Chat.Prefixs.CustomPartyChat;
import com.lastrum.lastrumprivatemod.Commands.LastrumCommand;
import com.lastrum.lastrumprivatemod.Commands.OpenConfig;
import com.lastrum.lastrumprivatemod.Commands.PlayCommandTab;
import com.lastrum.lastrumprivatemod.Commands.Sites.*;
import com.lastrum.lastrumprivatemod.Config.LastrumConfig;
import com.lastrum.lastrumprivatemod.Keybinds.OpenConfigGui;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.m;
import com.lastrum.lastrumprivatemod.Events.ChatClickEvent;
import com.orangemarshall.config.Config;
import com.orangemarshall.config.ConfigApi;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.Keyboard;


@Mod(modid = Reference.MODID, version = Reference.MODVERSION)
public class LastrumCore {


    public static Config config;
    public static String startingAccountName = Reference.STOP;
    public static String startingAccountId = Reference.STOP;

    public static KeyBinding openConfigKey;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        EventBus EventBus = MinecraftForge.EVENT_BUS;
        ClientCommandHandler CommandHandler = ClientCommandHandler.instance;
        //GuiIngame ingameGUI = m.c.ingameGUI;
        RenderManager renderManager = m.c.getRenderManager();

        //Events
        EventBus.register(new ChatClickEvent());
        EventBus.register(new CustomCoopChat());
        EventBus.register(new CustomNPCChat());
        EventBus.register(new CustomPartyChat());
        EventBus.register(new CustomGuildChat());
        EventBus.register(new OpenConfigGui());
        EventBus.register(new Achievements());
        EventBus.register(new AutoWelcome());
        EventBus.register(new Level());
        EventBus.register(new Booster());
        EventBus.register(new WeeklyQuests());


        //Commands
        CommandHandler.registerCommand(new Plancke());
        CommandHandler.registerCommand(new Sk1er());
        CommandHandler.registerCommand(new Notifly());
        CommandHandler.registerCommand(new Hypixel());
        CommandHandler.registerCommand(new AllSites());
        CommandHandler.registerCommand(new LastrumCommand());
        CommandHandler.registerCommand(new OpenConfig());
        CommandHandler.registerCommand(new PlayCommandTab());


        //Resources

        //KeyBinds
        openConfigKey = new KeyBinding("Open Config", Keyboard.KEY_GRAVE,"LastrumMod");

        registerKeyBinds();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        config = ConfigApi.createAndLoad("\u00a73Lastrum Mod \u00a78" + Reference.MODVERSION,Reference.MODVERSION,event.getSuggestedConfigurationFile(), LastrumConfig.getConfig);
    }

    private void registerKeyBinds() {
        ClientRegistry.registerKeyBinding(openConfigKey);
    }

}


