import java.io.IOException;
import java.io.*;
import java.util.*;

public class 킹퀸룩{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
}