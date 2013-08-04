package simpleJanken;

public class NonObjectJanken {

	public static final int GU = 0;
	public static final int CHO = 1;
	public static final int PA = 2;

	public void janken() {

		System.out.println("【じゃんけん開始】");

		double randomNum;
		int player1WinCount = 0;
		int player2WinCount = 0;

		// ３回繰り返す
		for (int i = 0; i < 3; i++) {

			System.out.println("\n＝＝第" + (i + 1) + "回戦＝＝");

			// プレイヤー１の手を決定
			int player1Hand = 0;

			System.out.print("１：");

			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				player1Hand = GU;
				System.out.println("ぐー");
			} else if (randomNum < 2) {
				player1Hand = CHO;
				System.out.println("ちょき");
			} else if (randomNum < 3) {
				player1Hand = PA;
				System.out.println("ぱー");
			}

			// プレイヤー２の手を決定
			int player2Hand = 0;

			System.out.print("２：");

			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				player2Hand = GU;
				System.out.println("ぐー");
			} else if (randomNum < 2) {
				player2Hand = CHO;
				System.out.println("ちょき");
			} else if (randomNum < 3) {
				player2Hand = PA;
				System.out.println("ぱー");
			}

			// 手の判定
			System.out.print("結果：");

			if (player1Hand == GU && player2Hand == CHO || player1Hand == CHO
					&& player2Hand == PA || player1Hand == PA
					&& player2Hand == GU) {
				player1WinCount++;
				System.out.println("プレイヤー１が勝ち");

			} else if (player1Hand == GU && player2Hand == PA
					|| player1Hand == CHO && player2Hand == GU
					|| player1Hand == PA && player2Hand == CHO) {
				player2WinCount++;
				System.out.println("プレイヤー２が勝ち");
				// それ以外はあいこ
			} else {
				System.out.println("あいこ");
			}
		}

		// 結果判定
		System.out.println("\n◆◆◆結果◆◆◆");

		if (player1WinCount > player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "でプレイヤー１の勝ち");
		} else if (player1WinCount < player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "でプレイヤー２の勝ち");
		}
		if (player1WinCount == player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "で引き分け");
		}
	}
}
