package String;

import org.junit.Test;

import java.util.Date;

/**
* 计算世界时间的主要标准有：
* UTC（Coordinated Universal Time）
* GMT（Greenwich Mean Time）
* CST（Central Standard Time）
*
*  1.java.lang.System 类
* System类提供的 public static long currentTimeMillis()
* 用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
*
* 2. java.util.Date类
* 表示特定的瞬间，精确到毫秒
* Date():使用无参的构造器创建对象可以获取本地当前时间
*  -- toString()：把此Date对象转换为以下形式的 String：dow mon dd hh: mm:ss zzz yyyy
*  -- getTime()：返回自1970年1月1日00：00：00GMT以来此Date对象表示的毫秒数
*    java.sql.Date 对应着数据库中的日期类型的变量
*
* */
public class DateTimeTest {
    @Test
    public void test(){
        //获取系统当前时间：System类中的currentTimeMillis()
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        System.out.println(time);
    }
    @Test
    public void test2(){
        //构造器一：Date():创建一个当前时间的Date对象
        Date date = new Date();//alt + enter
        System.out.println(date.toString());//Wed Aug 17 16:31:21 CST 2022
        System.out.println(date.getTime());//1660725081889
        //构造器二：创建指定毫秒数的对象
        Date date1 = new Date(1660725081889L);
        System.out.println(date1.toString());//Wed Aug 17 16:31:21 CST 2022

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(1587274512876L);
        System.out.println(date3.toString());

        //如何将java.util.Date对象转换为java.sql.Date对象
        Date date4 = new Date();
        //第一种方式，存在问题：java.util.Date cannot be cast to java.sql.Date
        //        java.sql.Date date6 = (java.sql.Date) date4;
        //        System.out.println(date6);
        //第二种方式
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date5);

    }
}
