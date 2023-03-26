package String;

import org.junit.Test;

/**
* String:字符串，使用一对""引起来表示。
* 1.String声明为final的，不可被继承
* 2.String 实现了 Serializable 接口：表示字符串是支持序列化的。
*        实现了 Comparable   接口：表示String可以比较大小
* 3.String内部定义了 final char[] value 用于存储字符串数据
* 4.String:代表不可变的字符序列。简称：不可变性。
*   体现：
*   4.1 当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
*   4.2 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
*   4.3 当调用String的 replace() 方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
*
* 5.通过字面量的方式（区别于new给一个字符串赋值，此时的字符串值声明在字符串常量池中)
* 6.字符串常量池中是不会存储相同内容(使用String类的equals()比较，返回true)的字符串的)。
*
* 实现方式说明：
* 通过new + 构造器的方式 --堆
* 通过字面量定义的方式 --常量池
*
* String s = new String("abc"); 方式创建对象，在内存中创建了几个对象？
*   两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据："abc"
*
* */
public class StringTest {
    @Test
    public void test1(){
        //通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中。
        String s1 = "javaEE";
        String s2 = "javaEE";
        //通过new + 构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("****************************");

        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);
        //通过字面量定义的方式

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true
        p1.name = "Jetty";
        System.out.println(p2.name);//Tom , 不可变性
    }
}


class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
