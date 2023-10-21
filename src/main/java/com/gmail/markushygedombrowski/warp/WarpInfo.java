package com.gmail.markushygedombrowski.warp;

import org.bukkit.Location;


public class WarpInfo {
    private String name;
    private Location location;
    private String worldName;



    public WarpInfo(String name, Location location, String worldName) {
        this.name = name;
        this.location = location;
        this.worldName = worldName;
    }

    public String getName() {
        return name;
    }
    public Location getLocation () {
        if(location.getWorld() == null) {
            location.setWorld(org.bukkit.Bukkit.getWorld(worldName));
        }
        return location;
    }



}
