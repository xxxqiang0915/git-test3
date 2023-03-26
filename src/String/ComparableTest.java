package String;
/**
* 自然排序：使用Comparable接口
*
* 1.像 String 或包装类等实现了Comparable接口，重写了 compareTo(obj) 方法，给出了比较两个对象大小的方式。
* 2.像 String 或包装类重写 compareTo() 方法以后，进行了从小到大的排列。
* 3.重写 compareTo(obj) 的规则： 如果当前对象this大于形参对象obj，则返回正整数，
*   如果当前对象this小于形参对象obj，则返回负整数， 如果当前对象this等于形参对象obj，则返回零。
* 4.对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，
*   重写 compareTo(obj) 方法。在 compareTo(obj) 方法中指明如何排序
*
* */
public class ComparableTest {

}
class Goods implements  Comparable{

    private String name;
    private double price;

    //指明商品比较大小的方式:照价格从低到高排序,再照产品名称从高到低排序
    @Override
    public int compareTo(Object o) {
        //        System.out.println("**************");
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            //方式一：
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
                //                return 0;
                return -this.name.compareTo(goods.name);
            }
            //方式二：
            //           return Double.compare(this.price,goods.price);
        }
        //        return 0;
        throw new RuntimeException("传入的数据类型不一致！");
    }
    // getter、setter、toString()、构造器：省略
}

