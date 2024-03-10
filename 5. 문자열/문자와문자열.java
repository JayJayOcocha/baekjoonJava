import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class 문자와문자열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int n = Integer.parseInt(br.readLine());

        // chartAt 함수를 이용하여 String의 n-1 번째 char을 출력
        System.out.println(word.charAt(n-1));

        br.close();
    }   
}
