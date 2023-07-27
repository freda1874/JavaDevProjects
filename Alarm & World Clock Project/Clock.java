/*
 * File name: Clock.java
 * Author :Lei Luo

 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 
 * 
 * This is to Implement a class Clock whose getHours, getMinutes and getTime
 * methods return the current time and the current time zone is Toronto (EDT,
 * -4). Return the time as a string.
 * 
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 */
public class Clock {

	/** The current time as a string. */
	private String time;
	/** The current hours as a string. */
	private String hours;
	/** The current minutes as a string. */
	private String minutes;

	/**
	 * Updates the time, hours, and minutes based on the current time in Toronto
	 * (EDT, -4).
	 */
	private void updateTime() {

		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		this.hours = String.valueOf(localDateTime.getHour());
		this.minutes = String.valueOf(localDateTime.getMinute());

	}

	/**
	 * @return the hours
	 */
	public String getHours() {
		updateTime();
		return hours;
	}

	/**
	 * @return the minutes
	 */
	public String getMinutes() {
		updateTime();
		return minutes;
	}

	/**
	 * Returns the current time as a string in the format "hh:mm".
	 * 
	 * @return The current time in "hh:mm" format.
	 */
	public String getTime() {
		updateTime();
		this.time = getHours() + ":" + getMinutes();
		return time;
	}

}
