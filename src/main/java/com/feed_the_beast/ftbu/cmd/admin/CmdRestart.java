package com.feed_the_beast.ftbu.cmd.admin;

import com.feed_the_beast.ftbl.api.cmd.CommandLM;
import com.feed_the_beast.ftbl.api.cmd.CommandLevel;
import com.feed_the_beast.ftbl.util.FTBLib;
import latmod.lib.LMFileUtils;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import java.io.File;

public class CmdRestart extends CommandLM
{
    public CmdRestart()
    {
        super("restart", CommandLevel.OP);
    }

    public static void restart()
    {
        LMFileUtils.newFile(new File(FTBLib.folderMinecraft, "autostart.stamp"));
        FTBLib.getServer().initiateShutdown();
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender ics, String[] args) throws CommandException
    {
        restart();
    }
}