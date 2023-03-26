package String;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
* 定制排序：使用Comparator接口
*
* 当元素的类型没实现 java.lang.Comparable 接口而又不方便修改代码，
* 或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，
* 那么可以考虑使用 Comparator 的对象来排序
*
* 重写 compare(Object o1,Object o2) 方法，比较o1和o2的大小：
* 如果方法返回正整数，则表示o1大于o2；
* 如果返回0，表示相等；
* 返回负整数，表示o1小于o2。
*
* 两种排序方式对比:
* Comparable接口的方式是一定的，保证Comparable接口实现类的对象在任何位置都可以比较大小。
* Comparator接口属于临时性的比较。
*
* */
public class ComparatorTest {
    @Test
    public void test(){
        String[] arr = new String[]{"AA","BB","KK","GG","DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
//                return 0;
                throw new RuntimeException("传入的数据类型不一致！");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}


