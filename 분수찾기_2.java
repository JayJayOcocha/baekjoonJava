import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 분수찾기_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startDenom = 1;
        int count = 0;
        StringBuilder sb = new StringBuilder();

        // 분모를 찾아주는 for문이다.
        // 분모는 1   2,1   3,2,1   4,3,2,1 이런식으로 흘러가기에
        // 이중 for문을 이용해서 count와 n이 딱 맞을 때 적합한 분모를 sb에 넣도록 하였다.
        for(int i =1 ; i<=n; i++){
            if(n == 1){
                sb.append("1/1");
                break;
            }
            else if(n == 2){
                sb.append("1/2");
                break;
            }
            else if(n == count){
                break;
            }
            else{
                int denom = startDenom;
                int numuerator = 0;
                while(denom-->1){
                        count++;
                        numuerator++;
                        System.out.println(count + 
                        " " +denom + " " + numuerator);
                    
                    if(n==count){
                        System.out.println("여기닷");
                        sb.append(numuerator).append("/").append(denom);
                        break;
                    }
                }
                startDenom += 1;
            }
        }
        System.out.println(sb);
    }
}
