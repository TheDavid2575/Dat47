import java.util.Scanner;
public class random {
public static void main(String[] args) {  
	Scanner s = new Scanner(System.in); 
	
		System.out.println("Calculate your gross pay for this week.");
		System.out.print("Name: ");
		String N = s.nextLine();
		System.out.print("Amount of hours worked: ");
		double H = s.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double P = s.nextDouble();
		
		if (H <= 40) {
			double WP = H * P;
			System.out.printf("%s, your pay for this week will be %f$", N, WP);
		}
		
		if (H >= 40) {
			double WP = (40 * P) + ( (H - 40) * P);
			System.out.printf("%s, your gross pay for this week will be %f$", N, WP );
		}
	} 
}
