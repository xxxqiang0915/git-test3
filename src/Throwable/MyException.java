package Throwable;
/*
* 如何自定义异常类？
* 1.继承于现有的异常结构：RuntimeException、Exception
* 2.提供全局常量：serialVersionUID
* 3.重载的构造器
* */
public class MyException extends RuntimeException{
    static final long serialVersionUID = -70348971907457939L;
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }

}
