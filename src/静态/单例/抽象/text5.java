package 静态.单例.抽象;
/**
* final关键字:
* 1.final可以修饰的结构：类、方法、变量
* 2.final用来修饰一个类：不能被其他类所继承
*              比如：String类、System类、StringBuffer类
* 3.final用来修饰一个方法：不能再被重写
*              比如：Object类中getClass()方法
* 4.final用来修饰一个变量：此时“变量”就是一个常量了
*   4.1:final修饰属性：赋值位置有：显示初始化、代码块中初始化、构造器中初始化
*   4.2:final修饰局部变量：用final修饰形参时，表面形参是一个常量，调用时赋值。
*
* static final 用来修饰属性：全局常量
* */
public class text5 {
    public static void main(String[] args) {
        text5 t = new text5();
        t.show(10);
//        t.setDOWN(3);
    }
    final int WIDTH = 10; //显示初始化
    final int LEFT;
    final int RIGHT;
//    final int DOWN;

    {
        LEFT = 1; //代码块中初始化
    }

    public text5(){
        RIGHT = 2; //构造器中初始化
    }
    public text5(int n){
        RIGHT = n;
    }

    public void show(){
        final int NUM = 10;//常量
//        num += 20;
    }

    public void show(final int num){
        System.out.println(num);
    }
//    public void setDOWN(int down){ //方法不靠谱
//        this.DOWN = down;
//    }
}
final class Final{
}
