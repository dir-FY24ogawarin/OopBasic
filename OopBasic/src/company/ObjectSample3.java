package company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ObjectSample3 {

    public static void main(String[] args) {
        System.out.println(Math.abs(-5));
        //切り上げ、切り捨て、四捨五入
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.round(3.5));

        //最大と最小
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        
        //ランダムな値
        System.out.println(Math.random());
        
        //日付
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2023, Month.DECEMBER,5));
        
        //時刻
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.of(2023, Month.DECEMBER,5,13,45));
        
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
        
        try {
            System.out.println(LocalDateTime.parse("2023/12/05 15:30:45", formatter));
            
        }catch(DateTimeParseException e) {
            System.out.println("Error" +e.getMessage());
        }
        var tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        var utcTime = tokyoTime.withZoneSameInstant(ZoneOffset.UTC);
        
        System.out.println("Tokyo Time:"+tokyoTime);
        System.out.println("UTC Time:"+utcTime);
        
    }

}
