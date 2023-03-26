package 静态.单例.抽象;
//static关键字的使用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c1的id:"+c2.getId());
        System.out.println("c1的id:"+c3.getId());
        System.out.println("创建圆的个数为："+Circle.getTotal());
        System.out.println("圆的面积为："+c3.findArea());
    }

}
class Circle{
    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;
    //static声明的属性被所以对象共享
    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;

    }

    public static int getTotal() {
        return total;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

}