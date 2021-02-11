//finds commision of a sales person who gets 20%

import java.util.Scanner;
public class random {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    	System.out.println("Calculate the commission of a sales person with 20% commission.");
    	System.out.print("Sales in USD: ");
    	double sales = input.nextDouble();
    	
    	double commission = sales * .2;
    	System.out.println("The commission of this employees sales is: " + commission + “$”);
	} 
}
