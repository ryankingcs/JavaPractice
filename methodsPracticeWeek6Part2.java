package methodsPracticeWeek6;

import java.util.Scanner;

public class methodsPracticeWeek6Part2 {
	/*
	 * Write a program which prompts the user to enter a number between 1-20. 
	 * It continually repeats this request until they enter a valid number. 
	 * Once a valid number is entered the program will output a square of * of the correct size.
	 *  Example output for inputs of 1, 2 and 5 are shown below:

Please enter a number between 1-20 :1
*

Please enter a number between 1-20 :2
**
**
Please enter a number between 1-20 :5
*****
* *
* *
* *
***** 
	 */

	public static void main(String[] args) {
		int input = 0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(input<1 || input >20) {
		System.out.println("Please enter a number between 1-20");
		input = scanner.nextInt();
		} 
		
		for (int w = 0; w < input; w++) {
            for (int l = 0; l < input; l++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
		

	}

}
