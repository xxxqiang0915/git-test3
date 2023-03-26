package newText;

/**
* 递归
* 递归方法：一个方法体内调用它自己
*
* */
public class text9 {
    public static void main(String[] args) {
        //例题1：计算1-100和
        /*int sum = 0;
        for (int i = 0; i <=100; i++) {
            sum += i;
        }
        System.out.println(sum);*/
        text9 text = new text9();
        int sum1 = text.getSum(100);
        System.out.println(sum1);
        int sum2 = text.f(10);
        System.out.println(sum2);
    }
    //方式2：
    public int getSum(int n){
        if (n == 1) {
            return 1;
        }else {
            return n+getSum(n - 1);
        }
    }
    //例题3：
    public int f(int n){
        if (n == 0) {
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            return 2*f(n-1) + f(n-2);
        }
    }
    
}
