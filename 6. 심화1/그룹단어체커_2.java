import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class 그룹단어체커_2 {
    static int[] abcArr;
    static int n;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i< n ;i ++){
            if(prevCheck() == true){
                count ++;
            }
        }
        System.out.println(count);
    }
    static boolean prevCheck() throws IOException{
        abcArr = new int[26];
        int prev = 0;
        int now;
        String str = br.readLine();
        for(int i = 1; i< str.length(); i++){
            now = i;
            if(str.charAt(i) == str.charAt(prev)){
                prev = now;
            }
            else{
                if(abcArr[str.charAt(i) - 'a'] == 0){
                    abcArr[str.charAt(prev) - 'a']++;
                    prev = now;
                    
                    // break;
                }
                else{
                    return false;
                    
                }
            }
        }
        
        return true;
    }
}
