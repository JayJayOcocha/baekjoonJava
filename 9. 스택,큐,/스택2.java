import java.util.StringTokenizer;
import java.io.*;;

public class 스택2 {

    public static int[] stack;
    public static int size;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        stack = new int[n];
        StringBuilder sb = new StringBuilder();
        
        while(n-- >0){
            st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기 마다 다음 줄로 분류함
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    push(Integer.parseInt(st.nextToken()));
                    break;
            
                case 2:
                    sb.append(pop()).append("\n");
                    break;
            
                case 3:
                    sb.append(size()).append("\n");
                    break;
            
                case 4:
                    sb.append(empty()).append("\n");
                    break;
            
                case 5:
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
