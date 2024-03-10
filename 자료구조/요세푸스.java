package 자료구조;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class 요세푸스 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> circle = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i<=n; i++){
            circle.offer(i);
        }
        int kth = 1;
        while(circle.size() != 0){
            if(kth == k){
                int temp = circle.pollFirst();
                if(circle.size() >= 1){
                    sb.append(temp).append(", ");
                }
                else{
                    sb.append(temp);
                }
                
                kth = 1;
            }
            else{
                int temp = circle.pollFirst();
                circle.addLast(temp);
                kth++;
            }
        }
        // System.out.println(sb);
        System.out.print("<");
        System.out.print(sb);
        
        System.out.print(">");
    }
}
