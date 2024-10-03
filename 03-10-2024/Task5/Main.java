import java.util.ArrayList;

class Main{
	
	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		

		GameMenu game = new GameMenu(actions);

		//game.displayMenu();

		//int userChoice = Integer.parseInt(game.getAction());
		String userChoice = game.getAction();


		doAction(Integer.parseInt(userChoice));
		}
		public static void doAction(int choice){
			switch(choice){
			case 1:
				System.out.println("Starting the game");
				break;
			case 2:
				System.out.println("Resuming the game");
				break;
			case 3:
				System.out.println("Pausing the game");
				break;
			case 4:
				System.out.println("Ending the game");
				break;
			}
	}
}