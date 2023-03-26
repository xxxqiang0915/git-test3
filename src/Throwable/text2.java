package Throwable;

import org.junit.Test;

/*
* java 异常处理的方式
* 方式一：try-catch-finally
* 方式二：throws + 异常类型
*
* 一、异常处理：抓抛模型
* 过程一：“抛”：程序在正常执行过程中，一旦出现异常，就会在异常代码处生成一个对应
*             异常类的对象。并将此对象抛出，一旦抛出其后代码不再执行。
*
*       关于异常对象的产生：1.系统自动生成的异常对象
*                       2.手动的生成一个异常对象，并抛出(throw)
*
* 过程二：“抓”：异常处理的2种方式。
*
* 二、try-catch-finally的使用
*
* try{
*       //可能出现的异常的代码
*  }catch(异常类型1 变量名1){
*       //处理异常的方式1
*  }catch(异常类型2 变量名2){
*       //处理异常的方式2
*  }catch(异常类型3 变量名3){
*       //处理异常的方式3
*  }
* ···
* finally{
*       //一定会执行的代码
* }
* 说明：1.finally是可选的
*      2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会
*        生成一个对应异常的对象，根据此对象的类型，去catch中进行匹配。
*      3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常处理，
*        一旦处理完成，就跳出try-catch结构。继续执行其后的代码。
*      4.catch中的异常类型如果没有子父类关系，则谁声明在上、下都无所谓。
*        catch中的异常类型如果有子父类关系，则要求子类一定声明在父类的上面。否则，报错。
*      5.常用的异常对象处理方式：1.String getMessage()
*                           2.printStackTrace()
*      6.在try结构中声明的变量，不能被调用。
*      7.try-catch结构可以实现嵌套。
*
* 体会：1.使用try-catch-finally处理编译时异常，运行时还可能报错。
*      2.开发中，由于运行时异常比较常见，所以我们跳出就不针对运行时异常编写try-catch-finally。
* */
public class text2 {
    @Test
    //NumberFormatException 数字格式化异常
    public void test4(){
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常了，不要着急····");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("出现空指针异常了，不要着急····");
        }
        System.out.println("hello-----2");
    }
}
