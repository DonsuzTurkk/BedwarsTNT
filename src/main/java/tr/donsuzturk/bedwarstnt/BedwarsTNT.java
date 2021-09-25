package tr.donsuzturk.bedwarstnt;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BedwarsTNT extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void tntKoyunca(final BlockPlaceEvent event) {
        final Block blok = event.getBlock();
        if (blok.getType() == Material.TNT) {
            blok.getWorld().spawn(blok.getLocation(), TNTPrimed.class);
            blok.setType(Material.AIR);
        }
    }
}
