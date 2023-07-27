/*
 * File name: AlarmClock.java
 * Author :Lei Luo
 * Purpose:to implement polymorphic behavior on using inheritance.*/

package w23assignment2;

/**
 * This class inherits from Clock.When setAlarm(hours, minutes) is called, the
 * AlarmClock stores the alarm.When getTime() is called, and the alarm time has
 * been reached or exceeded, return the time followed by the string "Alarm", and
 * clear the alarm.
 * 
 * @author Lei Luo
 * @version 1.0
 * @since 18.0.2
 * @see Clock
 */
public class AlarmClock extends Clock {
	private String alarm;
	private int alarmHour;
	private int alarmMinute;
	private boolean alarmActive;

	/**
	 * Constructs an AlarmClock object with the specified alarm hour and minute.
	 * 
	 * @param alarmHour   the hour of the alarm
	 * @param alarmMinute the minute of the alarm
	 */
	public AlarmClock(int alarmHour, int alarmMinute) {
		super();
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
		this.alarmActive = true;

	}

	/**
	 * Sets the alarm to the specified hour and minute.
	 * 
	 * @param hours   the hour of the alarm
	 * @param minutes the minute of the alarm
	 */
	public void setAlarm(int hours, int minutes) {
		alarmHour = hours;
		alarmMinute = minutes;
		alarm = String.format("%02d:%02d", hours, minutes);
		alarmActive = true;
	}

	/**
	 * @return the alarm
	 */
	public String getAlarm() {
		return alarm;
	}

	/**
	 * Returns the current time and checks if the alarm has been reached or
	 * exceeded. If the alarm has been reached, returns the time followed by the
	 * string "Alarm", and clears the alarm.
	 * 
	 * @return the current time or the time followed by "Alarm" if the alarm has
	 *         been reached
	 */
	@Override
	public String getTime() {
		String currentTime = super.getTime(); // Get the current time from the Clock superclass

		int currentHour = Integer.parseInt(currentTime.substring(0, 2));
		int currentMinute = Integer.parseInt(currentTime.substring(3, 5));

		// Check if the current time has reached or exceeded the alarm time
		if (alarmActive && (currentHour > alarmHour || (currentHour == alarmHour && currentMinute >= alarmMinute))) {
			clearAlarm(); // Clear the alarm
			return currentTime + " Alarm"; // return the time followed by the string "Alarm"
		}

		return currentTime;
		// Return only the current time
	}

	/**
	 * Clears the alarm by setting the alarmActive flag to false.
	 */
	private void clearAlarm() {
		alarmActive = false;
	}
}
