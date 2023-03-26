package 继承.多态;
/** 多态性:一个事物的多种心态
*
* 向上转型：
* 父类的引用指向子类的对象：  Person p = new Man();
* 虚拟方法的调用：当调用子父类同名方法时，实际调用的是子类重写的方法
* 编译看左边，执行看右边 （不能调用子类中特有的方法、属性）
* 多态性的使用前提：1.要有类的继承关系 2.要有方法的重写
* 对象的多态性只适用于方法，不适用于属性（编译和运行都看左边）
* 多态性是 运行时行为，调用过程叫 动态绑定（晚绑定）
*
* 向下转型：使用强制类型转换符（）
* 有了对象多态性以后，内存中实际加载了子类特有的属性和方法，都是由于变量声明为父类类型，
* 导致编译时，只能调用父类声明的属性和方法。子类特有的属性和方法不能调用。
* 如何才能调用子类特有的属性和方法：
*   使用instanceof进行判断
*   Man m = (Man)p;
*   使用强转时，可能出现ClassCatException的异常
*
* instanceof关键字的使用：
*   要求a所属的类与A类必须是子类和父类的关系，否则编译错误
*   a instanceof A：判断对象a是否是类A的实例。是，返回true;不是，返回false
*   if(p instanceof Man){
*       Man m = (Man)p;
*   }
*
* */
//多态性的举例
public class text5 {

    public static void main(String[] args) {
        text5 t = new text5();
        t.func(new Dog());//虚拟方法的调用
        t.func(new Cat());
    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
class Animal {
    public void eat() {
        System.out.println("动物：进食");
    }

    public void shout() {
        System.out.println("动物：叫");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("汪！汪！汪！");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵！喵！喵！");
    }
}

