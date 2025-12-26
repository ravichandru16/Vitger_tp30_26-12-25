package genericUtility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateMethodSource {

	/**
	 * This is used to get system date Approach:1
	 * @return
	 */
	public String systemDate()
	{
		LocalDate date=LocalDate.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String sysdate=d.format(date);
		return sysdate;
	}
	
	/**
	 * Get system date approach:1
	 * @return
	 */
	public String sysDate()
	{
		Date dt= new Date();
		
		SimpleDateFormat sdt=new SimpleDateFormat("dd-MM-yyy_HH-mm-ss");
		String updateddt = sdt.format(dt);
		return updateddt;
	}
	
	/**
	 * This is used to get the future date
	 * @param plusyear
	 * @return
	 */
	public String futureDate(long plusyear)
	{
		LocalDate dt=LocalDate.now();
		LocalDate ldt=dt.plusYears(plusyear);
		
		
		DateTimeFormatter d= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String futureyr=d.format(ldt);
		return futureyr;
		
	}
}
