package ac.grim.grimac.platform.bukkit.initables;

import ac.grim.grimac.manager.init.start.StartableInitable;
import ac.grim.grimac.utils.anticheat.LogUtil;

public class BukkitEventManager implements StartableInitable {
    public void start() {
        LogUtil.info("Registering singular bukkit event... (PistonEvent)");

        //   Bukkit.getPluginManager().registerEvents(new PistonEvent(), GrimACBukkitLoaderPlugin.LOADER);
    }
}
