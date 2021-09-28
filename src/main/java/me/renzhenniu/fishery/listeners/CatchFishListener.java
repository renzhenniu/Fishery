package me.renzhenniu.fishery.listeners;


import me.renzhenniu.fishery.managers.GetFishManager;
import me.renzhenniu.fishery.managers.GetItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class CatchFishListener implements Listener {

    @EventHandler
    public void onPlayerFish(PlayerFishEvent event) {

        GetItemManager i = new GetItemManager();
        GetFishManager g = new GetFishManager();
        Player player = event.getPlayer();
        Entity caught = event.getCaught();

        if (event.getState().equals(PlayerFishEvent.State.CAUGHT_FISH)) {
            if (caught != null && event.getCaught() instanceof Item) {
                Item c = (Item) event.getCaught();
                if (c.getItemStack().getType() == Material.COD) {
                    c.remove();
                    if (player.getInventory().firstEmpty() == -1) {
                        player.getWorld().dropItem(player.getPlayer().getLocation(), g.getFish());
                    } else {
                        player.getInventory().addItem(g.getFish());
                    }
                } else if (c.getItemStack().getType() == Material.SALMON) {
                    c.remove();
                    if (player.getInventory().firstEmpty() == -1) {
                        player.getWorld().dropItem(player.getPlayer().getLocation(), g.getFish());
                    } else {
                        player.getInventory().addItem(g.getFish());
                    }

                } else if (c.getItemStack().getType() == Material.TROPICAL_FISH) {
                    c.remove();
                    if (player.getInventory().firstEmpty() == -1) {
                        player.getWorld().dropItem(player.getPlayer().getLocation(), g.getFish());
                    } else {
                        player.getInventory().addItem(g.getFish());
                    }
                } else if (c.getItemStack().getType() == Material.PUFFERFISH) {
                    c.remove();
                    if (player.getInventory().firstEmpty() == -1) {
                        player.getWorld().dropItem(player.getPlayer().getLocation(), i.getItem());
                    } else {
                        player.getInventory().addItem(i.getItem());
                    }
                } else {
                    c.remove();
                    if (player.getInventory().firstEmpty() == -1) {
                        player.getWorld().dropItem(player.getPlayer().getLocation(), i.getItem());
                    } else {
                        player.getInventory().addItem(i.getItem());
                    }
                }
            }
        }
    }
}