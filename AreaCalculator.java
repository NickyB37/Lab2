package lab2;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String a ;
           
		do {
			System.out.println("Enter the the width:");
			double width = scnr.nextDouble();
			System.out.println("Enter the height: ");
			double height = scnr.nextDouble();
			System.out.println("Enter the parameter");
			double parameter = scnr.nextDouble();
			parameter = 4*parameter;
			double Area = height * width;
			System.out.println("The Area of the room is " + Area + "ft");
			System.out.println("The parameter of the room is " + parameter + "ft");
			System.out.println("Would you like to continue (y/n)");
		a = scnr.next();
		} while (a.equalsIgnoreCase("Y"));



	}

}
