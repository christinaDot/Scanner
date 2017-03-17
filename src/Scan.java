import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		System.out.println("Enter the price of the product?");
		
		
//scanner library
		Scanner keyboard = new Scanner(System.in);
		double price = keyboard.nextDouble();
		
		System.out.println("The price after 50% discount is " + price*0.5);
		
		
		
	}

}
