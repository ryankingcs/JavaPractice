package javapractice;

import java.util.Random;

public class Blackjack {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		boolean cont;
		int balance = 1000;
		System.out.println("How much would you like to bet?");
		int wagerAmount = scanner.nextInt();
		System.out.println("You have placed a bet of " + wagerAmount + " dollars.");
		balance = balance - wagerAmount; 
		
		System.out.println("Type 1 to play.");
		System.out.println("Type 2 to check balance.");
		int play = scanner.nextInt();
		if(play==1) {
			
			Random random = new Random();
			int dealerFirstCard = random.nextInt(10);
			dealerFirstCard += 1;
			int dealerSecondCard = random.nextInt(10);
			dealerSecondCard +=1;
			int playerFirstCard = random.nextInt(10);
			playerFirstCard +=1;
			int playerSecondCard = random.nextInt(10);
			playerSecondCard +=1;
			System.out.println("The dealer drew a " + dealerFirstCard + ".");
			System.out.println("The dealers second card is hidden");
			System.out.println("");
			System.out.println("You drew a " + playerFirstCard + ".");
			System.out.println("You drew a " + playerSecondCard + ".");
			int playerTotalCards = playerFirstCard + playerSecondCard;
			int dealerTotalCards = dealerFirstCard + dealerSecondCard; 
			System.out.println("Your total is " + playerTotalCards + ".");
			System.out.println("Type 1 to hit.");
			System.out.println("Type 2 to stand.");
			int hitOrStand = scanner.nextInt();
			if(hitOrStand==1) { //hit
				int playerThirdCard = random.nextInt(10);
				playerThirdCard +=1;
				System.out.println("You drew a " + playerThirdCard + ".");
				playerTotalCards = playerTotalCards + playerThirdCard;
				System.out.println("Your total is " + playerTotalCards + ".");
				if(playerTotalCards>=21) {
					System.out.println("You have went over 21!");
					System.out.println("You have lost.");
					balance = balance - wagerAmount;
					System.out.println("Your new balance is " + balance + ".");
				
				}}
				
				
			
				if(hitOrStand==2) { //stand
				int dealerThirdCard = random.nextInt(10);
				dealerThirdCard +=1;
				System.out.println("The dealers second card is " + dealerSecondCard + ".");
				System.out.println("The dealer drew a " + dealerThirdCard + ".");
				dealerTotalCards = dealerTotalCards + dealerThirdCard;
				if(dealerTotalCards>=21) {
					System.out.println("The dealer has went over 21!");
					System.out.println("You have won.");
					balance = balance + wagerAmount;
					System.out.println("Your new balance is " + balance + ".");
				}
			}
		
		
		
		
		
		
		
		
		
	
	}else if(play==2)

	{
		System.out.println("Your balance is " + balance + ".");
	}
}}