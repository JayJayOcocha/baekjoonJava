import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 분수찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startDenom = 1;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =1 ; i<=n; i++){
            int denom = startDenom;

            while(denom-->1){
                if(count != n){
                    count++;System.out.println(count + 
                    " " +denom);
                }
                else{
                    System.out.println("여기닷");
                    sb.append(denom);
                    count = 0;
                    break;
                }
            }
            // if(count != n){
            startDenom += 1;
            System.out.println("카운트 " + count);
            System.out.println();
            // }
            
            

            // if(count == n){
            //     System.out.println("딱 맞아요" + denom +1);
            //     break;
            // }
        }
        System.out.println(sb);
    }
}
