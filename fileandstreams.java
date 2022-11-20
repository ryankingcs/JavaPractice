package practical6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class fileandstreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		for(int loop = 0; loop<array.length;loop++) {
			System.out.println("Enter a number");
			array[loop] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		File file = new File("WrittenFile.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < array.length; i++) {
		    // Maybe:
		    bw.write(array[i]+"");
		}
		
		bw.write("\n");
		bw.close();
		System.out.println("Write complete");
		scanner.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
