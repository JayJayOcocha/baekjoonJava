import java.io.*;
import java.util.*;

public class 세로읽기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[5];
        char[][] mat;
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            mat = new char[5][str.length()];
            for(int j = 0; j <str.length(); j++){
                mat[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j< 5; j++){
                
            }
        }

        System.out.println(Arrays.toString(arr));

        
    }
}
