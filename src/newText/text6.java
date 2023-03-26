package newText;

/** 方法重载
*  同一个类中，允许存在一个以上的同名方法，只要 参数个数 或 参数类型 不同即可
*  “两同一不同”： 同一个类、相同方法名
*              参数列表不同：参数个数不同、参数类型不同
*  判断是否重载：
*              跟方法的权限修饰符、返回值类型、形参变量名、方法体 都无关！
* */
public class text6 {
    public static void main(String[] args) {
        text6 text = new text6();
        text.mol(2);
        text.mol(2,3);
        text.mol("newtext.a");
    }

    public void mol(int i){
        System.out.println(i*i);
    }
    public void mol(int i,int j ){
        System.out.println(i*j);
    }
    public void mol(String s){
        System.out.println(s);
    }
    //比较大小
    public int max(int i,int j){
        return (i>j)? i : j;
    }
    public double max(double d1,double d2){
        return (d1>d2)? d1 : d2;
    }
    public double max(double d1, double d2, double d3){
        double max = (d1 > d2)? d1 : d2;
        return (max > d3)? max : d3;
    }

}
