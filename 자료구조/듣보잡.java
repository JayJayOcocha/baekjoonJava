package 자료구조;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class 듣보잡 {
    static int n,m;
    static String[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        Set<String> hSet = new HashSet<String>();
        Set<String> dupHSet = new HashSet<String>();
        

        // 듣잡
        for(int i = 0; i< n; i++){
            String notHeared = br.readLine();
            if(!hSet.contains(notHeared)){
                hSet.add(notHeared);
            }
            else{
                dupHSet.add(notHeared);
            }
        }
        for(int i = 0; i< m; i++){
            String notSeen = br.readLine();
            if(!hSet.contains(notSeen)){
                hSet.add(notSeen);
            }
            else{
                dupHSet.add(notSeen);
            }
        }
        arr = new String[dupHSet.size()];
        Iterator<String> iter = dupHSet.iterator();
        int idx = 0;
        while(iter.hasNext()){
            arr[idx] = iter.next();
            idx++;
        }
        System.out.println(arr.length);
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
