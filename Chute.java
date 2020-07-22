package chutesAndLadders;

public class Chute {
	//chute has start and end positions, use getter and setters to access them
	private int start;
	private int end;
	
	public Chute(int pos1, int pos2) {
		this.start = pos1;
		this.end = pos2;
	}
	
	public int getTopPosition() {
		return start;
	}
	
	public void setTopPosition(int pos) {
		this.start = pos;
	}

	public int getBottomPosition() {
		return end;
	}

	public void setBottomPosition(int pos) {
		this.end = pos;
	}
	
	//change position
	public int slide(int from) {
		return this.end;
	}
}
