package br.com.estudos.ICUtilitarias.CDates;

import java.time.LocalDate;

/**
 * Class LocalDate
 * 
 * Links:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html
 */
public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("1980-03-16");
		System.out.println(date);
	}
}

//LocalDate is a final class so cannot be extended.
//class MyLocalDate extends LocalDate {
//	 
//    @Override
//    public String toString() {
//        return super.getDayOfMonth() + "-" + super.getMonthValue() + 
//           "-" +  super.getYear();
//    }
//}
//Resultado: Compilation Error
