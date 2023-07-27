/*
 * File name: ClocksDemo.java
 * Author :Lei Luo
 * Student Number:041068533
 * Course: CST8284_303
 * Assessment: Java assignment one
 * Date: July 7, 2023
 * Professor: Daniel Cormier
 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

/**
 * A test class that would create a Clock, a WorldClock and an AlarmClock with
 * some parameters. Stores all clocks in an array of Clock type. and Loop
 * through the array and use polymorphism to ask each clock for its time, and
 * print this time along with the clock class name.
 * 
 * * @author Lei Luo
 * 
 * @version 1.0
 * @since 18.0.2
 * @see Clock
 * @see WorldClock
 * @see AlarmClock
 */
public class ClocksDemo {

	/** Starting point of program execution */
	public static void main(String[] args) {

		Clock[] clocks = { new Clock(), new WorldClock(-4), new AlarmClock(14, 30) };

		for (Clock clock : clocks) {
			String className = clock.getClass().getSimpleName(); // Get the class name of the clock object
			String time = clock.getTime(); // Get the time of the clock object
			System.out.println(className + ": " + time); // Print the class name and time
		}

	}
}
