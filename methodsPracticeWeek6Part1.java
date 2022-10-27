package methodsPracticeWeek6;

import java.util.Scanner;

public class methodsPracticeWeek6Part1 {
	//Write a program which first asks the user to enter their name. The program will then output the name backwards as shown below:


//Please type your name :Darryl Stewart
//Your name backwards is :trawetS lyrraD

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = scanner.nextLine();
		char[] charArr = name.toCharArray();
		System.out.println(charArr.length);

		   for (int i = charArr.length - 1; i >= 0; i--){

		      System.out.print(charArr[i]);

		   }
		
		
		
		
		
		scanner.close();
	}

}
