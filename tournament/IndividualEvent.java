package ScoreKeeping;

/**
 * class for event that only for individual participation
 *
 * @author KD Bui
 * @version April 27th 2023
 */
public class IndividualEvent extends Event {
	private Participant p;                      //participant p
	private int score;                          //score of the participant
	
	/**
     * constructor an Individual Event
     * @param eventName name of the event
     * @param p participant who participates in the event
     * @param score score of the participant
     */
	public IndividualEvent(String eventName, Participant p, int score) {
		super(eventName);
		this.p = p;
		this.score = score;
	}
	
	/**
     * get the  participant who participate in the game
     * @return p-the participant
     */
	public Participant getParticipant() {
		return p;
	}
	
	/**
	 * Return participant's score.
	 * @return score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Set participant's score.
	 * @param newScore new score to initiated
	 */
	public void setScore(int newScore) {
		this.score = newScore;
	}
	
	@Override
	/**
     * check to see whether the participant participates on the event or not
     * @param p participant you want to checked
     * @return true if the participant did participate and vice versa
     */
	public boolean playedln(Participant p) {
		if (p == this.p) {
			return true;
		}else {
			return false;
		}
	}
	
}

