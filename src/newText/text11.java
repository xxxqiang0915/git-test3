package newText;

/** 关键字：this
*   1.this可以用来修饰：属性、方法、构造器
*   this理解为当前对象
*   类方法中，可以使用 this.属性、this.方法 调用，一般省略
 *   this 修饰、调用构造器：this(形参列表),不能调用自己,
 *   必须声明在 首行 且只有 一个
* */
public class text11 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Tom",2);
        p1.setAge(3);
        System.out.println(p1.getAge());
    }
}
class Person1{
    private String name;
    private int age;

    public Person1(String name,int age){
        this.name =name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("人吃饭！");
        this.study();

    }
    public void study(){
        System.out.println("人学习！");
    }

}