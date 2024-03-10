package 자료구조;
import java.io.*;
import java.util.*;

public class DFS와BFS {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        boolean visited[] = new boolean[n +1];

        LinkedList<Integer>[] adjList = new LinkedList[n+1];

        for (int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}

        for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}

        for (int i = 1; i <= n; i++) { 
			Collections.sort(adjList[i]); // 방문 순서를 위해 오름차순 정렬 
		}
        dfs_list(v, adjList, visited);
        System.out.println();
        for(int i =0;i<visited.length; i++){
            visited[i] = false;
        }
        bfs_list(v, adjList, visited);
    }



    public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v] = true; 
		queue.add(v);

		while(queue.size() != 0) { 
			v = queue.poll(); 
			System.out.print(v + " ");

			Iterator<Integer> iter = adjList[v].listIterator();
			while(iter.hasNext()) { 
				int w = iter.next(); 
				if(!visited[w]) { 
					visited[w] = true; 
					queue.add(w); 
				} 
			}
		}
	}

    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> iter = adjList[v].listIterator();
        while(iter.hasNext()){
            int w = iter.next();
            if(!visited[w]){
                dfs_list(w, adjList, visited);
            }
        }
    }
    
}
