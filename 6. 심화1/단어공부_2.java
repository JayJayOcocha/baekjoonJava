import java.io.*;

public class 단어공부_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String strLower = str.toLowerCase();

        // a 는 97 그렇다면 97씩 빼주면 arr에 알파뱃 순서대로 넣을 수 있겠다
        int[] arr = new int[26];
        // System.out.println('a'-0);
        for(int i = 0; i<strLower.length(); i++){
            arr[strLower.charAt(i) - 97]++;
        }

        int max = -1;
        char ch = '?';
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
