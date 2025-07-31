package testingDates;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateAddDaysTest {
	private static Date startDate = new Date(1,1,2019);
	@Test
	public void stayInSameMonth() {
		startDate.setDate(2019);
		assertEquals(new Date(1,2,2019), startDate.addOneDay());
		
		startDate = new Date("June", 10, 2019);
		startDate.addOneDay();
		assertEquals(new Date("June", 11, 2019), startDate);

	}

	@Test
	public void moveForwardOneYearByOneDay() {
		startDate.setDate(12, 31, 2019);
		assertEquals(new Date(2020), startDate.addOneDay());
	}
	
	@Test
	public void moveForwardOneMonthByOneDay() {
		startDate.setDate(11, 30,2019);
		assertEquals(new Date(12, 1, 2019), startDate.addOneDay());
	}
}
