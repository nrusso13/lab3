package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	

	
	
	
	HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p, UUID playerID)
	{
		 this.TablePlayers.put(playerID, p);
	
	return this;
	}
	
	
	
	
	public Table RemovePlayerFromTable(Player p)
	{
		this.TablePlayers.remove(p.getPlayerID());
		return this;
	}
}
