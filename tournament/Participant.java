package ScoreKeeping;

/**
 * class for participant
 *
 * @author KD Bui
 * @version April 27th 2023
 */
public class Participant {
	
	private String name;                  //name of the participant
	private int ID;                       //ID of the participant
	public static int nextID = 1;         //next ID of the participant
	
	/**
	 * Create a new participant. Initialize participantID to the next
	 * available participantID from nextID. Set played as false.
	 * @param name
	 */
	public Participant(String name) {
		this.name = name;
		this.ID = nextID;
		nextID++;
	}
	
	/**
	 * Return participant's name.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return participant's ID.
	 * @return participantID
	 */
	public int getId() {
		return ID;
	}
	
	/**
	 * Implement toString() method.
	 */
	public String toString() {
		return "Participant " + name;
	}
	
	/**
	 * print out the participant's name.
	 */
	public void print() {
		System.out.println(toString());
	}
}
