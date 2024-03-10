import java.io.IOException;
import java.io.*;

public class 별찍기7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 피라미드
        // 세로
        for(int i = 0; i<n; i++){
            // 가로
            for(int j = 1; j<n+n; j++){
                // System.out.print("*");
                if(j <= i +n && i +j >= n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }

        //역피라미드
        for(int i = n-2; i >= 0; i--){
            for(int j =n +n-1; j >=1; j--){
                if(i+j >= n && j <= i+n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
    }
}
