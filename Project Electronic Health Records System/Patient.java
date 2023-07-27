
/*
 * File name: Patient.java
 * Author :Lei Luo
 * Purpose:to facilitate the creation of patients’ health records during their first time of hospital visit. */

 

import java.time.LocalDate;

/**
 * This class represents a system that maintains important health information
 * about a patient.
 * 
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 */
public class Patient {

	/**
	 * Patient's first name.
	 */
	private String firstName;
	/**
	 * Patient's last name.
	 */
	private String lastName;
	/**
	 * Patient's gender.
	 */
	private String gender;
	/**
	 * Patient's birth year.
	 */
	private int birthYear;
	/**
	 * Patient's birth month.
	 */
	private int birthMonth;
	/**
	 * Patient's birth day.
	 */
	private int birthDay;
	/**
	 * Patient’s height (in inches)
	 */
	private double height;
	/**
	 * Patient’s weight (in pounds)
	 */
	private double weight;

	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE

	/**
	 * The class constructor that receives these fields data as parameters.
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

	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}

	// TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE

	/**
	 * get method for first name.
	 * 
	 * @return first name the name of the patient.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * set method for first name.
	 * 
	 * @param firstName user's firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * get method for last name.
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * set method for last name.
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * get method for gender.
	 * 
	 * @return gender the gender of patient
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * set method for gender.
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * get method for birthYear.
	 * 
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * set method for birthYear.
	 * 
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * get method for birthMonth.
	 * 
	 * @return the birthMonth
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * set method for birthMonth.
	 * 
	 * @param birthMonth the birthMonth to set
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * get method for birthDay.
	 * 
	 * @return the birthDay
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * set method for birthDay.
	 * 
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * get method for height.
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * set method for height.
	 * 
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * get method for weight.
	 * 
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * set method for weight.
	 * 
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * This method calculates and returns the patient’s age (in years)
	 * 
	 * @return patient’s age
	 */

	public int patientAge() {
		return LocalDate.now().getYear() - getBirthYear();
	}

	/**
	 * This method calculates and returns MaximumHeartRate as:(220 – Age in years)
	 * 
	 * @return patient’s maximum heart rate
	 */

	public int MaximumHeartRate() {
		return 220 - patientAge();
	}

	/**
	 * This method displays patient's target heart rate range, which is between
	 * MinimumTargetHeartRate and MaximumTargetHeartRate: MinimumTargetHeartRate as
	 * 50% of MaximumHeartRate and MaximumTargetHeartRate as 85% of
	 * MaximumHeartRate.
	 * 
	 * @return The patient's target heart rate range.
	 */

	public String targetHeartRate() {
		double MaximumTargetHeartRate = MaximumHeartRate() * 0.85;
		double MinimumTargetHeartRate = MaximumHeartRate() * 0.5;
		return String.format("minimum: %.2f ~ maximum: %.2f", MinimumTargetHeartRate, MaximumTargetHeartRate);

	}

	/**
	 * THIS RETURNS THE PATIENT'S Body Mass Index (BMI) calculation
	 * 
	 * @return patient’s BMI index
	 */

	public double getBMI() {

		return (getWeight() * 703) / (getHeight() * getHeight());

	}

	/**
	 * This method is intentionally incorrect for testing purposes. The dividend
	 * value 703 has been deliberately changed to 70 .It is specifically designed
	 * for testing purposes.
	 * 
	 * @return The calculated BMI value (incorrect result for testing purposes).
	 */
	public double getWrongBMI() {

		return (getWeight() * 70) / (getHeight() * getHeight());

	}

	/**
	 * THIS DISPLAY ALL THE PATIENT'S HEALTH DATA.Including first name,last
	 * name,gender,Year of birth, month of birth, day of birth, height, weight,age
	 * in years, BMI, maximum heart rate, target heart rate range, BMI values and
	 * information about BMI VALUES.
	 */

	public void displayMyHealthData() {
		System.out.println();
		System.out.println("Here is the patient's health data:");
		System.out.printf("Name: %s %s\n", firstName, lastName);
		System.out.printf("Gender: %s\n", gender);
		System.out.printf("Birthday:%d, %d, %d, age: %d\n", birthYear, birthMonth, birthDay, patientAge());
		System.out.printf("Height: %.2f inches, \nWeight: %.2f pounds\n", height, weight);
		System.out.printf("Maximum heart rate: %d, \nTarget heart rate range: %s,\nBody Mass Index (BMI) : %.2f\n",
				MaximumHeartRate(), targetHeartRate(), getBMI());

//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

}
