package ScoreKeeping;

public class EventDemo {

	public static void main(String[] args) {
		Participant p1 = new Participant("Alice");
		Participant p2 = new Participant("Bob");
		Participant p3 = new Participant("Carol");
		Participant p4 = new Participant("Dave");
		
		Tournament t1 = new Tournament("Solo Pinball");
		IndividualEvent e1 = new IndividualEvent("Alice Game 1", p1, 15000);
		IndividualEvent e2 = new IndividualEvent("Alice Game 2", p1, 12000);
		IndividualEvent e3 = new IndividualEvent("Alice Game 3", p1, 12500);
		t1.addEvent(e1);
		t1.addEvent(e2);
		t1.addEvent(e3);
		
		Tournament t2 = new Tournament("Alice vs Bob");
		HeadToHeadEvent e4 = new HeadToHeadEvent("Game 1", p1, p2, 10000, 20000);
		HeadToHeadEvent e5 = new HeadToHeadEvent("Game 2", p1, p2);
		e5.setScore(p1, 20000);
		e5.setScore(p2, 12000);
		
		Team team1 = new Team("ABs");
		Team team2 = new Team("CDs");
		team1.addParticipant(p1);
		team1.addParticipant(p2);
		
		team2.addParticipant(p3);
		team2.addParticipant(p4);
		
		Tournament t3 = new Tournament("Pinball League");
		TeamEvent e6 = new TeamEvent("League Game 1");
		e6.addTeam(team1);
		e6.addTeam(team2);
		
		e6.setScore(team1, 100);
		e6.setScore(team2, 200);
		
		t3.addEvent(e6);	
	}

}