package week1.day1;

public class CheckNumPositiveOrNegative {

	public static void main(String[] args) {
		// Initialize test variable to check Positive or Negative
		int tstVal = 35;
		// Check if test value is Positive
		if (tstVal > 0)
		{
			System.out.println("The Number "+tstVal+" is Positive");
		}
		//Check if test value is Negative
		else if (tstVal < 0)
		{
			System.out.println("The Number "+tstVal+" is Negative");
		}
		//Check if test value is Positive or Negative
		else if (tstVal == 0)
		{
			System.out.println("The Number "+tstVal+" is neither Positive nor Negative");
		}
	}

}
