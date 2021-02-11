import java.util.Scanner;
public class random {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    	System.out.println("Find out if a number is a multiple of another number!");
    	System.out.print("Factor:");
    	int a = input.nextInt();
    	
    	System.out.print("Multiple:");
    	int b = input.nextInt();
    	
    	if (b%a==0)
    		System.out.println("Yes, " + b + " is a multiple of " + a);
    	
    	else
    		System.out.println("No, " + b + " is not a multiple of " + a);
	} 
}
