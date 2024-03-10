import java.io.*;

public class 재귀의귀재 {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            count = 0;
            String str = br.readLine();
            sb.append(isPalindrome(str)).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
