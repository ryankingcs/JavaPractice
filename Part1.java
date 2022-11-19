package practical6;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {

		int[] hours = { 8, 7, 9, 7, 4 };
		hoursAndWages(hours);

		System.out.println();
		System.out.println();

		double[] temps = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		temperatures(temps);

		System.out.println();
		System.out.println();

		double[] hts = { 1.4, 1.9, 1.31, 1.2 };
		heights(hts);

		System.out.println();
		System.out.println();

		temperaturesUpdate(temps);

		System.out.println();
		System.out.println();
		nameVowelCounter();

		System.out.println();
		System.out.println();
		numbersEven();

		System.out.println();
		System.out.println();
		int[] myArr = { 4, 5, 6, 7, 8, 9 };
		arrayToScreen(myArr);

		System.out.println();
		System.out.println();
		int[] assignment1 = { 24, 42, 29, 66, 77 };
		int[] assignment2 = { 79, 68, 31, 22, 42 };
		assignmentAnalyser(assignment1, assignment2);

		System.out.println();
		System.out.println();
		quoteAnalyser();

	}

	public static final double RATE = 10.25;

	public static void hoursAndWages(int[] hours) {

		int totalHours = 0;
		for (int day = 0; day < hours.length; day++) {
			System.out.printf("Day %d hours %d \n", (day + 1), hours[day]);
			totalHours += hours[day];
		}
		System.out.println("Total hours : " + totalHours);
		System.out.printf("Total salary : £%.2f", (totalHours * RATE));
	}

	public static void temperatures(double[] temps) {

		double totaltemps = 0;
		for (int loop = 0; loop < temps.length; loop++) {
			totaltemps += temps[loop];
		}
		System.out.printf("Average temp : %.2f", (totaltemps / temps.length));
	}

	public static void heights(double[] hts) {
		double tallest, smallest;
		tallest = hts[0];
		smallest = hts[0];
		double totalHts = 0;
		for (int loop = 0; loop < hts.length; loop++) {
			totalHts += hts[loop];

			if (hts[loop] < smallest) {

				smallest = hts[loop];
			}

			if (hts[loop] > tallest) {

				tallest = hts[loop];
			}

		}
		System.out.printf("Smallest : %.2f \n", smallest);
		System.out.printf("Tallest : %.2f \n", tallest);
		System.out.printf("Average height : %.2f \n", (totalHts / hts.length));
	}

	public static void temperaturesUpdate(double[] temps) {

		double totaltemps = 0;
		double highest, lowest;
		lowest = temps[0];
		highest = temps[0];

		for (int loop = 0; loop < temps.length; loop++) {
			totaltemps += temps[loop];

			if (temps[loop] < lowest) {

				lowest = temps[loop];
			}

			if (temps[loop] > highest) {

				highest = temps[loop];
			}

		}
		System.out.printf("Highest temp %.2f \n", highest);
		System.out.printf("Lowest temp %.2f \n", lowest);
		System.out.printf("Average temp : %.2f \n", (totaltemps / temps.length));
	}

	public static void nameVowelCounter() {

		String userName;
		char[] userNameChar;
		int totalA, totalE, totalI, totalO, totalU;
		totalA = 0;
		totalE = 0;
		totalI = 0;
		totalO = 0;
		totalU = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name : ");
		userName = scanner.next();
		userNameChar = new char[userName.length()];

		for (int loop = 0; loop < userName.length(); loop++) {
			userNameChar[loop] = userName.charAt(loop);
		}

		for (int loop = 0; loop < userNameChar.length; loop++) {

			switch (userNameChar[loop]) {
			case 'a':
			case 'A':
				totalA++;
				break;
			case 'e':
			case 'E':
				totalE++;
				break;
			case 'i':
			case 'I':
				totalI++;
				break;
			case 'o':
			case 'O':
				totalO++;
				break;
			case 'u':
			case 'U':
				totalU++;
				break;
			default:

			}
		}
		System.out.println("Total A  : " + totalA);
		System.out.println("Total E  : " + totalE);
		System.out.println("Total I  : " + totalI);
		System.out.println("Total O  : " + totalO);
		System.out.println("Total U  : " + totalU);
		scanner.close();

	}

	public static void numbersEven() {

		int[] evens = new int[50];
		int nextFreeElement = 0;
		int total = 0;

		for (int loop = 1; loop <= 100; loop++) {

			if (loop % 2 == 0) {

				evens[nextFreeElement] = loop;

				nextFreeElement++;
			}

		}

		for (int i : evens) {
			total += i;
		}
		System.out.println("total is : " + total);
	}

	public static void arrayToScreen(int[] myArray) {
		for (int loop = 0; loop < myArray.length; loop++) {
			System.out.println(myArray[loop]);
		}
	}

	public static void assignmentAnalyser(int[] assign1, int[] assign2) {

		double aver1, aver2;

		aver1 = (double) totalMarks(assign1) / assign1.length;
		aver2 = (double) totalMarks(assign2) / assign2.length;

		System.out.printf("Average mark assignment 1 %.1f \n", aver1);
		System.out.printf("Average mark assignment 2 %.1f \n", aver2);

		System.out.printf("Overall average : %.1f \n", (aver1 + aver2) / 2);

		if (aver1 > aver2) {
			System.out.println("Assignment 1 has the highest average");
		} else if (aver1 < aver2) {
			System.out.println("Assignment 2 has the highest average");
		} else {
			System.out.println("Both assignment averages are the same");
		}
	}

	public static int totalMarks(int[] results) {
		int total = 0;

		for (int loop = 0; loop < results.length; loop++) {
			total += results[loop];
		}
		return total;
	}

	public static void quoteAnalyser() {

		int numberWords = 0;
		int numberLetters = 0;
		String smallestWord;
		String largestWord;

		String[] quote = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key", "for",
				"unlocking", "our", "potential" };

		smallestWord = quote[0];
		largestWord = quote[0];

		for (int loop = 0; loop < quote.length; loop++) {
			System.out.print(quote[loop]);
			System.out.print(" ");

			numberWords++;
			numberLetters += quote[loop].length();

			if (quote[loop].length() > largestWord.length()) {

				largestWord = quote[loop];
			}

			if (quote[loop].length() < smallestWord.length()) {
				smallestWord = quote[loop];
			}

		}
		System.out.println("");
		System.out.println("Stats ___________________________");
		System.out.println("Number of words   : " + numberWords);
		System.out.println("Number of letters : " + numberLetters);
		System.out.println("Largest word : " + largestWord);
		System.out.println("Smallest word : " + smallestWord);
	}

}
