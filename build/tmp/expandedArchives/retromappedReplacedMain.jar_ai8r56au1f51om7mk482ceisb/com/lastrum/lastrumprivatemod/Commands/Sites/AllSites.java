package com.lastrum.lastrumprivatemod.Commands.Sites;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.CC;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.EnumChatFormatting;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllSites extends CommandBase {
    @Override
    public String func_71517_b() {
        return "sites";
    }

    @Override
    public String func_71518_a(ICommandSender sender) {
        return "/sites [player]";
    }

    @Override
    public List<String> func_71514_a() {
        final List<String> list = new ArrayList<>(Arrays.asList("site"));
        return list;
    }

    @Override
    public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 1) {
            Chat.error("/sites [player]");
            return;
        }
        if (Desktop.isDesktopSupported()) {
            //Plancke
            String urlplancke = "https://plancke.io/hypixel/stats/" + args[0];
            sender.func_145747_a(CC.of("\u00a7bPlancke: \u00a77\u00a7n" + urlplancke)
                    .setHoverEvent(CC.of("Click to open " + urlplancke)
                            .setColor(EnumChatFormatting.BLUE)
                            .build())
                    .setClickEvent(ClickEvent.Action.OPEN_URL,urlplancke)
                    .build());
            //Sk1er
            String urlsk1er = "https://sk1er.club/" + args[0];
            sender.func_145747_a(CC.of("\u00a7eSk1er: \u00a77\u00a7n" + urlsk1er)
                    .setHoverEvent(CC.of("Click to open " + urlsk1er)
                            .setColor(EnumChatFormatting.BLUE)
                            .build())
                    .setClickEvent(ClickEvent.Action.OPEN_URL,urlsk1er)
                    .build());
            //Notifly
            String urlnotifly = "https://notifly.zone/quests/" + args[0];
            sender.func_145747_a(CC.of("\u00a7aNotifly: \u00a77\u00a7n" + urlnotifly)
                    .setHoverEvent(CC.of("Click to open " + urlnotifly)
                            .setColor(EnumChatFormatting.BLUE)
                            .build())
                    .setClickEvent(ClickEvent.Action.OPEN_URL,urlnotifly)
                    .build());
            //Hypixel
            String urlhypixel = "https://hypixel.net/player/" + args[0];
            sender.func_145747_a(CC.of("\u00a76Hypixel: \u00a77\u00a7n" + urlhypixel)
                    .setHoverEvent(CC.of("Click to open " + urlhypixel)
                            .setColor(EnumChatFormatting.BLUE)
                            .build())
                    .setClickEvent(ClickEvent.Action.OPEN_URL,urlhypixel)
                    .build());
        } else {
            Chat.error("ERROR 001 has occurred, Contact Lastrum for help!");
        }
    }

    @Override
    public boolean func_71519_b(ICommandSender sender) {
        return true;
    }

    @Override
    public boolean func_82358_a(String[] args, int index) {
        return true;
    }
}
