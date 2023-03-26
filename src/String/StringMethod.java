package String;
/**
* 操作字符：
* int length()：返回字符串的长度： return value.length
* char charAt(int index)： 返回某索引处的字符 return value[index]
* boolean isEmpty()：判断是否是空字符串：return value.length == 0
* String toLowerCase()：使用默认语言环境，将 String 中的所字符转换为小写
* String toUpperCase()：使用默认语言环境，将 String 中的所字符转换为大写
* String trim()：返回字符串的副本，忽略前导空白和尾部空白
* boolean equals(Object obj)：比较字符串的内容是否相同
* boolean equalsIgnoreCase(String anotherString)：与 equals() 方法类似，忽略大小写
* String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用 +
* int compareTo(String anotherString)：比较两个字符串的大小
* String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex 开始截取到最后的一个子字符串。
* String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从 beginIndex 开始截取到 endIndex (不包含)的一个子字符串。
*
* 判断字符：
* boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
* boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
* boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
*
* 查找字符串中的字符:
* boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
* int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
* int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
* int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
* int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
* 注：indexOf 和 lastIndexOf 方法如果未找到都是返回-1
*
* 字符串操作方法:
* 替换：
* String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所 oldChar 得到的。
* String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所匹配字面值目标序列的子字符串。
* String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所匹配给定的正则表达式的子字符串。
* String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
* 匹配:
* boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
* 切片：
* String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
* String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
*
* */

import org.junit.Test;

import java.util.Locale;

public class StringMethod {
    @Test
    public void test() {
        String s1 = "HelloWorld";
        String s2 = " hello word ";
        String s3 = "helloworld";
        String s4 = "abc"; //a=97
        String s5 = "abe";

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s2.trim());//忽略前导空白和尾部空白
        System.out.println(s1.equalsIgnoreCase(s3));//忽略大小写,true
        System.out.println(s3.concat("hello"));//拼接，等价于用 +
        System.out.println(s4.compareTo(s5));//比较两个字符串的大小
        System.out.println(s1.substring(5));//World,从beginIndex开始截取到最后的一个子字符串
        System.out.println(s1.substring(5, 7));//Wo,左闭右开原则
    }

    @Test
    public void test2() {
        String str1 = "helloworld";

        System.out.println(str1.endsWith("ld"));//是否以指定的后缀结束
        System.out.println(str1.startsWith("he"));//是否以指定的前缀开始
        System.out.println(str1.startsWith("ll", 2));//从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(str1.contains("wor"));//是否含指定的 char 值序列
        System.out.println(str1.indexOf("lo"));//返回指定子字符串在此字符串中第一次出现处的索引
        System.out.println(str1.indexOf("wor", 3));//从指定的索引开始找
        System.out.println(str1.lastIndexOf("or"));//6,从后往前找
        System.out.println(str1.lastIndexOf("ow", 5));
    }

    @Test
    public void test3() {
        String s1 = "hellogirl";

        System.out.println(s1.replace("l", "o"));//替换此字符串中出现的所 oldChar 得到的
        System.out.println(s1.replace("girl", "boy"));

        String str = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);//hello,world,java,mysql

        System.out.println("*************************");

        str = "12345";
        //判断str字符串中是否全部有数字组成，即有1-n个数字组成
        boolean matches = str.matches("\\d+");
        System.out.println(matches);//true
        String tel = "0571-4534289";
        //判断这是否是一个杭州的固定电话
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);//true

        System.out.println("*************************");

        str = "hello|world|java";
        String[] strs = str.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);//依次输出hello word java
        }
        System.out.println();
        String str2 = "hello.world.java";
        String[] strs2 = str2.split("\\.");
        for (int i = 0; i < strs2.length; i++) {
            System.out.println(strs2[i]);//依次输出hello word java
        }
    }
}
