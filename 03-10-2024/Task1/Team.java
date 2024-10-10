import java.util.ArrayList;
class Team{
	private String teamName;
	private int rank;
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
		String s = ("Team: " + this.teamName + " | Rank: " 
			+ this.rank + "\nNames:\n");
			int k = 1;
			for(String i: players){
				String playerName = i;
				s += k + ": " + playerName;
				s += "\n";
				k++;
		}


	return s;
	}
}