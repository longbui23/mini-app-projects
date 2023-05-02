package ScoreKeeping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamEventTest {

	@BeforeEach
	void setUp() throws Exception {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		Participant p4 = new Participant("D");
		Participant p5 = new Participant("E");
		Participant p6 = new Participant("F");
		Participant p7 = new Participant("G");
		Participant p8 = new Participant("H");
		
		Team t1 = new Team("Dson1");
		Team t2 = new Team("Dson2");
		Team t3 = new Team("Dson3");
		
		TeamEvent e1 = new TeamEvent("2v2");
		e1.addTeam(t1);
		e1.addTeam(t2);
	}

	@Test
	void testPlayedlnParticipant() {
		fail("Not yet implemented");
	}

	@Test
	void testAddTeam() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveTeam() {
		fail("Not yet implemented");
	}

	@Test
	void testSetScore() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScore() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckWinner() {
		fail("Not yet implemented");
	}

	@Test
	void testPlayedlnTeam() {
		fail("Not yet implemented");
	}

}
