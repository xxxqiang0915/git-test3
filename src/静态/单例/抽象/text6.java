package 静态.单例.抽象;
/**
* 抽象类和抽象方法
* 1.abstract 关键字的使用
* 2.abstract 可以修饰的结构：类、方法
* 3.抽象类：此类不能实例化；一定有构造器，便于子类使用
*
* 4.抽象方法：只有方法的声明，没有方法体。
*           >包含抽象方法的类一定是抽象类、反之抽象类中可以没有抽象方法。
*           >若子类重写了父类中所有的抽象方法，此子类方可实例化
*           >若子类没有重写了父类中所有的抽象方法，则子类也需是抽象类
*
* abstract使用注意点：
*   1.不能用来修饰：属性、构造器等
*   2.不能用来修饰私有方法、静态方法、final方法、final类
*
* */
public class text6 {
    public static void main(String[] args) {

    }
}
abstract class People{
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //抽象方法
    public abstract void eat();

    public void walk(){
        System.out.println("人走路");
    }
}
 class Child extends People{
    public Child(){

    }
    public Child(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("小孩要多吃饭");
    }
}