package 자료구조;
import java.io.*;
import java.util.*;

public class 회전하는큐_2{
    static int[] circularQ;
    static int n,m;
    static int head = 1;
    static int tail = 0;
    static int count = 0;
    // static int size;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i = 1; i<= n; i++){
            ll.offer(i);
        }

        int[] seq = new int[m];	// 뽑고자 하는 수를 담은 배열
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
        for(int i = 0; i< m; i++){
            int target_idx = ll.indexOf(seq[i]);
            int half_idx;

            if(ll.size() % 2 == 0){
                half_idx = ll.size() /2 -1;
            }
            else{
                half_idx = ll.size()/2;
            }

            if(target_idx <= half_idx){
                for(int j = 0; j < target_idx; j++){
                    int temp = ll.pollFirst();
                    ll.offerLast(temp);
                    count++;
                }
            }
            else{
                for(int j = 0; j < ll.size() - target_idx; j++){
                    int temp = ll.pollLast();
                    ll.offerFirst(temp);
                    count++;
                }
            }
            ll.pollFirst();
        }

        System.out.println(count);
    }
}
