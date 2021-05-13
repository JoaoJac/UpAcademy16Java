package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Desafio {

	public static int countDays(String string, String string2) {
//		String[] strArr1 = string.split(" ");
//		String[] strArr2 = string2.split(" ");
//		
//		int [] intArr1 = new int [3];
//		int [] intArr2 = new int [3];
//	      for(int i=0; i<3; i++) {
//	         intArr1[i] = Integer.parseInt(strArr1[i]);
//	         intArr2[i] = Integer.parseInt(strArr2[i]);
//	      }
//		
//		LocalDate date1 = LocalDate.of(intArr1[2], intArr1[1], intArr1[0]);
//		LocalDate date2 = LocalDate.of(intArr2[2], intArr2[1], intArr2[0]);
//		
//		int numDays = (int) ChronoUnit.DAYS.between(date1, date2);
//				
//		return numDays;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate date1 = LocalDate.parse(string, formatter);
		LocalDate date2 = LocalDate.parse(string2, formatter);
		int numDays = (int) ChronoUnit.DAYS.between(date1, date2);
		return numDays;
	}

}
