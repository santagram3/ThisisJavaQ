package BlogUpload.ch05.Enum;

public class EnumMain {
	
	public static void main(String[] args) {
		
		Week week1 = Week.MONDAY;
		Week week2 = Week.TUESDAY;
		System.out.println(week1);
		System.out.println(week2);
		System.out.println(week1.toString());
		System.out.println(week1.getClass().getName());
		//System.out.println(Week.getClass());
	}
}
