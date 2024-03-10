import java.io.IOException;
import java.io.*;

public class 팰린드롬 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        int k = str.length() -1;
        boolean state = true;
        //짝수
        if(n%2 == 0){
            for(int i = 0; i<= (n/2)-1; i++){
                if(str.charAt(i) == str.charAt(k)){
                    k --;
                    continue;
                }
                else if(str.charAt(i) != str.charAt(k)){
                    state = false;
                    // System.out.println(0);
                    break;
                }
            }
        }
        //홀수
        else if(n%2 != 0){
            for(int i = 0; i< (n/2); i++){
                if(str.charAt(i) == str.charAt(k)){
                    k --;
                    continue;
                }
                else if(str.charAt(i) != str.charAt(k)){
                    state = false;
                    // System.out.println(0);
                    break;
                }
            }
        }
        if(state == true){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
    }
}
