package loopturn.reaperantivpn.checks;

import java.util.ArrayList;

import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class CheckManager {
	
	public static ArrayList<Check> checks = new ArrayList<Check>();
	
	// Creates new CheckManager if it doesn't exist
	// Returns CheckManager
	public static CheckManager checkManager;
	public static CheckManager getCheckManager() {
		if(checkManager == null) {
			checkManager = new CheckManager();
		}
		return checkManager;
	}
	
	// Registers a check and makes it usable
	public void registerCheck(Check check) {
		checks.add(check);
	}
	
	// Pushes an PlayerJoinEvent to all the registered checks
	public void pushJoinEvent(AsyncPlayerPreLoginEvent event) {
		for (Check check : checks) {
			check.onJoin(event);
		}
	}

}
