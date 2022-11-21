package project_RyanKing_40372847;

import java.util.Arrays;
import java.util.Comparator;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLetter('A'));
		System.out.println(longestWord("hello there my number is 123456789 and my name is Allister"));
		System.out.println(countDifferentLetters("hello there"));
		System.out.println(mostCommonLetter("HhHee"));
	}

	public static boolean isLetter(char ch) {

		String str = String.valueOf(ch);

		if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			return true;
		} else if ((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {
			return true;
		} else
			return false;
	}

	public static boolean isSameLetterIgnoreCase(char ch1, char ch2) {
		if ((isLetter(ch1) == false) || (isLetter(ch2) == false)) {

			return false;

		} else {
			String str1 = String.valueOf(ch1);
			String str2 = String.valueOf(ch2);

			if ((str1.equalsIgnoreCase(str2)) == true) {
				return true;
			} else
				return false;
		}
	}

	public static boolean containsNumber(String s) {
		boolean number = false;
		for (int i = 0; i < s.length(); i++) {
			if (isLetter(s.charAt(i)) == true) {
				number = false;
			} else
				number = true;
			if (number == true) {
				break;
			}
		}
		return number;
	}

	
	//need to add so that it breaks up words with more than just " " aka breaks for % 2 / etc 
	public static String longestWord(String s) {
		String[] words = s.split(" ");
		String longest = "";

		for (int i = 0; i < words.length; i++) {
			if ((words[i].length() > longest.length()) && (containsNumber(words[i]) == false)) {
				longest = words[i];
			}
		}

		return longest;

	}
//need to use same different case version
	public static int countDifferentLetters(String s) {

		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			if ((temp.indexOf(s.charAt(i)) == -1) && (isLetter(s.charAt(i)) == true)) {
				temp = temp + s.charAt(i);
			}
		}

		return temp.length();

	}
	
	//Add a method called mostCommonLetter, which takes one parameter s of 
	//type String and returns a char value. The method should return the letter 
	//		that occurs most often in s. If more than one letter occurs the most often then 
	//		the one which is first alphabetically should be returned. For example, if s was 
	//		“hello there” then it would return ‘e’. 
	
	public static char mostCommonLetter(String s) {
		String mostUsedChar = "";
        int count = 0;

        String[] array = s.split("");

        for (int i = 0; i < array.length; i++) {
            int tempCount = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[i].equals(array[j])) {
                   tempCount++;
                }
                if (tempCount > count) {
                    count = tempCount;
                    mostUsedChar = array[i];
                }
            }
        }
        
      char mostUsed = mostUsedChar.charAt(0);
      return mostUsed;
		
		
		
		
		
	}

}
