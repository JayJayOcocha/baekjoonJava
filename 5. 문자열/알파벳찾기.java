import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException{
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
            String input = br.readLine();

            int[] intArr = new int[26];
            for(int i = 0; i<intArr.length ; i++){
                intArr[i] = -1;
            }
            for(int i = 0; i< input.length(); i++){
                char ch = input.charAt(i);

                // 각각의 ch가 i번째 index인 것이니깐
                // 우리는 그 ch가 몇 번째 index인지 찾고 싶어한다.
                // 그렇기에 intArr란 배열에서 ch의 위치에 맞는 i값을 넣어주면 된다.
                // 예를 들어 intArr['a' - 'a'] 에
                // 혹은 intArr[0] 에는 i의 값이 저장될 것이다.
                
                if(intArr[ch - 'a'] == -1){
                    intArr[ch - 'a'] = i;
                }

            }
            for(int i = 0; i<intArr.length; i++){
                System.out.print(intArr[i] + " ");
            }

            br.close();

        }
    }
}
