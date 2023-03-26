package 静态.单例.抽象;
/**
* 单例(Singleton)设计模式
* 1.采取一定的方法保证整个的软件系统中，对某个类只能存在一个对象实例
* 2.如何实现？
*   饿汉式 vs 懒汉式
* 3.区分饿汉式 和 懒汉式
*   饿汉式：坏处：对象加载时间过长。
*         好处：线程安全。
*
*   懒汉式：好处：延迟对象的创建。
*         坏处：目前写法线程不安全。
*
* */
public class text2 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
//饿汉式
class Bank{
    //1.私有化构造器
    private Bank(){}
    //2.内部创建类的对象
    //4.要求此对象声明静态的
    private static Bank instance = new Bank();
    //3.提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}