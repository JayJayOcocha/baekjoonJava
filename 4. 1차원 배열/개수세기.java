import java.io.*;
import java.util.StringTokenizer;

public class 개수세기{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());    
        int[] arr = new int[n];
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }      
        
        int v = Integer.parseInt(br.readLine()); 
        for(int i = 0 ; i< n; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
        
        
        
    }
}
