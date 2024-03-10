import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException{
        // System.out.println(50.0/70*100);

        //첫째 줄에 시험 본 과목 개수 N이 주어진다. 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        //둘째 줄에 세준이의 현재 성적이 주어진다.
        // for(int i =0; i< n; i++){
        st = new StringTokenizer(br.readLine());
        // }

        // 배열에다가 세준이의 점수들을 넣어놓자
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열에서 가장 큰 수를 구해야 하기 때문에, 배열을 정렬해준다.
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        // 최고점은 배열 맨마지막
        int maxScore = arr[n-1];

        // for(int i = 0; i< n; i++){
        //     System.out.println(arr[i]);
        // }

        //자 이제 평균 구해보자
        float sum = 0;
        for(int i=0; i< n; i++){
            sum += ((float)arr[i])/maxScore*100;
            
        }
        System.out.println(sum/n);
    }
}
