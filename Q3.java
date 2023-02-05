package javapractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		
		int number = 2;
		int[][] twodArray = new int[4][4];
		int total = 0;
		

		for (int rowCounter = 0; rowCounter < 4; rowCounter++) {

			for (int colCounter = 0; colCounter < 4; colCounter++) {

				twodArray[rowCounter][colCounter] = number;

				number += 2;
			}
		}

		for (int rowCounter1 = 0; rowCounter1 < twodArray.length; rowCounter1++) {

			for (int colCounter1 = 0; colCounter1 < twodArray[rowCounter1].length; colCounter1++) {
				System.out.printf("[%d %d] : %d ", rowCounter1, colCounter1, twodArray[rowCounter1][colCounter1]);
				total = total + twodArray[rowCounter1][colCounter1];
			}
			System.out.println("\n");
		}
		System.out.println(total);
		System.out.println(total / 16);
		
		try {
			
			File file = new File("WrittenFile.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int rowCounter2 = 0; rowCounter2 < twodArray.length; rowCounter2++) {
				for (int colCounter2 = 0; colCounter2 < twodArray[rowCounter2].length; colCounter2++) {
					bw.write(twodArray[rowCounter2][colCounter2]+"");
					
					if(twodArray[rowCounter2][colCounter2]==twodArray[twodArray.length-1][twodArray.length-1]) {
					bw.write("");
					}else
						bw.write(",");
					
					if(colCounter2==twodArray.length-1) {
						bw.write("\n");
					}
				}
			
			}
			
			bw.write("\n");
			bw.close();
			System.out.println("Wrote");
			System.out.println(twodArray.length);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

