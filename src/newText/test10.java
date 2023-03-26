package newText;

/** 面向对象特征一：封装与隐藏
 *   高内聚，低耦合
 *   封装性的体现：类属性私有化（private），
 *   提供公共（public）的方法来设置(setxxx)和获取(getxxx)属性值
 *   权限修饰符：private、缺省、protected、public
 */

public class test10 {
    public static void main(String[] args) {
        animal a = new animal();
        a.name = "花花";
        //newtext.a.age = 1;
        a.setAge(3);
        a.setlegs(2);
        a.show();
        a.eat();
    }
}

class animal{
    String name;
    private int age;
    private int legs;//私有，不能调用

    //对于属性的设置
    public void setlegs(int i){
        if(i>=0 && i%2 ==0){
            legs = i;
        }else {
            legs = 0;
            //抛出异常
        }
    }
    //对于属性的获取
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物吃东西！");
    }
    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
}
