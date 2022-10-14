package Numberguesser;

import java.util.Random;






public class numberguessing {

	public static void main(String[] args) {
		
		
		
		boolean b;
		Random rand = new Random();
		int answer = rand.nextInt(10);
		answer += 1;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.next();
		System.out.println("Welcome " + name + ".");
		
		
		
		
		while(b=true) {
		
		System.out.println(name + ", please guess a number between 1 and 10.");
		int guess = scanner.nextInt();
		
		if(guess < 1 || guess > 10) {
			System.out.println("That guess is not within the right range you.");
		}else if(guess == answer){
			System.out.println("Well done " + name + ", your guess was correct!");
			System.out.println("The correct answer was " + answer + ".");
			break;
		} else {
			b = true;
			System.out.println("Hmm, not quite, try again!");
			
		}
		
		
		}
		scanner.close();
		}
	
	}


