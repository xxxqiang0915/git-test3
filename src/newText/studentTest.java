package newText;

class student{
    int number;
    int state;
    int score;

    public String infor() {
        return "学号:"  + number + ",年级:" + state + ",成绩:" + score;
    }
}


public class studentTest {
    public static void main(String[] args) {
        student[] stus = new student[20];

        for (int i = 0; i < stus.length; i++) {
            stus[i] = new student();
            stus[i].number = (i +1);
            stus[i].state = (int)(Math.random()*(6 - 1 +1)+1);
            stus[i].score = (int)(Math.random() * (100 - 0 +1));
        }

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].infor());
        }
        System.out.println("********************");
        for (int i = 0; i < stus.length; i++) {
            if(stus[i].state ==3){
                System.out.println(stus[i].infor());
            }
        }
        System.out.println("********************");
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
                if(stus[j].score > stus[j+1].score){
                    student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1 ] = temp;

                }
            }
        }
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].infor());
        }

    }
}
