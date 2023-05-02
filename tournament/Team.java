package ScoreKeeping;
import java.util.ArrayList;

/**
 * class for team
 *
 * @author KD Bui
 * @version April 27th 2023
 */
public class Team {
	private String name;                                     //name of the Team
	private ArrayList<Participant> t;                        //participants in the Team
	
	/**
	 * Create a new Team. Set none participant in a team
	 * @param name
	 */
	public Team(String name) {
		this.name = name;
		t = new ArrayList<Participant>();
	}
	
	/**
     * get the name of the team
     * @return name - name of the team
     */
	public String getName() {
		return name;
	}
	
	/**
     * change name of the team
     * @param newName name of the new team
     */
	public void changeName(String newName) {
		this.name = newName;
	}
	
	/**
     * add a participant on a team
     * @param p participant being added to the team
     */
	public void addParticipant(Participant p) {
		t.add(p);
	}
	
	/**
     * REMOVE a participant on a team
     * @param p participant being removed from the team
     */
	public void removeParticipant(Participant p) {
		t.remove(p);
	}
	
	/**
     * check whether a participant on a team
     * @param p participant being checked
     */
	public boolean checkPart(Participant p) {
		boolean val = false;
		
		for (Participant p1: t) {
			if (p1 == p) {
				val = true;
			}
		}
		
		return val;
	}
	
	/**
	 * Implement toString() method.
	 */
	public String toString() {
		return "Team: " + name;
	}
	
	/**
	 * print out the team's name.
	 */
	public void print() {
		System.out.println(toString());
	}
}
