package javapractice2901;

public class multiplyelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,3,-5,4};
		int[] array2 = {1,4,-5,-2};
		int[] result = new int[4];
		
		for(int i = 0; i < array1.length; i++) {
			
			result[i] = array1[i] * array2[i];
			
		}
		
		System.out.print("[");
		
		for(int i = 0; i < array1.length; i++) {
			
			System.out.print(result[i] + ", ");
			
		}
		
		System.out.print("]");
		
	}

}
