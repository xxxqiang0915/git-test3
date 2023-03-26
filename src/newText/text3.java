package newText;

//数组冒泡排序
public class text3 {
    public static void main(String[] args) {
        int[] arr = new int []{43,45,76,-98,0,65,-21,55};
        //冒泡排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
