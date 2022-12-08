import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]args){
        Instant instant = Instant.now();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Warsaw"));
        System.out.println(zdt.getHour() + ":" + zdt.getMinute() + ":" + zdt.getSecond());
    }
}
