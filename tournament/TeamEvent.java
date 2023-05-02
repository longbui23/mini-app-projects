package ScoreKeeping;
/**
 * class for team event
 * @author KD Bui
 * @version April 27th 2023
 */

import java.util.ArrayList;
import java.util.HashMap;


public class TeamEvent extends Event{
	private ArrayList<Team> ts;                      //List of team participating in the event
	private HashMap<Team, Integer> board;            //board that record score for each team
	
	/**
     * constructor for a Team Event
     * @param eventName name of the event
     */
	public TeamEvent(String eventName) {
		super(eventName);
		ts = new ArrayList<Team>();
		board  = new HashMap<Team, Integer>();
	}

	/**
     * add team for the event
     * @param team1 team that being added
     */
	public void addTeam(Team team1) {
		ts.add(team1);
		board.put(team1, 0);
	}
	
	/**
     * remove team from the event
     * @param team1 team that being removed
     */
	public void removeTeam(Team team1) {
		ts.remove(team1);
		board.remove(team1);
	}
	/**
     * get Score for a specified team
     * @param team1 team that need to set score
     * @param score score that being setted
     */
	public void setScore(Team team1, int score) {
		if (playedln(team1) == true) {
				board.replace(team1, score);
		}
	}
	
	/**
     * set Score for a specified team
     * @param team1 team that need to get score
     */
	public int getScore(Team team1) {
		if (playedln(team1) == true) {
				return board.get(team1);
		} else {
			System.out.println("The team " + team1 + " does not participate in the event");
			return 0;
		}
	}
	
	/**
     * examine who is/are the winner(s) of the event. 
     * Return an empty array list if all teams has negative scores.
     * @return return an array list of winners
     */
	public ArrayList<Team> checkWinner() {
		ArrayList<Team> winners = new ArrayList<Team>();
		int maxscore = 0;
		
		for(Team team: ts) {
			if (getScore(team) > maxscore) {
				maxscore = getScore(team);
				winners.clear();
				winners.add(team);
			} else if (getScore(team) == maxscore) {
				winners.add(team);
			}
		}
		return winners;
	}

	@Override
	/**
     * examine whether a participant participates in the event or not
     * @return return true if the participant did participate and 
     * vice versa
     */
	public boolean playedln(Participant p) {
		boolean val = false;
		
		for (Team t1: ts) {
			if (t1.checkPart(p) == true) {
				val = true;
			}
		}
		return val;
	}
	
	/**
     * examine whether a team participates in the event or not
     * @return return true if the team did participate and 
     * vice versa
     */
	public boolean playedln(Team t) {
		boolean val = false;
		
		for (Team t1: ts) {
			if (t1 == t) {
				val = true;
			}
		}
		
		return val;
	}
	
}
