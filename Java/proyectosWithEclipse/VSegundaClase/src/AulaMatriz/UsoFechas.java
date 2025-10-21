package AulaMatriz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.Month.FEBRUARY;
import static java.time.Month.APRIL;
import static java.time.Month.JULY;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.YEARS;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.DECADES;;
//import static java.time.DayOfWeek.*;
//import static java.time.temporal.TemporalAdjusters.next;

public class UsoFechas {
	
	public static void main(String [] args) {
		
		System.out.println("usted se llama " +args[0]+ " "+args[1]);//Debes de insertar las variables antes de ejecutarlo
		System.out.println("This app you can use to dates");
		System.out.println("El nacimiento de Abraham Lincoln "
				+ "fue el 12 de febrero de 1809\ny murio el 15 "
				+ "de abril de 1855\n");
		
		LocalDate nacimientoAbraham, fallecimientoAbraham;
		
		nacimientoAbraham = LocalDate.of(1809, FEBRUARY, 12);
		fallecimientoAbraham = LocalDate.of(1855, APRIL, 15);
		//aniosAbraham = LocalDate.MIN()
		//diasVivoAbraham = nacimientoAbraham.plu)
		
		System.out.println("Cuantos anios tenia cuando murio = "+ nacimientoAbraham.until(fallecimientoAbraham, YEARS)+ " anios");
		System.out.println("Cuantos dias vivio = "+ nacimientoAbraham.until(fallecimientoAbraham, DAYS)+ " Dias");
		
		System.out.println("***********************************");
		
		System.out.println("Bennedict cumberbatch nacio el 19 de julio "
				+ "de 1976\n");
		
		LocalDate nacimientoBennedict, TreintaAniosBennedict, aniosActualBennedict;
		
		nacimientoBennedict = LocalDate.of(1976, JULY, 19);
		TreintaAniosBennedict = nacimientoBennedict.plusYears(30);
		//aniosActualBennedict = nacimientoBennedict + LocalDate.now();
				
		System.out.println("Nacio en un anio bisiesto? = "+ nacimientoBennedict.isLeapYear());
		System.out.println("Cuantas decadas ha vivido? = "+ nacimientoBennedict.until(TreintaAniosBennedict, DECADES) + " Decadas" );
		System.out.println("Que dia de la semana era?, cuando cumplio 30 anios = "+TreintaAniosBennedict.getDayOfWeek());
		
		System.out.println("***********************************");
		
		System.out.println("Un vuelo sale de Boston a Miami, el 24 de marzo "
				+ "2021 a las 9:16 pm  la duracion del vuelo es 4 horas y 15 minutos\n");
		
		LocalDateTime salidaBoston, llegadaSinRetrasoMIAMI, salidaConRetraso, llegadaConRetrasoMIAMI;
		
		salidaBoston = LocalDateTime.of(2021, MARCH, 24, 21, 16);
		llegadaSinRetrasoMIAMI = salidaBoston.plusHours(4).plusMinutes(15);
		salidaConRetraso = salidaBoston.plusHours(1).plusMinutes(27);
		llegadaConRetrasoMIAMI = salidaConRetraso.plusHours(4).plusMinutes(15);
		
		System.out.println("Cuando y a que horas llega el vuelo a MIAMI? = "+ llegadaSinRetrasoMIAMI);
		System.out.println("Si se atrasa el vuelo 1 hora y 27 minutos, Cuando y a que horas llega el vuelo a MIAMI? = " +llegadaConRetrasoMIAMI);
	}

}
