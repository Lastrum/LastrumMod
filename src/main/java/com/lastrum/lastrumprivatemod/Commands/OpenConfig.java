package com.lastrum.lastrumprivatemod.Commands;

import com.lastrum.lastrumprivatemod.LastrumCore;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.Arrays;
import java.util.List;

public class OpenConfig extends CommandBase {

    @Override
    public String getCommandName() {
        return "lastrummodconfig";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/lastrummodconfig";
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList("lmc","lastmodconfig","lmconfig","lastsettings","lastrumettings");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        LastrumCore.config.openGui();
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
}
