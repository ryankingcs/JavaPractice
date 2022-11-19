package practical6;

import java.util.Arrays;

public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] shoesizes = {11, 10, 10, 9, 11, 9, 11, 8.5};
		double total = 0;
		for(int loop = 0; loop<shoesizes.length; loop++) {
			total = total + shoesizes[loop];
			System.out.println("Size number " + (loop+1) + " = " + shoesizes[loop]);
		}
		System.out.println(total/shoesizes.length);
		
		
		int mostpopular = 0;
		String mostpopularname = "";
		String [] name = {"Android", "Iphone", "Blackberry", "Windows", "Other"};
		int[] survey = {30, 25, 5, 4, 6};
		int total1 = 0;
		for(int counter=0; counter<survey.length; counter++) {
			System.out.println(name[counter] + " " + survey[counter]);
			total1 += survey[counter];
			
			if(survey[counter] > mostpopular) {
				mostpopularname = name[counter];
				mostpopular = survey[counter];
			}
			
			
			
			
			
			
			
		}
		System.out.println(total1);
		System.out.println(mostpopularname);
		
		int[][] epicArray = new int[4][3];
		int number = 2;
		for(int rowCounter=0; rowCounter<4; rowCounter++) {
			
			for(int colCounter=0; colCounter<3; colCounter++) {
				epicArray[rowCounter][colCounter] = number;
				number+=2;
			}
		}
		
		for(int rowCounter=0;rowCounter<epicArray.length;rowCounter++) {
			for(int colCounter=0; colCounter<epicArray[rowCounter].length; colCounter++) {
				System.out.printf("[%d %d] : %d ", rowCounter, colCounter, epicArray[rowCounter][colCounter]);
			}
			System.out.println("\n");
		}
		
		int[] array = {6, 4 , 3, 1};
		System.out.println("unsorted : " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted: "+ Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
	}

}
