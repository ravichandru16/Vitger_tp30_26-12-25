package genericUtility;

import java.util.Random;

public class RandomNumGenerator {

	/**
	 * Generate random number
	 * @param range
	 * @return
	 */
	public int randNum(int range)
	{
		Random rand= new Random();
		int randNum=rand.nextInt(range);
		return randNum;
		
	}
}
