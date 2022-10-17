package uk.ac.qub.week4.practicals;

import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int response;
		do {
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Save");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Select option....");
	    response = scanner.nextInt();
	    if(response==1) {
	    	System.out.println("You chose File.");
	    }else if(response==2) {
	    	System.out.println("You chose Edit.");
	    }else if(response==3) {
	    	System.out.println("You chose Save.");
	    }else if(response==4) {
	    	System.out.println("You chose Delete.");
	    }else if(response==5) {
	    	System.out.println("You chose Exit.");
	    }else {
	    	System.out.println("Invalid option.");
	    }
		
		
		
		}while(response != 5);
		System.out.println("Exiting program.");
		scanner.close();
	}

}

