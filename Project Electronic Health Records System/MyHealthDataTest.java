
/*
 * File name: MyHealthDataTest.java
 * Author :Lei Luo
 * Purpose:to facilitate the creation of patients’ health records during their first time of hospital visit. */


import java.util.Scanner;

/**
 * Write a Test class for your code named MyHealthDataTest.java. This code
 * prompt for input of the patient’s data (described above), instantiate an
 * object of the class Patient for that patient and then prints the data from
 * that object.
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 * @see Patient
 */
public class MyHealthDataTest {
	/**
	 * 
	 * The main method is the entry point of the Java program.
	 * 
	 * @param args The command-line arguments passed to the program.
	 */
	public static void main(String[] args) {

		/**
		 * This method creates a Scanner object to allow user input from the console.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = input.nextLine();
		System.out.println("Please enter your gender(Female or Male):");
		String gender = input.nextLine();
		System.out.println("Please enter your birth year:");
		int birthYear = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your birth month in number:");
		int birthMonth = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your birth day:");
		int birthDay = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your height(in inches):");
		double height = input.nextDouble();
		input.nextLine();
		System.out.println("Please enter your weight(in pounds):");
		double weight = input.nextDouble();
		input.nextLine();

		/**
		 * 
		 * Constructs a new Patient object with the given information.
		 * 
		 * @param firstName  The first name of the patient.
		 * @param lastName   The last name of the patient.
		 * @param gender     The gender of the patient.
		 * @param birthYear  The birth year of the patient.
		 * @param birthMonth The birth month of the patient.
		 * @param birthDay   The birth day of the patient.
		 * @param height     The height of the patient in inches.
		 * @param weight     The weight of the patient in pounds.
		 */
		Patient patient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
		patient.displayMyHealthData();
		System.out.println();
		System.out.println("Programmed by Lei Luo, student number:041068533");

	}

}
