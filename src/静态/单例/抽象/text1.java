package 静态.单例.抽象;
/**
* 关键字：static (静态的)
* static可以用来修饰：属性、方法、代码块、内部类
*
* 使用static修饰 属性 ：静态变量(或 类变量)
*   1.属性，是否使用static修饰，又分为：静态属性 vs 非静态属性（实例变量）
*   实例变量：创建了类的多个对象，每个对象独立拥有一套类中的非静态属性。当修改
*           其中一个对象中非静态属性时，不会导致其他对象中同样的属性值修改。
*   静态变量：创建了类的多个对象，多个对象共享一个静态变量。当通过某一个对象
*           修改静态变量时，会导致其他对象调用此静态变量是修改过了的。
*   2.static修饰属性的其他说明：
*       a.静态变量随着类的加载而加载，可以通过“类.静态变量”进行调用
*       b.静态变量加载早与对象的创建
*       c.由于类只会加载一次，则静态变量在内存只会加载一次，存在方法区的静态域中。

*       d.   类变量    实例变量
*       类    yes       no
*      对象   yes       yes
*
*   3.静态属性举例：System.out ;  Math.PI ;
*
* 使用static修饰 方法 ：静态方法
*     1.随着类的加载而加载，通过“类.方法”调用
*     2.       静态方法     非静态方法
*       类       yes          no
*      对象      yes          yes
*
*     3.静态方法中，只能调用静态的方法或属性
*       非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
*
* static注意点：
*     在静态的方法内，不能使用this,super关键字 (生命周期影响)
*
* 开发中，如何确定一个属性是否要声明为static?
*   >属性可以被多个对象所共享的，不会随着对象的不同而不同的。
*   >类中的常量也常常声明为static
*
* 开发中，如何确定一个属性是否要声明为static?
*   >操作静态属性的方法通常设置为静态
*   >工具类中的方法，习惯声明为static,比如：Math、Arrays、···
*
* */
public class text1 {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.age = 20;
        c1.name ="小熊";
        c1.nation = "CHAIN";

        Chinese c2 = new Chinese();
        c2.age = 21;
        c2.name ="小黄";
        c2.nation = "CNA";
        System.out.println(c1.nation);

        c1.eat();
        Chinese.show();
    }
}
//中国人
class Chinese{
    String name;
    int age;
    static String nation;//静态属性
    public void eat(){
        System.out.println("中国人吃中餐");
    }
    public static void show(){
        System.out.println("我是一个中国人！");//静态方法
        System.out.println(Chinese.nation);//调用静态属性
    }


}