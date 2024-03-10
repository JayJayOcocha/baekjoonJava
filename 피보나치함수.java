import java.io.IOException;
import java.io.*;
import java.util.*;

public class 피보나치함수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                sb.append(1).append(" ").append(0).append("\n");
            }
            else if(x == 1){
                sb.append(0).append(" ").append(1).append("\n");
            }
            else {
                sb.append(fibonacci(x-1)).append(" ").append(fibonacci(x)).append("\n");
            }
            
            
        }
        System.out.println(sb);
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
