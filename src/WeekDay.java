import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeekDay {

    public static void findDay(){

    }

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
//        System.out.println("calendar = " + calendar);

        Calendar rightNow = calendar.getInstance();
//        System.out.println("rightNow = " + rightNow);
        
        Calendar rightNow2 = Calendar.getInstance();
//        System.out.println("rightNow2 = " + rightNow2);

        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println("dateTime = " + dateTime);

        LocalDate localDate = LocalDate.of(calendar.getWeekYear(), Month.FEBRUARY, 12);
        DayOfWeek ofWeek = DayOfWeek.from(localDate);
        System.out.println(ofWeek);
    }

    public static Temporal adjust(Temporal temporal) {
        return temporal;
    }

}