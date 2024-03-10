import java.io.*;
import java.util.*;
public class 최댓값이차원배열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = 9;
        int[][] mat = new int[n][n];
        int max = 0;
        int maxI = 0;
        int maxJ = 0;

        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                // mat[i][j] = 
                int temp = Integer.parseInt(st.nextToken());
                if(temp > max){
                    max = temp;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxI +1 + " " + (maxJ +1));
        
        
    }
}
