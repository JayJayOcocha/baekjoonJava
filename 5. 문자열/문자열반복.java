import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< n ; i++){
            st = new StringTokenizer(br.readLine());
            int numOfRepeat = Integer.parseInt(st.nextToken());
            String repeatString = st.nextToken();
            

            // 이 부분의 알고리즘을 짜는데 힘들어 시간이 많이 소요되었다.
            int num = 0;  // num = 0으로 설정해준뒤
            // repeatString 의 길이만큼 반복문을 설정해 줄것이다. 
            // 그 이유는 repeatString의 charAt(j)를 numOfRepeat만큼 출력(정확히는 stringBuilder에 저장) 해줘야하기 때문
            // repeatString을 ABCD라고 가정하고 numOfRpeat을 5라 쳤을 때
            // charAt(0)인 A를 5번 반복
            // charAt(1)인 B를 5번 반복
            // ...
            // charAt(3)인 D를 5번 반복 이렇게 해줘야 하기 때문이다
            for(int j =0; j< repeatString.length(); j++){ 
                while (num < numOfRepeat){ //
                    sb.append(repeatString.charAt(j));
                    num++;
                }
                num = 0;
                
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
        
    }
}
