package uk.ac.qub.week4.practicals;

import java.util.Scanner;

public class part3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int old = 120;
		int young = 1;
		Scanner scanner = new Scanner(System.in);
		int age;
		do {
			System.out.println("What age are you?");
			age = scanner.nextInt();

		} while (age >= old || age <= young);
		if (age < 18) {
			System.out.println("£25");
		} else if (age < 21 && age > 17) {
			System.out.println("£40");
		} else if (age > 21 && age < 61) {
			System.out.println("£80");
		} else if (age > 60) {
			System.out.println("£60");
		}
		scanner.close();
	}

}
