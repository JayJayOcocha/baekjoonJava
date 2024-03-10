import java.io.IOException;
import java.io.*;

public class 크로아티아 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
       
        int count = 0;
        String[] strArr = str.split("");

        for(int i = 0; i<strArr.length; i++){
            if(strArr[i].contains("d") && i +1 >= 0 && i +2 >= 0){
                if(strArr[i +1].equals("z") && strArr[i +2].equals("=")){
                    strArr[i] = "";
                    strArr[i+1] = "";
                    strArr[i+2] = "";
                    count ++;
                }
            }
            else if(strArr[i].contains("-") && i -1 >= 0){  //|| strArr[i].contains("j") || strArr[i].contains("=")
                int idx = i;
                if(strArr[i -1].equals("c") || strArr[i -1].equals("d")){
                    strArr[idx] = "";
                    strArr[i-1] = "";
                    count ++;
                }
                
            }
            else if(strArr[i].contains("j") && i -1 >= 0){  
                int idx = i;
                if(strArr[i -1].equals("l") || strArr[i -1].equals("n")){
                    strArr[i] = "";
                    strArr[i-1] = "";
                    count ++;
                }
                
            }
            else if(strArr[i].contains("=") && i -1 >= 0){  
                int idx = i;
                if(strArr[i -1].equals("s") || strArr[i -1].equals("z") ||strArr[i -1].equals("c")){
                    strArr[i] = "";
                    strArr[i-1] = "";
                    count ++;
                }
                
            }
        }

        for(int i = 0; i<strArr.length; i++){
            if(strArr[i] != ""){
                count++;
            }
        }

        System.out.println(count);
    }
}