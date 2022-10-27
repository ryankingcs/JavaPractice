package practical5;

public class part7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sumOf(100);
	}
	
	public static void sumOf(double n) {
		double x = n+1;
		double y = (n*x)/2;
		System.out.println("The sum is "+ y);
		
		double smallNumber = 1;
		double largeNumber = n;

		double counter = smallNumber;

		double average = 0;

		double total = 0;

		double numberCounter = 0;

		while(counter <= largeNumber) { 
		    total = counter + total;
		    counter = counter + 1;
		    numberCounter++;
		}

		average = total / numberCounter;
		System.out.println("The average is " + average);
		        
		
	}

}
