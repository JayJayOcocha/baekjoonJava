import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 빠른AB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //선언. InputStreamReader인 이유는 한글이 영어보다 1byte 크기 때문에임. 영어는 1byte 한글은 2byte
        int n = Integer.parseInt(br.readLine());
        // System.out.println(n+1);
        StringTokenizer st;
        // 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            // int a = Integer.parseInt(br.readLine());
            // int b = Integer.parseInt(br.readLine());
            // System.out.println("dffff " + a +" fff" + b);
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) + "\n"));
        }
        
        // bw.write();
        bw.flush();
        bw.close();
    }
    
    
}
