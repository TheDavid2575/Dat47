//rupees

import java.util.Scanner;
public class random {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    	System.out.println(“Convert US Dollars to Rupees!”);
    	System.out.print(“USD: “);
    	double USD = input.nextInt();
    	double Indian_rupee = 75 * USD;
    	System.out.println(USD + “converted to Indian Rupee is “ + Indian_rupee);
	} 
}


//canadian "dollars"

import java.util.Scanner;
public class convert1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double USD, CD;
		System.out.println("Enter the amount of US dollars\n");
		USD = input.nextDouble();
		CD = 1.4*USD;
		System.out.printf("The amount of Canadian dollars is %.2f\n", CD);	
	}
}
