package Day22DateAccess_Modifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Date01 {

	public static void main(String[] args) {
		
		// create a date object
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println(currentDate);
		System.out.println(currentDate.plusDays(8));
		System.out.println(currentDate.plusMonths(2));
		System.out.println(currentDate.plusYears(5));
		System.out.println(currentDate.plusYears(5));
		System.out.println(currentDate.plusDays(-11));
		System.out.println();
		System.out.println("*******");
		
		System.out.println(currentDate.plusDays(4).plusMonths(3).plusYears(2));
		System.out.println(currentDate.getYear());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getMonthValue());
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.plusWeeks(2));
		System.out.println();
		System.out.println("*************");
		
		
		LocalDate date2 = LocalDate.of(2020, 8, 10);
		
		System.out.println(currentDate.isAfter(date2));//true
		System.out.println(currentDate.isBefore(date2));//false
		
		System.out.println();
		
		LocalDateTime daytime = LocalDateTime.now();
		
		System.out.println(daytime);
		
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);
		DateTimeFormatter dtformat1= DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

		System.out.println(dtformat1.format(currentDate2));// 12/Jul/21
		/*
		 M is Month
		 m is minutes 
		 MM=> the number of months 
		 MMM=> is initials of the months 
		 
		 */
		System.out.println();
		
		System.out.println(dtformat1.format(currentDate2.plusMonths(2)));
		System.out.println();
		
		
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);
		
		DateTimeFormatter dtformat2= DateTimeFormatter.ofPattern("HH:mm");
		/*
		  HH => am- pm format 
		  hh => 24 hour format 
		 */
		System.out.println(dtformat2.format(currentTime1));//08:08
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		LocalDate d1 = LocalDate.now();
		
		LocalDate d2 = LocalDate.of(2009, 07, 07);
		Period age = Period.between(d1, d2);
		
		System.out.println(age);
		
	int ageYear	= Period.between(d1, d2).getYears();
	System.out.println(ageYear);
	
		
		
		
		
		

		
	}

}
