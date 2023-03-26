package newText;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        //1.使用Scanner,读取学生个数
        Scanner scanner = new Scanner (System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();

        //创建数组，存储学生信息；动态初始化
        int[] scores = new int [number];

        //给数组中元素赋值
        System.out.println("请输入" + number + "个学生成绩");
        int maxScore = 0;
        for (int i = 0;1 < scores.length ;i++){
            scores[i]  = scanner.nextInt();
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        //获取数组中元素的最大值：最高分


        //根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char level;
        for (int i = 0;i < scores.length;i++){
            if (maxScore - scores[i] <=10){
                level = 'A';
            }else if (maxScore - scores[i] <=20){
                level = 'B';
            }else if (maxScore - scores[i] <=30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("newtext.student "+ i +" score is "+ scores[i]+ ",grade is "+ level);
        }

    }
}
