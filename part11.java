package practical5;

public class part11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getAverage(5,3,2));
	}
	
	public static double getAverage(int x, int y, int z) {
		double average = 0;
		double x1 = x;
		double y1 = y;
		double z1 = z; 
		average = (z1 + y1 + x1)/3;
		
		
		return average;
	}

}
