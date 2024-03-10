package 자료구조;
import java.io.*;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class 회전하는큐 {
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
        // size = n;
        circularQ = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< m; i++){
            poll(Integer.parseInt(st.nextToken()));
        }
        System.out.println(count);
    }
    

    public static int poll(int item){
        // System.out.println("첫 아이템" + item);
        int size = n;
        if(head == item){
            head+= 1;
            size--;
            // System.out.println(size);
        }
        else{
            if(item-head <= 5){
                moveLeft(item, size);
                size--;
                System.out.println(size);
            }
            else{
                System.out.println("hihihi");
                moveRight(item, size);
            }
        }

        
        
        return -1;
    }
    public static void moveLeft(int item, int size){
        System.out.println(head);
        if(head+item >= size){
            head = (head+item) -size;
            count += item;
        }
        else{
            head += item;
            count += item;
        }
    }
    public static void moveRight(int item, int size){
        System.out.println(head);
        System.out.println(size);
        if(head+item <= n-size){
            head = (head-item) +10;
            count += item;
        }
        else{
            head -= item;
            count += item;
        }
    }
}
