package me.renzhenniu.fishery.listeners;


import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FishermanListener implements Listener {


    @EventHandler
    public void onRightClick(NPCRightClickEvent event) {

        NPC n = event.getNPC();
        Player p = event.getClicker();

        if (n.getName().equalsIgnoreCase("Fisherman")) {

            Inventory gui = Bukkit.createInventory(p, 27, "Fisherman");

            ItemStack sellClicker = new ItemStack(Material.COD);
            ItemMeta sellMeta = sellClicker.getItemMeta();
            assert sellMeta != null;
            sellMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Sell items");
            sellMeta.setCustomModelData(9);
            sellClicker.setItemMeta(sellMeta);

            ItemStack sellAllClicker = new ItemStack(Material.BARREL);
            ItemMeta sellAllMeta = sellClicker.getItemMeta();
            assert sellAllMeta != null;
            sellAllMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sell ALL items");
            sellAllClicker.setItemMeta(sellAllMeta);

            ItemStack exitMenu = new ItemStack(Material.BARRIER);
            ItemMeta exitMenuMeta = sellClicker.getItemMeta();
            assert exitMenuMeta != null;
            exitMenuMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Exit Menu");
            exitMenu.setItemMeta(exitMenuMeta);

            gui.setItem(11, sellClicker);
            gui.setItem(13, sellAllClicker);
            gui.setItem(15, exitMenu);

            p.openInventory(gui);
        }

    }
}