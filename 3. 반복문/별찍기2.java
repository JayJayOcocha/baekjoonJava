import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 별찍기2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i ++){
            for (int j = n; j > 0; j--){
                if (i >= j){
                    bw.write("*");
                }
                else{
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }


        bw.close();
    }
}
