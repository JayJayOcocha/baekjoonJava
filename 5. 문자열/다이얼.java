import java.io.IOException;
import java.io.*;

public class 다이얼 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int time = 0;

        for(int i =0; i<str.length(); i++){
            // ABC
            if(str.charAt(i)*1 <= 65 && str.charAt(i)*1 <= 67){
                time += 3;
            }
            // DEF
            else if(str.charAt(i)*1 > 67 && str.charAt(i)*1 <= 70){
                time += 4;
            }
            // GHI
            else if(str.charAt(i)*1 > 70 && str.charAt(i)*1 <= 73){
                time += 5;
            }
            // JKL
            else if(str.charAt(i)*1 > 73 && str.charAt(i)*1 <= 76){
                time += 6;
            }
            // MNO
            else if(str.charAt(i)*1 > 76 && str.charAt(i)*1 <= 79){
                time += 7;
            }
            // PQRS
            else if(str.charAt(i)*1 > 79 && str.charAt(i)*1 <= 83){
                time += 8;
            }
            // TUV
            else if(str.charAt(i)*1 > 83 && str.charAt(i)*1 <= 86){
                time += 9;
            }
            // WXYZ
            else {
                time += 10;
            }
        }
        System.out.println(time);
        br.close();

    }
}
