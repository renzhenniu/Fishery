package me.renzhenniu.fishery;

import me.renzhenniu.fishery.commands.SellGUICommand;
import me.renzhenniu.fishery.commands.TestingCommand;
import me.renzhenniu.fishery.listeners.CatchFishListener;
import me.renzhenniu.fishery.listeners.CrateOpenListener;
import me.renzhenniu.fishery.listeners.FishermanListener;
import me.renzhenniu.fishery.listeners.SellGUIListener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fishery extends JavaPlugin {

    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy econ = null;




    @Override
    public void onDisable() {
        log.info(String.format("[%s] Disabled Version %s", getDescription().getName(), getDescription().getVersion()));
    }

    @Override
    public void onEnable() {

        if (!setupEconomy()) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        if(getServer().getPluginManager().getPlugin("Citizens") == null || !getServer().getPluginManager().getPlugin("Citizens").isEnabled()) {
            getLogger().log(Level.SEVERE, "Citizens 2.0 not found or not enabled");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Bukkit.getPluginManager().registerEvents(new CatchFishListener(), this);
        Bukkit.getPluginManager().registerEvents(new SellGUIListener(), this);
        Bukkit.getPluginManager().registerEvents(new FishermanListener(), this);
        Bukkit.getPluginManager().registerEvents(new CrateOpenListener(), this);
        getCommand("gui").setExecutor(new SellGUICommand());
        getCommand("test").setExecutor(new TestingCommand());

    }


    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public static Economy getEconomy() {
        return econ;
    }
    }
