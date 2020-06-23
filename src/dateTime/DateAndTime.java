package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time =  LocalTime.now();
        System.out.println(time);

        LocalDateTime d_t = LocalDateTime.now();
        System.out.println(d_t);


    }
}
