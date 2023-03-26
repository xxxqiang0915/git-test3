package String;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* jdk8 之前的日期时间的API测试
* 1.System类中currentTimeMillis()；
* 2.java.util.Date和子类java.sql.Date
* 3.java.text.SimpleDateFormat 类
* 4.Calendar类：日历类、抽象类
*
* SimpleDateFormat的使用：
* 是一个不与语言环境有关的方式来格式化和解析日期的具体类。
*   1.两个操作：
*      1.1.格式化：日期 ---> 字符串
*      1.2.解析：格式化的逆过程， 字符串 ---> 日期
*   2.SimpleDateFormat的实例化
*
* Calendar类：日历类(抽象类)的使用：
* 是一个抽象基类，主用用于完成日期字段之间相互操作的功能。
*   方式一：创建其子类(GregorianCalendar)的对象
*   方式二：调用其静态方法 getInstance()
*
* */
public class DateTimeTest2 {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat：默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化日期: 日期-->字符串
        Date date = new Date();
//        System.out.println(date);//Thu Aug 18 09:53:22 CST 2022
        String format = sdf.format(date);
        System.out.println(format);//22-8-18 上午9:55

        //解析：格式化的逆过程， 字符串 ---> 日期
        String str = "22-8-18 上午9:55";
        Date parse = sdf.parse(str);
        System.out.println(parse);

        //*********************指定方式格式化：调用带参构造器****************************

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");//Ctrl + P 方法参数提示显示
        String format1 = sdf1.format(date);
        System.out.println(format1);
    }

    //将字符串"2020-09-08"转换为 java.sql.Date 格式的时间
    @Test
    public void test3() throws ParseException {
        String brith = "1997-10-15";
        //新建SimpleDateFormat对象并设置时间格式
        SimpleDateFormat simpBrith = new SimpleDateFormat("yyyy-mm-dd");
        //将字符串格式的时间格式化为Date类
        Date brithday = simpBrith.parse(brith);
        //通过Date的getTime方法将Date对象转化为时间戳放到java.sql.date类的构造方法中
        java.sql.Date brithDate = new java.sql.Date(brithday.getTime());
        System.out.println(brithDate);
    }

    //
    @Test
    public void testCalendar(){
        //方式二：
        //1.实例化 调用其静态方法 getInstance()
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);//获取本月第几天
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//获取本年第几天

        //set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,22);//设置本月第几天
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():Date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

    }

}
