import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 두수의합_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 0;
        Set<Integer> hSet = new HashSet<Integer>();

        for(int i =0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            hSet.add(arr[i]);
        }
        for(int i =0; i<n; i++){
            if(hSet.contains(x-arr[i])){
                count++;
            }
        }
        System.out.println(count/2);
    }
}
