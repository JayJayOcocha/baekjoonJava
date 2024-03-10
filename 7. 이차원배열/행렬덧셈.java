import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;
public class 행렬덧셈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[m][n];
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine() , " ");
            for(int j = 0; j<m; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine() , " ");
            for(int j = 0; j<m; j++){
                // matrix[i][j] += Integer.parseInt(st.nextToken());
                sb.append(matrix[i][j] + Integer.parseInt(st.nextToken())).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
