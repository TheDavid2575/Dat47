import java.util.Scanner;
public class Driving {
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    double distance, gas, mileage; 
    System.out.println("Enter the distance traveled \n"); 
    distance = input.nextDouble();  
    System.out.println("Enter the amount of gas used\n");
    gas = input.nextDouble(); 
    mileage = distance/gas;
    System.out.printf("mileage is %.2fMPG\n", mileage);
  } 
}
