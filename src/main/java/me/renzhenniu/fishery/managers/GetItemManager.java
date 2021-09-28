package me.renzhenniu.fishery.managers;

import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GetItemManager {


    public ItemStack getItem() {

        RandomPullManager r = new RandomPullManager();
        HeadDatabaseAPI h = new HeadDatabaseAPI();

        if (r.getItem() == 1) {
            switch (r.getCrate()) {
                default:
                    ItemStack cCrate = h.getItemHead(String.valueOf(4584));
                    ItemMeta m1 = cCrate.getItemMeta();
                    assert m1 != null;
                    m1.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Crate");
                    cCrate.setItemMeta(m1);
                    return cCrate;
                case 2:
                    ItemStack iCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m2 = iCrate.getItemMeta();
                    assert m2 != null;
                    m2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Improved Crate");
                    iCrate.setItemMeta(m2);
                    return iCrate;
                case 3:
                    ItemStack sCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m3 = sCrate.getItemMeta();
                    assert m3 != null;
                    m3.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Steel Crate");
                    sCrate.setItemMeta(m3);
                    return sCrate;
                case 4:
                    ItemStack gCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m4 = gCrate.getItemMeta();
                    assert m4 != null;
                    m4.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Golden Crate");
                    gCrate.setItemMeta(m4);
                    return gCrate;
                case 5:
                    ItemStack mCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m5 = mCrate.getItemMeta();
                    assert m5 != null;
                    m5.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Mythical Crate");
                    mCrate.setItemMeta(m5);
                    return mCrate;
            }
        } else {
            switch (r.getCrate()) {
                default:
                    ItemStack cCrate = h.getItemHead(String.valueOf(4584));
                    ItemMeta m1 = cCrate.getItemMeta();
                    assert m1 != null;
                    m1.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Crate");
                    cCrate.setItemMeta(m1);
                    return cCrate;
                case 2:
                    ItemStack iCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m2 = iCrate.getItemMeta();
                    assert m2 != null;
                    m2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Improved Crate");
                    iCrate.setItemMeta(m2);
                    return iCrate;
                case 3:
                    ItemStack sCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m3 = sCrate.getItemMeta();
                    assert m3 != null;
                    m3.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Steel Crate");
                    sCrate.setItemMeta(m3);
                    return sCrate;
                case 4:
                    ItemStack gCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m4 = gCrate.getItemMeta();
                    assert m4 != null;
                    m4.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Golden Crate");
                    gCrate.setItemMeta(m4);
                    return gCrate;
                case 5:
                    ItemStack mCrate = h.getItemHead(String.valueOf(4601));
                    ItemMeta m5 = mCrate.getItemMeta();
                    assert m5 != null;
                    m5.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Mythical Crate");
                    mCrate.setItemMeta(m5);
                    return mCrate;
            }
        }

    }
}
