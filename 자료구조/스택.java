package 자료구조;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스택 {
    
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack = new int[n];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){ // n이 1씩 줄고 그것이 0 보다 클 동안. 개꿀이네 이거
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
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
                case "top":
                    sb.append(top()).append("\n");
                    break;
            
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
    
    public static void push(int item){
        stack[size] = item;
        size++;
    }
    public static int pop(){
        if(size != 0){
            size--;
            int ret = stack[size];
            stack[size] = 0;
            return ret;
        }  
        return -1;
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size != 0){
            return 0;
        }
        return 1;
    }
    public static int top(){
        if(size != 0){
            return stack[size-1];
        }
        return -1;
    }
}
