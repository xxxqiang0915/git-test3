package 静态.单例.抽象;
/**
* 抽象类的匿名子类
*
* */
public class PeopleTest {
    public static void main(String[] args) {
        method(new Child());//匿名对象

        Work work = new Work();
        method1(work);//非匿名类，非匿名对象

        method1(new Work());//非匿名类，匿名对象

        System.out.println("**********");
        //创建了一个匿名子类的对象：p
        People p = new People() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
        method1(p);
        System.out.println("*********");
        //创建匿名子类匿名对象
        method1(new People() {
            @Override
            public void eat() {
                System.out.println("人吃水果");
            }
        });
    }

    public static void method1(People p){
        p.eat();
        p.walk();
    }

    public static void method(Child s){

    }
}

class Work extends People{
    public void eat(){

    }
}