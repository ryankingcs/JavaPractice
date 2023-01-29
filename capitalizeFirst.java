package javapractice2901;

import java.util.Scanner;

public class capitalizeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		String line = scanner.nextLine();
		
		String uppercase = "";
		
		Scanner lineScan = new Scanner(line);
		
		while(lineScan.hasNext()) {
			
			String word = lineScan.next();
			uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
			
		}
		
		System.out.println(uppercase.trim());
		
		scanner.close();
		lineScan.close();

	}

}
