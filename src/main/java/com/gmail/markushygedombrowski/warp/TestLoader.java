package com.gmail.markushygedombrowski.warp;

import com.gmail.markushygedombrowski.utils.ConfigManagerWarp;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class TestLoader {

    private final Map<String, WarpInfo> warpMap = new HashMap<>();
    private final JavaPlugin plugin;
    private ConfigManagerWarp configM;

    public TestLoader(JavaPlugin plugin, ConfigManagerWarp configM) {
        this.plugin = plugin;
        this.configM = configM;
    }

    public void load() {

    }
}
