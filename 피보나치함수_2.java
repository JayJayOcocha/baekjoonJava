import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수_2 {
    static Integer[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        //1. 이차원배열 생성
        // 2. DP 방법을 이용해서 Memoization 할 것

        arr = new Integer[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        while(n -- >0){
            int item = Integer.parseInt(br.readLine());
            fibonacci(item);
            sb.append(arr[item][0]).append(" ").append(arr[item][1]).append("\n");
        }
        System.out.println(sb);
    }
        static Integer[] fibonacci(int item) {
            if(arr[item][0] == null || arr[item][1] == null){
                arr[item][0] = fibonacci(item-1)[0] + fibonacci(item -2)[0];
                arr[item][1] = fibonacci(item-1)[1] + fibonacci(item -2)[1];
            }
            return arr[item];
        }
}
