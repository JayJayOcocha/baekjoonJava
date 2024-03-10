import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;

public class 상수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int reversedA = A/100 + ((A%100)/10)*10 + ((A%100)%10)*100;
        int reversedB = B/100 + ((B%100)/10)*10 + ((B%100)%10)*100;

        System.out.println(Math.max(reversedA, reversedB));
        br.close();
    }
}
