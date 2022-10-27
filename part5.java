package practical5;

import java.util.Scanner;

public class part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int x = scanner.nextInt();
		if(x<=50&&x>=5) {
			asterisksNumber(x);
		}else System.out.println("Error");
		
	}

	public static void asterisksNumber(int n) {
		 for (int n1 = n; n1 >0; n1--) {
		        System.out.println(n1 + "  "+ repeat(n1, "* "));
		    }
		}
	public static String repeat(int count, String with) {
	    return new String(new char[count]).replace("\0", with);
	}

	public static String repeat(int count) {
	    return repeat(count, " ");
	}
	}
	
	

