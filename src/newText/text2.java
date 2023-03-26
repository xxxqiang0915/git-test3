package newText;

//数组的复制
public class text2 {
    public static void main(String[] args) {
        int [] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ "\t" );
        }

        //array2 = array1;这个不是真正的复制
        array2 = new int [array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0){
                array2[i] = i;
            }
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

    }
}
