package com.lastrum.lastrumprivatemod.Commands;

import com.lastrum.lastrumprivatemod.LastrumCore;
import com.lastrum.lastrumprivatemod.Reference;
import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LastrumCommand extends CommandBase {


    @Override
    public String func_71517_b() {
        return "lastrummod";
    }

    @Override
    public String func_71518_a(ICommandSender sender) {
        return "/lastrummod";
    }



    @Override
    public List<String> func_71514_a() {
       final List<String> list = new ArrayList<>(Arrays.asList("lm", "lastmod"));
       return list;
    }

    @Override
    public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 1) {
            Chat.error("/lastrummod [help/config/info]");
            return;
        }
        switch (args[0]) {
            case "help": {
                Chat.breakline();
                Chat.put("\u00a73/lastrum info \u00a77- Opens info page.");
                Chat.put("\u00a73/lastrum help \u00a77- Opens help page.");
                Chat.put("\u00a73/sites [Player] \u00a77- Opens sites page which shows all links with [player]'s name.");
                Chat.put("\u00a73/plancke [player] \u00a77- Bring you to plancke with the [player]'s name.");
                Chat.put("\u00a73/sk1er [player] \u00a77- Bring you to sk1er with the [player]'s name.");
                Chat.put("\u00a73/notifly [player] \u00a77- Bring you to notifly with the [player]'s name.");
                Chat.put("\u00a73/hypixel [player] \u00a77- Bring you to hypixel with the [player]'s name.");
                Chat.breakline();
                return;
            }
            case "config": {
                LastrumCore.config.openGui();
                return;
            }
            case "info": {
                Chat.breakline();
                Chat.put("\u00a73                        Lastrum Mod");
                Chat.put("\u00a73 Version: \u00a77" + Reference.MODVERSION);
                Chat.put("\u00a73 Developer: \u00a77Lastrum");
                Chat.put("\u00a73 Description: \u00a77Some Cool Private Mod");
                Chat.breakline();
                return;
            }

        }
    }

    @Override
    public boolean func_71519_b(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> func_180525_a(ICommandSender sender, String[] args, BlockPos pos) {
        final List<String> list = new ArrayList<String>(Arrays.asList("help", "config", "info"));
        return ((args.length == 1) ? func_71530_a(args, (String[]) list.toArray(new String[0])) : null);
    }


}