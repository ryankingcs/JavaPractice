package practical5;
import java.util.Random;
public class part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomInt();
	}

	
	public static void randomInt() {
		System.out.println("Generating 10 random integers in range 1-100");
		for(int i =10; i >0; i--) {
			Random rand = new Random();
		
			System.out.println("Generated : " + rand.nextInt(101));
		}
	}
}
