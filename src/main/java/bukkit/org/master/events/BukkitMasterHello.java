package bukkit.org.master.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.mineacademy.fo.Common;

public class BukkitMasterHello implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        Common.tell(player,Common.colorize("&ALooking for &Bplugins &Ato link with them."));

    }
}
