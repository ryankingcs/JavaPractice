package practical5;

public class part12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(capitalCities("Japan"));
	}
 
	public static String capitalCities(String country) {
		String capital = "";
		if(country.equals("France")) {
			capital = "Paris";
		}else if(country.equals("Germany")){
			capital = "Berlin";
		}else if(country.equals("Italy")){
			capital = "Rome";
		}else if(country.equals("Japan")){
			capital = "Tokyo";
		}else if(country.equals("Russia")){
			capital = "Moscow";
		}else if(country.equals("United Kingdom")){
			capital = "London";
		}else if(country.equals("United States")){
			capital = "Washington";
		}
		
		
		
		return capital;
	}
}
