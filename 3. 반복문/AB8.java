import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AB8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 정수 n개

        for(int i = 1; i<= n; i++){
            st = new StringTokenizer(br.readLine()); // 이제 한 라인에 띄어쓰기로 읽기 가능
            int fstToken = Integer.parseInt(st.nextToken());
            int sndToekn = Integer.parseInt(st.nextToken());
            int sum = fstToken + sndToekn;
            bw.write("Case #" + i +": " + fstToken + " + " + sndToekn + " = " + sum + "\n");
        }
        bw.close();
    }
}
