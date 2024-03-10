import java.io.IOException;
import java.io.*;
import java.util.*;

public class 약수_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i =0; i<str.length(); i++){
            int now = str.charAt(i);

            if(prev != now){
                if(check[now- 'a'] == false){
                    check[now -'a'] = true;
                    prev = now;
                }
                else{
                return false;
                }
            }
            
        }

        return true;
    }
}
