import java.util.ArrayList;
class Main3{
	public static void main(String[] args) {
		
		Team team1 = new Team("Lost Light", 1);
		Team team2 = new Team("AutoBots", 4);
		Team team3 = new Team("Decepticons", 3);
		Team team4 = new Team("The Wreakers", 2);
		Team team5 = new Team("Decepticons Justice Divison", 100);
		Team team6 = new Team("Lost Light's cheap knock off", 200);

		team1.setRank(5);
		team1.addPlayer("Rodimus");
		team1.addPlayer("Optimus");

		team2.addPlayer("Arcee");
		team2.addPlayer("BumbleBee");

		System.out.println(team2);
	}
}