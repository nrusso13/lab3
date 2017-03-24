package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;
import pkgPokerException.HandException;

public class test {

	public static void main(String[] args) {
Hand h = new Hand();
 	
		
h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE,1));
h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE,1));
h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER,1));
h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE,1));
h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE,1));
		
		System.out.println("START");
		System.out.println(h);
		System.out.println("STOP");
		
		
		ArrayList<Hand> hands = h.ExplodeHands(h);
		
		try {
			System.out.println(h.EvaluateHand());
		} catch (HandException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
