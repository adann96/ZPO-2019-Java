import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {

        //-------Część a)--------//
        LocalDate endWar = LocalDate.of(1945,5, 8);
        LocalDate startWar = LocalDate.of(1939,9, 1);
        long numberOfDays = ChronoUnit.DAYS.between(startWar, endWar);

        //-------Część b)--------//
        LocalDate whichDay = LocalDate.ofYearDay(2016, 68);

        //-------Część c)--------//
        int numberOdStrangeYear = 0;

        for (int years = 1996; years<2020; years++)
        {
            System.out.println(years);
            if (Year.of(years).length() == 366){
                numberOdStrangeYear+=1;
            }
        }

        System.out.println("Tyle dni trwała druga wojna światowa: " + numberOfDays);
        System.out.println("Dzień: " + whichDay.getDayOfWeek() + " tzn. " + whichDay.getDayOfMonth() + " | Miesiąc: " + whichDay.getMonth());
        System.out.println("Tyle razy miałem przyjemność przeżyć rok przestępny: " + numberOdStrangeYear);
    }
}