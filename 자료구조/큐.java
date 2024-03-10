package 자료구조;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.*;
public class 큐{
    public static int[] queue;
    public static int size = 0;
    public static int idx = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        queue = new int[n];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));;
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item){
        queue[size] = item;
        size++;
    }
    public static int pop(){
        if(size != idx){
            int ret = queue[idx];
            idx++;
            return ret;
        }
        return -1;
    }
    public static int size(){
        if(size != idx){
            return size - idx;
        }
        return 0;
    }
    public static int empty(){
        if(size == idx){
            return 1;
        }
        return 0;
    }
    public static int front(){
        if(size != idx){
            return queue[idx];
        }
        return -1;
    }
    public static int back(){
        if(size != idx){
            return queue[size-1];
        }
        return -1;
    }
}