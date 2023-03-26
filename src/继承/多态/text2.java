package 继承.多态;
/**
* 继承性：1.减少代码的冗余，提高代码的复用性
*       2.便于功能的扩展
*       3.为多态的使用提供前提
*  格式：class A extends B{}
*       A:子类、派生类 B:父类、超类、基类
*  体现：继承后获取父类结构中的属性和方法(private也继承，封装性影响，子类不能直接调用)
*  规定：一个类只有一个父类，子父类是相对的概念
*  如果没有显示声明一个类的父类，则继承于java.lang.Object类
*
*  */
public class text2 {
    public static void main(String[] args) {
        Kids somekid = new Kids(5);
        somekid.printAge();
        somekid.setSalary(0);
        somekid.setSex(1);
        somekid.manOrWoman();
        somekid.employeed();

    }
}
class ManKind{
    private int sex;
    private int salary;
    public int getSex(){
        return sex;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public ManKind(){

    }
    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else System.out.println("job");
    }
}
class Kids extends ManKind{
    private int yearOld;

    public Kids(int yearOld){
        this.yearOld =yearOld;
    }
    public int getYearOld(){
        return yearOld;
    }
    public void setYearOld(int yearOld){
        this.yearOld = yearOld;
    }
    public void printAge(){
        System.out.println("I am "+ yearOld);
    }
}
