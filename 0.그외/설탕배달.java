import java.io.BufferedReader;
import java.io.*;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = n/5;
        int min = 1000;
        if(n%5==0){
            System.out.println(n/5);
        }
        else if (n%5!=0){
            for(int i=x; i >= 1; i--){
                if((n-5*i)%3 ==0){
                    min = i + (n-5*i)/3;
                    System.out.println(min);
                } 
            }
            if(n%3==0){
                if(n/3 < min){
                    min = n/3;
                    System.out.println(min);
                }
            }
            if(n%3!=0 && n%5!=0 && n < 5){
                System.out.println(-1);
            }
        }
    }
}
