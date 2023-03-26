package String;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
* 日期时间格式化类：DateTimeFormatter
* 格式化或解析日期、时间
* 类似于 SimpleDateFormat
*
* */
public class DateTimeFormatterTest {
    @Test
    public void test3(){
        //        方式一：预定义的标准格式。
        //        如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);//2022-08-21T12:54:02.824
        System.out.println(str1);//2022-08-21T12:54:02.824

        //解析：字符串 -->日期
        TemporalAccessor parse = formatter.parse("2022-08-21T12:54:02.824");
        System.out.println(parse);//{},ISO resolved to 2022-08-21T12:54:02.824

        //        方式二：
        //        本地化相关的格式。如：ofLocalizedDateTime()
        //        FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//2022年8月21日 下午01时05分03秒

        //      本地化相关的格式。如：ofLocalizedDate()
        //      FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2022-8-21

        //       重点： 方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String Str4 = formatter3.format(LocalDateTime.now());
        System.out.println(Str4);//2022-08-21 01:05:03

        TemporalAccessor accessor = formatter3.parse("2022-08-21 01:05:03");
        System.out.println(accessor);//{HourOfAmPm=1, SecondOfMinute=3, MicroOfSecond=0, MilliOfSecond=0, MinuteOfHour=5, NanoOfSecond=0},ISO resolved to 2022-08-21

    }


}
