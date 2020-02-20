package loopturn.reaperantivpn.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import loopturn.reaperantivpn.checks.ASN;
import loopturn.reaperantivpn.checks.CheckManager;

public class Main extends JavaPlugin {
	
	private static String prefix = "[ReaperAntiVPN]";
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new OnJoin(), this);
		CheckManager.getCheckManager().registerCheck(new ASN());
		consoleLog("Started!");
	}
	
	public void onDisable() {
		consoleLog("Stoped!");
	}
	
	private void consoleLog(String message) {
		Bukkit.getConsoleSender().sendMessage(prefix + " " + message);
	}

}
