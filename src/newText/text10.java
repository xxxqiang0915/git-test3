package newText;

/** 构造器作用：创建对象、初始化对象的信息
*   没有定义，系统默认空构造器
*   一个类中定义多个构造器，构成重载
*   定义后，系统不在提供默认空参构造器
*
 * */

public class text10 {
    public static void main(String[] args) {
        Person p = new Person("Tom",21);
        System.out.println("name="+p.getName()+
                ",age="+p.getAge());
    }
}
class Person{
    private int age;
    private String name;

    public Person(){
        age = 18;
    }
    public Person(String n,int a){
        name = n;
        age = a;
    }
    //name
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    //age
    public void setAge(int a ){
        age = a;
    }
    public int getAge(){
        return age;
    }
}