import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++){
            String word = br.readLine();

            // // 이렇게 더해버리면 int형으로 변경이 되네? 흠
            // sb.append(word.charAt(0)+word.charAt(word.length()-1));

            // 첫글자와 마지막 글자를 str에 저장
            String str = "";
            str += word.charAt(0);
            str += word.charAt(word.length()-1);

            // 그 후 stringBuilder에 넣어줌
            sb.append(str);
            // 이거는 stringBuilder에 계속 next line까지 넣어주길래 반복문의 다음이 없을 때까지만 sb에 next line을 넣어주도록 조건문 설정
            if(i < n-1){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}
