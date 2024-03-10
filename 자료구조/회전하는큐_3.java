package 자료구조;
import java.io.*;
import java.util.*;

public class 회전하는큐_3 {
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        int count =0;
        // doubly linked list에 1부터 N까지의 숫자를 넣어준다
        for(int i = 1; i<=n; i++){
            deque.offer(i);
        }

        int[] seq = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;i<m; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i< m; i++){
            int idxToFind = deque.indexOf(seq[i]);
            int half;


            if(deque.size() %2 == 0 ){
                half = deque.size() / 2 -1;
            }
            else{
                half = deque.size() /2; 
            }


            if(idxToFind <= half){
                for(int j = 0; j< idxToFind; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else{
                for(int j = 0; j < deque.size() - idxToFind; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
