
/*
 * File name: MyHealthDataTest2.java
 * Author :Lei Luo
 * Purpose:Create a two test cases for Patient in a class and name it MyHealthDataTest2 to test the getBMI() method */

package w23assignment1;

public class MyHealthDataTest2 {

	public static void main(String[] args) {
		final double TOLERANCE = 0.1;

		final double CORRECTRESULT = 20.2;

		// Test Case 1
		Patient patient1 = new Patient("John", "Smith", "Male", 1985, 5, 6, 66, 125);
		System.out.printf("Test Case One");
		System.out.printf("Your BMI value: %.2f\n", patient1.getBMI());
		double absoluteResultOne = Math.abs(patient1.getBMI() - CORRECTRESULT);
		if (absoluteResultOne > TOLERANCE) {
			System.out.printf(
					"This is a wrong BMI calculation!\nthe correct result is %.1f, which exceed the tolerance of %.2f.",
					CORRECTRESULT, TOLERANCE);
		} else {
			System.out.println("This is a correct BMI calculation!");

		}
		System.out.println();

		// Test Case 2
		System.out.printf("Test Case Two");
		Patient patient2 = new Patient("Will", "Smith", "Male", 1985, 5, 6, 66, 125);
		System.out.printf("Your BMI value: %.2f\n", patient2.getWrongBMI());
		double absoluteResultTwo = Math.abs(patient2.getWrongBMI() - CORRECTRESULT);
		if (absoluteResultTwo > TOLERANCE) {
			System.out.printf(
					"This is a wrong BMI calculation!\nThe correct result should be %.1f, which exceed the tolerance of %.2f.",
					CORRECTRESULT, TOLERANCE);
		} else {
			System.out.println("This is a correct BMI calculation!");

		}

	}

}
