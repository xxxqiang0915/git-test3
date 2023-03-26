package String;

import org.junit.Test;

/**
* String、StringBuffer、StringBuilder三者的异同？
* String:不可变的字符序列；
* StringBuffer：可变的字符序列；线程安全的，效率低；
* StringBuilder：可变的字符序列；JDK5.0新增，线程不安全，效率高；
*
* StringBuffer的常用方法：
* StringBuffer append(xxx):提供了很多的append()方法，用于进行字符串拼接
* StringBuffer replace(int start,int end):删除指定位置的内容
* StringBuffer delete(int start,int end,String str):把[start,end)位置替换为str
* StringBuffer insert(int offset,xxx):在指定位置插入xxx
* StringBuffer reverse():把当前字符序列逆转
* public int indexOf(String str)
* public String substring(int start,int end):返回一个从start开始到end结束左闭右开的子字符串
* public int length()
* public char charAt(int n)
* public void setCharAt(int n,char ch)：将指定位置的字符改成一个新的字符
*
* 与StringBuffer、StringBuilder之间的转换
* 1.String -->StringBuffer、StringBuilder: 调用StringBuffer、StringBuilder构造器
* 2.StringBuffer、StringBuilder -->String:
* ①调用String构造器； ②StringBuffer、StringBuilder的toString()
*
* */
public class StringBufferBuilder {
    @Test
    public void test(){
        StringBuffer s1 = new StringBuffer("abcd");
        s1.append(1);
        s1.append("12");
        System.out.println(s1);
//        s1.delete(1,4);
//        System.out.println(s1);//a112
//        s1.replace(1,4,"pple");
//        System.out.println(s1);//apple112
//        s1.insert(4,"efg");
//        System.out.println(s1);//原来位置的数后移 abcdefg112
//        System.out.println(s1.reverse());//211dcba
        System.out.println(s1.substring(1, 4));//bcd，有返回值
    }
}
