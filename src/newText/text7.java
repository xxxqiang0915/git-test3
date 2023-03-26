package newText;

/** 可变个数的形参
 * 格式：数据类型 ... 变量名；
 * 当调用 可变个数形参 方法时，传入的次数个数可以是0个，1个或多个；
 * 可变个数的形参 与 形参类型相同的数组 不构成重载，二者不能共存；
 * 可变个数的形参 最多只能声明一个
 **/
public class text7 {
    public static void main(String[] args) {
        text7 test = new text7();
        test.show(12);
        test.show("hello");
        test.show("hello","word");

    }
    public void show(int i){

    }
    public void show(String s){

    }
    public void show(String ... strs){

    }
    /*public void show(String[] strs){
        ‘’‘’与上方法不能共存‘’‘’
    }*/
    public void show(int i,String ... strs){
        //String ... strs 只能写在后面
    }
}
