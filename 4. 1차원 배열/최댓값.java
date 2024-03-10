import java.io.*;
import java.util.StringTokenizer;

public class 최댓값 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = - 100;
        int idx = 0;
        for(int i = 0; i< 9; i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i +1;
            }
        }
        System.out.println(max);
        System.out.println(idx);



        bw.flush();
        bw.close();

    }
}
