package ScoreKeeping;
/**
 * class for event that is head-to-head type
 *
 * @author KD Bui
 * @version April 27th 2023
 */

public class HeadToHeadEvent extends Event {
	private Participant p1;              //first participant
	private Participant p2;              //second participant
	private int score1;                  //score of the first participant
	private int score2;                  //score of the second participant
	
	/**
     * constructor for Head-To-Head Event
     * @param eventName name of the event
     * @param p1 first participant who participates in the event
     * @param p2 second participant who participates in the event 
     */
	public HeadToHeadEvent(String eventName, Participant p1, Participant p2) {
		super(eventName);
		this.p1 = p1;
		this.p2 = p2;
		score1 = 0;
		score2 = 0;
	}
	
	/**
     * constructor for Head-To-Head Event
     * @param eventName name of the event
     * @param p1 first participant who participates in the event
     * @param p2 second participant who participates in the event 
     * @param score1 score of the first participant
     * @param score2 score of the second participant
     */
	public HeadToHeadEvent(String eventName, Participant p1, Participant p2, int score1, int score2) {
		super(eventName);
		this.p1 = p1;
		this.p2 = p2;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	/**
	 * Return participant's score by specifying a certain participant.
	 * @param p-the participant you want to know his/her score.
	 * @return score
	 */
	public int getScore(Participant p) {
		if (playedln(p) == true) {
			if (p == p1) {
				return score1;
			}else {
				return score2;
			}
		}else {
			return 0;
		}
	}
	
	/**
	 * Return participant's score by specifying a certain participant.
	 * @param p-the participant you want to set his/her score.
	 * @param score-the new score you want to set
	 */
	public void setScore(Participant p, int score) {
		if (playedln(p) == true) {
			if (p==p1) {
				score1 = score;
			} else {
				score2 = score;
			}
		} else {
			System.out.println("Participant " + p + " does not participate in this event");
		}
	}

	/**
	 * Return the list of winners for the event
	 * @return winner - arraylist of winners of the event. Return null if it is a draw or
	 * no one gets score above 0.
	 */
	public Participant winner() {
		if ((score1 >= 0) || (score2 >= 0)) {
			if (score1 > score2) {
				return p1;
			} else if (score1 < score2) {
				return p2;
			} else {
				return null;
			} 
		} else {
			return null;
		}
	}

	@Override
	/**
     * check to see whether the participant participates on the event or not
     * @param p participant you want to checked
     * @return true if the participant did participate and vice versa
     */
	public boolean playedln(Participant p) {
		if ((p == p1) || (p == p2)) {
			return true;
		} else {
			return false;
		}
	}
}
