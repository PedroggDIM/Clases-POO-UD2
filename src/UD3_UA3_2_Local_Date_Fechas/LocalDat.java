package UD3_UA3_2_Local_Date_Fechas;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDat {

	public static void main(String[] args) {
		
		LocalDate localDate1 = LocalDate.now();
	        System.out.println("LocalDate1: " + localDate1);
	 
	        LocalDate localDate2 = LocalDate.now(Clock.systemUTC());
	        System.out.println("LocalDate2: " + localDate2);
	        
	        LocalDate localDate3 = LocalDate.now(ZoneId.systemDefault());
	        System.out.println("LocalDate3: " + localDate3);
	        
	        LocalDate localDate4 = LocalDate.of(1980, 4, 9);
	        System.out.println("LocalDate4: " + localDate4);
	        
	        LocalDate localDate5 = LocalDate.of(1980, Month.APRIL, 9);
	        System.out.println("LocalDate5: " + localDate5);
	        
	        LocalDate localDate6 = LocalDate.ofEpochDay(3629);
	        System.out.println("LocalDate6: " + localDate6);
	        
	        LocalDate localDate7 = LocalDate.ofYearDay(1997, 127);
	        System.out.println("LocalDate7: " + localDate7);
	        
	        LocalDate localDate8 = LocalDate.parse("2018-07-24");
	        System.out.println("LocalDate8: " + localDate8);
	        
	        LocalDate localDate9 = LocalDate.parse("20180724", DateTimeFormatter.BASIC_ISO_DATE);
	        System.out.println("LocalDate9: " + localDate9);
	        
	        LocalDate localDate = LocalDate.now();
	        System.out.println("LocalDate    : " + localDate);
	        System.out.println("DayOfMonth   : " + localDate.getDayOfMonth());
	        System.out.println("MonthValue   : " + localDate.getMonthValue());
	        System.out.println("Year         : " + localDate.getYear());
	        
	        System.out.println("DayOfWeek    : " + localDate.getDayOfWeek());
	        System.out.println("Month        : " + localDate.getMonth());
	        System.out.println("DayOfYear    : " + localDate.getDayOfYear());
	 
	        System.out.println("DAY_OF_MONTH : " + localDate.getLong(ChronoField.DAY_OF_MONTH));        
	        System.out.println("MONTH_OF_YEAR: " + localDate.getLong(ChronoField.MONTH_OF_YEAR));
	        System.out.println("YEAR         : " + localDate.getLong(ChronoField.YEAR));

	    System.out.println("\n---------------------------------------");	        
	        LocalDate localDate22 = LocalDate.parse("1980-04-09");
	        System.out.println("LocalDate     : " + localDate22);
	        
	        // Adding/subtracting days
	        System.out.println("10 days before: " + localDate22.minusDays(10));
	        System.out.println("15 days later : " + localDate22.plusDays(15));
	        
	        // Adding/subtracting months
	        System.out.println("Minus 4 months: " + localDate22.minusMonths(4));
	        System.out.println("Plus 5 months : " + localDate22.plusMonths(5));
	        
	        // Adding/subtracting weeks
	        System.out.println("Minus 20 weeks: " + localDate22.minusWeeks(20));
	        System.out.println("Plus 30 weeks : " + localDate22.plusWeeks(30));
	        
	        // Adding/subtracting years
	        System.out.println("Minus 12 years: " + localDate22.minusYears(12));
	        System.out.println("Plus 4 years  : " + localDate22.plusYears(4));
	        
	        // Using DAYS
	        System.out.println("30 days before: " + localDate22.minus(30, ChronoUnit.DAYS));
	        // Using WEEKS
	        System.out.println("3 weeks before: " + localDate22.minus(3, ChronoUnit.WEEKS));
	        // Using MONTHS
	        System.out.println("6 months later: " + localDate22.plus(6, ChronoUnit.MONTHS));
	        // Using YEARS
	        System.out.println("2 years later : " + localDate22.plus(2, ChronoUnit.YEARS));
	        
	        // Using TemporalAmount - Period 
	        System.out.println("5 years later : " + localDate22.plus(Period.ofYears(5))); 
	        
System.out.println("\n-----------------------------------------------");        
	        LocalDate today = LocalDate.now();

	        String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	        System.out.println("LONG format: " + formattedDate);

	        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
	        System.out.println("MEDIUM format: " + formattedDate);

	        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
	        System.out.println("SHORT format: " + formattedDate);

	        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	        System.out.println("FULL format: " + formattedDate);
	        
	        
	     // old string format
	        String oldStr = "12/23/2019";

	        // parse old string to date
	        LocalDate date1 = LocalDate.parse(oldStr, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

	        // format date to string
	        String newStr = date1.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));

	        // print both strings
	        System.out.println("Date Format (before): " + oldStr);
	        System.out.println("Date Format (after): " + newStr);
	        
	        LocalDate hoy = LocalDate.now();
	        LocalDate haceUnAño  = hoy.minusDays(365);
	       	System.out.println(haceUnAño);
	       	
	       	//dentro de 1 año:
	       	System.out.println("Dentro de un año: " + hoy.plusDays(365));
	       	
	       	System.out.println(today.isBefore(date1));
	       	
	       	long rangoDias = ChronoUnit.DAYS.between(today, today.plusDays(2));
	       	
	       	System.out.println(rangoDias);
	       	
	       	
System.out.println("\n-------opciones .now( ) -----------------------");	       	

	        /*
	         * Opciones .now()
	         */
	        System.out.println(LocalDate.now()); // 2022-11-23
	        System.out.println(LocalTime.now()); // 19:03:12.134193
	        System.out.println(LocalDateTime.now()); // 2022-11-23T19:03:35.010253
	        System.out.println(LocalDate.now().getDayOfMonth()); // 23
	        System.out.println(LocalDate.now().getDayOfWeek()); // WEDNESDAY
	        System.out.println(LocalDate.now().getMonth()); // NOVEMBER
	        System.out.println(LocalDate.now().lengthOfMonth()); // 30
	        System.out.println(LocalDate.now().withDayOfYear(5)); // 2022-01-05
	        System.out.println(LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"))); // noviembre

	        /*
	         * Opciones .of()
	         */
	        System.out.println(LocalDate.of(2012, Month.MAY, 14)); // 2012-05-14
	        System.out.println(LocalDate.of(1988, 11, 9)); // 1988-11-09

	        LocalDate yesterday = LocalDate.now().minusDays(1);
	        LocalDate today1 = LocalDate.now();
	        LocalDate tomorrow = LocalDate.now().plusDays(1);

	        System.out.println(today1.compareTo(tomorrow)); // -1
	        System.out.println(today1.compareTo(yesterday)); // 1
	        System.out.println(today1.isAfter(tomorrow)); // false
	        System.out.println(today1.isAfter(yesterday)); // true

	        /*
	         * Formateo
	         */
	        Locale spanishLocale = new Locale("es", "ES");
	        LocalDateTime date = LocalDateTime.now();
	        String year = date.format(DateTimeFormatter.ofPattern("yyyy", spanishLocale));
	        String month = date.format(DateTimeFormatter.ofPattern("MMMM", spanishLocale));
	        String day = date.format(DateTimeFormatter.ofPattern("dd", spanishLocale));
	        String dayOfWeek = date.format(DateTimeFormatter.ofPattern("EEEE", spanishLocale));
	        String hour = date.format(DateTimeFormatter.ofPattern("HH", spanishLocale));
	        String minute = date.format(DateTimeFormatter.ofPattern("mm", spanishLocale));

	        String text = String.format("La fecha de hoy es %1$s, %2$s de %3$s de %4$s, a las %5$s:%6$s.", dayOfWeek, day,
	            month, year, hour, minute);

	        System.out.println(text); // La fecha de hoy es miércoles, 23 de noviembre de 2022, a las 19:58.
	        
	     
	        /*
	         * Cambio de zona horaria
	         */
	        ZoneId spainZone = ZoneId.of("Europe/Madrid"); // https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
	        ZoneId japanZone = ZoneId.of("Japan");
	        LocalDateTime timeNow = LocalDateTime.now();
	        ZonedDateTime localTime = ZonedDateTime.of(timeNow, spainZone);
	        ZonedDateTime japanTime = localTime.withZoneSameInstant(
	            japanZone);

	        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

	        System.out.println("En Japón son: " + japanTime.format(format)); // En Japón son: Nov 24 2022 04:28 AM
	       	
	       	
	       	
	        
	}

}
