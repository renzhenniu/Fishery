package me.renzhenniu.fishery.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class CrateOpenListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerUse(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if (e.getItem().getType() == Material.PLAYER_HEAD) {
            if (e.getItem().getItemMeta() != null) {
                if (e.getItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE+""+ChatColor.BOLD+"Common Crate")) {
                    p.sendMessage("Yes!");
                }
            }
        }
    }
}