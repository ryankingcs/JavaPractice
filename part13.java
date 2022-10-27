package practical5;

import java.util.Random;

public class part13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
coinToss("tails");
	}

	public static void coinToss(String call) {
		Random rand = new Random();
		String right = "";
		int x =rand.nextInt(1);
		if(x==0) {
			right = "heads";
			System.out.println("heads");
		}else if(x==1) { System.out.println("tails");
		right = "tails";
		
		}
		if(right.equals(call)) {
			System.out.println("good job");
		}else System.out.println("unlucky");
		
		
	}
}
