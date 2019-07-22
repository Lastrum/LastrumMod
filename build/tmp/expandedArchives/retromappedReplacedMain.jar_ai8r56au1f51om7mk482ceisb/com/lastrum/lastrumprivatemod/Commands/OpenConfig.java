package com.lastrum.lastrumprivatemod.Commands;

import com.lastrum.lastrumprivatemod.LastrumCore;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.Arrays;
import java.util.List;

public class OpenConfig extends CommandBase {

    @Override
    public String func_71517_b() {
        return "lastrummodconfig";
    }

    @Override
    public String func_71518_a(ICommandSender sender) {
        return "/lastrummodconfig";
    }

    @Override
    public List<String> func_71514_a() {
        return Arrays.asList("lmc","lastmodconfig","lmconfig","lastsettings","lastrumettings");
    }

    @Override
    public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
        LastrumCore.config.openGui();
    }

    @Override
    public boolean func_71519_b(ICommandSender sender) {
        return true;
    }
}