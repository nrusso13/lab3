package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;
import pkgPokerException.DeckException;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	Scanner input = new Scanner(System.in);

	public Deck() {

		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				}
			}
			
		}
		Collections.shuffle(DeckCards);
		}
	
	public Deck(int j){
		this();
		//System.out.println("How many Jokers are in this deck?");
		//int NmbrofJkrs = input.nextInt();
		for (int i=0; i < j; i++){
		DeckCards.add(new Card(eRank.JOKER, eSuit.JOKER, 53+i));
		}
		Collections.shuffle(DeckCards);
	}
	public Card DrawCard() throws DeckException{
		if (DeckCards.size() == 0){
			throw new DeckException(this);
		}
		return DeckCards.remove(0);
	}
}
