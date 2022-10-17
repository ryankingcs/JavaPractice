package uk.ac.qub.week4.practicals;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.next();
		for (int i = 1; i < 11; i++) {
			System.out.println(name);
		}
		scanner.close();
	}

}
