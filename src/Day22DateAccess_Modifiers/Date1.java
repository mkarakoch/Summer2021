package Day22DateAccess_Modifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Date1 {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		
		System.out.println(currentDate.plusDays(5));
		System.out.println(currentDate.plusMonths(2));
		System.out.println(currentDate.plusYears(5));
		
		System.out.println(currentDate.plusDays(-5));
		System.out.println(currentDate.minusDays(5));
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("tomorrow " + tomorrow);
		
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("yesterday" + yesterday); 
		
		System.out.println(currentDate.plusYears(2).plusMonths(5).plusDays(15) );
		
		System.out.println(currentDate.minusMonths(5).minusDays(27));
	
		System.out.println(currentDate.getYear());
		System.out.println(currentDate.getMonthValue());
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getDayOfWeek());

		LocalDate date1 = LocalDate.of(1995, 3, 3);
		System.out.println(date1.getDayOfWeek());
		System.out.println(currentDate.isAfter(date1));
		
		// uppercase M is for month lowecase m is for minutes
		
		//yyyy-MM-DD-dd is default format
		
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyy");
		System.out.println("after formatting :" + dateTimeFormatter.format(currentDate1));
	
		DateTimeFormatter formatteddate = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println("after formatting :" + formatteddate.format(currentDate1));
	
		DateTimeFormatter formatteddate1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println("after formatting :" + formatteddate1.format(currentDate1));
	
	System.out.println(formatteddate1.format(currentDate1.plusMonths(3)));
	
		LocalTime currentTime = LocalTime.now();
		
		System.out.println(currentTime);
	
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(timeFormatter.format(currentTime));
	
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(timeFormatter1.format(currentTime));
		
		LocalDate d1 = LocalDate.now();
		
		LocalDate d2 = LocalDate.of(1992, 03, 27);
		
		Period myage = Period.between(d1, d2);
		System.out.println(myage);
		
		int age = Period.between(d1,d2).getYears();
		System.out.println(Math.abs(age));
		
	
	
	
	
	}

}
