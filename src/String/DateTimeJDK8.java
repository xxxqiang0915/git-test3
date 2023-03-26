package String;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
* JDK 8.0中新的日期时间类
*
* 1.本地日期、本地时间、本地日期时间的使用：
* LocalDate / LocalTime / LocalDateTime
*
* */
public class DateTimeJDK8 {
    @Test
    public void test(){
        //now():获取当前的日期、时间、日期时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2022-08-22
        System.out.println(localTime);//08:39:29.325
        System.out.println(localDateTime);//2022-08-22T08:39:29.325

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2022,9,1,12,13,12);
        System.out.println(localDateTime1);//2022-09-01T12:13:12

        //getXxx()：获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());//22
        System.out.println(localDateTime.getDayOfWeek());//MONDAY
        System.out.println(localDateTime.getMonth());//AUGUST
        System.out.println(localDateTime.getMonthValue());//8
        System.out.println(localDateTime.getMinute());//39

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(28);
        System.out.println(localDate);//2022-08-22
        System.out.println(localDate1);//2022-08-28

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);//2022-08-22T08:42:03.750
        System.out.println(localDateTime2);//2022-08-22T04:42:03.750

        //不可变性 加
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);//2022-08-22T08:42:03.750
        System.out.println(localDateTime3);//2022-11-22T08:42:03.750
        //减
        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);//2022-08-22T08:42:03.750
        System.out.println(localDateTime4);//2022-08-16T08:42:03.750


    }

}
