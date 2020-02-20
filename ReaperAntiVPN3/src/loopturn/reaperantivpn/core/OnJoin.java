package loopturn.reaperantivpn.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import loopturn.reaperantivpn.checks.CheckManager;


public class OnJoin implements Listener {
	
	@EventHandler
	public void onJoin(AsyncPlayerPreLoginEvent e) {
		CheckManager.getCheckManager().pushJoinEvent(e);
	}

}
