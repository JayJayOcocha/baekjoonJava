import java.io.*;
import java.util.*;

public class 그룹단어체커 {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        String[] strArr = new String[n];
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<str.length(); j++){
                arr[str.charAt(j)-97]++;
            }
            System.out.println(Arrays.toString(arr));
        }
        // for(int i = 0; i<n; i++){
        //     System.out.println(arr[i]);
        // }
        
    }
}
