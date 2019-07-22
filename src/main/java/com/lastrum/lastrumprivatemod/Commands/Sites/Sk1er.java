package com.lastrum.lastrumprivatemod.Commands.Sites;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import com.lastrum.lastrumprivatemod.Util.CC;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.EnumChatFormatting;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Sk1er extends CommandBase {
    @Override
    public String getCommandName() {
        return "sk1er";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/sk1er [player]";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 1) {
            Chat.error("/sk1er [player]");
            return;
        }
        if (Desktop.isDesktopSupported()) {
            String url = "https://sk1er.club/" + args[0];
           try {
               Desktop.getDesktop().browse(new URI(url));
           } catch (URISyntaxException | IOException e) {
               e.printStackTrace();
               Chat.error("Unexpected error occurred.");
           }
            sender.addChatMessage(CC.of("\u00a7eSk1er: \u00a77\u00a7n" + url)
                    .setHoverEvent(CC.of("Click to open " + url)
                            .setColor(EnumChatFormatting.BLUE)
                            .build())
                    .setClickEvent(ClickEvent.Action.OPEN_URL,url)
                    .build());
        } else {
            Chat.error("ERROR 001 has occurred, Contact Lastrum for help!");
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return true;
    }
}
