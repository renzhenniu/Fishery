package me.renzhenniu.fishery.managers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GetFishManager {

    public ItemStack getFish() {

        RandomPullManager randomFish = new RandomPullManager();
        int r = randomFish.getFish();
        RandomGradeManager gradeGenerator = new RandomGradeManager();
        if (r <= 6) {
            if (r == 1) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack Anchovy = new ItemStack(Material.COD);
                ItemMeta meta = Anchovy.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Anchovy");
                meta.setLore(lore);
                meta.setCustomModelData(1);
                Anchovy.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(50 * gradeGenerator.getGrade(Anchovy)));
                meta.setLore(lore);
                Anchovy.setItemMeta(meta);
                return Anchovy;
            } else if (r == 2) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack WhiteLegShrimp = new ItemStack(Material.COD);
                ItemMeta meta = WhiteLegShrimp.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Whiteleg Shrimp");
                meta.setLore(lore);
                meta.setCustomModelData(2);
                WhiteLegShrimp.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(50 * gradeGenerator.getGrade(WhiteLegShrimp)));
                meta.setLore(lore);
                WhiteLegShrimp.setItemMeta(meta);
                return WhiteLegShrimp;
            } else if (r == 3) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack SilverCarp = new ItemStack(Material.COD);
                ItemMeta meta = SilverCarp.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Silver Carp");
                meta.setLore(lore);
                meta.setCustomModelData(3);
                SilverCarp.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(SilverCarp)));
                meta.setLore(lore);
                SilverCarp.setItemMeta(meta);
                return SilverCarp;
            } else if (r == 4) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack GrassCarp = new ItemStack(Material.COD);
                ItemMeta meta = GrassCarp.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Grass Carp");
                meta.setLore(lore);
                meta.setCustomModelData(4);
                GrassCarp.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(GrassCarp)));
                meta.setLore(lore);
                GrassCarp.setItemMeta(meta);
                return GrassCarp;
            } else if (r == 5) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack AtlanticCod = new ItemStack(Material.COD);
                ItemMeta meta = AtlanticCod.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Atlantic Cod");
                meta.setLore(lore);
                meta.setCustomModelData(5);
                AtlanticCod.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(AtlanticCod)));
                meta.setLore(lore);
                AtlanticCod.setItemMeta(meta);
                return AtlanticCod;
            } else if (r == 6) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack AlaskanPollock = new ItemStack(Material.COD);
                ItemMeta meta = AlaskanPollock.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Alaskan Pollock");
                meta.setLore(lore);
                meta.setCustomModelData(6);
                AlaskanPollock.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(AlaskanPollock)));
                meta.setLore(lore);
                AlaskanPollock.setItemMeta(meta);
                return AlaskanPollock;
            }
        } else if (r <= 12) {
            if (r == 7) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack GoldFish = new ItemStack(Material.COD);
                ItemMeta meta = GoldFish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Goldfish");
                meta.setLore(lore);
                meta.setCustomModelData(7);
                GoldFish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(GoldFish)));
                meta.setLore(lore);
                GoldFish.setItemMeta(meta);
                return GoldFish;
            } else if (r == 8) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack AtlanticMackerel = new ItemStack(Material.COD);
                ItemMeta meta = AtlanticMackerel.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Atlantic Mackerel");
                meta.setLore(lore);
                meta.setCustomModelData(8);
                AtlanticMackerel.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(AtlanticMackerel)));
                meta.setLore(lore);
                AtlanticMackerel.setItemMeta(meta);
                return AtlanticMackerel;
            } else if (r == 9) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack LargemouthBass = new ItemStack(Material.COD);
                ItemMeta meta = LargemouthBass.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Largemouth Bass");
                meta.setLore(lore);
                meta.setCustomModelData(9);
                LargemouthBass.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(LargemouthBass)));
                meta.setLore(lore);
                LargemouthBass.setItemMeta(meta);
                return LargemouthBass;
            } else if (r == 10) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack SmallmouthBass = new ItemStack(Material.COD);
                ItemMeta meta = SmallmouthBass.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Smallmouth Bass");
                meta.setLore(lore);
                meta.setCustomModelData(10);
                SmallmouthBass.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(SmallmouthBass)));
                meta.setLore(lore);
                SmallmouthBass.setItemMeta(meta);
                return SmallmouthBass;
            } else if (r == 11) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
                ItemStack Tilapia = new ItemStack(Material.COD);
                ItemMeta meta = Tilapia.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.WHITE + "Tilapia");
                meta.setLore(lore);
                meta.setCustomModelData(11);
                Tilapia.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(70 * gradeGenerator.getGrade(Tilapia)));
                meta.setLore(lore);
                Tilapia.setItemMeta(meta);
                return Tilapia;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack NeonTetra = new ItemStack(Material.COD);
                ItemMeta meta = NeonTetra.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Neon Tetra");
                meta.setLore(lore);
                meta.setCustomModelData(12);
                NeonTetra.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(100 * gradeGenerator.getGrade(NeonTetra)));
                meta.setLore(lore);
                NeonTetra.setItemMeta(meta);
                return NeonTetra;
            }
        } else if (r <= 18) {
            if (r == 13) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack FreshwaterTrout = new ItemStack(Material.COD);
                ItemMeta meta = FreshwaterTrout.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Freshwater Trout");
                meta.setLore(lore);
                meta.setCustomModelData(13);
                FreshwaterTrout.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(100 * gradeGenerator.getGrade(FreshwaterTrout)));
                meta.setLore(lore);
                FreshwaterTrout.setItemMeta(meta);
                return FreshwaterTrout;
            } else if (r == 14) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack PinkSalmon = new ItemStack(Material.COD);
                ItemMeta meta = PinkSalmon.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Pink Salmon");
                meta.setLore(lore);
                meta.setCustomModelData(14);
                PinkSalmon.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(100 * gradeGenerator.getGrade(PinkSalmon)));
                meta.setLore(lore);
                PinkSalmon.setItemMeta(meta);
                return PinkSalmon;
            } else if (r == 15) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack Tuna = new ItemStack(Material.COD);
                ItemMeta meta = Tuna.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Tuna");
                meta.setLore(lore);
                meta.setCustomModelData(15);
                Tuna.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(100 * gradeGenerator.getGrade(Tuna)));
                meta.setLore(lore);
                Tuna.setItemMeta(meta);
                return Tuna;
            } else if (r == 16) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack RedMullet = new ItemStack(Material.COD);
                ItemMeta meta = RedMullet.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Red Mullet");
                meta.setLore(lore);
                meta.setCustomModelData(16);
                RedMullet.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(120 * gradeGenerator.getGrade(RedMullet)));
                meta.setLore(lore);
                RedMullet.setItemMeta(meta);
                return RedMullet;
            } else if (r == 17) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeUncommons());
                ItemStack RedSnapper = new ItemStack(Material.COD);
                ItemMeta meta = RedSnapper.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GREEN + "Red Snapper");
                meta.setLore(lore);
                meta.setCustomModelData(17);
                RedSnapper.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(120 * gradeGenerator.getGrade(RedSnapper)));
                meta.setLore(lore);
                RedSnapper.setItemMeta(meta);
                return RedSnapper;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack Clownfish = new ItemStack(Material.COD);
                ItemMeta meta = Clownfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Clownfish");
                meta.setLore(lore);
                meta.setCustomModelData(18);
                Clownfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(160 * gradeGenerator.getGrade(Clownfish)));
                meta.setLore(lore);
                Clownfish.setItemMeta(meta);
                return Clownfish;
            }
        } else if (r <= 24) {
            if (r == 19) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack Angelfish = new ItemStack(Material.COD);
                ItemMeta meta = Angelfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Angel fish");
                meta.setLore(lore);
                meta.setCustomModelData(19);
                Angelfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(160 * gradeGenerator.getGrade(Angelfish)));
                meta.setLore(lore);
                Angelfish.setItemMeta(meta);
                return Angelfish;
            } else if (r == 20) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack Starfish = new ItemStack(Material.COD);
                ItemMeta meta = Starfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Starfish");
                meta.setLore(lore);
                meta.setCustomModelData(20);
                Starfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(160 * gradeGenerator.getGrade(Starfish)));
                meta.setLore(lore);
                Starfish.setItemMeta(meta);
                return Starfish;
            } else if (r == 21) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack OscarFish = new ItemStack(Material.COD);
                ItemMeta meta = OscarFish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Oscar Fish");
                meta.setLore(lore);
                meta.setCustomModelData(21);
                OscarFish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(160 * gradeGenerator.getGrade(OscarFish)));
                meta.setLore(lore);
                OscarFish.setItemMeta(meta);
                return OscarFish;
            } else if (r == 22) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack Catfish = new ItemStack(Material.COD);
                ItemMeta meta = Catfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Catfish");
                meta.setLore(lore);
                meta.setCustomModelData(22);
                Catfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(160 * gradeGenerator.getGrade(Catfish)));
                meta.setLore(lore);
                Catfish.setItemMeta(meta);
                return Catfish;
            } else if (r == 23) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack EuropeanEel = new ItemStack(Material.COD);
                ItemMeta meta = EuropeanEel.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "European Eel");
                meta.setLore(lore);
                meta.setCustomModelData(23);
                EuropeanEel.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(200 * gradeGenerator.getGrade(EuropeanEel)));
                meta.setLore(lore);
                EuropeanEel.setItemMeta(meta);
                return EuropeanEel;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeRares());
                ItemStack WalleyeFish = new ItemStack(Material.COD);
                ItemMeta meta = WalleyeFish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.AQUA + "Walleye Fish");
                meta.setLore(lore);
                meta.setCustomModelData(24);
                WalleyeFish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(200 * gradeGenerator.getGrade(WalleyeFish)));
                meta.setLore(lore);
                WalleyeFish.setItemMeta(meta);
                return WalleyeFish;
            }
        } else if (r <= 30) {
            if (r == 25) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack Jellyfish = new ItemStack(Material.COD);
                ItemMeta meta = Jellyfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Jellyfish");
                meta.setLore(lore);
                meta.setCustomModelData(25);
                Jellyfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(400 * gradeGenerator.getGrade(Jellyfish)));
                meta.setLore(lore);
                Jellyfish.setItemMeta(meta);
                return Jellyfish;
            } else if (r == 26) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack Sawfish = new ItemStack(Material.COD);
                ItemMeta meta = Sawfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Sawfish");
                meta.setLore(lore);
                meta.setCustomModelData(26);
                Sawfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(500 * gradeGenerator.getGrade(Sawfish)));
                meta.setLore(lore);
                Sawfish.setItemMeta(meta);
                return Sawfish;
            } else if (r == 27) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack Swordfish = new ItemStack(Material.COD);
                ItemMeta meta = Swordfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Swordfish");
                meta.setLore(lore);
                meta.setCustomModelData(27);
                Swordfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(800 * gradeGenerator.getGrade(Swordfish)));
                meta.setLore(lore);
                Swordfish.setItemMeta(meta);
                return Swordfish;
            } else if (r == 28) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack OceanSunfish = new ItemStack(Material.COD);
                ItemMeta meta = OceanSunfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Ocean Sunfish");
                meta.setLore(lore);
                meta.setCustomModelData(28);
                OceanSunfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(1000 * gradeGenerator.getGrade(OceanSunfish)));
                meta.setLore(lore);
                OceanSunfish.setItemMeta(meta);
                return OceanSunfish;
            } else if (r == 29) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack EuropeanSeaSturgeon = new ItemStack(Material.COD);
                ItemMeta meta = EuropeanSeaSturgeon.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "European Sea Sturgeon");
                meta.setLore(lore);
                meta.setCustomModelData(29);
                EuropeanSeaSturgeon.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(1000 * gradeGenerator.getGrade(EuropeanSeaSturgeon)));
                meta.setLore(lore);
                EuropeanSeaSturgeon.setItemMeta(meta);
                return EuropeanSeaSturgeon;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeEpics());
                ItemStack AtlanticSturgeon = new ItemStack(Material.COD);
                ItemMeta meta = AtlanticSturgeon.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Atlantic Sturgeon");
                meta.setLore(lore);
                meta.setCustomModelData(30);
                AtlanticSturgeon.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(1000 * gradeGenerator.getGrade(AtlanticSturgeon)));
                meta.setLore(lore);
                AtlanticSturgeon.setItemMeta(meta);
                return AtlanticSturgeon;
            }
        } else if (r <= 35) {
            if (r == 31) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeLegendaries());
                ItemStack AdriaticSturgeon = new ItemStack(Material.COD);
                ItemMeta meta = AdriaticSturgeon.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GOLD + "Adriatic Sturgeon");
                meta.setLore(lore);
                meta.setCustomModelData(31);
                AdriaticSturgeon.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(1500 * gradeGenerator.getGrade(AdriaticSturgeon)));
                meta.setLore(lore);
                AdriaticSturgeon.setItemMeta(meta);
                return AdriaticSturgeon;
            } else if (r == 32) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeLegendaries());
                ItemStack SakhalinSturgeon = new ItemStack(Material.COD);
                ItemMeta meta = SakhalinSturgeon.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sakhalin Sturgeon");
                meta.setLore(lore);
                meta.setCustomModelData(32);
                SakhalinSturgeon.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(2000 * gradeGenerator.getGrade(SakhalinSturgeon)));
                meta.setLore(lore);
                SakhalinSturgeon.setItemMeta(meta);
                return SakhalinSturgeon;
            } else if (r == 33) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeLegendaries());
                ItemStack AnglerFish = new ItemStack(Material.COD);
                ItemMeta meta = AnglerFish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Angler Fish");
                meta.setLore(lore);
                meta.setCustomModelData(35);
                AnglerFish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(3000 * gradeGenerator.getGrade(AnglerFish)));
                meta.setLore(lore);
                AnglerFish.setItemMeta(meta);
                return AnglerFish;
            } else if (r == 34) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeLegendaries());
                ItemStack OrnateSleeperRay = new ItemStack(Material.COD);
                ItemMeta meta = OrnateSleeperRay.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Ornate Sleeper Ray");
                meta.setLore(lore);
                meta.setCustomModelData(34);
                OrnateSleeperRay.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(2500 * gradeGenerator.getGrade(OrnateSleeperRay)));
                meta.setLore(lore);
                OrnateSleeperRay.setItemMeta(meta);
                return OrnateSleeperRay;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeLegendaries());
                ItemStack AnglerFish = new ItemStack(Material.COD);
                ItemMeta meta = AnglerFish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Angler Fish");
                meta.setLore(lore);
                meta.setCustomModelData(35);
                AnglerFish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(3000 * gradeGenerator.getGrade(AnglerFish)));
                meta.setLore(lore);
                AnglerFish.setItemMeta(meta);
                return AnglerFish;
            }
        } else {
            if (r == 36) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeMythics());
                ItemStack CrystalCod = new ItemStack(Material.COD);
                ItemMeta meta = CrystalCod.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Crystal Cod");
                meta.setLore(lore);
                meta.setCustomModelData(36);
                CrystalCod.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(4000 * gradeGenerator.getGrade(CrystalCod)));
                meta.setLore(lore);
                CrystalCod.setItemMeta(meta);
                return CrystalCod;
            } else if (r == 37) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeMythics());
                ItemStack Ghostfish = new ItemStack(Material.COD);
                ItemMeta meta = Ghostfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Ghostfish");
                meta.setLore(lore);
                meta.setCustomModelData(37);
                Ghostfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(5000 * gradeGenerator.getGrade(Ghostfish)));
                meta.setLore(lore);
                Ghostfish.setItemMeta(meta);
                return Ghostfish;
            } else if (r == 38) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeMythics());
                ItemStack GoldenMinnow = new ItemStack(Material.COD);
                ItemMeta meta = GoldenMinnow.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Golden Minnow");
                meta.setLore(lore);
                meta.setCustomModelData(38);
                GoldenMinnow.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(10000 * gradeGenerator.getGrade(GoldenMinnow)));
                meta.setLore(lore);
                GoldenMinnow.setItemMeta(meta);
                return GoldenMinnow;
            } else if (r == 39) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeMythics());
                ItemStack RainbowTrout = new ItemStack(Material.COD);
                ItemMeta meta = RainbowTrout.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Rainbow Trout");
                meta.setLore(lore);
                meta.setCustomModelData(39);
                RainbowTrout.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(15000 * gradeGenerator.getGrade(RainbowTrout)));
                meta.setLore(lore);
                RainbowTrout.setItemMeta(meta);
                return RainbowTrout;
            } else {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeMythics());
                ItemStack EnchantedJellyfish = new ItemStack(Material.COD);
                ItemMeta meta = EnchantedJellyfish.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "E" + ChatColor.GOLD + "" + ChatColor.BOLD + "n" + ChatColor.YELLOW + "" + ChatColor.BOLD + "c" + ChatColor.GREEN + "" + ChatColor.BOLD + "h" + ChatColor.AQUA + "" + ChatColor.BOLD + "a" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "n" + ChatColor.RED + "" + ChatColor.BOLD + "t" + ChatColor.GOLD + "" + ChatColor.BOLD + "e" + ChatColor.YELLOW + "" + ChatColor.BOLD + "d " + ChatColor.GREEN + "" + ChatColor.BOLD + "J" + ChatColor.AQUA + "" + ChatColor.BOLD + "e" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "l" + ChatColor.RED + "" + ChatColor.BOLD + "l" + ChatColor.GOLD + "" + ChatColor.BOLD + "y" + ChatColor.YELLOW + "" + ChatColor.BOLD + "f" + ChatColor.GREEN + "i" + ChatColor.AQUA + "s" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "h");
                meta.setLore(lore);
                meta.setCustomModelData(40);
                EnchantedJellyfish.setItemMeta(meta);
                lore.add(ChatColor.WHITE + "$" + Math.round(30000 * gradeGenerator.getGrade(EnchantedJellyfish)));
                meta.setLore(lore);
                return EnchantedJellyfish;
            }
        }
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Grade: " + gradeGenerator.getGradeCommons());
        ItemStack Anchovy = new ItemStack(Material.COD);
        ItemMeta meta = Anchovy.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Anchovy");
        meta.setLore(lore);
        meta.setCustomModelData(1);
        Anchovy.setItemMeta(meta);
        lore.add(ChatColor.WHITE + "$" + Math.round(50 * gradeGenerator.getGrade(Anchovy)));
        meta.setLore(lore);
        Anchovy.setItemMeta(meta);
        return Anchovy;
    }
}
