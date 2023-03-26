package newText;

//数组的赋值，随机数
public class text1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*(99-10+1)+10);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
        //求最大值
        int maxValue = arr[0];
        for (int i=1;i<arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为："+ maxValue);
        //求最小值
        int minValue = arr[0];
        for (int i=1;i<arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为："+ minValue);
        //求总和
        int sum = 0;
        for (int i=1;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("总和为"+sum);
        //求平均值
        int arrValue = 0;
        arrValue = sum / arr.length;
        System.out.println("平均值为："+arrValue);

    }
}
