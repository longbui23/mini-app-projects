package ScoreKeeping;

import static org.junit.Assert.*;

import org.junit.Test;


class HeadToHeadEventTest {


	@Test
	void testPlayedln() {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		HeadToHeadEvent e1 = new HeadToHeadEvent("Solo1", p1, p2);
		HeadToHeadEvent e2 = new HeadToHeadEvent("Solo2", p2, p3, 100, 300);
		assertEquals(true, e1.playedln(p1));
		assertEquals(false, e1.playedln(p3));
	}

	@Test
	void testGetScore() {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		HeadToHeadEvent e1 = new HeadToHeadEvent("Solo1", p1, p2);
		HeadToHeadEvent e2 = new HeadToHeadEvent("Solo2", p2, p3, 100, 300);
		assertEquals(100, e2.getScore(p2));
		assertEquals(0, e2.getScore(p1));
	}

	@Test
	void testSetScore() {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		HeadToHeadEvent e1 = new HeadToHeadEvent("Solo1", p1, p2);
		HeadToHeadEvent e2 = new HeadToHeadEvent("Solo2", p2, p3, 100, 300);
		e1.setScore(p1, 400);
		assertEquals(400, e1.getScore(p1));
		e1.setScore(p3, 500);
		assertEquals(0, e1.getScore(p3));
	}

	@Test
	void testWinner() {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		HeadToHeadEvent e1 = new HeadToHeadEvent("Solo1", p1, p2);
		HeadToHeadEvent e2 = new HeadToHeadEvent("Solo2", p2, p3, 100, 300);
		assertEquals(p3, e2.winner());
		assertEquals(null, e1.winner());
		e1.setScore(p1, -100);
		assertEquals(p2, e1.winner());
		e1.setScore(p2, -100);
		assertEquals(null, e1.winner());
	}

}
