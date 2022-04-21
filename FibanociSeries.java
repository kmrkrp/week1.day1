package week1.day1;

public class FibanociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int fibanociNumber_1 = 0;
		int fibanociNumber_2 = 1;		
		int fibanociNumber;
		
		System.out.println("FibanociNumber:"+fibanociNumber_1);
		System.out.println("FibanociNumber:"+fibanociNumber_2);
		for (int i = 1; i <= 8; i++)
		{		
			fibanociNumber = fibanociNumber_1 + fibanociNumber_2;
			System.out.println("FibanociNumber:"+fibanociNumber);
			fibanociNumber_1 = fibanociNumber_2;
			fibanociNumber_2 = fibanociNumber;
			
		}
				
	}

}
