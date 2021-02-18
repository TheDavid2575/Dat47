David Perez | Exercise 4A | Dat49

1.	

Code:
Public class random {
public static void main(String[] args) { 
	
	//Task: Use a for loop to print the odd numbers from 1 to 25 on the screen
    
    	for (int a = 1; a <= 25; a++ )
    		if(a % 2 != 0)
    		System.out.print(a + " ");
    	
	} 
}
________________________________________________________________

2.	
 
Code:
public class random {
public static void main(String[] args) { 
	
	//Task: Use a while loop to print numbers 1 to 20 on the screen
    
	int x = 1;
	
    	while (x <= 20) {
    		System.out.print(x + " ");
    		x++;
    	}
	} 
}
________________________________________________________________
 

3.	

Code:
 public class random {
public static void main(String[] args) { 
	
	//Task: Use a do-while loop to print numbers 1 to 15 on the screen 
    
	int x = 1;
	
		do {
			System.out.print( x + " ");
			x++;
		} while (x <= 15);
	
	} 
}
________________________________________________________________

4.	

Code:

public class random {
public static void main(String[] args) { 
	
	//Task: Use a loop structure to calculate the sum of all odd numbers from 1 to 30
    
	int sum = 0;
	
	for (int x = 1; x <= 30; x++) {
		if (x % 2 != 0)
			sum = sum + x; }
		
		System.out.print(sum);
	} 
}

Code:
public class random {
public static void main(String[] args) { 
	
	//Task: Use a loop structure to calculate the product of all even numbers from 1 to 10.
	
	int prod = 1;
	
	for (int x = 1; x <= 10; x++) {
		if (x % 2 == 0)
			prod = prod * x; 
		}
	
		System.out.print(prod);
	} 
}
