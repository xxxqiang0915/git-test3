package 静态.单例.抽象;
/**
* main()方法的使用说明：
* 1.作为程序的入口
* 2.也是一个普通的静态方法
* 3.也可以作为我们与控制台交互的方式
*
*
* */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}
class Main{
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
class MainDemo{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("*****"+args[i]);
            int num = Integer.parseInt(args[i]);
            System.out.println("#####"+num);
        }

    }
}