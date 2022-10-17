package uk.ac.qub.week4.practicals;

public class part3_9 {

	public static void main(String[] args) {
		for (int i = 1850; i < 2023; i++) {
			if (i % 4 == 0) {
				if ((i % 100 != 0) && (i % 400 == 0)) {

				} else {
					System.out.println(i);
				}
			}
		}
	}

}
