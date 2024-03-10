import java.io.*;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
 
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        for(int i = 0; i< n; i++){
            if(arr[i] < x){
                sb.append(arr[i]).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}
