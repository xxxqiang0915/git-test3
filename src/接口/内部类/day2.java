package 接口.内部类;
/**
* 内的部内部成员之五：内部类
* 1.java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
* 2.内部类的分类：成员内部类（静态、非静态） vs 局部内部类（方法类、代码块类、构造器类）
*
* 3.成员内部类：
*   一方面，作为外部类的成员：>调用外部类的结构
*                        >可以被static修饰
*                        >可以被4种不同的权限修饰
*
*   另一方面，作为一个类：>类内可以定义属性、方法、构造器、
*                     >可以被final、abstract修饰
*
* 4.关注如下3个问题：
*   4.1：如何实例化成员内部类的对象
*   4.2：如何在成员内部类中区分调用外部类的结构
*   4.3：开发中局部内部类的使用
*
* 注意点：
*   在局部内部类的方法中（比如：show如果调用局部内部类所声明的方法（比如：method）
*   中的局部变量（比如：num）的话，要求此局部变量声明为final的。（jdk8后可省略）
*
* */
public class day2 {
    public static void main(String[] args) {
        //创建haed实例
        Person.head h = new Person.head();
        //创建ear实例
//      Person.ear e = new Person.ear();错误
        Person p = new Person();
        Person.ear e = p.new ear();
        e.look();
    }
}
class Person{
    String name;
    //静态成员内部类
    static class head{

    }
    //非静态成员内部类
    class ear{
        String name;
        public ear(){}
        public void look(){
            System.out.println("让我看看");
        }
        public void display(String name){
            System.out.println(name);//方法形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }

    public void method(){
        //局部内部类，方法类
        class AA{

        }
    }

    {   //局部内部类，代码块类
        class BB{

        }
    }

    public Person(){
        //局部内部类，构造器类
        class CC{

        }
    }

}