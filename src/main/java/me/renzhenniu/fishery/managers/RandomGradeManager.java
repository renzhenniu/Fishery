package me.renzhenniu.fishery.managers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class RandomGradeManager {

    Random rnd = new Random();
    public String Pristine = ChatColor.RED + ""+ChatColor.BOLD+"P" + ChatColor.GOLD + ""+ChatColor.BOLD+"R" + ChatColor.YELLOW + ""+ChatColor.BOLD+"I" + ChatColor.GREEN +""+ChatColor.BOLD+ "S" + ChatColor.AQUA +""+ChatColor.BOLD+ "T" + ChatColor.LIGHT_PURPLE +""+ChatColor.BOLD+ "I"+  ChatColor.RED +""+ChatColor.BOLD+ "N" + ChatColor.GOLD +""+ChatColor.BOLD+ "E";

    public String getGradeCommons() {
        int r = this.rnd.nextInt(11);
        System.out.println("Grademanager was called");
        switch (r) {
            case 1:
                return ChatColor.DARK_RED + "F";
            case 2:
            case 3:
                return ChatColor.RED + "D";
            case 6:
            case 7:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 9:
            case 10:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
            default:
                return ChatColor.GOLD + "C";
        }
    }


    public String getGradeUncommons() {
        int r = this.rnd.nextInt(12);
        switch (r) {
            case 1:
                return ChatColor.DARK_RED + "F";
            case 2:
            case 3:
                return ChatColor.RED + "D";
            case 6:
            case 7:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 9:
            case 10:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
            case 11:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A+";
            default:
                return ChatColor.GOLD + "C";
        }
    }
    public String getGradeRares() {
        int r = this.rnd.nextInt(13);
        switch (r) {
            case 1:
                return ChatColor.DARK_RED + "F";
            case 2:
            case 3:
                return ChatColor.RED + "D";
            case 6:
            case 7:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 9:
            case 10:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
            case 11:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A+";
            case 12:
                return ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "A++";
            default:
                return ChatColor.GOLD + "C";
        }
    }
    public String getGradeEpics() {
        int r = this.rnd.nextInt(13);
        switch (r) {
            case 1:
            case 2:
            case 3:
                return ChatColor.RED + "D";
            case 6:
            case 7:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 9:
            case 10:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
            case 11:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A+";
            case 12:
                return ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "A++";
            default:
                return ChatColor.GOLD + "C";
        }
    }
    public String getGradeLegendaries() {
        int r = this.rnd.nextInt(14);
        switch (r) {
            case 2:
            case 3:
            case 6:
            case 7:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 9:
            case 10:
            case 1:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
            case 11:
            case 13:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A+";
            case 12:
                return ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "A++";
            default:
                return ChatColor.GOLD + "C";
        }
    }
    public String getGradeMythics() {
        int r = this.rnd.nextInt(10);
        switch (r) {
            case 1:
                return ChatColor.GOLD + "C";
            case 2:
                return ChatColor.YELLOW + "" + ChatColor.BOLD + "B";
            case 5:
            case 6:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A+";
            case 7:
                return ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "A++";
            case 8:
            case 9:
                return Pristine;

                default:
                return ChatColor.GREEN + "" + ChatColor.BOLD + "A";
        }
    }
    public double getGrade(ItemStack i) {
        if (i != null && i.hasItemMeta() && i.getItemMeta() != null && i.getItemMeta().getLore() != null) {
            if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.DARK_RED + "F")) {
                return 0.5;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.RED + "D")) {
                return 0.8;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.GOLD + "C")) {
                return 0.9;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.YELLOW + "" + ChatColor.BOLD + "B")) {
                return 1;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.GREEN + "" + ChatColor.BOLD + "A")) {
                return 1.1;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.GREEN + "" + ChatColor.BOLD + "A+")) {
                return 1.3;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ChatColor.AQUA + "" + ChatColor.BOLD +"" + ChatColor.ITALIC + "A++")) {
                return 1.5;
            }else if (i.getItemMeta().getLore().contains(ChatColor.YELLOW+"Grade: "+ Pristine)) {
                return 2.5;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}


