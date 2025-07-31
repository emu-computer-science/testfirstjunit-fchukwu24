package testingDates;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateSetDateTest {

	@Test
	public void testSetDateLegal() {
	    Date d = new Date(3, 10, 2023); // March 10
	    d.setDate("April", 25, 2023);
	    assertEquals(new Date("April", 25, 2023), d);
	    
	    d.setDate("February", 28, 2023);
	    assertEquals(new Date("February", 28, 2023), d);
	    
	    d.setDate("December", 31, 2023);
	    assertEquals(new Date("December", 31, 2023), d);
	    
	    d.setDate("May", 1, 2023);
	    assertEquals(new Date("May", 1, 2023), d);
	}

	@Test
	public void testSetDateIllegal() {
	    Date d = new Date(2, 28, 2023);
	    d.setDate("February", 30, 2023); // feb has less days
	    assertEquals(new Date("February", 28, 2023), d);
	    
	    d.setDate("January", 0, 2023);
	    assertEquals(new Date("February", 28, 2023), d);
	    
	    d.setDate("March", -3, 2023);
	    assertEquals(new Date("February", 28, 2023), d);
	    
	    d.setDate("July", 35, 2023);
	    assertEquals(new Date("February", 28, 2023), d);
	    
	    d.setDate("Octember", 5, 2023); 
	    assertEquals(new Date("February", 28, 2023), d);
	}
}
