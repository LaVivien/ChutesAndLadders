package chutesAndLadders;

public class Ladder {
	//ladder has start and end positions, use getter and setters to access them
	private int start; 
	private int end; 
	
	Ladder(int pos1, int pos2) {
		this.start = pos1;
		this.end = pos2;
	}

	public int getBottomPosition() {
		return start;
	}

	public void setBottomPosition(int pos) {
		this.start = pos;
	}

	public int getTopPosition() {
		return end;
	}

	public void setTopPosition(int pos) {
		this.end = pos;
	}
	//change position
	public int climb(int from) {
		return this.end;
	}
}
