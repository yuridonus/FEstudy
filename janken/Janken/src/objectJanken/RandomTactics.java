package objectJanken;

public class RandomTactics implements Tactics {

	@Override
	public int readTactics() {
		int playerHand = 0;
		double randomNum = Math.random() * 3;

		if (randomNum < 1) {
			playerHand = Player.GU;
		} else if (randomNum < 2) {
			playerHand = Player.CHO;
		} else if (randomNum < 3) {
			playerHand = Player.PA;
		}
		return playerHand;
	}

}
