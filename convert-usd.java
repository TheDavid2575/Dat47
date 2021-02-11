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

//or

//add other currency here
