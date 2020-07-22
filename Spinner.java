package chutesAndLadders;

import java.util.Random;

public final class Spinner {
	
	//generate random number with range of 6 to simulate a dice
	public static final int spin() {
		Random random = new Random();
		int spinNum = random.nextInt(6); 
		return spinNum + 1;				
	}
}
