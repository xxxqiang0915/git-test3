package newText;

/** 针对引用数据类型
 * 值传递机制
 *
* */

public class text8 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = "+ data.m +",n = "+ data.n);
/*        //交换m和n值
        int temp = data.m;
        data.m = data.n;
        data.n = temp;*/

        text8 text = new text8();
        text.swap(data);

        System.out.println("m = "+ data.m +",n = "+ data.n);
    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;
}

