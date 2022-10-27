package practical5;
import java.util.Calendar;
public class part8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
timeOfDay();
	}

	public static void timeOfDay() {
		Calendar cal = Calendar.getInstance();
		if((cal.get(Calendar.AM_PM))==1) {
			System.out.println("morning");
		}else System.out.println("good night");
	}
}
