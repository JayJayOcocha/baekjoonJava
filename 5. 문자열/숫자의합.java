import java.io.*;

public class 숫자의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        
        String[] arr = new String[n];
        arr = str.split("");

        // N과 입력하는 N개의 숫자가 같아야 하므로 조건문
        int sum = 0;
        if(n == arr.length){
            for(int i = 0; i< n; i++){
                sum += Integer.parseInt(arr[i]);
            }
        }

        System.out.println(sum);
        br.close();
    }
    
}
