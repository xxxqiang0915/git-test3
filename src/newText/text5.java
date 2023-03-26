package newText;

public class text5 {
    public static void main(String[] args) {
        text5 text = new text5();
        //newtext.text.method();
        int area = text.method();
        System.out.println("面积为：" + area);
    }


    /*    public void method(){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }*/
    public int method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }
}





