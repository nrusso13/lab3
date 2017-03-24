package pkgPokerException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception{
	private Deck d;
	public DeckException(){
		
	}
	public DeckException(Deck e){
		this.d = e;
	}
	public Deck getDeck(){
		return d;
	}
}
