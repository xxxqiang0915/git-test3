package 继承.多态;
/**
* java.lang.Object类
* 1.Object类是所有Java类的根父类
* 2.Object类中的功能（属性、方法）具有通用性
* 属性：无
* 方法：equals() / toString() / getClass() / hashCode()
* clone() / finalize() / wait()、notify()、notifyAll()
* 数组 也作为Object类的子类出现，可以调用Object类中声明的方法
*
* 3.Object类只能声明一个空参构造器
*
*一、回顾 == 的使用
* 1.比较基本数据类型变量：比较两变量保存的数据是否相等;
*   比较引用数据类型变量，比较两对象的地址值是否相同，即两个引用是否指向同一个对象实体
*
*二、equals()方法的使用：
*  public boolean equals(Object obj){
*      return (this == obj);
*  }
* 1.是一个方法，而非运算符
* 2.只能适用于引用数据类型
* 3.像String、Data、File、包装类等，都重写了Object类中equals()方法
* 4.自定义类如何重写equals()方法: 手动、一般自动生成
*
*三、toString()的使用：
* public String toString(){
*   return getClass().getName()+"@"+Integer.toHexString(hashCode());
* }
*1.像String、Data、File、包装类等，都重写了Object类中toString()方法
*2.自定义类如何重写toString()方法: 手动、一般自动生成
*
* */
public class ObjectTest {
}
//重写equals方法
class User{
    String name;
    int age;
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj instanceof User){
            User u = (User) obj;
            return this.age == u.age && this.name.equals(u.name);
        }
        return false;
    }
}
