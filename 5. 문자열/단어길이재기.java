import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 자바에서는 String 객체의 길이를 잴 수 있게 해주는 length() 함수가 있다.
        int n = word.length();
        System.out.println(n);

        br.close();
    }
}
