import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int min = 1000000;
        int max = -1000000;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            int nn = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            // int max = 0;
            // int min = 0;
            for(int j =0; j<nn; j++){
                int next = Integer.parseInt(st.nextToken());
                max = Math.max(max, next);
                min = Math.min(min, next);
            }

            
            sb.append(min +" ");
            sb.append(max);
            if(i != n-1){
                sb.append("\n");
            }
            
        }

        // System.out.println(sb.toString());
        
    }
}
