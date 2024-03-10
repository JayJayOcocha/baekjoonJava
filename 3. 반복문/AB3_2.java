import java.io.*;
import java.util.StringTokenizer;

public class AB3_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 정수 N을 사용자가 입력하여 버퍼에 저장

        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine()); // 한 칸 띄어서 입력받을 수 있게해줌
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
