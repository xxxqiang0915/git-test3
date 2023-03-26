package 接口.内部类;
/**
* interface 接口
* 1.接口使用interface来定义
* 2.Java中，接口和类是并列的结构
* 3.如何定义接口：定义接口中的成员
*   >3.1 JDK7及以前：只能定义全局常量和抽象方法
*        全局常量：public static final 的，但是可以省略不写（还在）
*        抽象方法：public abstract 的
*
*   >3.2 JDK8:除了全局常量和抽象方法外，还可以定义静态方法、默认方法（略）
*
* 4.接口中不能定义构造器！意味着接口不可以实例化
*
* 5.Java开发中，接口通过让类实现(implements)的方式使用
*   如果实现类覆盖了接口中所有方法，则此实现类就可以实例化
*   如果实现类没有覆盖了接口中所有方法，则此实现类仍为一个抽象类
*
* 6.java类可以实现多个接口 ---> 弥补java单继承的局限性
*   格式：class AA extends BB implements CC,DD,EE
*
* 7.接口与接口之间可以继承，可以多继承
* 8.接口的使用，体现多态性
* 9.接口，实际上看作一种规范
*
* */
public class day1 {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plan p = new Plan();
        p.fly();
        p.stop();
    }
}

interface Attackable{
    void attack();
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略了 public static final

    //全局方法
    public abstract void fly();

    void stop();//省略了 public static
}

class Plan implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

class Kite implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过风起飞");
    }

    @Override
    public void stop() {
        System.out.println("人工停止");
    }
}

class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void attack() {
        System.out.println("子弹具有攻击性");
    }

    @Override
    public void fly() {
        System.out.println("子弹速度很快");
    }

    @Override
    public void stop() {
        System.out.println("遇到物体停止");
    }
}
//**************************************
//接口与接口之间的继承
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}
