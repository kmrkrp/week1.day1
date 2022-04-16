package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize test variable to convert into Positive
		int tstVal = -40;
		int convertedVal;
		//Check if test value is less than zero
		if (tstVal < 0)
		{
			//Convert test value to positive value
			convertedVal = (-1*tstVal);
			//Print the converted test value
			System.out.println("The Number "+tstVal+" converted to "+convertedVal);
		}
		

	}

}
