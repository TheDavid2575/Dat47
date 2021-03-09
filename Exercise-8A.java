// Exercises for class

//------------------------------------------

/* Task: 
Write a complete Java application to prompt the user for the double radius of a circle, and
call method circlePerm to calculate and display the circumference of the circle. 
Use the following statement to calculate the area: double circum = 2*Math.PI * radius
*/

import java.util.Scanner;

public class Probando {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 	System.out.print("Please enter the radius of the circle: ");
	 	double rad = s.nextDouble();
	 	double circum = circlePerm(rad);
	 	System.out.printf("The circumference of the cirle is: %f", circum );
	}

	static double circlePerm (double a) {
		double circum = 2 * Math.PI * a;
		return circum;
	}
	
}

//------------------------------------------

/*  Task:
-Stimulate a roll dice environment using random functions and using a for loop 
-Toss the dice 200 times and print the number of times each face occurs.
*/


import java.util.Scanner;
import java.util.Random;

public class random {
	
	public static int n;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Creates an object of the Scanner imported from java.util library
		Random r = new Random();
		
		System.out.println("Lets flip heads and tails 200 times and see the results...");
		
		int one = 0; 
		int two = 0; 
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int a;
		
		for (int x = 1;x <= 200; x++) {
			
		a = 1 + r.nextInt(6);
			
			switch(a) {
			
				case (1) : 
					one++;
					break;
				
				case (2) : 
					two++;
					break;
				
				case (3) : 
					three++;
					break;
			
				case (4) : 
					four++;
					break;
			
				case (5) : 
					five++;
					break;
			
				case (6) : 
					six++;
					break;
			
				default :
				
					break;
				
				}
			
		}	
		
		System.out.println("Dice roll 1: " + one);
		System.out.println("Dice roll 2: " + two);
		System.out.println("Dice roll 3: " + three);
		System.out.println("Dice roll 4: " + four);
		System.out.println("Dice roll 5: " + five);
		System.out.println("Dice roll 6: " + six);	
			
	}
	 
}

//------------------------------------------

/* 
Task:
-Stimulate a coin tossing environment using random functions and using a for loop.
-Toss the coin 200 times and print the number of heads and tails. 
*/


import java.util.Scanner;
import java.util.Random;

public class random {
	
	public static int n;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Creates an object of the Scanner imported from java.util library
		Random r = new Random();
		
		System.out.println("Lets flip heads and tails 200 times and see the results...");
		
		int H = 0; 
		int T = 0; 
		int a;
		
		for (int f = 1; f <= 200; f++) {
			a = r.nextInt(2);
			
			//Heads = 0
			if (a == 0) { 
				H = H + 1; //add 1 to the variable H if random function produces 0
			}
			
			//Tails = 1
			if (a == 1) {
				T = T + 1; //add 1 to the variable T if random function produces 1
			}
			
		}
			
		System.out.println("Heads: " + H + " times." );
		System.out.println("Tails: " + T + " times." );
		
		
		
	}
	 
}


//------------------------------------------
