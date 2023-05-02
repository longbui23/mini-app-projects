package ScoreKeeping;

/**
 * abstract class for event
 *
 * @author KD Bui
 * @version April 27th 2023
 */
public abstract class Event {
 	private String eventName;                 // Name of the event
 
 	
	/**
     * constructor an Event
     * @param eventName name of the event
     */
	public Event(String eventName) {
		this.eventName = eventName;
	}
	
	/**
     * get the name of the event
     * @return eventName - name of the event
     */
	public String getEventName() {
		return this.eventName;
	}
	
	/**
     * change name of the event
     * @param newName name of the new event
     */
	public void changeEventName(String newName) {
		this.eventName = newName;
	}
	
	public abstract boolean playedln(Participant p);              // check whether a participant participates in a certain event
	
}