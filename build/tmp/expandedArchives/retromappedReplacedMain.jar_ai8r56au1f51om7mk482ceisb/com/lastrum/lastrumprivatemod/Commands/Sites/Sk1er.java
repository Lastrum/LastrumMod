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
    public String func_71517_b() {
        return "sk1er";
    }

    @Override
    public String func_71518_a(ICommandSender sender) {
        return "/sk1er [player]";
    }

    @Override
    public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
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
            sender.func_145747_a(CC.of("\u00a7eSk1er: \u00a77\u00a7n" + url)
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
    public boolean func_71519_b(ICommandSender sender) {
        return true;
    }

    @Override
    public boolean func_82358_a(String[] args, int index) {
        return true;
    }
}
