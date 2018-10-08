package pkgTest;
import pkgCore.Deck;
import pkgEnum.eRank;
import pkgEnum.eSuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {
		
	@Test
	public void getRemaningTest1() {
		Deck d1 = new Deck();
		
		d1.Draw(eSuit.CLUBS);
		d1.Draw(eSuit.CLUBS);
		
		assertTrue(d1.getRemaining(eSuit.CLUBS)==11);
	}
	
	@Test
	public void getRemainingTest2() {
		Deck d2 = new Deck();
		
		d2.Draw(eRank.TWO);
		d2.Draw(eRank.TWO);
		
		assertTrue(d2.getRemaining(eRank.TWO)==2);
	}
}
