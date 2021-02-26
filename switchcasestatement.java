import java.util.Scanner;

public class Probando {
	
	public static void main(String[] args) {
		Scanner xxx = new Scanner(System.in);
		
		System.out.println("Please choose a number of the following | 11, 12, 13, 14 |");
		System.out.print("Number: ");
		
		int x = xxx.nextInt();
		
		switch (x) {
			
			case 11:
				System.out.println("You chose 11");
				break;
				
			case 12:
				System.out.println("You chose 12");
				break;
			
			case 13:
				System.out.println("You chose 13");
				break;
				
			case 14:
				System.out.println("You chose 14");
				break;
				
			default: 
				System.out.println("You did not choose a number from the list");
				break;
				
		}
	}
}

