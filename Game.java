package chutesAndLadders;

public class Game  {
	
	private static Player[] players;
	private static int numOfPlayers;
	private static int step = 0; 

	//constructor of game, initialize the players and board
	public Game(String[] playerNames) throws Exception {
		//throw exceptions if there is not enough players or too many players 
		if(playerNames == null || playerNames.length == 0) {
			throw new Exception("no players!");
		}		
		numOfPlayers = playerNames.length;
		if(numOfPlayers > 4 || numOfPlayers<2) {
			throw new Exception("not appropriate number of players!");
		} 
		
		//initialize players and board
		players = new Player[numOfPlayers];		
		for(int i = 0; i < numOfPlayers; i++) {
			players[i] = new Player(i+1, playerNames[i]);			
		}
		Board.setUpBoard();
	}

	//game logic based on the doc provided, print status at each step
	public void playGame() {	
		boolean hasWinner = false; 	
		//while loop to run the game in progress
		while(!hasWinner) {		
			//for loop to control players' turn
			for(Player player : players) {								
				step++; 					
				int currentPosition = player.getPosition();
				int spinNum = Spinner.spin(); 
				int newPosition = currentPosition + spinNum;					
				System.out.print(step + ": " + player.getName() + ": " + currentPosition + " --> " + newPosition);		
				//check new position after each spin
				if(newPosition < 100){
					//run into chute
					if(Board.squares[newPosition].getChute() != null) {
						processChute(newPosition);
					}
					//run into ladder
					if(Board.squares[newPosition].getLadder() != null) {
						processLadder(newPosition);
					}							
					player.setPosition(newPosition);
					System.out.println(); 			
				} else if (newPosition > 100) {
					//score over 100 has to stop
					System.out.println(", Score over 100, try again on your next turn!");
					continue;
				} else if(newPosition == 100) {
					//winning condition, game will stop
					System.out.print("\nThe Winner is " + player.getName() + "!");
					hasWinner = true;
					break;
				}										
			}
		}
	}
	
	//utility funcs:move to new position and print status
	private void processLadder(int newPos){
		int topPos = Board.squares[newPos].getLadder().climb(newPos);					
		System.out.print(" -- LADDER --> " + topPos);
		newPos = topPos;										
	}
	
	private void processChute(int newPos){
		int bottomPos = Board.squares[newPos].getChute().slide(newPos);						
		System.out.print(" -- CHUTE --> " + bottomPos);
		newPos = bottomPos;	
	}
}
