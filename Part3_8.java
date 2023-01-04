package methodsPracticeWeek6;

import java.util.Scanner;

public class Part3_8 {

	/**
	 * Outputs series of numbers and stars ... 
	 * *1, *2, *3, *4, *5, *6, *7, *8, *9, *10 
     * **1,  **2, **3, **4, **5, **6, **7, **8, **9, **10
     * ***1,  ***2,***3,***4, ***5, ***6, ***7, ***8, ***9, ***10
	 * @param args
	 */
	public static void main(String[] args) {

		// uses a nested for loop (i.e. a loop inside another)
		// outer loops runs 1 -3 
		for (int row = 1; row <= 3; row++){
			
			// runs from 1 - 10
			for (int partOfRow = 1; partOfRow <= 10; partOfRow++){
			
				// check if one, two or three stars required
				if (row == 1){
					System.out.print("*" + partOfRow);
				} else if (row == 2){
					System.out.print("**" + partOfRow);
				} else {
					System.out.print("***" + partOfRow);
				}
				
				// add the comma and space?
				if (partOfRow != 10){
					System.out.print(", ");
				}
				
			} // end of inner loop
			
			// line break added
			System.out.println();
		
		} // end of outer loop
	} // end main
} // end class

