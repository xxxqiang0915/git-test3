package newText;

public class text4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.1;
        //double area = c1.findArea();
        //System.out.println(area);
        c1.findArea();

    }
}
class Circle{
    //属性
    double radius;
    //方法1:
 //   public double findArea(){
    //      double area = Math.PI * radius * radius;
    //    return area;
  //  }
    //方法2:
    public  void findArea() {
        double area = Math.PI * radius * radius;
        System.out.println("面积为" + area);
    }

}
