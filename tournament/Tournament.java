package ScoreKeeping;
import java.util.HashMap;

public class Tournament{
	private String name;
	private HashMap<String, Event> t;
	
	public Tournament(String name) {
		this.name = name;
		this.t = new HashMap<String,Event>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void addEvent(Event e) {
		t.put(e.getEventName(), e);
	}
	
	public Event getEvent(String eventName) {
		return t.get(eventName);
	}
}

