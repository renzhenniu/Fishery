package me.renzhenniu.fishery.listeners;

import me.renzhenniu.fishery.Fishery;
import me.renzhenniu.fishery.managers.RandomGradeManager;
import net.citizensnpcs.api.npc.NPC;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SellGUIListener implements Listener {

Economy economy = Fishery.getEconomy();

    public double getPrice(ItemStack item) {

        if (item != null && item.getItemMeta() != null && item.getType().equals(Material.COD)) {
            switch (item.getItemMeta().getCustomModelData()) {
                case 1:
                case 2:
                    return 50;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    return 70;
                case 12:
                case 13:
                case 14:
                case 15:
                    return 100;
                case 16:
                case 17:
                    return 120;
                case 18:
                case 19:
                case 20:
                case 21:
                    return 160;
                case 22:
                case 23:
                case 24:
                    return 200;
                case 25:
                    return 400;
                case 26:
                    return 500;
                case 27:
                    return 800;
                case 28:
                case 29:
                case 30:
                    return 1000;
                case 31:
                    return 1500;
                case 32:
                    return 2000;
                case 33:
                case 34:
                    return 2500;
                case 35:
                    return 3000;
                case 36:
                    return 4000;
                case 37:
                    return 5000;
                case 38:
                    return 10000;
                case 39:
                    return 15000;
                case 40:
                    return 30000;
                default:
                    return 0;
            }
        } else {
            return 0;
        }
    }

    private Inventory getGuiSell(Player p) {

        Inventory guiSell = Bukkit.createInventory(p, 54, "Sell Items");

        ItemStack ConfirmSell = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta ConfirmMeta = ConfirmSell.getItemMeta();
        assert ConfirmMeta != null;
        ConfirmMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Confirm");
        ConfirmSell.setItemMeta(ConfirmMeta);

        ItemStack Blank = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        ItemMeta BlankMeta = ConfirmSell.getItemMeta();
        assert BlankMeta != null;
        BlankMeta.setDisplayName(" ");
        Blank.setItemMeta(BlankMeta);

        ItemStack Back = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta BackMeta = Back.getItemMeta();
        assert BackMeta != null;
        BackMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        Back.setItemMeta(BackMeta);

        guiSell.setItem(45, Blank);
        guiSell.setItem(46, Blank);
        guiSell.setItem(47, Blank);
        guiSell.setItem(48, Blank);
        guiSell.setItem(49, ConfirmSell);
        guiSell.setItem(50, Blank);
        guiSell.setItem(51, Blank);
        guiSell.setItem(52, Blank);
        guiSell.setItem(53, Back);

        return guiSell;
    }


    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();
        String fisheryPrefix = ChatColor.YELLOW+ "["+ChatColor.GOLD+"Fishery"+ChatColor.GOLD+ "] " +ChatColor.WHITE+" ";
        String fishermanPrefix = ChatColor.YELLOW+ "["+ChatColor.GOLD+"Fisherman"+ChatColor.GOLD+ "] "+ChatColor.WHITE+"";
        RandomGradeManager gradeManager = new RandomGradeManager();

        if (e.getView().getTitle().equalsIgnoreCase("Fisherman")) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null) {

                if (e.getCurrentItem().getType().equals(Material.COD)) {
                    p.openInventory(getGuiSell(p));
                } else if (e.getCurrentItem().getType().equals(Material.BARREL)) {
                    Inventory guiConfirm = Bukkit.createInventory(p, 27, "Are you sure?");

                    ItemStack ConfirmSell = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
                    ItemMeta ConfirmMeta = ConfirmSell.getItemMeta();
                    assert ConfirmMeta != null;
                    ConfirmMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Confirm");
                    ConfirmSell.setItemMeta(ConfirmMeta);

                    ItemStack DeclineSell = new ItemStack(Material.RED_STAINED_GLASS_PANE);
                    ItemMeta DeclineMeta = DeclineSell.getItemMeta();
                    assert DeclineMeta != null;
                    DeclineMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Cancel");
                    DeclineSell.setItemMeta(DeclineMeta);

                    guiConfirm.setItem(11, ConfirmSell);
                    guiConfirm.setItem(15, DeclineSell);

                    p.openInventory(guiConfirm);
                } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                    p.closeInventory();
                }
            }
        } else if (e.getView().getTitle().equalsIgnoreCase("Are you sure?")) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null) {
                if (e.getCurrentItem().getType().equals(Material.LIME_STAINED_GLASS_PANE)) {
                    double finalPrice = 0;
                    for (int i = 0; i < 37; i++) {
                        ItemStack item = p.getInventory().getItem(i);
                        if (item != null && item.getItemMeta() != null && item.getItemMeta().hasCustomModelData()) {
                            if (item.getType() == Material.COD) {
                                int itemAmount = p.getInventory().getItem(i).getAmount();
                                for (int iAm = 0; iAm < itemAmount; iAm++) {
                                    finalPrice += (getPrice(item) * gradeManager.getGrade(item));
                                }

                                p.getInventory().remove(item);
                            }
                        }
                    }
                    if (finalPrice == 0) {
                        p.sendMessage(fisheryPrefix+ "You do not have any sellable items!");
                        p.closeInventory();
                    } else {
                        p.sendMessage(fisheryPrefix+ "You sold all your items for $" + finalPrice + "!");
                        economy.depositPlayer(p, finalPrice);
                        p.closeInventory();
                        finalPrice = 0;
                    }
                } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
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
        } else if (e.getView().getTitle().equalsIgnoreCase("Sell Items")) {
            Inventory iN = e.getClickedInventory();
            if (e.getCurrentItem() != null) {
                if (e.getCurrentItem().getType() == Material.LIME_STAINED_GLASS_PANE) {
                    double finalPrice = 0;
                    int finalAmount = 0;
                    e.setCancelled(true);
                    boolean isCancelled = false;
                    for (int i = 0; i < 45; i++) {
                        if (iN.getItem(i) != null) {
                            if (iN.getItem(i).getType() == Material.COD && iN.getItem(i).hasItemMeta()) {
                                ItemStack item = iN.getItem(i);
                                int itemAmount = item.getAmount();
                                finalAmount += itemAmount;
                                for (int iAm = 0; iAm < itemAmount; iAm++) {
                                    finalPrice += (getPrice(item) * gradeManager.getGrade(item));
                                }
                            } else {
                                isCancelled = true;
                                break;
                            }
                        }
                            }
                    if (!isCancelled) {
                        if (finalPrice == 0) {
                            p.sendMessage(fishermanPrefix+ "None of this will do! Bring me an actual fish!");
                        } else{
                            if (finalAmount == 1) {
                                p.sendMessage(fisheryPrefix+"You sold "+finalAmount+ " item for $" + finalPrice + "!");
                                p.closeInventory();
                                economy.depositPlayer(p, finalPrice);
                            } else {
                                p.sendMessage(fisheryPrefix+ "You sold "+finalAmount+ " items for $" + finalPrice + "!");
                                economy.depositPlayer(p, finalPrice);
                                p.closeInventory();
                            }

                        }
                    } else {
                        p.sendMessage(fishermanPrefix+ "No, no this wont do. I'll only take custom fish!!");
                    }

                        } else if ((e.getCurrentItem().getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE)) {
                    e.setCancelled(true);

                    } else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE) {

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
            }
        }

