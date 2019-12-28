package bukkit.org.master;

import bukkit.org.master.events.BukkitMasterHello;
import bukkit.org.master.settings.Settings;
import org.bukkit.Bukkit;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.settings.YamlStaticConfig;

import java.util.Arrays;
import java.util.List;

public final class BukkitMaster extends SimplePlugin {

    @Override
    protected void onPluginStart() {
        Common.ADD_LOG_PREFIX = true;
        Common.ADD_TELL_PREFIX = true;
        Common.log("Bukkit master has been enabled and working correctly!");

        //Events which are registered normally are below:
        Bukkit.getPluginManager().registerEvents(new BukkitMasterHello(),this);


    }


    @Override
    public List<Class<? extends YamlStaticConfig>> getSettings() {
        return Arrays.asList(Settings.class);
    }
}
