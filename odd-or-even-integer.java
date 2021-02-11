import java.util.Scanner;
public class random {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    	System.out.println("Is your integer even? Lets find out.");
    	System.out.println("Please enter the intiger:");
    	int a = input.nextInt();
    	
    	if (a%2==0)
    		System.out.println("This number is even");
    	
    	else
    		System.out.println("This number is odd");
	} 
}
