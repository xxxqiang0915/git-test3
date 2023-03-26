package Day;
public class day1 {
    public static void main(String[] args) {
        int a,b,c;
        for (int i = 100; i <1000 ; i++) {
            a = i%10;
            b = i/10%10;
            c = i/10/10%10;
            if(i == (a*a*a + b*b*b + c*c*c))
                System.out.println(i);
        }
    }
}