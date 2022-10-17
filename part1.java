package uk.ac.qub.week4.practicals;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=1;
		while(num<11) {
			sum = num + sum;
			System.out.println("The sum is " + sum + ".");
			sum++;
			num++;
		}
		
	}

}
