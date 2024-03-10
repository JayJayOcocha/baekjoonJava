import java.io.*;
import java.util.*;

public class 행운의바퀴 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<String> circle = new LinkedList<>();
        int idx = 0;
        boolean status = true;

        for(int i = 0; i<n; i++){
            circle.add(null);
        }
        

        for(int i = 0; i <k; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String abc = st.nextToken();

            for(int j =0; j<x; j++){
                String temp = circle.removeFirst();
                circle.addLast(temp);
                
            }
            if(circle.getFirst() == null){
                circle.set(0, abc);
            }
            else{
                if(circle.getFirst().equals(abc)){
                    // System.out.println("가타");
                }
                else{
                    System.out.println("!");
                    status = false;
                    break;
                }
            }
            
        }


        /// 여기서 중복체크해야함
        
        StringBuilder sb = new StringBuilder();
        if(status == true){
            sb.append(circle.getFirst());
            for(int i = 0; i<n-1; i++){
                if(circle.getLast() == null){
                    sb.append("?");
                }
                else{
                    sb.append(circle.getLast());
                }
                
            
                circle.removeLast();
            }
        }


        // System.out.println(sb);
        행운의바퀴 t = new 행운의바퀴();
        if(t.solution(sb.toString()) == false){
            System.out.println(sb.toString());
        }
        else{
            System.out.println("!");
        }


        
    }
    public boolean solution(String str) {
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
		    // System.out.println(c);
		    if (c != '?' && !set.contains(c)) {
	            set.add(c);
	        }
            else if (c != '?' && set.contains(c)) {
	            return true;
	        }
		}
		

		
		 return false;
	}
}
