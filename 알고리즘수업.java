import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class 알고리즘수업 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 == 0){
            if((a0 <= c*n0) == true){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else if(a0 == 0){
            if((a1*n0 <= c*n0) == true){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            boolean isTrue = (a1*n0+a0 <= c*n0);
            if(isTrue == false ){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
            
        }
        
    }
}
