/*
 * File name: WorldClockDemo.java
 * Author :Lei Luo
 * Student Number:041068533
 * Course: CST8284_303
 * Assessment: Java assignment one
 * Date: July 7, 2023
 * Professor: Daniel Cormier
 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

/**
 * 
 * 
 *  In WorldClock.java class, override getTime() as needed to return the
 * correct time in the given time zone.  Be careful as the hour can't exceed 24
 * hours in a day, or be negative.
 * 
 *  Test your code by executing WorldClockDemo.java
 */
public class WorldClockDemo {

	/** Starting point of program execution */
	public static void main(String[] args) {
		// test WorldClock
		System.out.println("");
		System.out.println("Testing WorldClock class");
		int offset = 3;
		System.out.println("Offset: " + offset);
		WorldClock wclock = new WorldClock(offset);
		System.out.println("Hours: " + wclock.getHours());
		System.out.println("Minutes: " + wclock.getMinutes());
		System.out.println("Time: " + wclock.getTime());

	}
}
