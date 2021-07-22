package week3exerciseSolutions;

public class sampleTwentySix {
		public static void main(String[] args)
		{
		int i = -243;
		int j = 243;
		if(i == j);//there is no curly brackets opening so the condition will not be checked and
		//the next line will be printed by default
		System.out.println("numbers are the same 1st");
		// we will check by adding curly brackets
		if(i==j) {
			System.out.println("numbers are the same  2nd");
			//above line will not be printed as we checked condition by adding '{ }'.
		}
		}
	}
