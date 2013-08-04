package objectJanken;

import static org.junit.Assert.*;

import org.junit.Test;

public class JudgeTest {

	Judge j;

	@Test
	public void startJankenTest(){
		j = new Judge();
		Player p1 = new Player("1");
		Player p2 = new Player("2");
		p1.setTactics(new RandomTactics());
		p2.setTactics(new RandomTactics());

		j.startJanken(p1, p2);
	}

	@Test
	public void testJudgeWinner() {
		j = new Judge();
		Player p1 = new Player("1");
		Player p2 = new Player("2");
		j.judgeJanken(p1, p2);
	}

	@Test
	public void testJudgeFinalWinner() {
		j = new Judge();
		Player p1 = new Player("1");
		Player p2 = new Player("2");
		p1.notifyResult(true);
		Player result = j.judgeFinalWinner(p1, p2);
		assertEquals("結果がちゃう", result, p1);
	}

	@Test
	public void testPrintHand() {
		j = new Judge();
		j.printHand(1);
	}
}
