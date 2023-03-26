package 继承.多态;
//import org.junit.Test;

import org.junit.Test;

/**
* java中的 JUnit单元测试
* 步骤： idea 输入@Test 导包
*      创建java类：1.此类是public 2.此类提供公共的无参的构造器
*      此类中声明单元测试方法：方法public，没有返回值，没有形参
*      此单元测试方法上需声明@Test 导入( import org.junit.Test )
*
* 包装类(封装类)：
* 1.java提供了8种基本数据类型变量，使得基本数据类型变量有了类的特征
* 2.掌握：基本数据类型、包装类、String三者之间的相互转换
*
* */
public class JUnit {
    //JDK5.0新特性：自动装箱与自动拆箱
    @Test
    public void test3(){
        //自动装箱：基本数据类型 --> 包装类
        int num2 = 10;
        Integer in1 = num2;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱:包装类 --> 基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;
    }
    //基本数据类型 --> 包装类 ：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
    }
    //包装类 --> 基本数据类型 ：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型、包装类 --> String类型 ：调用String重载的valueof(xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String的valueOf(xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);
    }
    //String类型 --> 基本数据类型、包装类:调用包装类中parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";
        //int num1 = (int)str1;没有子父类关系，不能强转
        //可能会报NumberFormatException

        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }

}
