import java.io.*;

public class 단어공부 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String strLower = str.toLowerCase();
        int count = 0;
        int maxCount = 0;
        int idx = 0;
        boolean question = false;
        for(int i = 0;i<strLower.length() ; i++){
            char ch = strLower.charAt(i);
            for(int j = i; j< strLower.length(); j++){
                if(ch == strLower.charAt(j)){
                    count++;
                    // System.out.println(ch + " " + count + " " + j);
                }

                
            }
            if(count > maxCount){
                // System.out.println(count + " " + i);
                maxCount = count;
                idx = i;
                count = 0;
            }
            else if(count == maxCount){
                // System.out.println(" 여기에요" +i+ count);
                question = true;
                break;
            }
            else{
                count = 0;
            }
        }
        char charc = str.charAt(idx);
        String strr = Character.toString(charc);
        if(question == true){
            System.out.println("?");
        }
        else{
            System.out.println(strr.toUpperCase());
        }
    }
}
