package 静态.单例.抽象;
/**
* 类的成员之四：代码块（初始化块）
* 1.代码块的作用：用来初始化类、对象
* 2.代码块只能使用static修饰
* 3.分类：静态代码块 vs 非静态代码块
*
* 4.静态代码块：
*   >内部可以有输出语句
*   >随着类的加载而执行，而且只执行一次
*   >作用：初始化类的信息
*   >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
*   >只能调用静态的属性、方法
*
* 5.非静态代码块：
*   >内部可以有输出语句
*   >随着对象的创建而执行
*   >每创建一个对象，就执行一次非静态代码块
*   >作用：可以在创建对象时，对对象的属性进行初始化
*   >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
*   >静态、非静态的属性和方法都可以调用
* */
public class text4 {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        System.out.println(p1.age);
//        Person.info();
    }
}
class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //static代码块
    static {
        System.out.println("Hello,static block-1");
        desc = "我是一个爱学习的人";
        info();
    }
    static {
        System.out.println("Hello,static block-2");
    }

    //非static代码块
    {
        System.out.println("Hello,block");
        age = 1;
        info();
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}