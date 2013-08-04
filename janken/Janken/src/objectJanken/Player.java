package objectJanken;

public class Player {

	public static final int GU = 0;
	public static final int CHO = 1;
	public static final int PA = 2;

	private String name;

	private int winCount = 0;

	private Tactics tactics;

	public Player(String name) {
		this.name = name;
	}

	public int showHand() {
//		int playerHand = 0;
//		double randomNum = Math.random() * 3;
//
//		if (randomNum < 1) {
//			playerHand = GU;
//		} else if (randomNum < 2) {
//			playerHand = CHO;
//		} else if (randomNum < 3) {
//			playerHand = PA;
//		}

		int playerHand = tactics.readTactics();
		return playerHand;
	}

	public void notifyResult(boolean result) {
		if (result) {
			winCount++;
		}
	}

	public int getWinCount() {
		return winCount;
	}

	public String getName() {
		return name;
	}

	public void setTactics(Tactics tactics) {
		this.tactics = tactics;
	}
}
