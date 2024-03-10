import java.io.IOException;
import java.util.*;
import java.io.*;

public class 나머지_2 {
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        arr = new int[43];
        Set<Integer> hSet = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i< 10; i++){
            hSet.add(Integer.parseInt(br.readLine()) %42);
        }
        for(int i = 0; i<42; i++){
            if(hSet.contains(i)){
                arr[i]++;
            }
        }
        for(int i =0; i< 42; i++){
            if(arr[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
