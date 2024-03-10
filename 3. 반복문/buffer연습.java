import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class buffer연습{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String s = bf.readLine(); // String
        int i = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "abc";
        bw.write(a + "\n");
        bw.flush();
        bw.close();
    }
}