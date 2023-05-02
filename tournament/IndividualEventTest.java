package ScoreKeeping;

class IndividualEventTest {

	@Before
	void setUp() throws Exception {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		IndividualEvent e1 = new IndividualEvent("SubwaySurfer1", p1, 300);
		IndividualEvent e2 = new IndividualEvent("SubwaySurger2", p2, 400);
	}

	@Test
	void testPlayedln() {
		assertEquals(true, e1.playedln(p1));
		assertEquals(false, e1.playedln(p2));
	}

	@Test
	void testGetParticipant() {
		assertEquals(p1, e1.getParticipant());
	}

	@Test
	void testGetScore() {
		assertEquals(300, e1.getScore());
	}

	@Test
	void testSetScore() {
		assertEquals(100, e1.setScore(100));
	}

}
