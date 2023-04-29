package com.gmail.markushygedombrowski;

import com.gmail.markushygedombrowski.utils.ConfigManagerWarp;
import com.gmail.markushygedombrowski.warp.ReloadWarpsCommands;
import com.gmail.markushygedombrowski.warp.WarpCommand;
import com.gmail.markushygedombrowski.warp.WarpManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class HLWarp extends JavaPlugin {
    private WarpManager warpManager;
    private ConfigManagerWarp configManagerWarp;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        loadConfigManager();
        System.out.println("HLWarp enabled");
        initWarps();
        ReloadWarpsCommands reloadWarpsCommands = new ReloadWarpsCommands(this);
        getCommand("hlwarpreload").setExecutor(reloadWarpsCommands);
    }

    @Override
    public void onDisable() {
        System.out.println("HLWarp disabled");
    }

    private void initWarps() {
        warpManager = new WarpManager(this, configManagerWarp);
        warpManager.load();
        WarpCommand warpCommand = new WarpCommand(warpManager, this);
        getCommand("hlwarp").setExecutor(warpCommand);
    }
    public void loadConfigManager() {
        configManagerWarp = new ConfigManagerWarp();
        configManagerWarp.setup();
        configManagerWarp.saveWarps();
        configManagerWarp.reloadWarps();

    }
    public void reload() {
        reloadConfig();
        FileConfiguration config = getConfig();
        loadConfigManager();
        configManagerWarp.reloadWarps();
        warpManager.load();

    }
}
