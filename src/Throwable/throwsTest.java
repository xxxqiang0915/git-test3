package Throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
* 方式二：throws + 异常类型
* 1.“throws + 异常类型”写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
*   当方法体执行时，出现异常，仍会在异常代码处生成一个异常对象，此对象满足throws
*   后异常类型时，就会被抛出。异常后续代码不再执行。
*
* 2.体会：try-catch-finally：真正的异常给处理掉了。
*        throws的方式只是将异常抛给了方法的调用者，并没有将真正的异常处理掉。
*
* 3.开发中如何选择try-catch-finally还是throws?
*   3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用
*       throws，如果子类重写方法中有异常，必须使用try-catch-finally方式处理。
*   3.2 执行的方法a中，先后又调用了另外几个方法，这几个方法是递进进行执行的。建议这
*       几个方法用throws的方式进行处理。执行方法a可以考虑使用try-catch-finally。
*
* */
public class throwsTest {
    public static void main(String[] args) {
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }
        method3();

    }
    public static void method3(){
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException{
        method1();
    }
    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
