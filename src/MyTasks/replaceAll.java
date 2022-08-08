package MyTasks;

public class replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (this is to replace 2 ore more letter or words in a string) (eg; vcentry-cenvtry, 5tech-6tech)
String a="5Tech";
String b="vcentry";
System.out.println(b.replaceAll("vcen","cenv"));
		System.out.println(a.replaceAll("5","6"));
	}

}
