/*
 * File name: ClockDemo.java
 * Author :Lei Luo
 * Student Number:041068533
 * Course: CST8284_303
 * Assessment: Java assignment one
 * Date: July 7, 2023
 * Professor: Daniel Cormier
 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

/**
 * Tests the Clock class.
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 * @see Clock
 */
public class ClockDemo {

	/** Starting point of program execution */
	public static void main(String[] args) {
		// test Clock
		System.out.println("Testing Clock class");
		Clock clock = new Clock();
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
	}
}
