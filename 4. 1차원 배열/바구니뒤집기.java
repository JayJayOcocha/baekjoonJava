import java.io.*;
import java.util.StringTokenizer;
public class 바구니뒤집기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // N만큼의 크기를 가진 배열을 생성한 뒤, 그 배열에 1 부터 N까지 숫자를 매긴다.
        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            arr[i] = i +1 ;
        }
        for(int i = 0 ; i< m; i++){
			// 왼쪽에서 오른쪽 범위의 숫자를 역순으로 바꿔줄 것이기에, 변수는 각각 left, right으로 정했다.
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
			// revArr가 필요한 이유는 역순으로 바꿔줄 아이템들을 저장해놓을 배열이 필요하기 때문
            int[] revArr = new int[n];
			
			// startIdx를 left의 index로 정해준 뒤, revArr에다가 범위 안의 숫자들을 역순으로 집어넣는다.
			// 이 부분에서 많이 시간 소요가 되었다... 다음부터는 오기부리지 말고 걍 디버깅 해보자...
            int startIdx = left -1;
            for(int j = right -1; j >= left -1; j--){
                revArr[j] = arr[startIdx];
                startIdx++;
            }
            // for(int j = 0; j<arr.length; j++){
            //     System.out.println("array j : "+arr[j]);
            //     System.out.println("revArray j : "+revArr[j]);
            // }
			
			// 그렇게 완성된 revArr는 성공적으로 left에서 right까지의 숫자들을 역순으로 배열에 넣는다.
			// 그렇게 역순으로 된 아이템들과, 범위 밖의 숫자로 배열은 가득차는데, 범위 밖의 숫자에는 아무런 값을 주지 않았기에 0이 된다.
			// 즉 0 이 아닌 숫자들을 기존의 배열에다가 넣어주게 되면, 역순으로 바구니를 바꾸는데 성공하게 된다.
            for(int j = 0; j<n; j++){
                if(revArr[j] != 0){
                    arr[j] = revArr[j];
                }
            }
            
            
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}