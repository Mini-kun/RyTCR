package net.royaltechnica;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Rytessentials extends JavaPlugin {

    String prefix = "§7[§5Royal §aTech§enica§7] §7";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "§aPlugin successfully enabled bla bla");

    }
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "§cPlugin successfully disabled");
    }
}
