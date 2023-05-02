package ScoreKeeping;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParticipantTest {

	@Before
	public void setUp() throws Exception {
		Participant p1 = new Participant("Allisa");
		Participant p2 = new Participant("Fallon");
	}
	

	@Test
	public void testGetName() {
		assertEquals("Allisa", p1.getName());
	}

	@Test
	public void testGetId() {
		assertEquals("1", p1.getID());
	}

	@Test
	public void testToString() {
		assertEquals("Allisa", p1.toString());
	}

	@Test
	public void testPrint() {
		p1.print();
	}

}
