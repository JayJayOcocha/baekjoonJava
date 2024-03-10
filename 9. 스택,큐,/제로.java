import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제로 {
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack = new int[n];
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){
            int nextInt = Integer.parseInt(br.readLine());
            if(nextInt == 0){
                pop();
            }
            else{
                push(nextInt);
            }
        }
        int sum = 0;
        // System.out.println(pop());
        
        // System.out.println(size);
        while(size() > 0){
            sum += pop();
        }
        System.out.println(sum);
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
