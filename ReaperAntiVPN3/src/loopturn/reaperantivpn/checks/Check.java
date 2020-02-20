package loopturn.reaperantivpn.checks;

import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public interface Check {
	
	// Called on playerPreLogin event
	public void onJoin(AsyncPlayerPreLoginEvent event);

}
