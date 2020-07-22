package chutesAndLadders;

public class ChutesAndLadders {
	
	//the main func to run the game in non-GUI env 
	public static void main(String[] args)  throws Exception {	
		
		//The game has two players to run the test
		String[] players={"Eric","Paul"};		
		Game game = new Game(players);
		game.playGame();
	}
}
