package be.moondevelopment.sqlite;
/*
 * @created 26/02/2023 - 1:54
 * @project SQLiteLib
 * @author MoonDevelopment
 */

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.author.Authors;

import java.util.logging.Level;

@Plugin(name = "SQLiteLib", version = "1")
@Authors({
        @Author("MoonDevelopment")
})
public class SQLiteLib extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "Lib enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
