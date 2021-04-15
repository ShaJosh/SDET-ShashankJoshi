package genericlib;

import java.util.Date;
import java.util.Random;

public class Java_Utility {

	/**
	 * @author Shashank
	 * @Generate a random number
	 * @return random number till 10000
	 */
	public int createRandomNumber() {
		Random r = new Random();
		int randomnumber = r.nextInt(10000);
		return randomnumber;
	}

	/**
	 * @author Shashank
	 * @Provide Current System Date
	 * @return currentSysDate
	 */

	public String getCurrentSystemDate() {
		Date dateobj = new Date();
		String currentSysDate = dateobj.toString();
		return currentSysDate;

	}

	/**
	 * @author Shashank
	 * @Provide current month
	 * @return current month
	 */
	public int getCurrentMonth() {
		Date dateobj = new Date();
		return dateobj.getMonth();

	}

	/**
	 * @author Shashank
	 * @Gives current date
	 * @return date
	 */
	public String getDate() {
		Date dateobj = new Date();
		String currentSysDate = dateobj.toString();
		String arr[] = currentSysDate.split(" ");
		return arr[2];

	}
}
