import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 이거는 이전 문제에서 우연히 힌트를 얻었는데, Stringbuilder에 값을 append 할 때, 
        // string 의 charAt() 에다가 int 형인 0을 더해주면 알아서 아스키 코드의 값으로 바꿔준다.
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0) + 0);
        System.out.println(sb.toString());

        br.close();
    }
}
