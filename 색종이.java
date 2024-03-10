import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class 색종이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        boolean[][] board = new boolean[100][100];
        int[] leftIndent = new int[n];
        int[] botIndent = new int[n]; 
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            leftIndent[i] = Integer.parseInt(st.nextToken());
            botIndent[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i<board.length; i++){
            
        }

    }
}
