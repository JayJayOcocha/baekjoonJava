import java.io.*;
import java.util.*;

public class 피보나치함수_3 {
    static Integer[][] arr = new Integer[41][2];
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        arr[0][0] = 1; // 테스트 케이스가 0 일때 0은 1개
        arr[0][1] = 0; // 테스트 케이스가 0 일때 1은 0개
        arr[1][0] = 0; // 테스트 케이스가 1 일때 0은 0개
        arr[1][1] = 1; // 테스트 케이스가 1 일때 1은 1개

        for(int i = 0; i< n; i++){
            int x = Integer.parseInt(br.readLine());
            // sb.append(fibonacci(x));
            fibonacci(x);
            sb.append(arr[x][0]).append(" ").append(arr[x][1]).append("\n");
        }
        System.out.println(sb);
    }   
    static Integer[] fibonacci(int item){
        for(int i =0; i< n; i++){
            if(arr[item][0] == null || arr[item][1] == null){ // 와 여기를 arr[item] == null 로 했어서 안됐네 이차원 배열 공부 다시하고 와
                arr[item][0] = fibonacci(item-1)[0] + fibonacci(item-2)[0];
                arr[item][1] = fibonacci(item-1)[1] + fibonacci(item-2)[1];
            }
        }
        return arr[item];
    }
}
