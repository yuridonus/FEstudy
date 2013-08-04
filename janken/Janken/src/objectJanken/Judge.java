package objectJanken;

public class Judge {

	public void startJanken(Player p1, Player p2) {
		System.out.println("【じゃんけん開始】");

		for (int i = 0; i < 3; i++) {
			System.out.println("\n＝＝第" + (i + 1) + "回戦＝＝");

			Player winner = judgeJanken(p1, p2);
			if (winner != null) {
				winner.notifyResult(true);
				System.out.println(winner.getName() + "さんが勝ちました");
			} else {
				System.out.println("あいこ");
			}
		}
		System.out.println("\n◆◆◆結果判定◆◆◆");
		Player finalWinner = judgeFinalWinner(p1, p2);
		System.out.println(p1.getName() + "さんの勝利数：" + p1.getWinCount());
		System.out.println(p2.getName() + "さんの勝利数：" + p2.getWinCount());

		System.out.println(p1.getWinCount() + "対" + p2.getWinCount() + "で");
		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "さんが勝ちです");
		} else {
			System.out.println("引き分け");
		}
	}

	public Player judgeJanken(Player p1, Player p2) {
		Player winner = null;
		int p1Hand = p1.showHand();
		int p2Hand = p2.showHand();

		System.out.print(p1.getName() + "さんの手：");
		printHand(p1Hand);
		System.out.print(p2.getName() + "さんの手：");
		printHand(p2Hand);

		if (p1Hand == Player.GU && p2Hand == Player.CHO || p1Hand == Player.CHO
				&& p2Hand == Player.PA || p1Hand == Player.PA
				&& p2Hand == Player.GU) {
			winner = p1;
		}
		if (p1Hand == Player.GU && p2Hand == Player.PA || p1Hand == Player.CHO
				&& p2Hand == Player.GU || p1Hand == Player.PA
				&& p2Hand == Player.CHO) {
			winner = p2;
		}

		return winner;
	}

	public Player judgeFinalWinner(Player p1, Player p2) {
		Player finalWinner = null;

		if (p1.getWinCount() > p2.getWinCount()) {

			finalWinner = p1;
		}
		if (p1.getWinCount() < p2.getWinCount()) {
			finalWinner = p2;
		}

		return finalWinner;
	}

	public void printHand(int hand) {
		if (hand == Player.GU) {
			System.out.println("ぐー");
		}
		if (hand == Player.CHO) {
			System.out.println("ちょき");
		}
		if (hand == Player.PA) {
			System.out.println("ぱー");
		}

	}

}
