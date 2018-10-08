package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() throws DeckException {

		if (cardsInDeck.size() == 0)
		{
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);

	}

	public Card Draw(eSuit eSuit) {
		for (Card c : cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return (c);
			}
		}
		return (null);
	}
	
	public Card Draw(eRank eRank) { // Created this method to test getRemaining
		for (Card c : cardsInDeck) {
			if (c.geteRank() == eRank) {
				cardsInDeck.remove(c);
				return (c);
			}
		}
		return (null);
	}

	public int getiDeckCount()
	{
		return cardsInDeck.size();
	}
	
	public int getRemaining(Object eNum) {
		int count = 0;
		if(eNum instanceof eRank) {
			for(Card c: cardsInDeck) {
				if(c.geteRank() == eNum) {
					count++;
				}
			}
		}
		else if(eNum instanceof eSuit) {
			for(Card c: cardsInDeck) {
				if(c.geteSuit() == eNum) {
					count++;
				} 
			}
		}
		return count;
	}
}