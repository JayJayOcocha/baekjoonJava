import java.io.*;
import java.util.StringTokenizer;

public class 공넣기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        

        // 정수 N과 M을 띄어쓰기로 입력하게 끔 해야함
        // 그럴라면 StringTokenizer가 필요하겠지.
        st = new StringTokenizer(br.readLine()); // 첫 줄: N M 이런 꼴로 완성

        // 이제 우리가 알아야 할 것은 N, M인데
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 이렇게 하면 알 수 있겠지


        // N 개의 바구니를 가지고 있고, 우리는 이제 N의 값을 알게 되었지.
        // 바구니 N개를 생성할 건데, 배열로 생성하자.
        int[] arr = new int[N];


        // 이제 M만큼의 행이 필요할거야.
        // i,j,k 이렇게 세 개의 행이니깐
        for(int i = 0; i< M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());     
            int b = Integer.parseInt(st2.nextToken());     
            int c = Integer.parseInt(st2.nextToken());
            for(int j = a-1; j <= b-1; j++){
                arr[j] = c;
            }     
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
