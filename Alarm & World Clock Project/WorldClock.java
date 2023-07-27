/*
 * File name: WorldClockDemo.java
 * Author :Lei Luo
 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Subclass of Clock that represents a world clock with a time offset.
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 * @see Clock
 * 
 */

public class WorldClock extends Clock {
	/** The time offset in hours. */
	private int timeOffset;

	/**
	 * Constructs a WorldClock object with the given time offset.
	 *
	 * @param timeOffset The time offset in hours. A negative value represents time
	 *                   zones after UTC, while a positive value represents time
	 *                   zones ahead of UTC.
	 */

	public WorldClock(int timeOffset) {
		super();
		if (timeOffset >= -12 && timeOffset <= 14) {
			this.timeOffset = timeOffset;
		} else {
			throw new IllegalArgumentException("Invalid time offset. Time offset must be between -12 and 14.");
		}
	}

	/**
	 * Returns the current time adjusted by the time offset from UTC.
	 * 
	 * @return The current time adjusted by the time offset.
	 */
	@Override
	public String getTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		ZonedDateTime adjustedTime = zonedDateTime.plusHours(timeOffset);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm z");
		return adjustedTime.format(formatter);
	}

}
