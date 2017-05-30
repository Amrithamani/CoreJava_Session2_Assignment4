package Session2;

import java.util.Scanner;

public class TestDemo {

	// method declared in class to check values passing number as arguments

	public void checkingValue(int number) {

		// condition to check number equal to zero

		if (number == 0) {
			System.out.println("You Have Entered Zero");// print the given line
		}

		// condition to check number greater than zero

		else if (number > 0) {
			System.out.println("You Have Entered Positive Value");// print the
			// given
			// line
		}

		// condition to check number less than zero

		else if (number < 0) {
			System.out.println("You Have Entered Negative Value");// print the
			// given
			// line
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDemo obj = new TestDemo();// creating object for the class TestDemo

		// initialize variable to get input using Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number");// print the given statement

		int number = input.nextInt();// getting the number

		obj.checkingValue(number);// object calling the method in class TestDemo
		// which accepts the number as argument

	}

}
