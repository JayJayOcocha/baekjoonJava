import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 순열사이클 {
    public static boolean[] visited;
    public static int[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< t; i++){
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            arr = new int[n+1];
            visited = new boolean[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 1; j<=n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                // System.out.println(arr[j]);
            }

            for(int j = 1; j<=n; j++){
                // 방문한 적이 없다면 (false면)
                if(!visited[j]){
                    dfs(j);
                    count++;
                }
            }
            sb.append(count).append("\n");
            
        }
        System.out.println(sb.toString());
    }


    public static void dfs(int j){
        if(visited[j]){
            return;
        }
        visited[j] = true;
        int next = arr[j];
        if(!visited[next]){
            dfs(next);
        }
    }
}
