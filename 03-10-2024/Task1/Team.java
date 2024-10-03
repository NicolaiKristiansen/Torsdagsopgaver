import java.util.ArrayList;
class Team{
	private String teamName;
	private int rank;
	private String s;
	private ArrayList<String> players = new ArrayList<String>();

	Team(String teamName, int rank){
		this.teamName = teamName;
		this.rank = rank;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public void addPlayer(String player){
		players.add(player);
	}

	public String toString(){
		s = ("Team: " + this.teamName + " | Rank: " 
			+ this.rank + " | Name: " + players);


	return s;
	}
}