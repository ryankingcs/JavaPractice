package practical5;

public class part10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(month(2));
	}

	public static String month(int x) {
		String name = "";
		if(x==1) {
			name = "January";
		}else if(x==2) {
			name ="February";
		}else if(x==3) {
			name ="March";
		}else if(x==4) {
			name ="April";
		}else if(x==5) {
			name ="May";
		}else if(x==6) {
			name ="June";
		}else if(x==7) {
			name ="July";
		}else if(x==8) {
			name ="August";
		}else if(x==9) {
			name ="September";
		}else if(x==10) {
			name ="October";
		}else if(x==11) {
			name ="November";
		}else if(x==12) {
			name ="December";
		}
		
		
		
		return name;
	}
}
