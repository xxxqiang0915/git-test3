package newText;

public class a {
    public static void main(String[] args) {
        //静态初始化
        int [][] arr = new int [][]{{1,2,3},{1,2},{1,2,3,4}};
        //动态初始化
        String [][] arr1 = new String [3][2];

        System.out.println(arr[0][1]);
        System.out.println(arr[1].length);
        //遍历
        for(int i = 0;i< arr.length; i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
