package pkgPokerBLL;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Game {
	
	private UUID GameID;
	private UUID TableID;
	private List<Player> GmPlyrs = new ArrayList<Player>();
	
	public Game(UUID tableID, ArrayList<Player> gameplayers){
		GmPlyrs = gameplayers;
		TableID = tableID;
		GameID=UUID.randomUUID();
	}
	 public List<Player> getGamePlayers(){
		 return GmPlyrs;
	 }
	 
	 public void setGamePlayers(List<Player> gameplayers){
		 GmPlyrs = gameplayers;
	 }
	 public UUID getGameID(){
		 return GameID;
	 }
	 public UUID getTableID(){
		 return TableID;
	 }
	 public void AddPlayer(Table t, Player p){
		 t.AddPlayerToTable(p, p.getPlayerID());
	 }

}
