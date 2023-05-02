package ScoreKeeping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamTest {

	@BeforeEach
	void setUp() throws Exception {
		Participant p1 = new Participant("A");
		Participant p2 = new Participant("B");
		Participant p3 = new Participant("C");
		Team t1 = new Team("Dson1");
		Team t2 = new Team("Dson2");
	}

	@Test
	void testGetName() {
		assertEquals("Dson1", t1.getName());
	}

	@Test
	void testChangeName() {
		t1.changeName("Dison1");
		assertEquals(Dison1, t1.getName());
	}

	@Test
	void testAddParticipant() {
		t1.add(p1);
		t1.add(p2);
		assertEquals(true, t1.checkPart(p1));
		assertEquals(false, t1.checkPart(p3));
		assertEquals(false, t2.checkPart(p1));
	}

	@Test
	void testRemoveParticipant() {
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		t1.remove(p1);
		assertEquals(false, t1.checkPart(p1));
		assertEquals(true, t1.checkPart(p3));
		assertEquals(true, t1.checkPart(p2));
		t1.remove(p3)
		assertEquals(false, t1.checkPart(p3));
		assertEquals(true, t1.checkPart(p1));
		t1.remove(p2);
		assertEquals(false, t1.checkPart(p2));
	}

	@Test
	void testCheckPart() {
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		t1.remove(p1);
		assertEquals(false, t1.checkPart(p1));
		assertEquals(true, t1.checkPart(p3));
		assertEquals(true, t1.checkPart(p2));
		t1.remove(p3)
		assertEquals(false, t1.checkPart(p3));
		assertEquals(true, t1.checkPart(p1));
		t1.remove(p2);
		assertEquals(false, t1.checkPart(p2));
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testPrint() {
		fail("Not yet implemented");
	}

}
