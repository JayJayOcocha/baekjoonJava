import java.util.Arrays;
import java.util.Scanner;
public class 영수증{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int totalPrice = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        // System.out.println();
        for(int i = 0; i< n; i++){
            int product = in.nextInt();
            int nums = in.nextInt();
            // System.out.println(product * nums);
            int sum = product * nums;
            arr[i] = sum;
        }
        // System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        // System.out.println( sum);
        if(sum == totalPrice){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}