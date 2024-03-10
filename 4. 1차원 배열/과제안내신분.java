import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 과제안내신분 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int[] arr = new int[31]; 
        for(int i=1; i<=28; i++){  // 28명의 숙제를 낸 학생들을 우리는 확인해야 하잖아.
            arr[Integer.parseInt(br.readLine())]++;  
            // 31개의 공간이 있는 배열에다가 우리는 사용자가 입력한 번호랑 매치되는 학생들의 번호를 1로,
            // 숙제 제출 안한 학생의 번호는 0으로 남겨둘거야.

        }
        
        
        for(int i = 1 ; i<= 30; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
        br.close();

        
        

        
    }
}

