package javapractice2901;

import java.util.Scanner;

public class decToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dec, quot, i=1, j;
		int bin[] = new int[100];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a Decimal Number");
		dec = scanner.nextInt();
		scanner.close();
		
		quot = dec;
		
		while(quot != 0) {
			
			bin[i++] = quot%2;
			quot = quot/2;
			
		}
		
		System.out.println("Binary number is: ");
		
		for(j=i-1; j>0; j--) {
			
			System.out.println(bin[j]);
			
		}
		
		System.out.println("\n");
		
		
		

	}

}
