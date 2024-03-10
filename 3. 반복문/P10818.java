import java.util.Arrays;
import java.util.Scanner;
public class P10818 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];

        for(int i = 0; i < t; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        // System.out.println(Arrays.toString(arr));
        int min = 1000000;
        int max = -1000000;
        for(int i = 0; i< t; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i< t; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
