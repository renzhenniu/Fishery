package me.renzhenniu.fishery.commands;


import me.arcaniax.hdb.api.HeadDatabaseAPI;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;


public class TestingCommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            HeadDatabaseAPI h = new HeadDatabaseAPI();
            Player p = ((Player) sender).getPlayer();


            ItemStack cCrate = h.getItemHead(String.valueOf(4584));
            ItemMeta m = cCrate.getItemMeta();
            m.setDisplayName(ChatColor.WHITE+""+ChatColor.BOLD+"Common Crate");
            cCrate.setItemMeta(m);

            p.getInventory().addItem(cCrate);
        }
        return  true;
    }
}
