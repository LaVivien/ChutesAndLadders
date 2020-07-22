package chutesAndLadders;

public class Player {
	
	//player has two fields name and position, use getter and setter to access them
	private String name;
	private int position; 

	public Player() {
		this.position = 0;
	}
	
	public Player(int playerID, String name) {
		this.name = name;
		this.position = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int pos) {
		this.position = pos;
	}
}
