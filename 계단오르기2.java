import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class 계단오르기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int score = 0;
        // 연속된 세 개의 계단을 밟으면 안되기에, 카르마가 3이 되려고 하면 안되도록 막을 예정
        int karma = 2;

        // 각 점수를 int형 배열에 넣어놓은 뒤
        int[] scoreArr = new int[n];
        for (int i = 0; i < n; i++) {
            scoreArr[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;
        while (i < n) {
            // 시작 다음의 계단의 점수는 올려주자. 백준 알고리즘에서도 시작 다음 계단은 점수를 그냥 올려주더라.
            score += scoreArr[i];

            // 조건문을 사용하여서, 바로 다음 idx가 더 크면 다음 idx로
            // 다다음 idx가 더 크면 다다음 idx로 반복문이 넘어가도록 손을 보았다.
            // 단 3연속 점프는 안되기에 karma가 3보다 작을 경우만 작동하도록 손보았다.
            // System.out.println("현재 점수는" + score);
            // System.out.println(i);
            // System.out.println("현재 카르마" + karma);
            if (karma < 3 && i + 1 < n && i + 2 < n) {
                if (scoreArr[i + 1] > scoreArr[i + 2]) {
                    karma++;
                    i++;
                } else if (scoreArr[i + 1] < scoreArr[i + 2]) {
                    karma = 1;
                    i = i + 2;
                }
            } else {
                i++;
            }

        }
        System.out.println(score);
        br.close();
    }
}
