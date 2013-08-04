package objectJanken;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	Player p;

	@Test
	public void showHandTest() {
		p = new Player("ヤマダ");
		int result = p.showHand();
		System.out.println(result);
	}

	@Test
	public void notifyResultTest() {
		p = new Player("ヤマダ");
		assertEquals("勝利数が初期化されてない", 0, p.getWinCount());
		p.notifyResult(true);
		assertEquals("勝利数が加算されてない", 1, p.getWinCount());
	}
}
