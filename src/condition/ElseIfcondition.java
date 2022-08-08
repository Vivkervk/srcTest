package condition;

public class ElseIfcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 60;
		String country = "india";
		if (age>=70 &&country.equalsIgnoreCase("india"))
		{
			System.out.println("my age is 60 lives in india");
		}
		else if (age==60 &&country.equalsIgnoreCase("india"))
		{
			System.out.println("my age is 60 lives in india");
		}
		else 
		{
			System.out.println("no data available");
		}
	}

}
