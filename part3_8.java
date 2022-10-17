package uk.ac.qub.week4.practicals;

public class part3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				for (int k = 1; k < 11; k++) {
					if ((i == k) && (k == j)) {
						System.out.printf("[%d]* [%d]**  [%d]*** \n", j, k, i);
					}
				}
			}
		}
	}

}
