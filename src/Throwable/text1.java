package Throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
* 异常处理: java.lang.Throwable
*
* java.lang.Error: java虚拟机无法解决的严重问题。一般不编写针对性代码进行修改。
*    如：JVM系统内部错误、资源耗尽等严重问题。
*
* java.lang.Exception: 空指针访问、试图读取不存在的文件、网络连接中断、数组角标越界
*    -->编译时异常(checked):--IOException
*                         --ClassNotFoundException
*    -->运行时异常(unchecked,RuntimeException):
*                         --NullPointerException 空指针异常
*                         --ArrayIndexOutOfBoundException 数组角标越界
*                         --ClassCastException 类型转换异常
*                         --NumberFormatException 数字格式化异常
*                         --InputMismatchException 输入不匹配异常
*                         --ArithmeticException 算术异常
*
* 面试题：常见的异常都有哪些？举例说明：
* */
public class text1 {
//    public static void main(String[] args) {
//   1.栈溢出：java.lang.StackOverflowError
//        main(args);
//   2.堆溢出：java.lang.OutOfMemoryError
//        Integer[] arr = new Integer[1024*1024*1024];
//    }

    // *********  以下是运行时异常  ***********
    @Test
    //NullPointerException 空指针异常
    public void test1() {
        int[] arr = null;
        System.out.println(arr[3]);
    }

    @Test
    //IndexOutOfBoundException 角标越界
    public void test2() {
        //ArrayIndexOutOfBoundException 数组角标越界
        int[] arr = new int[10];
        System.out.println(arr[10]);
        //StringIndexOutOfBoundException 数组角标越界
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    @Test
    //ClassCastException 类型转换异常
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
    }

    @Test
    //NumberFormatException 数字格式化异常
    public void test4() {
        String str = "abc";
        int num = Integer.parseInt(str);
    }

    @Test
    //InputMismatchException 输入不匹配异常
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);//输入类型不一致的，报错

        scanner.close();
    }

    @Test
    //ArithmeticException 算术异常
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //*********  以下是编译时异常  ***********
    @Test
    //IOException
    public void test7() {     //Ctrl + Alt + T 快捷键
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(fis != null)
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
