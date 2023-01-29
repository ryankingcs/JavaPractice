package javapractice2901;

public class appearsOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 20, 10, 20, 30, 40, 40, 30, 50 };

		System.out.println(getSingleNumber(array));

	}

	public static int getSingleNumber(int[] nums) {

		if (nums == null || nums.length == 0) {

			return -1;

		}

		int result = 0;

		for (int i = 0; i < nums.length; i++) {

			result ^= nums[i];

		}

		return result;

	}

}
