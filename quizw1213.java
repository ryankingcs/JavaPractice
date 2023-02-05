package javapractice;

public class quizw1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int answer = 0;
for(int outer = 1; outer<10; outer++) {
	for(int middle = 1; middle <5; middle ++) {
	for(int inner = 1; inner <10; inner++) {
		answer++;
		if(inner==5)
			break;
	}}
	
}System.out.println(answer);

	}

}
