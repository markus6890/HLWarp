package com.gmail.markushygedombrowski.warp;

import com.gmail.markushygedombrowski.HLWarp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadWarpsCommands implements CommandExecutor {
    private HLWarp plugin;

    public ReloadWarpsCommands(HLWarp plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] strings) {
        if(!(commandSender.hasPermission("admin"))) {
            commandSender.sendMessage("§cDet har du ikke permission til!");
            return true;
        }
        commandSender.sendMessage("§aWarps er blevet reloaded!");
        plugin.reload();
        return true;
    }
}
