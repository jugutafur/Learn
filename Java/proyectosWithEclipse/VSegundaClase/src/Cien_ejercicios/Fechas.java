package Cien_ejercicios;

import java.time.LocalDate; //solo la fecha
import java.time.LocalDateTime; //fecha y hora 
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.Month.FEBRUARY;
import static java.time.Month.OCTOBER;

public class Fechas {
	
	public static void main (String[] args) {
		
		LocalDate myDate = LocalDate.now();
		LocalDateTime myDateTime = LocalDateTime.now();
		DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		ZonedDateTime myZonedDateTime = ZonedDateTime.now();
				
		System.out.println("This class you can use dates");
		System.out.println("today is = "+ myDate);
		System.out.println("today is = "+ myDateTime);
		System.out.println("today is = "+ myDate.format(myDateTimeFormatter));
		
		//vamos a cambiar el formato
		myDateTimeFormatter = DateTimeFormatter.ISO_ORDINAL_DATE; //Saca el numero de dias que van corridos en el anio 2022-018
		System.out.println("today is = "+ myDate.format(myDateTimeFormatter));
		
		myDateTimeFormatter = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy G, hh:mm a 'Q'q VV");
		System.out.println("today is = "+ myZonedDateTime.format(myDateTimeFormatter));
		
		/********************************************************/
		LocalDate now, bDate, nowPlusMonth, nextTues;
		
		now = LocalDate.now(); //la fecha de ahora
		bDate = LocalDate.of(1988, Month.SEPTEMBER, 24); //Una fecha puntual 
		nowPlusMonth = now.plusMonths(3); //Sumarle 3 meses
		nextTues = now.with(next(TUESDAY));
		
		System.out.println("More aplication");
		System.out.println("Hoy es = "+ now);
		System.out.println("MI fecha de nacimiento es  = "+ bDate);
		System.out.println("la fecha de nacimiento fue bisiesto? = "+ bDate.isLeapYear()); //Si el anio fue bisiesto true or false
		System.out.println("Que DIA de la semana Naciste? "+bDate.getDayOfWeek());
		System.out.println("Que DIA del mes Naciste? "+bDate.getDayOfMonth());
		System.out.println("Que ANIO de la semana Naciste? "+bDate.getDayOfYear());
		
		System.out.println("De hoy a 3 meses sera "+ nowPlusMonth);
		System.out.println("El proximo sera  "+ nextTues);
		
		/********************************************************/
		LocalDateTime meeting, flight, courseStart, courseEnd;
		
		meeting = LocalDate.of(2021, 03, 15).atTime(13, 30); //la reunion es a las 1:30pm
		System.out.println("La fecha y hora de la reunion es =  "+ meeting);
		
		LocalDate flightDate = LocalDate.of(2021, FEBRUARY, 25); 
		LocalTime flightTime = LocalTime.of(10, 30);
		flight = LocalDateTime.of(flightDate, flightTime);
		System.out.println("Datos del vuelo = "+ flight);
		
		courseStart = LocalDateTime.of(2020, OCTOBER, 2, 9, 00);
		courseEnd = courseStart.plusDays(30).plusHours(2);
		System.out.println("El curso Inicia = "+ courseStart);
		System.out.println("El curso Finaliza = "+ courseEnd);
	}

}
