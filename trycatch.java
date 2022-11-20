package practical6;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your age");
try {
age = scanner.nextInt();


System.out.printf("%d That is quite old !", age);
}
catch(Exception ex) {
	System.out.println("oops");
}



scanner.close();
	}

}
