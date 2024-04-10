package TempConvert;

public class temperature {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c= 45.5;
		
		double f= convertCtoF(c);
		System.out.println("Type Celsius: " +c);
		System.out.println(f+ " Fahrenheit");
		
		
		double convertFToC= cvertFtoC(f);
		System.out.println("Type Fahrengeit: " +f);
		System.out.println(c+ " Celsius");
		
		

	}

	private static double cvertFtoC(double f) {
		// TODO Auto-generated method stub
		return (5/9)*(f-32);
	}

	private static double convertCtoF(double c) {
		// TODO Auto-generated method stub
		return (9/5)*(c+32);
	}





}
