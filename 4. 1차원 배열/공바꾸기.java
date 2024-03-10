import java.io.*;
import java.util.StringTokenizer;


public class 공바꾸기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        // N 개의 바구니에 각각 N 숫자를 넣어줌
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = i+1;
        }
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // 도현이는 공을 바꿀 바구니 2개를 a,b로 설정하고
        for(int i = 0; i <m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp;
            temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
