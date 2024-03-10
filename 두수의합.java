import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int idx = 0;
        int[] arr = new int[n];
        int count = 0;
        for(int i =0; i< n; i++){
            arr[idx] = Integer.parseInt(st.nextToken());;
            idx++;
        }
        for(int i = 0; i<n; i++){
            int ai = arr[i];
            for(int j = i+1; j<n; j++){
                int aj = arr[j];
                if(ai + aj == x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
