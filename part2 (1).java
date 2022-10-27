package practical5;

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toLower('A');

	}
 
	public static void toLower(char c) {
		if(Character.isLowerCase(c)==true) {
			System.out.println(c);
		}else if(Character.isLowerCase(c)==false) {
			System.out.println(Character.toLowerCase(c));
		}

	}
}
