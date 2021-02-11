import java.util.Scanner;
public class random {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    	System.out.println("Lets compare two ingtigers!");
    	System.out.println("Please enter the first intiger:");
    	int a = input.nextInt();
    	System.out.println("Now enter the second intiger:");
    	int b = input.nextInt();
    	System.out.println("Here are your results:");
    	
    	if (a == b)
    		System.out.println("These numbers are equal.");
    	
    	if (a > b)
    		System.out.println(a + " is the larger number.");
    	
    	if (a < b)
    		System.out.println(b + " is the larger number.");
  } 
}
