package methodsPracticeWeek6;
/*a. Write a program that will repeatedly read a string from the user until they enter
Yes (regardless of the case, e.g. ‘yes’ is fine).


b. Get the program to count how many words were entered before Yes was entered.


c. Get the program to tell the user if the Y in Yes was capitalised or not.
*/

import java.util.Scanner;

public class methodsPracticeWeek6Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String input = "";
		Scanner scanner = new Scanner(System.in);
		boolean yep = false;
		while(yep==false) {
			System.out.println("Enter yes");
			input = scanner.nextLine();
			if(input.equalsIgnoreCase("yes")) {
				yep = true;
			}else count++;
		}
		
		System.out.println(count);
		if(input.equals("yes")) {
			System.out.println("not capitilised");
		}else System.out.println("capitilised");
		
		
	}

}
