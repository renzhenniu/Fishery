package me.renzhenniu.fishery.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SellGUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {
        Player p = ((Player) sender).getPlayer();

        Inventory gui = Bukkit.createInventory(p, 27, "Fish Seller");

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

        assert p != null;
        p.openInventory(gui);

    }
        return true;
    }
}
