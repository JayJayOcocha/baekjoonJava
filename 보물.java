import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class 보물 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<n ;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<n ;i++){
            
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        int result = 0;
        for(int i = 0; i< n; i++){
            result += a[i] *b[i];
        }
        System.out.println(result);
        br.close();
    }
}
