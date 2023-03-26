package 接口.内部类;
/**
* JDK8:除了全局常量和抽象方法外，还可以定义静态方法、默认方法（略）
* 1.接口中定义的静态方法，只能通过接口来调用
* 2.通过实现类的对象，可以调用接口中的默认方法
*   实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
* 3.如果子类继承父类和实现的接口中声明了同名同参的方法，子类在没有重写此
*   方法的情况下，默认调用的是父类的同名同参的方法---->类优先原则
* 4.如果实现类，实现了多个接口，而这多个接口中定义了同名同参的默认方法
*   实现类没有重写此方法的情况下，报错。---->接口冲突
*
* */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }
    //默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }
    default void method3(){
        System.out.println("CompareA:上海");
    }
}
class SubClassTest{
    public static void main(String[] args) {
        SubClass s = new SubClass();
//        s.method1();
//        s.method2();
//        s.method3();
//        CompareA.method1();
        s.myMethod();
    }

}
class SubClass implements CompareA,CompareB{
    public void method2(){
        System.out.println("CompareA:岳阳");
    }
    public void method3(){
        System.out.println("CompareA:深圳");
    }
    //如何在子类的方法调用父类
    public void myMethod(){
        method3();//调用自己默认方法
        CompareA.super.method3();//调用接口默认方法
        CompareB.super.method3();
    }
}
class SuperClass{
    public void method3(){
        System.out.println("CompareA:长沙");
    }
}
interface CompareB{
    default void method3(){
        System.out.println("CompareB:上海");
    }
}